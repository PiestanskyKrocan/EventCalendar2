package sdj.project.eventcalendar.servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import sdj.project.eventcalendar.GRPC.GrpcEventService;
import sdj.project.eventcalendar.GRPC.GrpcUserService;
import sdj.project.eventcalendar.service.EventService;
import sdj.project.eventcalendar.service.UserService;

import java.io.IOException;

public class UserServer {
    public static UserService userService;
    public static EventService eventService;
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8081)
                .addService(new GrpcUserService(userService))
                .addService(new GrpcEventService(eventService,userService))
                .build();

        try {
            server.start();

            server.awaitTermination();
        } catch (IOException e) {
        } catch (InterruptedException e) {

        }

    }
}