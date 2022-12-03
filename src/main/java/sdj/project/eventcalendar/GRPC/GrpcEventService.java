package sdj.project.eventcalendar.GRPC;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.protobuf.Event;
import sdj.project.eventcalendar.protobuf.GRPCEventServiceGrpc;
import sdj.project.eventcalendar.protobuf.User;
import sdj.project.eventcalendar.respiratory.EventRespiratory;
import sdj.project.eventcalendar.service.EventService;
import sdj.project.eventcalendar.service.UserService;
import sdj.project.eventcalendar.service.impl.EventServiceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class GrpcEventService extends GRPCEventServiceGrpc.GRPCEventServiceImplBase {


    private EventService eventService;

    private UserService userService;
    private Optional<EventEntity> optionaleventEntity;

    private ArrayList<EventEntity> eventlist;

    private ArrayList<UserEntity> userlist;

    private EventEntity eventEntity;

    private UserEntity user;

    private User userProto;

    @Override
    public void rPCGetListOfEvents(User request, StreamObserver<Event> responseObserver) {
        eventlist = eventService.findAllEvents();

        for (int i = 1; i <= eventlist.size(); i++) {

            userProto = User.newBuilder()
                    .setUserId(eventlist.get(i).getUser().getId())
                    .setName(eventlist.get(i).getUser().getName())
                    .setPassword( eventlist.get(i).getUser().getPassword())
                    .setGender(eventlist.get(i).getUser().getGender())
                    .setDateOfBirth(String.valueOf(eventlist.get(i).getUser().getDateOfBirth()))
                    .setAddress(eventlist.get(i).getUser().getAddress())
                    .build();

            Event eventresponse = Event.newBuilder()
                    .setEventId(eventlist.get(i).getId())
                    .setName(eventlist.get(i).getName())
                    .setBodytext(eventlist.get(i).getBodytext())
                    .setStartTime(String.valueOf(eventlist.get(i).getStartTime()))
                    .setEndTime(String.valueOf(eventlist.get(i).getEndTime()))
                    .setAddress(eventlist.get(i).getAddress())
                    .setCreator(userProto)
                    .build();
            responseObserver.onNext(eventresponse);
        }
        responseObserver.onCompleted();
    }


    @Override
    public void rPCGetListofCreatedEvents(User request, StreamObserver<Event> responseObserver) {
        eventlist = userService.findAllCreatedEvents(request.getUserId());

        for (int i = 1; i <= eventlist.size(); i++) {

            userProto = User.newBuilder()
                    .setUserId(eventlist.get(i).getUser().getId())
                    .setName(eventlist.get(i).getUser().getName())
                    .setPassword( eventlist.get(i).getUser().getPassword())
                    .setGender(eventlist.get(i).getUser().getGender())
                    .setDateOfBirth(String.valueOf(eventlist.get(i).getUser().getDateOfBirth()))
                    .setAddress(eventlist.get(i).getUser().getAddress())
                    .build();

            Event eventresponse = Event.newBuilder()
                    .setEventId(eventlist.get(i).getId())
                    .setName(eventlist.get(i).getName())
                    .setBodytext(eventlist.get(i).getBodytext())
                    .setStartTime(String.valueOf(eventlist.get(i).getStartTime()))
                    .setEndTime(String.valueOf(eventlist.get(i).getEndTime()))
                    .setAddress(eventlist.get(i).getAddress())
                    .setCreator(userProto)
                    .build();
            responseObserver.onNext(eventresponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void rPCGetListOfJoinedEvents(User request, StreamObserver<Event> responseObserver) {
        eventlist = userService.findAllJoinedEvents(request.getUserId());

        for (int i = 1; i <= eventlist.size(); i++) {

            userProto = User.newBuilder()
                    .setUserId(eventlist.get(i).getUser().getId())
                    .setName(eventlist.get(i).getUser().getName())
                    .setPassword( eventlist.get(i).getUser().getPassword())
                    .setGender(eventlist.get(i).getUser().getGender())
                    .setDateOfBirth(String.valueOf(eventlist.get(i).getUser().getDateOfBirth()))
                    .setAddress(eventlist.get(i).getUser().getAddress())
                    .build();

            Event eventresponse = Event.newBuilder()
                    .setEventId(eventlist.get(i).getId())
                    .setName(eventlist.get(i).getName())
                    .setBodytext(eventlist.get(i).getBodytext())
                    .setStartTime(String.valueOf(eventlist.get(i).getStartTime()))
                    .setEndTime(String.valueOf(eventlist.get(i).getEndTime()))
                    .setAddress(eventlist.get(i).getAddress())
                    .setCreator(userProto)
                    .build();
            responseObserver.onNext(eventresponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void rPCGetListOfUsersinEvent(Event request, StreamObserver<User> responseObserver) {
        userlist = eventService.findUsersByEventId(request.getEventId());

        for (int i = 1; i <= userlist.size(); i++) {
            User useresponse = User.newBuilder()
                    .setUserId(eventlist.get(i).getUser().getId())
                    .setName(eventlist.get(i).getUser().getName())
                    .setPassword( eventlist.get(i).getUser().getPassword())
                    .setGender(eventlist.get(i).getUser().getGender())
                    .setDateOfBirth(String.valueOf(eventlist.get(i).getUser().getDateOfBirth()))
                    .setAddress(eventlist.get(i).getUser().getAddress())
                    .build();
            responseObserver.onNext(useresponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void rPCfindEventById(Event request, StreamObserver<Event> responseObserver) {

        Long eventId = request.getEventId();

        try{optionaleventEntity = eventService.findById(eventId);} catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
                Event eventresponse = Event.newBuilder()
                        .setEventId(eventId)
                        .setName(optionaleventEntity.get().getName())
                        .setBodytext(optionaleventEntity.get().getBodytext())
                        .setStartTime(String.valueOf(optionaleventEntity.get().getStartTime()))
                        .setEndTime(String.valueOf(optionaleventEntity.get().getEndTime()))
                        .setAddress(optionaleventEntity.get().getAddress())
                        .setCreator(request.getCreator())
                                .build();

                responseObserver.onNext(eventresponse);
                responseObserver.onCompleted();

            } catch (NoSuchElementException e) {
                // If some error occurs we sent an error with the following status which is not_found
                responseObserver.onError(Status.NOT_FOUND.asRuntimeException());



    }



    }

    @Override
    public void rPCsaveEvent(Event request, StreamObserver<Event> responseObserver) {
        Long eventId = request.getEventId();
        User usrent;
        eventEntity = new EventEntity(request.getEventId(),
                request.getName(),
                request.getBodytext(),
                Timestamp.valueOf(request.getStartTime()),
                Timestamp.valueOf(request.getEndTime()),
                new UserEntity(
                        request.getCreator().getUserId(),
                        request.getCreator().getName(),
                        request.getCreator().getPassword(),
                        request.getCreator().getGender(),
                        Timestamp.valueOf(request.getCreator().getDateOfBirth()),
                        request.getCreator().getAddress()
                ),
                request.getAddress());

        eventEntity = eventService.saveEvent(eventEntity);


        try {
            Event eventresponse = Event.newBuilder()
                    .setEventId(eventId)
                    .setName(eventEntity.getName())
                    .setBodytext(eventEntity.getBodytext())
                    .setStartTime(String.valueOf(eventEntity.getStartTime()))
                    .setEndTime(String.valueOf(eventEntity.getEndTime()))
                    .setAddress(eventEntity.getAddress())
                    .setCreator(request.getCreator())
                    .build();

            responseObserver.onNext(eventresponse);
            responseObserver.onCompleted();

        } catch (NoSuchElementException e) {
            // If some error occurs we sent an error with the following status which is not_found
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());


        }
    }

    @Override
    public void rPCupdateEvent(Event request, StreamObserver<Event> responseObserver) {
            Long eventId = request.getEventId();
            User usrent;
            eventEntity= new EventEntity(request.getEventId(),
                    request.getName(),
                    request.getBodytext(),
                    Timestamp.valueOf(request.getStartTime()),
                    Timestamp.valueOf(request.getEndTime()),
                    new UserEntity(
                            request.getCreator().getUserId(),
                            request.getCreator().getName(),
                            request.getCreator().getPassword(),
                            request.getCreator().getGender(),
                            Timestamp.valueOf(request.getCreator().getDateOfBirth()),
                            request.getCreator().getAddress()
                    ),
                    request.getAddress());

            eventEntity = eventService.updateEvent(eventEntity);


            try {
                Event eventresponse = Event.newBuilder()
                        .setEventId(eventId)
                        .setName(eventEntity.getName())
                        .setBodytext(eventEntity.getBodytext())
                        .setStartTime(String.valueOf(eventEntity.getStartTime()))
                        .setEndTime(String.valueOf(eventEntity.getEndTime()))
                        .setAddress(eventEntity.getAddress())
                        .setCreator(request.getCreator())
                        .build();

                responseObserver.onNext(eventresponse);
                responseObserver.onCompleted();

            } catch (NoSuchElementException e) {
                // If some error occurs we sent an error with the following status which is not_found
                responseObserver.onError(Status.NOT_FOUND.asRuntimeException());



            }
        }

    @Override
    public void rPCdeleteEvent(Event request, StreamObserver<Event> responseObserver) {
        Long eventId = request.getEventId();
        eventEntity = new EventEntity(request.getEventId(),
                request.getName(),
                request.getBodytext(),
                Timestamp.valueOf(request.getStartTime()),
                Timestamp.valueOf(request.getEndTime()),
                new UserEntity(
                        request.getCreator().getUserId(),
                        request.getCreator().getName(),
                        request.getCreator().getPassword(),
                        request.getCreator().getGender(),
                        Timestamp.valueOf(request.getCreator().getDateOfBirth()),
                        request.getCreator().getAddress()
                ),
                request.getAddress());

        eventService.deleteEvent(eventId);


        try {
            Event eventresponse = Event.newBuilder()
                    .setEventId(eventId)
                    .setName(eventEntity.getName())
                    .setBodytext(eventEntity.getBodytext())
                    .setStartTime(String.valueOf(eventEntity.getStartTime()))
                    .setEndTime(String.valueOf(eventEntity.getEndTime()))
                    .setAddress(eventEntity.getAddress())
                    .setCreator(request.getCreator())
                    .build();

            responseObserver.onNext(eventresponse);
            responseObserver.onCompleted();

        } catch (NoSuchElementException e) {
            // If some error occurs we sent an error with the following status which is not_found
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());


        }
    }
}
