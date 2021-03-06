// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/java/dto/student.proto

package dto;

public final class StudentProtoDTO {
  private StudentProtoDTO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StudentDTOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StudentDTO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string age = 1;</code>
     * @return Whether the age field is set.
     */
    boolean hasAge();
    /**
     * <code>required string age = 1;</code>
     * @return The age.
     */
    String getAge();
    /**
     * <code>required string age = 1;</code>
     * @return The bytes for age.
     */
    com.google.protobuf.ByteString
        getAgeBytes();

    /**
     * <code>required string name = 2;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>required string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required string surname = 3;</code>
     * @return Whether the surname field is set.
     */
    boolean hasSurname();
    /**
     * <code>required string surname = 3;</code>
     * @return The surname.
     */
    String getSurname();
    /**
     * <code>required string surname = 3;</code>
     * @return The bytes for surname.
     */
    com.google.protobuf.ByteString
        getSurnameBytes();

    /**
     * <code>repeated string id = 4;</code>
     * @return A list containing the id.
     */
    java.util.List<String>
        getIdList();
    /**
     * <code>repeated string id = 4;</code>
     * @return The count of id.
     */
    int getIdCount();
    /**
     * <code>repeated string id = 4;</code>
     * @param index The index of the element to return.
     * @return The id at the given index.
     */
    String getId(int index);
    /**
     * <code>repeated string id = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the id at the given index.
     */
    com.google.protobuf.ByteString
        getIdBytes(int index);
  }
  /**
   * Protobuf type {@code StudentDTO}
   */
  public static final class StudentDTO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StudentDTO)
      StudentDTOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StudentDTO.newBuilder() to construct.
    private StudentDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StudentDTO() {
      age_ = "";
      name_ = "";
      surname_ = "";
      id_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new StudentDTO();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StudentDTO(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              age_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              surname_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                id_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              id_.add(bs);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          id_ = id_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StudentProtoDTO.internal_static_StudentDTO_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StudentProtoDTO.internal_static_StudentDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StudentDTO.class, Builder.class);
    }

    private int bitField0_;
    public static final int AGE_FIELD_NUMBER = 1;
    private volatile Object age_;
    /**
     * <code>required string age = 1;</code>
     * @return Whether the age field is set.
     */
    @Override
    public boolean hasAge() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string age = 1;</code>
     * @return The age.
     */
    @Override
    public String getAge() {
      Object ref = age_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          age_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string age = 1;</code>
     * @return The bytes for age.
     */
    @Override
    public com.google.protobuf.ByteString
        getAgeBytes() {
      Object ref = age_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        age_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile Object name_;
    /**
     * <code>required string name = 2;</code>
     * @return Whether the name field is set.
     */
    @Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string name = 2;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SURNAME_FIELD_NUMBER = 3;
    private volatile Object surname_;
    /**
     * <code>required string surname = 3;</code>
     * @return Whether the surname field is set.
     */
    @Override
    public boolean hasSurname() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string surname = 3;</code>
     * @return The surname.
     */
    @Override
    public String getSurname() {
      Object ref = surname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          surname_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string surname = 3;</code>
     * @return The bytes for surname.
     */
    @Override
    public com.google.protobuf.ByteString
        getSurnameBytes() {
      Object ref = surname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        surname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList id_;
    /**
     * <code>repeated string id = 4;</code>
     * @return A list containing the id.
     */
    public com.google.protobuf.ProtocolStringList
        getIdList() {
      return id_;
    }
    /**
     * <code>repeated string id = 4;</code>
     * @return The count of id.
     */
    public int getIdCount() {
      return id_.size();
    }
    /**
     * <code>repeated string id = 4;</code>
     * @param index The index of the element to return.
     * @return The id at the given index.
     */
    public String getId(int index) {
      return id_.get(index);
    }
    /**
     * <code>repeated string id = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the id at the given index.
     */
    public com.google.protobuf.ByteString
        getIdBytes(int index) {
      return id_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAge()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSurname()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, age_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, surname_);
      }
      for (int i = 0; i < id_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, id_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, age_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, surname_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < id_.size(); i++) {
          dataSize += computeStringSizeNoTag(id_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getIdList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof StudentDTO)) {
        return super.equals(obj);
      }
      StudentDTO other = (StudentDTO) obj;

      if (hasAge() != other.hasAge()) return false;
      if (hasAge()) {
        if (!getAge()
            .equals(other.getAge())) return false;
      }
      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasSurname() != other.hasSurname()) return false;
      if (hasSurname()) {
        if (!getSurname()
            .equals(other.getSurname())) return false;
      }
      if (!getIdList()
          .equals(other.getIdList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAge()) {
        hash = (37 * hash) + AGE_FIELD_NUMBER;
        hash = (53 * hash) + getAge().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasSurname()) {
        hash = (37 * hash) + SURNAME_FIELD_NUMBER;
        hash = (53 * hash) + getSurname().hashCode();
      }
      if (getIdCount() > 0) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getIdList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static StudentDTO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentDTO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentDTO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentDTO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentDTO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentDTO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentDTO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StudentDTO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static StudentDTO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static StudentDTO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static StudentDTO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StudentDTO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(StudentDTO prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code StudentDTO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StudentDTO)
        StudentDTOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return StudentProtoDTO.internal_static_StudentDTO_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return StudentProtoDTO.internal_static_StudentDTO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StudentDTO.class, Builder.class);
      }

      // Construct using dto.StudentProtoDTO.StudentDTO.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        age_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        surname_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        id_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return StudentProtoDTO.internal_static_StudentDTO_descriptor;
      }

      @Override
      public StudentDTO getDefaultInstanceForType() {
        return StudentDTO.getDefaultInstance();
      }

      @Override
      public StudentDTO build() {
        StudentDTO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public StudentDTO buildPartial() {
        StudentDTO result = new StudentDTO(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.age_ = age_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.surname_ = surname_;
        if (((bitField0_ & 0x00000008) != 0)) {
          id_ = id_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.id_ = id_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof StudentDTO) {
          return mergeFrom((StudentDTO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StudentDTO other) {
        if (other == StudentDTO.getDefaultInstance()) return this;
        if (other.hasAge()) {
          bitField0_ |= 0x00000001;
          age_ = other.age_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasSurname()) {
          bitField0_ |= 0x00000004;
          surname_ = other.surname_;
          onChanged();
        }
        if (!other.id_.isEmpty()) {
          if (id_.isEmpty()) {
            id_ = other.id_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureIdIsMutable();
            id_.addAll(other.id_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasAge()) {
          return false;
        }
        if (!hasName()) {
          return false;
        }
        if (!hasSurname()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        StudentDTO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StudentDTO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object age_ = "";
      /**
       * <code>required string age = 1;</code>
       * @return Whether the age field is set.
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string age = 1;</code>
       * @return The age.
       */
      public String getAge() {
        Object ref = age_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            age_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string age = 1;</code>
       * @return The bytes for age.
       */
      public com.google.protobuf.ByteString
          getAgeBytes() {
        Object ref = age_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          age_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string age = 1;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string age = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000001);
        age_ = getDefaultInstance().getAge();
        onChanged();
        return this;
      }
      /**
       * <code>required string age = 1;</code>
       * @param value The bytes for age to set.
       * @return This builder for chaining.
       */
      public Builder setAgeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        age_ = value;
        onChanged();
        return this;
      }

      private Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string name = 2;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private Object surname_ = "";
      /**
       * <code>required string surname = 3;</code>
       * @return Whether the surname field is set.
       */
      public boolean hasSurname() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required string surname = 3;</code>
       * @return The surname.
       */
      public String getSurname() {
        Object ref = surname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            surname_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string surname = 3;</code>
       * @return The bytes for surname.
       */
      public com.google.protobuf.ByteString
          getSurnameBytes() {
        Object ref = surname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          surname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string surname = 3;</code>
       * @param value The surname to set.
       * @return This builder for chaining.
       */
      public Builder setSurname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        surname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string surname = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSurname() {
        bitField0_ = (bitField0_ & ~0x00000004);
        surname_ = getDefaultInstance().getSurname();
        onChanged();
        return this;
      }
      /**
       * <code>required string surname = 3;</code>
       * @param value The bytes for surname to set.
       * @return This builder for chaining.
       */
      public Builder setSurnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        surname_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList id_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureIdIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          id_ = new com.google.protobuf.LazyStringArrayList(id_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string id = 4;</code>
       * @return A list containing the id.
       */
      public com.google.protobuf.ProtocolStringList
          getIdList() {
        return id_.getUnmodifiableView();
      }
      /**
       * <code>repeated string id = 4;</code>
       * @return The count of id.
       */
      public int getIdCount() {
        return id_.size();
      }
      /**
       * <code>repeated string id = 4;</code>
       * @param index The index of the element to return.
       * @return The id at the given index.
       */
      public String getId(int index) {
        return id_.get(index);
      }
      /**
       * <code>repeated string id = 4;</code>
       * @param index The index of the value to return.
       * @return The bytes of the id at the given index.
       */
      public com.google.protobuf.ByteString
          getIdBytes(int index) {
        return id_.getByteString(index);
      }
      /**
       * <code>repeated string id = 4;</code>
       * @param index The index to set the value at.
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureIdIsMutable();
        id_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string id = 4;</code>
       * @param value The id to add.
       * @return This builder for chaining.
       */
      public Builder addId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureIdIsMutable();
        id_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string id = 4;</code>
       * @param values The id to add.
       * @return This builder for chaining.
       */
      public Builder addAllId(
          Iterable<String> values) {
        ensureIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, id_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        id_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string id = 4;</code>
       * @param value The bytes of the id to add.
       * @return This builder for chaining.
       */
      public Builder addIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureIdIsMutable();
        id_.add(value);
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:StudentDTO)
    }

    // @@protoc_insertion_point(class_scope:StudentDTO)
    private static final StudentDTO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StudentDTO();
    }

    public static StudentDTO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<StudentDTO>
        PARSER = new com.google.protobuf.AbstractParser<StudentDTO>() {
      @Override
      public StudentDTO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StudentDTO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StudentDTO> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<StudentDTO> getParserForType() {
      return PARSER;
    }

    @Override
    public StudentDTO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentDTO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentDTO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033main/java/dto/student.proto\"D\n\nStudent" +
      "DTO\022\013\n\003age\030\001 \002(\t\022\014\n\004name\030\002 \002(\t\022\017\n\007surnam" +
      "e\030\003 \002(\t\022\n\n\002id\030\004 \003(\tB\026\n\003dtoB\017StudentProto" +
      "DTO"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StudentDTO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StudentDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentDTO_descriptor,
        new String[] { "Age", "Name", "Surname", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
