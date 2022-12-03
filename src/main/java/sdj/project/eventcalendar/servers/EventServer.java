package sdj.project.eventcalendar.servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import sdj.project.eventcalendar.GRPC.GrpcEventService;
import sdj.project.eventcalendar.GRPC.GrpcUserService;

import java.io.IOException;

public class EventServer {
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GrpcEventService())
                .build();

        try {
            server.start();

            server.awaitTermination();
        } catch (IOException e) {
        } catch (InterruptedException e) {

        }

    }
}