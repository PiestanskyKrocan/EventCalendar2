package sdj.project.eventcalendar.GRPC;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.controller.EventController;
import sdj.project.eventcalendar.protobuf.Event;
import sdj.project.eventcalendar.protobuf.GRPCEventServiceGrpc;
import sdj.project.eventcalendar.protobuf.User;
import sdj.project.eventcalendar.respiratory.EventRespiratory;
import sdj.project.eventcalendar.service.EventService;
import sdj.project.eventcalendar.service.impl.EventServiceImpl;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class GrpcEventService extends GRPCEventServiceGrpc.GRPCEventServiceImplBase {

    private final EventRespiratory repository;

    private EventServiceImpl implementedEventService;

    public GrpcEventService(EventRespiratory repository) {
        this.repository = repository;
    }


    @Override
    public void rPCserverSideStreamingGetListOfEvents(User request, StreamObserver<Event> responseObserver) {
        repository.findAll().forEach(e -> {
            responseObserver.onNext(e.());
        });
        responseObserver.onCompleted();
        eventService.saveEvent(request.)
    }



    @Override
    public void rPCfindEventById(Event request, StreamObserver<Event> responseObserver) {

        Integer eventId = request.getEventId(); // the student ID should be passed with the request message

            try {
                Event event = implementedEventService.findById((long)eventId););

                Event eventresponse = Event.newBuilder()
                        .setEventId(eventId)
                        .setName(event.getName())
                        .setBodytext(event.getBodytext())
                        .setStartTime(event.getStartTime())
                        .setEndTime(event.getEndTime())
                        .setAddress(event.getAddress())

                responseObserver.onNext(eventresponse);
                responseObserver.onCompleted();

            } catch (NoSuchElementException e) {
                // If some error occurs we sent an error with the following status which is not_found
                responseObserver.onError(Status.NOT_FOUND.asRuntimeException());

            } catch (ChangeSetPersister.NotFoundException e) {
                throw new RuntimeException(e);
            }


    }



    }

    @Override
    public void rPCsaveEvent(Event request, StreamObserver<Event> responseObserver) {
        repository.save(new EventEntity(request.getEventId(), request.getName(), request.getBodytext(), request.getStartTime(),request.getEndTime(),request.getAddress()))

    }

    @Override
    public void rPCupdateEvent(Event request, StreamObserver<Event> responseObserver) {
        super.rPCupdateEvent(request, responseObserver);
    }

    @Override
    public void rPCdeleteEvent(Event request, StreamObserver<Event> responseObserver) {
        super.rPCdeleteEvent(request, responseObserver);
    }
}
