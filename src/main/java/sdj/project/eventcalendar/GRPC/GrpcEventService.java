package sdj.project.eventcalendar.GRPC;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.stereotype.Service;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.protobuf.*;
import sdj.project.eventcalendar.service.EventService;
import sdj.project.eventcalendar.service.UserService;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@GRpcService
public class GrpcEventService extends GRPCEventServiceGrpc.GRPCEventServiceImplBase {


    private EventService eventService;

    private UserService userService;
    private Optional<EventEntity> optionaleventEntity;

    private ArrayList<EventEntity> eventlist;

    private List<UserEntity> list;

    private ArrayList<UserEntity> userlist;

    private EventEntity eventEntity;
    private UserEntity userEntity;

    private User userProto;

    public GrpcEventService(EventService eventService, UserService userService) {
        this.eventService = eventService;
        this.userService = userService;
    }

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
        eventlist = new ArrayList<>(userService.findAllCreatedEvents(request.getUserId()));

        for (int i = 0; i < eventlist.size(); i++) {

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
        eventlist = new ArrayList<>(userService.findAllJoinedEvents(request.getUserId()));

        for (int i = 0; i < eventlist.size(); i++) {

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
        userlist = new ArrayList<>(eventService.findUsersByEventId(request.getEventId()));

        for (int i = 0; i < userlist.size(); i++) {
            User useresponse = User.newBuilder()
                    .setUserId(userlist.get(i).getId())
                    .setName(userlist.get(i).getName())
                    .setPassword( userlist.get(i).getPassword())
                    .setGender(userlist.get(i).getGender())
                    .setDateOfBirth(String.valueOf(userlist.get(i).getDateOfBirth()))
                    .setAddress(userlist.get(i).getAddress())
                    .build();
            responseObserver.onNext(useresponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void rPCAddUserToEvent(JoinedEvents request, StreamObserver<Empty> responseObserver) {
        eventService.addUser(request.getUserId(),request.getEventId());
        responseObserver.onCompleted();
    }

    @Override
    public void rPCRemoveUserFromEvent(JoinedEvents request, StreamObserver<Empty> responseObserver) {
        eventService.removeUser(request.getUserId(),request.getEventId());
        responseObserver.onCompleted();
    }

    @Override
    public void rPCAddEventToUser(JoinedEvents request, StreamObserver<Empty> responseObserver) {
        userService.addEvent(request.getUserId(),request.getEventId());
        responseObserver.onCompleted();
    }

    @Override
    public void rPCRemoveEventFromUser(JoinedEvents request, StreamObserver<Empty> responseObserver) {
        userService.removeEvent(request.getUserId(),request.getEventId());
        responseObserver.onCompleted();
    }

    @Override
    public void rPCfindEventById(Event request, StreamObserver<Event> responseObserver) {


        try{optionaleventEntity = eventService.findById(request.getEventId());} catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
                Event eventresponse = Event.newBuilder()
                        .setEventId(optionaleventEntity.get().getId())
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
        eventEntity = new EventEntity(request.getEventId(),
                request.getName(),
                request.getBodytext(),
                Timestamp.valueOf(request.getStartTime()),
                Timestamp.valueOf(request.getEndTime()),
                request.getAddress(),
                new UserEntity(
                        request.getCreator().getUserId(),
                        request.getCreator().getName(),
                        request.getCreator().getPassword(),
                        request.getCreator().getGender(),
                        Timestamp.valueOf(request.getCreator().getDateOfBirth()),
                        request.getCreator().getAddress()));

        eventService.saveEvent(eventEntity);


        try {
            Event eventresponse = Event.newBuilder()
                    .setEventId(eventEntity.getId())
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
            eventEntity= new EventEntity(request.getEventId(),
                    request.getName(),
                    request.getBodytext(),
                    Timestamp.valueOf(request.getStartTime()),
                    Timestamp.valueOf(request.getEndTime()),
                    request.getAddress(),
                    new UserEntity(
                            request.getCreator().getUserId(),
                            request.getCreator().getName(),
                            request.getCreator().getPassword(),
                            request.getCreator().getGender(),
                            Timestamp.valueOf(request.getCreator().getDateOfBirth()),
                            request.getCreator().getAddress()
                    ));

            eventService.updateEvent(eventEntity);


            try {
                Event eventresponse = Event.newBuilder()
                        .setEventId(eventEntity.getId())
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
        eventEntity = new EventEntity(request.getEventId(),
                request.getName(),
                request.getBodytext(),
                Timestamp.valueOf(request.getStartTime()),
                Timestamp.valueOf(request.getEndTime()),
                request.getAddress(),
                new UserEntity(
                        request.getCreator().getUserId(),
                        request.getCreator().getName(),
                        request.getCreator().getPassword(),
                        request.getCreator().getGender(),
                        Timestamp.valueOf(request.getCreator().getDateOfBirth()),
                        request.getCreator().getAddress()));

        eventService.deleteEvent(eventEntity.getId());


        try {
            Event eventresponse = Event.newBuilder()
                    .setEventId(eventEntity.getId())
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
