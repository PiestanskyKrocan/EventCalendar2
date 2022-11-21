import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Event.proto")
public final class GRPCEventServiceGrpc {

  private GRPCEventServiceGrpc() {}

  public static final String SERVICE_NAME = "GRPCEventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<User,
      Event> getRPCserverSideStreamingGetListOfEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCserverSideStreamingGetListOfEvents",
      requestType = User.class,
      responseType = Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<User,
      Event> getRPCserverSideStreamingGetListOfEventsMethod() {
    io.grpc.MethodDescriptor<User, Event> getRPCserverSideStreamingGetListOfEventsMethod;
    if ((getRPCserverSideStreamingGetListOfEventsMethod = GRPCEventServiceGrpc.getRPCserverSideStreamingGetListOfEventsMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCserverSideStreamingGetListOfEventsMethod = GRPCEventServiceGrpc.getRPCserverSideStreamingGetListOfEventsMethod) == null) {
          GRPCEventServiceGrpc.getRPCserverSideStreamingGetListOfEventsMethod = getRPCserverSideStreamingGetListOfEventsMethod =
              io.grpc.MethodDescriptor.<User, Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCserverSideStreamingGetListOfEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCserverSideStreamingGetListOfEvents"))
              .build();
        }
      }
    }
    return getRPCserverSideStreamingGetListOfEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Event,
      Event> getRPCfindEventByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCfindEventById",
      requestType = Event.class,
      responseType = Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Event,
      Event> getRPCfindEventByIdMethod() {
    io.grpc.MethodDescriptor<Event, Event> getRPCfindEventByIdMethod;
    if ((getRPCfindEventByIdMethod = GRPCEventServiceGrpc.getRPCfindEventByIdMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCfindEventByIdMethod = GRPCEventServiceGrpc.getRPCfindEventByIdMethod) == null) {
          GRPCEventServiceGrpc.getRPCfindEventByIdMethod = getRPCfindEventByIdMethod =
              io.grpc.MethodDescriptor.<Event, Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCfindEventById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCfindEventById"))
              .build();
        }
      }
    }
    return getRPCfindEventByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Event,
      Event> getRPCsaveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCsaveEvent",
      requestType = Event.class,
      responseType = Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Event,
      Event> getRPCsaveEventMethod() {
    io.grpc.MethodDescriptor<Event, Event> getRPCsaveEventMethod;
    if ((getRPCsaveEventMethod = GRPCEventServiceGrpc.getRPCsaveEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCsaveEventMethod = GRPCEventServiceGrpc.getRPCsaveEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCsaveEventMethod = getRPCsaveEventMethod =
              io.grpc.MethodDescriptor.<Event, Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCsaveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCsaveEvent"))
              .build();
        }
      }
    }
    return getRPCsaveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Event,
      Event> getRPCupdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCupdateEvent",
      requestType = Event.class,
      responseType = Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Event,
      Event> getRPCupdateEventMethod() {
    io.grpc.MethodDescriptor<Event, Event> getRPCupdateEventMethod;
    if ((getRPCupdateEventMethod = GRPCEventServiceGrpc.getRPCupdateEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCupdateEventMethod = GRPCEventServiceGrpc.getRPCupdateEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCupdateEventMethod = getRPCupdateEventMethod =
              io.grpc.MethodDescriptor.<Event, Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCupdateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCEventServiceMethodDescriptorSupplier("RPCupdateEvent"))
              .build();
        }
      }
    }
    return getRPCupdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Event,
      Event> getRPCdeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCdeleteEvent",
      requestType = Event.class,
      responseType = Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Event,
      Event> getRPCdeleteEventMethod() {
    io.grpc.MethodDescriptor<Event, Event> getRPCdeleteEventMethod;
    if ((getRPCdeleteEventMethod = GRPCEventServiceGrpc.getRPCdeleteEventMethod) == null) {
      synchronized (GRPCEventServiceGrpc.class) {
        if ((getRPCdeleteEventMethod = GRPCEventServiceGrpc.getRPCdeleteEventMethod) == null) {
          GRPCEventServiceGrpc.getRPCdeleteEventMethod = getRPCdeleteEventMethod =
              io.grpc.MethodDescriptor.<Event, Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCdeleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Event.getDefaultInstance()))
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
    public void rPCserverSideStreamingGetListOfEvents(User request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCserverSideStreamingGetListOfEventsMethod(), responseObserver);
    }

    /**
     */
    public void rPCfindEventById(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCfindEventByIdMethod(), responseObserver);
    }

    /**
     */
    public void rPCsaveEvent(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCsaveEventMethod(), responseObserver);
    }

    /**
     */
    public void rPCupdateEvent(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCupdateEventMethod(), responseObserver);
    }

    /**
     */
    public void rPCdeleteEvent(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCdeleteEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRPCserverSideStreamingGetListOfEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                User,
                Event>(
                  this, METHODID_RPCSERVER_SIDE_STREAMING_GET_LIST_OF_EVENTS)))
          .addMethod(
            getRPCfindEventByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Event,
                Event>(
                  this, METHODID_RPCFIND_EVENT_BY_ID)))
          .addMethod(
            getRPCsaveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Event,
                Event>(
                  this, METHODID_RPCSAVE_EVENT)))
          .addMethod(
            getRPCupdateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Event,
                Event>(
                  this, METHODID_RPCUPDATE_EVENT)))
          .addMethod(
            getRPCdeleteEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Event,
                Event>(
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
    public void rPCserverSideStreamingGetListOfEvents(User request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRPCserverSideStreamingGetListOfEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCfindEventById(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCfindEventByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCsaveEvent(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCsaveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCupdateEvent(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCupdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCdeleteEvent(Event request,
        io.grpc.stub.StreamObserver<Event> responseObserver) {
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
    public java.util.Iterator<Event> rPCserverSideStreamingGetListOfEvents(
        User request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRPCserverSideStreamingGetListOfEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Event rPCfindEventById(Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCfindEventByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public Event rPCsaveEvent(Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCsaveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public Event rPCupdateEvent(Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCupdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public Event rPCdeleteEvent(Event request) {
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
    public com.google.common.util.concurrent.ListenableFuture<Event> rPCfindEventById(
        Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCfindEventByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Event> rPCsaveEvent(
        Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCsaveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Event> rPCupdateEvent(
        Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCupdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Event> rPCdeleteEvent(
        Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCdeleteEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPCSERVER_SIDE_STREAMING_GET_LIST_OF_EVENTS = 0;
  private static final int METHODID_RPCFIND_EVENT_BY_ID = 1;
  private static final int METHODID_RPCSAVE_EVENT = 2;
  private static final int METHODID_RPCUPDATE_EVENT = 3;
  private static final int METHODID_RPCDELETE_EVENT = 4;

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
        case METHODID_RPCSERVER_SIDE_STREAMING_GET_LIST_OF_EVENTS:
          serviceImpl.rPCserverSideStreamingGetListOfEvents((User) request,
              (io.grpc.stub.StreamObserver<Event>) responseObserver);
          break;
        case METHODID_RPCFIND_EVENT_BY_ID:
          serviceImpl.rPCfindEventById((Event) request,
              (io.grpc.stub.StreamObserver<Event>) responseObserver);
          break;
        case METHODID_RPCSAVE_EVENT:
          serviceImpl.rPCsaveEvent((Event) request,
              (io.grpc.stub.StreamObserver<Event>) responseObserver);
          break;
        case METHODID_RPCUPDATE_EVENT:
          serviceImpl.rPCupdateEvent((Event) request,
              (io.grpc.stub.StreamObserver<Event>) responseObserver);
          break;
        case METHODID_RPCDELETE_EVENT:
          serviceImpl.rPCdeleteEvent((Event) request,
              (io.grpc.stub.StreamObserver<Event>) responseObserver);
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
      return EventOuterClass.getDescriptor();
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
              .addMethod(getRPCserverSideStreamingGetListOfEventsMethod())
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
