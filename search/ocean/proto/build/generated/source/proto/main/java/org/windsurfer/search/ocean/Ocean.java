// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ocean.proto

package org.windsurfer.search.ocean;

public final class Ocean {
  private Ocean() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_windsurfer_search_ocean_OceanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_windsurfer_search_ocean_OceanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_windsurfer_search_ocean_OceanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_windsurfer_search_ocean_OceanResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013ocean.proto\022\033org.windsurfer.search.oce" +
      "an\032\031google/protobuf/any.proto\"\035\n\014OceanRe" +
      "quest\022\r\n\005query\030\001 \001(\t\"!\n\rOceanResponse\022\020\n" +
      "\010response\030\001 \001(\t2q\n\014OceanService\022a\n\006Searc" +
      "h\022).org.windsurfer.search.ocean.OceanReq" +
      "uest\032*.org.windsurfer.search.ocean.Ocean" +
      "Response\"\000B\037\n\033org.windsurfer.search.ocea" +
      "nP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_org_windsurfer_search_ocean_OceanRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_windsurfer_search_ocean_OceanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_windsurfer_search_ocean_OceanRequest_descriptor,
        new java.lang.String[] { "Query", });
    internal_static_org_windsurfer_search_ocean_OceanResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_windsurfer_search_ocean_OceanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_windsurfer_search_ocean_OceanResponse_descriptor,
        new java.lang.String[] { "Response", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}