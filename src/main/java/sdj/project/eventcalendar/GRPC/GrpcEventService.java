//package sdj.project.eventcalendar.GRPC;
//
//import io.grpc.Status;
//import io.grpc.stub.StreamObserver;
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.stereotype.Service;
//import sdj.project.eventcalendar.Entity.EventEntity;
//import sdj.project.eventcalendar.Entity.UserEntity;
//import sdj.project.eventcalendar.protobuf.Event;
//import sdj.project.eventcalendar.protobuf.GRPCEventServiceGrpc;
//import sdj.project.eventcalendar.protobuf.User;
//import sdj.project.eventcalendar.respiratory.EventRespiratory;
//import sdj.project.eventcalendar.service.EventService;
//import sdj.project.eventcalendar.service.impl.EventServiceImpl;
//
//import java.sql.Timestamp;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//@Service
//public class GrpcEventService extends GRPCEventServiceGrpc.GRPCEventServiceImplBase {
//
//    private final EventRespiratory repository;
//
//    private EventService eventService;
//    private Optional<EventEntity> optionaleventEntity;
//    private EventEntity eventEntity;
//
//    private UserEntity user;
//
//    private User userProto;
//
//    public GrpcEventService(EventRespiratory repository) {
//        this.repository = repository;
//    }
//
//
//
//
//
//
//    @Override
//    public void rPCfindEventById(Event request, StreamObserver<Event> responseObserver) {
//
//        Long eventId = request.getEventId();
//
//        try{optionaleventEntity = eventService.findById(eventId);} catch (ChangeSetPersister.NotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        try {
//                Event eventresponse = Event.newBuilder()
//                        .setEventId(eventId)
//                        .setName(optionaleventEntity.get().getName())
//                        .setBodytext(optionaleventEntity.get().getBodytext())
//                        .setStartTime(String.valueOf(optionaleventEntity.get().getStartTime()))
//                        .setEndTime(String.valueOf(optionaleventEntity.get().getEndTime()))
//                        .setAddress(optionaleventEntity.get().getAddress())
//                                .build();
//
//                responseObserver.onNext(eventresponse);
//                responseObserver.onCompleted();
//
//            } catch (NoSuchElementException e) {
//                // If some error occurs we sent an error with the following status which is not_found
//                responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
//
//
//
//    }
//
//
//
//    }
//
//    @Override
//    public void rPCsaveEvent(Event request, StreamObserver<Event> responseObserver) {
//        Long eventId = request.getEventId();
//        eventEntity= new EventEntity(request.getEventId(),request.getName(),request.getBodytext(), Timestamp.valueOf(request.getStartTime()), Timestamp.valueOf(request.getEndTime()), request.getAddress(), request.getCreator();
//        user = eventEntity.getUser();
//        String.valueOf(user.getDateOfBirth());
//        userProto = user;
//
//        try{eventEntity = eventService.saveEvent(eventEntity);} catch (ChangeSetPersister.NotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        try {
//            Event eventresponse = Event.newBuilder()
//                    .setEventId(eventId)
//                    .setName(eventEntity.getName())
//                    .setBodytext(eventEntity.getBodytext())
//                    .setStartTime(String.valueOf(eventEntity.getStartTime()))
//                    .setEndTime(String.valueOf(eventEntity.getEndTime()))
//                    .setAddress(eventEntity.getAddress())
//                    .setCreator(userProto)
//                    .build();
//
//            responseObserver.onNext(eventresponse);
//            responseObserver.onCompleted();
//
//        } catch (NoSuchElementException e) {
//            // If some error occurs we sent an error with the following status which is not_found
//            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
//
//
//
//        }
//    }
//
//    @Override
//    public void rPCupdateEvent(Event request, StreamObserver<Event> responseObserver) {
//        super.rPCupdateEvent(request, responseObserver);
//    }
//
//    @Override
//    public void rPCdeleteEvent(Event request, StreamObserver<Event> responseObserver) {
//        super.rPCdeleteEvent(request, responseObserver);
//    }
//}
