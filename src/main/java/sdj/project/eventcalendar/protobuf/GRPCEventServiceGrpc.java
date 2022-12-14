package sdj.project.eventcalendar.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Event.proto")
public final class GRPCEventServiceGrpc {

  private GRPCEventServiceGrpc() {}

  public static final String SERVICE_NAME = "sdj.project.eventcalendar.protobuf.GRPCEventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.User> getRPCGetListOfUsersinEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCGetListOfUsersinEvent",
      requestType = sdj.project.eventcalendar.protobuf.Event.class,
      responseType = sdj.project.eventcalendar.protobuf.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.User> getRPCGetListOfUsersinEventMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.User> getRPCGetListOfUsersinEventMethod;
    if ((getRPCGetListOfUsersinEventMethod = GRPCEventServiceGrpc.getRPCGetListOfUsersinEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCGetListOfUsersinEventMethod = GRPCEventServiceGrpc.getRPCGetListOfUsersinEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCGetListOfUsersinEventMethod = getRPCGetListOfUsersinEventMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCGetListOfUsersinEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.User.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCGetListOfUsersinEvent"))
              .build();
        }
      }
    }
    return getRPCGetListOfUsersinEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User,
      sdj.project.eventcalendar.protobuf.Event> getRPCGetListofCreatedEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCGetListofCreatedEvents",
      requestType = sdj.project.eventcalendar.protobuf.User.class,
      responseType = sdj.project.eventcalendar.protobuf.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User,
      sdj.project.eventcalendar.protobuf.Event> getRPCGetListofCreatedEventsMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User, sdj.project.eventcalendar.protobuf.Event> getRPCGetListofCreatedEventsMethod;
    if ((getRPCGetListofCreatedEventsMethod = GRPCEventServiceGrpc.getRPCGetListofCreatedEventsMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCGetListofCreatedEventsMethod = GRPCEventServiceGrpc.getRPCGetListofCreatedEventsMethod) == null) {
          GRPCEventServiceGrpc.getRPCGetListofCreatedEventsMethod = getRPCGetListofCreatedEventsMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.User, sdj.project.eventcalendar.protobuf.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCGetListofCreatedEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCGetListofCreatedEvents"))
              .build();
        }
      }
    }
    return getRPCGetListofCreatedEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User,
      sdj.project.eventcalendar.protobuf.Event> getRPCGetListOfJoinedEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCGetListOfJoinedEvents",
      requestType = sdj.project.eventcalendar.protobuf.User.class,
      responseType = sdj.project.eventcalendar.protobuf.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User,
      sdj.project.eventcalendar.protobuf.Event> getRPCGetListOfJoinedEventsMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User, sdj.project.eventcalendar.protobuf.Event> getRPCGetListOfJoinedEventsMethod;
    if ((getRPCGetListOfJoinedEventsMethod = GRPCEventServiceGrpc.getRPCGetListOfJoinedEventsMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCGetListOfJoinedEventsMethod = GRPCEventServiceGrpc.getRPCGetListOfJoinedEventsMethod) == null) {
          GRPCEventServiceGrpc.getRPCGetListOfJoinedEventsMethod = getRPCGetListOfJoinedEventsMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.User, sdj.project.eventcalendar.protobuf.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCGetListOfJoinedEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCGetListOfJoinedEvents"))
              .build();
        }
      }
    }
    return getRPCGetListOfJoinedEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User,
      sdj.project.eventcalendar.protobuf.Event> getRPCGetListOfEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCGetListOfEvents",
      requestType = sdj.project.eventcalendar.protobuf.User.class,
      responseType = sdj.project.eventcalendar.protobuf.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User,
      sdj.project.eventcalendar.protobuf.Event> getRPCGetListOfEventsMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.User, sdj.project.eventcalendar.protobuf.Event> getRPCGetListOfEventsMethod;
    if ((getRPCGetListOfEventsMethod = GRPCEventServiceGrpc.getRPCGetListOfEventsMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCGetListOfEventsMethod = GRPCEventServiceGrpc.getRPCGetListOfEventsMethod) == null) {
          GRPCEventServiceGrpc.getRPCGetListOfEventsMethod = getRPCGetListOfEventsMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.User, sdj.project.eventcalendar.protobuf.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCGetListOfEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCGetListOfEvents"))
              .build();
        }
      }
    }
    return getRPCGetListOfEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCAddUserToEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCAddUserToEvent",
      requestType = sdj.project.eventcalendar.protobuf.JoinedEvents.class,
      responseType = sdj.project.eventcalendar.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCAddUserToEventMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty> getRPCAddUserToEventMethod;
    if ((getRPCAddUserToEventMethod = GRPCEventServiceGrpc.getRPCAddUserToEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCAddUserToEventMethod = GRPCEventServiceGrpc.getRPCAddUserToEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCAddUserToEventMethod = getRPCAddUserToEventMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCAddUserToEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.JoinedEvents.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCAddUserToEvent"))
              .build();
        }
      }
    }
    return getRPCAddUserToEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCRemoveUserFromEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCRemoveUserFromEvent",
      requestType = sdj.project.eventcalendar.protobuf.JoinedEvents.class,
      responseType = sdj.project.eventcalendar.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCRemoveUserFromEventMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty> getRPCRemoveUserFromEventMethod;
    if ((getRPCRemoveUserFromEventMethod = GRPCEventServiceGrpc.getRPCRemoveUserFromEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCRemoveUserFromEventMethod = GRPCEventServiceGrpc.getRPCRemoveUserFromEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCRemoveUserFromEventMethod = getRPCRemoveUserFromEventMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCRemoveUserFromEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.JoinedEvents.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCRemoveUserFromEvent"))
              .build();
        }
      }
    }
    return getRPCRemoveUserFromEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCAddEventToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCAddEventToUser",
      requestType = sdj.project.eventcalendar.protobuf.JoinedEvents.class,
      responseType = sdj.project.eventcalendar.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCAddEventToUserMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty> getRPCAddEventToUserMethod;
    if ((getRPCAddEventToUserMethod = GRPCEventServiceGrpc.getRPCAddEventToUserMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCAddEventToUserMethod = GRPCEventServiceGrpc.getRPCAddEventToUserMethod) == null) {
          GRPCEventServiceGrpc.getRPCAddEventToUserMethod = getRPCAddEventToUserMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCAddEventToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.JoinedEvents.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCAddEventToUser"))
              .build();
        }
      }
    }
    return getRPCAddEventToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCRemoveEventFromUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCRemoveEventFromUser",
      requestType = sdj.project.eventcalendar.protobuf.JoinedEvents.class,
      responseType = sdj.project.eventcalendar.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents,
      sdj.project.eventcalendar.protobuf.Empty> getRPCRemoveEventFromUserMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty> getRPCRemoveEventFromUserMethod;
    if ((getRPCRemoveEventFromUserMethod = GRPCEventServiceGrpc.getRPCRemoveEventFromUserMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCRemoveEventFromUserMethod = GRPCEventServiceGrpc.getRPCRemoveEventFromUserMethod) == null) {
          GRPCEventServiceGrpc.getRPCRemoveEventFromUserMethod = getRPCRemoveEventFromUserMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.JoinedEvents, sdj.project.eventcalendar.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCRemoveEventFromUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.JoinedEvents.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCRemoveEventFromUser"))
              .build();
        }
      }
    }
    return getRPCRemoveEventFromUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCfindEventByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCfindEventById",
      requestType = sdj.project.eventcalendar.protobuf.Event.class,
      responseType = sdj.project.eventcalendar.protobuf.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCfindEventByIdMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event> getRPCfindEventByIdMethod;
    if ((getRPCfindEventByIdMethod = GRPCEventServiceGrpc.getRPCfindEventByIdMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCfindEventByIdMethod = GRPCEventServiceGrpc.getRPCfindEventByIdMethod) == null) {
          GRPCEventServiceGrpc.getRPCfindEventByIdMethod = getRPCfindEventByIdMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCfindEventById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCfindEventById"))
              .build();
        }
      }
    }
    return getRPCfindEventByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCsaveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCsaveEvent",
      requestType = sdj.project.eventcalendar.protobuf.Event.class,
      responseType = sdj.project.eventcalendar.protobuf.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCsaveEventMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event> getRPCsaveEventMethod;
    if ((getRPCsaveEventMethod = GRPCEventServiceGrpc.getRPCsaveEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCsaveEventMethod = GRPCEventServiceGrpc.getRPCsaveEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCsaveEventMethod = getRPCsaveEventMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCsaveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCsaveEvent"))
              .build();
        }
      }
    }
    return getRPCsaveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCupdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCupdateEvent",
      requestType = sdj.project.eventcalendar.protobuf.Event.class,
      responseType = sdj.project.eventcalendar.protobuf.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCupdateEventMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event> getRPCupdateEventMethod;
    if ((getRPCupdateEventMethod = GRPCEventServiceGrpc.getRPCupdateEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCupdateEventMethod = GRPCEventServiceGrpc.getRPCupdateEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCupdateEventMethod = getRPCupdateEventMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCupdateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCupdateEvent"))
              .build();
        }
      }
    }
    return getRPCupdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCdeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCdeleteEvent",
      requestType = sdj.project.eventcalendar.protobuf.Event.class,
      responseType = sdj.project.eventcalendar.protobuf.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event,
      sdj.project.eventcalendar.protobuf.Event> getRPCdeleteEventMethod() {
    io.grpc.MethodDescriptor<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event> getRPCdeleteEventMethod;
    if ((getRPCdeleteEventMethod = GRPCEventServiceGrpc.getRPCdeleteEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCdeleteEventMethod = GRPCEventServiceGrpc.getRPCdeleteEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCdeleteEventMethod = getRPCdeleteEventMethod =
              io.grpc.MethodDescriptor.<sdj.project.eventcalendar.protobuf.Event, sdj.project.eventcalendar.protobuf.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCdeleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sdj.project.eventcalendar.protobuf.Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCdeleteEvent"))
              .build();
        }
      }
    }
    return getRPCdeleteEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GRPCEventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCEventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCEventServiceStub>() {
        @java.lang.Override
        public GRPCEventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCEventServiceStub(channel, callOptions);
        }
      };
    return GRPCEventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GRPCEventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCEventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCEventServiceBlockingStub>() {
        @java.lang.Override
        public GRPCEventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCEventServiceBlockingStub(channel, callOptions);
        }
      };
    return GRPCEventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GRPCEventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCEventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCEventServiceFutureStub>() {
        @java.lang.Override
        public GRPCEventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCEventServiceFutureStub(channel, callOptions);
        }
      };
    return GRPCEventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GRPCEventServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void rPCGetListOfUsersinEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCGetListOfUsersinEventMethod(), responseObserver);
    }

    /**
     */
    public void rPCGetListofCreatedEvents(sdj.project.eventcalendar.protobuf.User request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCGetListofCreatedEventsMethod(), responseObserver);
    }

    /**
     */
    public void rPCGetListOfJoinedEvents(sdj.project.eventcalendar.protobuf.User request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCGetListOfJoinedEventsMethod(), responseObserver);
    }

    /**
     */
    public void rPCGetListOfEvents(sdj.project.eventcalendar.protobuf.User request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCGetListOfEventsMethod(), responseObserver);
    }

    /**
     */
    public void rPCAddUserToEvent(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCAddUserToEventMethod(), responseObserver);
    }

    /**
     */
    public void rPCRemoveUserFromEvent(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCRemoveUserFromEventMethod(), responseObserver);
    }

    /**
     */
    public void rPCAddEventToUser(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCAddEventToUserMethod(), responseObserver);
    }

    /**
     */
    public void rPCRemoveEventFromUser(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCRemoveEventFromUserMethod(), responseObserver);
    }

    /**
     */
    public void rPCfindEventById(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCfindEventByIdMethod(), responseObserver);
    }

    /**
     */
    public void rPCsaveEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCsaveEventMethod(), responseObserver);
    }

    /**
     */
    public void rPCupdateEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCupdateEventMethod(), responseObserver);
    }

    /**
     */
    public void rPCdeleteEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCdeleteEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRPCGetListOfUsersinEventMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.Event,
                sdj.project.eventcalendar.protobuf.User>(
                  this, METHODID_RPCGET_LIST_OF_USERSIN_EVENT)))
          .addMethod(
            getRPCGetListofCreatedEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.User,
                sdj.project.eventcalendar.protobuf.Event>(
                  this, METHODID_RPCGET_LISTOF_CREATED_EVENTS)))
          .addMethod(
            getRPCGetListOfJoinedEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.User,
                sdj.project.eventcalendar.protobuf.Event>(
                  this, METHODID_RPCGET_LIST_OF_JOINED_EVENTS)))
          .addMethod(
            getRPCGetListOfEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.User,
                sdj.project.eventcalendar.protobuf.Event>(
                  this, METHODID_RPCGET_LIST_OF_EVENTS)))
          .addMethod(
            getRPCAddUserToEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.JoinedEvents,
                sdj.project.eventcalendar.protobuf.Empty>(
                  this, METHODID_RPCADD_USER_TO_EVENT)))
          .addMethod(
            getRPCRemoveUserFromEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.JoinedEvents,
                sdj.project.eventcalendar.protobuf.Empty>(
                  this, METHODID_RPCREMOVE_USER_FROM_EVENT)))
          .addMethod(
            getRPCAddEventToUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.JoinedEvents,
                sdj.project.eventcalendar.protobuf.Empty>(
                  this, METHODID_RPCADD_EVENT_TO_USER)))
          .addMethod(
            getRPCRemoveEventFromUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.JoinedEvents,
                sdj.project.eventcalendar.protobuf.Empty>(
                  this, METHODID_RPCREMOVE_EVENT_FROM_USER)))
          .addMethod(
            getRPCfindEventByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.Event,
                sdj.project.eventcalendar.protobuf.Event>(
                  this, METHODID_RPCFIND_EVENT_BY_ID)))
          .addMethod(
            getRPCsaveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.Event,
                sdj.project.eventcalendar.protobuf.Event>(
                  this, METHODID_RPCSAVE_EVENT)))
          .addMethod(
            getRPCupdateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.Event,
                sdj.project.eventcalendar.protobuf.Event>(
                  this, METHODID_RPCUPDATE_EVENT)))
          .addMethod(
            getRPCdeleteEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sdj.project.eventcalendar.protobuf.Event,
                sdj.project.eventcalendar.protobuf.Event>(
                  this, METHODID_RPCDELETE_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class GRPCEventServiceStub extends io.grpc.stub.AbstractAsyncStub<GRPCEventServiceStub> {
    private GRPCEventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCEventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCEventServiceStub(channel, callOptions);
    }

    /**
     */
    public void rPCGetListOfUsersinEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRPCGetListOfUsersinEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCGetListofCreatedEvents(sdj.project.eventcalendar.protobuf.User request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRPCGetListofCreatedEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCGetListOfJoinedEvents(sdj.project.eventcalendar.protobuf.User request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRPCGetListOfJoinedEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCGetListOfEvents(sdj.project.eventcalendar.protobuf.User request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRPCGetListOfEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCAddUserToEvent(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCAddUserToEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCRemoveUserFromEvent(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCRemoveUserFromEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCAddEventToUser(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCAddEventToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCRemoveEventFromUser(sdj.project.eventcalendar.protobuf.JoinedEvents request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCRemoveEventFromUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCfindEventById(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCfindEventByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCsaveEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCsaveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCupdateEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCupdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCdeleteEvent(sdj.project.eventcalendar.protobuf.Event request,
        io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCdeleteEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GRPCEventServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GRPCEventServiceBlockingStub> {
    private GRPCEventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCEventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCEventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<sdj.project.eventcalendar.protobuf.User> rPCGetListOfUsersinEvent(
        sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRPCGetListOfUsersinEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sdj.project.eventcalendar.protobuf.Event> rPCGetListofCreatedEvents(
        sdj.project.eventcalendar.protobuf.User request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRPCGetListofCreatedEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sdj.project.eventcalendar.protobuf.Event> rPCGetListOfJoinedEvents(
        sdj.project.eventcalendar.protobuf.User request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRPCGetListOfJoinedEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sdj.project.eventcalendar.protobuf.Event> rPCGetListOfEvents(
        sdj.project.eventcalendar.protobuf.User request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRPCGetListOfEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Empty rPCAddUserToEvent(sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCAddUserToEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Empty rPCRemoveUserFromEvent(sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCRemoveUserFromEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Empty rPCAddEventToUser(sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCAddEventToUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Empty rPCRemoveEventFromUser(sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCRemoveEventFromUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Event rPCfindEventById(sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCfindEventByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Event rPCsaveEvent(sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCsaveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Event rPCupdateEvent(sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCupdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public sdj.project.eventcalendar.protobuf.Event rPCdeleteEvent(sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCdeleteEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GRPCEventServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GRPCEventServiceFutureStub> {
    private GRPCEventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCEventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCEventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Empty> rPCAddUserToEvent(
        sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCAddUserToEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Empty> rPCRemoveUserFromEvent(
        sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCRemoveUserFromEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Empty> rPCAddEventToUser(
        sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCAddEventToUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Empty> rPCRemoveEventFromUser(
        sdj.project.eventcalendar.protobuf.JoinedEvents request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCRemoveEventFromUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Event> rPCfindEventById(
        sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCfindEventByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Event> rPCsaveEvent(
        sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCsaveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Event> rPCupdateEvent(
        sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCupdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sdj.project.eventcalendar.protobuf.Event> rPCdeleteEvent(
        sdj.project.eventcalendar.protobuf.Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCdeleteEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPCGET_LIST_OF_USERSIN_EVENT = 0;
  private static final int METHODID_RPCGET_LISTOF_CREATED_EVENTS = 1;
  private static final int METHODID_RPCGET_LIST_OF_JOINED_EVENTS = 2;
  private static final int METHODID_RPCGET_LIST_OF_EVENTS = 3;
  private static final int METHODID_RPCADD_USER_TO_EVENT = 4;
  private static final int METHODID_RPCREMOVE_USER_FROM_EVENT = 5;
  private static final int METHODID_RPCADD_EVENT_TO_USER = 6;
  private static final int METHODID_RPCREMOVE_EVENT_FROM_USER = 7;
  private static final int METHODID_RPCFIND_EVENT_BY_ID = 8;
  private static final int METHODID_RPCSAVE_EVENT = 9;
  private static final int METHODID_RPCUPDATE_EVENT = 10;
  private static final int METHODID_RPCDELETE_EVENT = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GRPCEventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GRPCEventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RPCGET_LIST_OF_USERSIN_EVENT:
          serviceImpl.rPCGetListOfUsersinEvent((sdj.project.eventcalendar.protobuf.Event) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.User>) responseObserver);
          break;
        case METHODID_RPCGET_LISTOF_CREATED_EVENTS:
          serviceImpl.rPCGetListofCreatedEvents((sdj.project.eventcalendar.protobuf.User) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event>) responseObserver);
          break;
        case METHODID_RPCGET_LIST_OF_JOINED_EVENTS:
          serviceImpl.rPCGetListOfJoinedEvents((sdj.project.eventcalendar.protobuf.User) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event>) responseObserver);
          break;
        case METHODID_RPCGET_LIST_OF_EVENTS:
          serviceImpl.rPCGetListOfEvents((sdj.project.eventcalendar.protobuf.User) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event>) responseObserver);
          break;
        case METHODID_RPCADD_USER_TO_EVENT:
          serviceImpl.rPCAddUserToEvent((sdj.project.eventcalendar.protobuf.JoinedEvents) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RPCREMOVE_USER_FROM_EVENT:
          serviceImpl.rPCRemoveUserFromEvent((sdj.project.eventcalendar.protobuf.JoinedEvents) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RPCADD_EVENT_TO_USER:
          serviceImpl.rPCAddEventToUser((sdj.project.eventcalendar.protobuf.JoinedEvents) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RPCREMOVE_EVENT_FROM_USER:
          serviceImpl.rPCRemoveEventFromUser((sdj.project.eventcalendar.protobuf.JoinedEvents) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RPCFIND_EVENT_BY_ID:
          serviceImpl.rPCfindEventById((sdj.project.eventcalendar.protobuf.Event) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event>) responseObserver);
          break;
        case METHODID_RPCSAVE_EVENT:
          serviceImpl.rPCsaveEvent((sdj.project.eventcalendar.protobuf.Event) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event>) responseObserver);
          break;
        case METHODID_RPCUPDATE_EVENT:
          serviceImpl.rPCupdateEvent((sdj.project.eventcalendar.protobuf.Event) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event>) responseObserver);
          break;
        case METHODID_RPCDELETE_EVENT:
          serviceImpl.rPCdeleteEvent((sdj.project.eventcalendar.protobuf.Event) request,
              (io.grpc.stub.StreamObserver<sdj.project.eventcalendar.protobuf.Event>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GRPCEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GRPCEventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sdj.project.eventcalendar.protobuf.EventOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GRPCEventService");
    }
  }

  private static final class GRPCEventServiceFileDescriptorSupplier
      extends GRPCEventServiceBaseDescriptorSupplier {
    GRPCEventServiceFileDescriptorSupplier() {}
  }

  private static final class GRPCEventServiceMethodDescriptorSupplier
      extends GRPCEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GRPCEventServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GRPCEventServiceFileDescriptorSupplier())
              .addMethod(getRPCGetListOfUsersinEventMethod())
              .addMethod(getRPCGetListofCreatedEventsMethod())
              .addMethod(getRPCGetListOfJoinedEventsMethod())
              .addMethod(getRPCGetListOfEventsMethod())
              .addMethod(getRPCAddUserToEventMethod())
              .addMethod(getRPCRemoveUserFromEventMethod())
              .addMethod(getRPCAddEventToUserMethod())
              .addMethod(getRPCRemoveEventFromUserMethod())
              .addMethod(getRPCfindEventByIdMethod())
              .addMethod(getRPCsaveEventMethod())
              .addMethod(getRPCupdateEventMethod())
              .addMethod(getRPCdeleteEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
