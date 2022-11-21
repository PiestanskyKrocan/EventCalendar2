import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: User.proto")
public final class GRPCUserServiceGrpc {

  private GRPCUserServiceGrpc() {}

  public static final String SERVICE_NAME = "GRPCUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<User,
      User> getRPCfindUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCfindUserById",
      requestType = User.class,
      responseType = User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<User,
      User> getRPCfindUserByIdMethod() {
    io.grpc.MethodDescriptor<User, User> getRPCfindUserByIdMethod;
    if ((getRPCfindUserByIdMethod = GRPCUserServiceGrpc.getRPCfindUserByIdMethod) == null) {
      synchronized (GRPCUserServiceGrpc.class) {
        if ((getRPCfindUserByIdMethod = GRPCUserServiceGrpc.getRPCfindUserByIdMethod) == null) {
          GRPCUserServiceGrpc.getRPCfindUserByIdMethod = getRPCfindUserByIdMethod =
              io.grpc.MethodDescriptor.<User, User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCfindUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCUserServiceMethodDescriptorSupplier("RPCfindUserById"))
              .build();
        }
      }
    }
    return getRPCfindUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<User,
      User> getRPCsaveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCsaveUser",
      requestType = User.class,
      responseType = User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<User,
      User> getRPCsaveUserMethod() {
    io.grpc.MethodDescriptor<User, User> getRPCsaveUserMethod;
    if ((getRPCsaveUserMethod = GRPCUserServiceGrpc.getRPCsaveUserMethod) == null) {
      synchronized (GRPCUserServiceGrpc.class) {
        if ((getRPCsaveUserMethod = GRPCUserServiceGrpc.getRPCsaveUserMethod) == null) {
          GRPCUserServiceGrpc.getRPCsaveUserMethod = getRPCsaveUserMethod =
              io.grpc.MethodDescriptor.<User, User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCsaveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCUserServiceMethodDescriptorSupplier("RPCsaveUser"))
              .build();
        }
      }
    }
    return getRPCsaveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<User,
      User> getRPCupdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCupdateUser",
      requestType = User.class,
      responseType = User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<User,
      User> getRPCupdateUserMethod() {
    io.grpc.MethodDescriptor<User, User> getRPCupdateUserMethod;
    if ((getRPCupdateUserMethod = GRPCUserServiceGrpc.getRPCupdateUserMethod) == null) {
      synchronized (GRPCUserServiceGrpc.class) {
        if ((getRPCupdateUserMethod = GRPCUserServiceGrpc.getRPCupdateUserMethod) == null) {
          GRPCUserServiceGrpc.getRPCupdateUserMethod = getRPCupdateUserMethod =
              io.grpc.MethodDescriptor.<User, User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCupdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCUserServiceMethodDescriptorSupplier("RPCupdateUser"))
              .build();
        }
      }
    }
    return getRPCupdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<User,
      User> getRPCdeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RPCdeleteUser",
      requestType = User.class,
      responseType = User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<User,
      User> getRPCdeleteUserMethod() {
    io.grpc.MethodDescriptor<User, User> getRPCdeleteUserMethod;
    if ((getRPCdeleteUserMethod = GRPCUserServiceGrpc.getRPCdeleteUserMethod) == null) {
      synchronized (GRPCUserServiceGrpc.class) {
        if ((getRPCdeleteUserMethod = GRPCUserServiceGrpc.getRPCdeleteUserMethod) == null) {
          GRPCUserServiceGrpc.getRPCdeleteUserMethod = getRPCdeleteUserMethod =
              io.grpc.MethodDescriptor.<User, User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RPCdeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCUserServiceMethodDescriptorSupplier("RPCdeleteUser"))
              .build();
        }
      }
    }
    return getRPCdeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GRPCUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCUserServiceStub>() {
        @java.lang.Override
        public GRPCUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCUserServiceStub(channel, callOptions);
        }
      };
    return GRPCUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GRPCUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCUserServiceBlockingStub>() {
        @java.lang.Override
        public GRPCUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCUserServiceBlockingStub(channel, callOptions);
        }
      };
    return GRPCUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GRPCUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCUserServiceFutureStub>() {
        @java.lang.Override
        public GRPCUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCUserServiceFutureStub(channel, callOptions);
        }
      };
    return GRPCUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GRPCUserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void rPCfindUserById(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCfindUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void rPCsaveUser(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCsaveUserMethod(), responseObserver);
    }

    /**
     */
    public void rPCupdateUser(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCupdateUserMethod(), responseObserver);
    }

    /**
     */
    public void rPCdeleteUser(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRPCdeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRPCfindUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                User,
                User>(
                  this, METHODID_RPCFIND_USER_BY_ID)))
          .addMethod(
            getRPCsaveUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                User,
                User>(
                  this, METHODID_RPCSAVE_USER)))
          .addMethod(
            getRPCupdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                User,
                User>(
                  this, METHODID_RPCUPDATE_USER)))
          .addMethod(
            getRPCdeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                User,
                User>(
                  this, METHODID_RPCDELETE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class GRPCUserServiceStub extends io.grpc.stub.AbstractAsyncStub<GRPCUserServiceStub> {
    private GRPCUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void rPCfindUserById(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCfindUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCsaveUser(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCsaveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCupdateUser(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCupdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rPCdeleteUser(User request,
        io.grpc.stub.StreamObserver<User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRPCdeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GRPCUserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GRPCUserServiceBlockingStub> {
    private GRPCUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public User rPCfindUserById(User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCfindUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public User rPCsaveUser(User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCsaveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public User rPCupdateUser(User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCupdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public User rPCdeleteUser(User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRPCdeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GRPCUserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GRPCUserServiceFutureStub> {
    private GRPCUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<User> rPCfindUserById(
        User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCfindUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<User> rPCsaveUser(
        User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCsaveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<User> rPCupdateUser(
        User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCupdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<User> rPCdeleteUser(
        User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRPCdeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RPCFIND_USER_BY_ID = 0;
  private static final int METHODID_RPCSAVE_USER = 1;
  private static final int METHODID_RPCUPDATE_USER = 2;
  private static final int METHODID_RPCDELETE_USER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GRPCUserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GRPCUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RPCFIND_USER_BY_ID:
          serviceImpl.rPCfindUserById((User) request,
              (io.grpc.stub.StreamObserver<User>) responseObserver);
          break;
        case METHODID_RPCSAVE_USER:
          serviceImpl.rPCsaveUser((User) request,
              (io.grpc.stub.StreamObserver<User>) responseObserver);
          break;
        case METHODID_RPCUPDATE_USER:
          serviceImpl.rPCupdateUser((User) request,
              (io.grpc.stub.StreamObserver<User>) responseObserver);
          break;
        case METHODID_RPCDELETE_USER:
          serviceImpl.rPCdeleteUser((User) request,
              (io.grpc.stub.StreamObserver<User>) responseObserver);
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

  private static abstract class GRPCUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GRPCUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GRPCUserService");
    }
  }

  private static final class GRPCUserServiceFileDescriptorSupplier
      extends GRPCUserServiceBaseDescriptorSupplier {
    GRPCUserServiceFileDescriptorSupplier() {}
  }

  private static final class GRPCUserServiceMethodDescriptorSupplier
      extends GRPCUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GRPCUserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GRPCUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GRPCUserServiceFileDescriptorSupplier())
              .addMethod(getRPCfindUserByIdMethod())
              .addMethod(getRPCsaveUserMethod())
              .addMethod(getRPCupdateUserMethod())
              .addMethod(getRPCdeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
