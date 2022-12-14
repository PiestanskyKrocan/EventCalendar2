package sdj.project.eventcalendar.GRPC;

import io.grpc.Grpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.protobuf.GRPCUserServiceGrpc;
import sdj.project.eventcalendar.protobuf.User;
import sdj.project.eventcalendar.service.UserService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@GRpcService
public class GrpcUserService extends GRPCUserServiceGrpc.GRPCUserServiceImplBase {

    private UserService userService;
    private UserEntity user;
    private Optional<UserEntity> optionalUserEntity;

    private ArrayList<UserEntity> arrayList;

    public GrpcUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void rPCGetListOfAllUsers(User request, StreamObserver<User> responseObserver) {
        arrayList = new ArrayList<>(userService.findAllUsers());

            for (int i = 0; i < arrayList.size(); i++) {

                User userresponse = User.newBuilder()
                        .setUserId(arrayList.get(i).getId())
                        .setName(arrayList.get(i).getName())
                        .setPassword(arrayList.get(i).getPassword())
                        .setGender(arrayList.get(i).getGender())
                        .setDateOfBirth(String.valueOf(arrayList.get(i).getDateOfBirth()))
                        .setAddress(arrayList.get(i).getAddress())
                        .build();
                responseObserver.onNext(userresponse);
            }
            responseObserver.onCompleted();
        }


    @Override
    public void rPCfindUserById(User request, StreamObserver<User> responseObserver) {
        super.rPCfindUserById(request, responseObserver);

        user = new UserEntity(request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());

        optionalUserEntity = userService.findById(user.getId());


        try {
            User userresponse = User.newBuilder()
                    .setUserId(optionalUserEntity.get().getId())
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
        user = new UserEntity(request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());
        userService.saveUser(user);
        responseObserver.onCompleted();
    }

    @Override
    public void rPCupdateUser(User request, StreamObserver<User> responseObserver) {
        user = new UserEntity(request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());
        userService.updateUser(user);
        responseObserver.onCompleted();


    }

    @Override
    public void rPCdeleteUser(User request, StreamObserver<User> responseObserver) {
        user = new UserEntity(request.getUserId(),request.getName(), request.getPassword(),request.getGender(), Timestamp.valueOf(request.getDateOfBirth()),request.getAddress());
        userService.deleteUser(user.getId());
        responseObserver.onCompleted();
    }
}
