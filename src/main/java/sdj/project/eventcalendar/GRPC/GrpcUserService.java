package sdj.project.eventcalendar.GRPC;

import io.grpc.Grpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.data.crossstore.ChangeSetPersister;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.protobuf.Event;
import sdj.project.eventcalendar.protobuf.GRPCUserServiceGrpc;
import sdj.project.eventcalendar.protobuf.User;
import sdj.project.eventcalendar.service.UserService;

import java.sql.Timestamp;
import java.util.NoSuchElementException;
import java.util.Optional;

public class GrpcUserService extends GRPCUserServiceGrpc.GRPCUserServiceImplBase {

    private UserService userService;
    private EventEntity eventEntity;
    private Grpc grpcUserService;
    private GRPCUserServiceGrpc grpc;
    private UserEntity user;
    private Optional<UserEntity> optionalUserEntity;


    @Override
    public void rPCfindUserById(User request, StreamObserver<User> responseObserver) {
        super.rPCfindUserById(request, responseObserver);

        user = new UserEntity((long)request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());

        optionalUserEntity = userService.findById(user.getId());


        try {
            User userresponse = User.newBuilder()
                    .setUserId(user.getId())
                    .setName(optionalUserEntity.get().getName())
                    .setPassword(optionalUserEntity.get().getPassword())
                    .setGender(optionalUserEntity.get().getGender())
                    .setDateOfBirth(String.valueOf(optionalUserEntity.get().getDateOfBirth()))
                    .setAddress(optionalUserEntity.get().getAddress())
                    .build();

            responseObserver.onNext(userresponse);
            responseObserver.onCompleted();

        } catch (NoSuchElementException e) {
            // If some error occurs we sent an error with the following status which is not_found
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());



        }



    }

    @Override
    public void rPCsaveUser(User request, StreamObserver<User> responseObserver) {
        super.rPCsaveUser(request, responseObserver);
        user = new UserEntity((long)request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());
        userService.saveUser(user);
    }

    @Override
    public void rPCupdateUser(User request, StreamObserver<User> responseObserver) {
        user = new UserEntity((long)request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());
        userService.updateUser(user);
        super.rPCupdateUser(request, responseObserver);

    }

    @Override
    public void rPCdeleteUser(User request, StreamObserver<User> responseObserver) {
        user = new UserEntity((long)request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());
        userService.deleteUser(user.getId());
        super.rPCdeleteUser(request, responseObserver);
    }
}
