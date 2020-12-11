// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: food.proto

package distributedsystems.foodService;

public final class Food {
  private Food() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_foodService_FoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_foodService_FoodResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_foodService_FoodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_foodService_FoodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_foodService_AllFoodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_foodService_AllFoodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_foodService_AllFoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_foodService_AllFoodResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_foodService_FoodByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_foodService_FoodByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_foodService_FoodByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_foodService_FoodByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_foodService_DeleteFoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_foodService_DeleteFoodResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nfood.proto\022\036distributedsystems.foodSer" +
      "vice\";\n\014FoodResponse\022\n\n\002id\030\001 \001(\t\022\r\n\005tast" +
      "e\030\002 \001(\005\022\020\n\010kindFood\030\003 \001(\t\".\n\013FoodRequest" +
      "\022\r\n\005taste\030\002 \001(\005\022\020\n\010kindFood\030\003 \001(\t\"\020\n\016All" +
      "FoodRequest\"M\n\017AllFoodResponse\022:\n\004Food\030\001" +
      " \003(\0132,.distributedsystems.foodService.Fo" +
      "odResponse\"\035\n\017FoodByIdRequest\022\n\n\002id\030\001 \001(" +
      "\t\"%\n\021FoodByNameRequest\022\020\n\010kindFood\030\001 \001(\t" +
      "\"\024\n\022DeleteFoodResponse2\230\004\n\013FoodService\022f" +
      "\n\003all\022..distributedsystems.foodService.A" +
      "llFoodRequest\032/.distributedsystems.foodS" +
      "ervice.AllFoodResponse\022`\n\003add\022+.distribu" +
      "tedsystems.foodService.FoodRequest\032,.dis" +
      "tributedsystems.foodService.FoodResponse" +
      "\022e\n\004byId\022/.distributedsystems.foodServic" +
      "e.FoodByIdRequest\032,.distributedsystems.f" +
      "oodService.FoodResponse\022i\n\006byName\0221.dist" +
      "ributedsystems.foodService.FoodByNameReq" +
      "uest\032,.distributedsystems.foodService.Fo" +
      "odResponse\022m\n\006delete\022/.distributedsystem" +
      "s.foodService.FoodByIdRequest\0322.distribu" +
      "tedsystems.foodService.DeleteFoodRespons" +
      "eB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_distributedsystems_foodService_FoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_distributedsystems_foodService_FoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_foodService_FoodResponse_descriptor,
        new java.lang.String[] { "Id", "Taste", "KindFood", });
    internal_static_distributedsystems_foodService_FoodRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_distributedsystems_foodService_FoodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_foodService_FoodRequest_descriptor,
        new java.lang.String[] { "Taste", "KindFood", });
    internal_static_distributedsystems_foodService_AllFoodRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_distributedsystems_foodService_AllFoodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_foodService_AllFoodRequest_descriptor,
        new java.lang.String[] { });
    internal_static_distributedsystems_foodService_AllFoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_distributedsystems_foodService_AllFoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_foodService_AllFoodResponse_descriptor,
        new java.lang.String[] { "Food", });
    internal_static_distributedsystems_foodService_FoodByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_distributedsystems_foodService_FoodByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_foodService_FoodByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_distributedsystems_foodService_FoodByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_distributedsystems_foodService_FoodByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_foodService_FoodByNameRequest_descriptor,
        new java.lang.String[] { "KindFood", });
    internal_static_distributedsystems_foodService_DeleteFoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_distributedsystems_foodService_DeleteFoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_foodService_DeleteFoodResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}