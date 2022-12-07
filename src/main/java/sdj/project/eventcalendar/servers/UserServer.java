package sdj.project.eventcalendar.servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import sdj.project.eventcalendar.GRPC.GrpcUserService;
import java.io.IOException;

public class UserServer {
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8081)
                .addService(new GrpcUserService())
                .build();

        try {
            server.start();

            server.awaitTermination();
        } catch (IOException e) {
        } catch (InterruptedException e) {

        }

    }
}