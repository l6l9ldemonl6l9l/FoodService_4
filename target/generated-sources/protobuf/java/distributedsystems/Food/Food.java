// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: food.proto

package distributedsystems.Food;

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
    internal_static_distributedsystems_Food_FoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_Food_FoodResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_Food_FoodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_Food_FoodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_Food_AllFoodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_Food_AllFoodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_Food_AllFoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_Food_AllFoodResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_Food_FoodByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_Food_FoodByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_Food_FoodByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_Food_FoodByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_Food_DeleteFoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_Food_DeleteFoodResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nfood.proto\022\027distributedsystems.Food\"7\n" +
      "\014FoodResponse\022\n\n\002id\030\001 \001(\t\022\r\n\005taste\030\002 \001(\005" +
      "\022\014\n\004name\030\003 \001(\t\"*\n\013FoodRequest\022\r\n\005taste\030\002" +
      " \001(\005\022\014\n\004name\030\003 \001(\t\"\020\n\016AllFoodRequest\"F\n\017" +
      "AllFoodResponse\0223\n\004Food\030\001 \003(\0132%.distribu" +
      "tedsystems.Food.FoodResponse\"\035\n\017FoodById" +
      "Request\022\n\n\002id\030\001 \001(\t\"!\n\021FoodByNameRequest" +
      "\022\014\n\004name\030\001 \001(\t\"\024\n\022DeleteFoodResponse2\322\003\n" +
      "\013FoodService\022X\n\003all\022\'.distributedsystems" +
      ".Food.AllFoodRequest\032(.distributedsystem" +
      "s.Food.AllFoodResponse\022R\n\003add\022$.distribu" +
      "tedsystems.Food.FoodRequest\032%.distribute" +
      "dsystems.Food.FoodResponse\022W\n\004byId\022(.dis" +
      "tributedsystems.Food.FoodByIdRequest\032%.d" +
      "istributedsystems.Food.FoodResponse\022[\n\006b" +
      "yName\022*.distributedsystems.Food.FoodByNa" +
      "meRequest\032%.distributedsystems.Food.Food" +
      "Response\022_\n\006delete\022(.distributedsystems." +
      "Food.FoodByIdRequest\032+.distributedsystem" +
      "s.Food.DeleteFoodResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_distributedsystems_Food_FoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_distributedsystems_Food_FoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_Food_FoodResponse_descriptor,
        new java.lang.String[] { "Id", "Taste", "Name", });
    internal_static_distributedsystems_Food_FoodRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_distributedsystems_Food_FoodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_Food_FoodRequest_descriptor,
        new java.lang.String[] { "Taste", "Name", });
    internal_static_distributedsystems_Food_AllFoodRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_distributedsystems_Food_AllFoodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_Food_AllFoodRequest_descriptor,
        new java.lang.String[] { });
    internal_static_distributedsystems_Food_AllFoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_distributedsystems_Food_AllFoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_Food_AllFoodResponse_descriptor,
        new java.lang.String[] { "Food", });
    internal_static_distributedsystems_Food_FoodByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_distributedsystems_Food_FoodByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_Food_FoodByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_distributedsystems_Food_FoodByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_distributedsystems_Food_FoodByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_Food_FoodByNameRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_distributedsystems_Food_DeleteFoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_distributedsystems_Food_DeleteFoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_Food_DeleteFoodResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}