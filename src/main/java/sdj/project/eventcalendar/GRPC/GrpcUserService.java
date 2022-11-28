package sdj.project.eventcalendar.GRPC;

import io.grpc.Grpc;
import io.grpc.stub.StreamObserver;
import sdj.project.eventcalendar.Entity.EventEntity;
import sdj.project.eventcalendar.Entity.UserEntity;
import sdj.project.eventcalendar.controller.UserController;
import sdj.project.eventcalendar.protobuf.GRPCUserServiceGrpc;
import sdj.project.eventcalendar.protobuf.User;
import sdj.project.eventcalendar.service.EventService;
import sdj.project.eventcalendar.service.UserService;

public class GrpcUserService extends GRPCUserServiceGrpc.GRPCUserServiceImplBase {

    private UserService userService;
    private EventEntity eventEntity;
    private Grpc grpcUserService;
    private GRPCUserServiceGrpc grpc;
    private UserController userController;


    @Override
    public void rPCfindUserById(User request, StreamObserver<User> responseObserver) {
        super.rPCfindUserById(request, responseObserver);
        userService.updateUser(request);

    }

    @Override
    public void rPCsaveUser(User request, StreamObserver<User> responseObserver) {
        super.rPCsaveUser(request, responseObserver);
        userController.saveUser(request);
    }

    @Override
    public void rPCupdateUser(User request, StreamObserver<User> responseObserver) {
        super.rPCupdateUser(request, responseObserver);
    }

    @Override
    public void rPCdeleteUser(User request, StreamObserver<User> responseObserver) {
        super.rPCdeleteUser(request, responseObserver);
    }
}
