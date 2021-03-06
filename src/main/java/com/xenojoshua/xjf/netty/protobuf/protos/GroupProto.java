// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package com.xenojoshua.xjf.netty.protobuf.protos;

public final class GroupProto {
  private GroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GroupOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 id = 1;
    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();

    // required string name = 2;
    /**
     * <code>required string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // repeated .Player players = 3;
    /**
     * <code>repeated .Player players = 3;</code>
     */
    java.util.List<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player> 
        getPlayersList();
    /**
     * <code>repeated .Player players = 3;</code>
     */
    com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player getPlayers(int index);
    /**
     * <code>repeated .Player players = 3;</code>
     */
    int getPlayersCount();
    /**
     * <code>repeated .Player players = 3;</code>
     */
    java.util.List<? extends com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder> 
        getPlayersOrBuilderList();
    /**
     * <code>repeated .Player players = 3;</code>
     */
    com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder getPlayersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Group}
   */
  public static final class Group extends
      com.google.protobuf.GeneratedMessage
      implements GroupOrBuilder {
    // Use Group.newBuilder() to construct.
    private Group(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Group(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Group defaultInstance;
    public static Group getDefaultInstance() {
      return defaultInstance;
    }

    public Group getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Group(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              name_ = input.readBytes();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                players_ = new java.util.ArrayList<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player>();
                mutable_bitField0_ |= 0x00000004;
              }
              players_.add(input.readMessage(com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          players_ = java.util.Collections.unmodifiableList(players_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.internal_static_Group_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.internal_static_Group_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group.class, com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group.Builder.class);
    }

    public static com.google.protobuf.Parser<Group> PARSER =
        new com.google.protobuf.AbstractParser<Group>() {
      public Group parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Group(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Group> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    // required string name = 2;
    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .Player players = 3;
    public static final int PLAYERS_FIELD_NUMBER = 3;
    private java.util.List<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player> players_;
    /**
     * <code>repeated .Player players = 3;</code>
     */
    public java.util.List<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player> getPlayersList() {
      return players_;
    }
    /**
     * <code>repeated .Player players = 3;</code>
     */
    public java.util.List<? extends com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder> 
        getPlayersOrBuilderList() {
      return players_;
    }
    /**
     * <code>repeated .Player players = 3;</code>
     */
    public int getPlayersCount() {
      return players_.size();
    }
    /**
     * <code>repeated .Player players = 3;</code>
     */
    public com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player getPlayers(int index) {
      return players_.get(index);
    }
    /**
     * <code>repeated .Player players = 3;</code>
     */
    public com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder getPlayersOrBuilder(
        int index) {
      return players_.get(index);
    }

    private void initFields() {
      id_ = 0;
      name_ = "";
      players_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPlayersCount(); i++) {
        if (!getPlayers(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      for (int i = 0; i < players_.size(); i++) {
        output.writeMessage(3, players_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      for (int i = 0; i < players_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, players_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Group}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.GroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.internal_static_Group_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.internal_static_Group_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group.class, com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group.Builder.class);
      }

      // Construct using com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPlayersFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (playersBuilder_ == null) {
          players_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          playersBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.internal_static_Group_descriptor;
      }

      public com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group getDefaultInstanceForType() {
        return com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group.getDefaultInstance();
      }

      public com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group build() {
        com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group buildPartial() {
        com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group result = new com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (playersBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            players_ = java.util.Collections.unmodifiableList(players_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.players_ = players_;
        } else {
          result.players_ = playersBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group) {
          return mergeFrom((com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group other) {
        if (other == com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (playersBuilder_ == null) {
          if (!other.players_.isEmpty()) {
            if (players_.isEmpty()) {
              players_ = other.players_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePlayersIsMutable();
              players_.addAll(other.players_);
            }
            onChanged();
          }
        } else {
          if (!other.players_.isEmpty()) {
            if (playersBuilder_.isEmpty()) {
              playersBuilder_.dispose();
              playersBuilder_ = null;
              players_ = other.players_;
              bitField0_ = (bitField0_ & ~0x00000004);
              playersBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPlayersFieldBuilder() : null;
            } else {
              playersBuilder_.addAllMessages(other.players_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        for (int i = 0; i < getPlayersCount(); i++) {
          if (!getPlayers(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xenojoshua.xjf.netty.protobuf.protos.GroupProto.Group) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 id = 1;
      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      // required string name = 2;
      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
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
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
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

      // repeated .Player players = 3;
      private java.util.List<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player> players_ =
        java.util.Collections.emptyList();
      private void ensurePlayersIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          players_ = new java.util.ArrayList<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player>(players_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder> playersBuilder_;

      /**
       * <code>repeated .Player players = 3;</code>
       */
      public java.util.List<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player> getPlayersList() {
        if (playersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(players_);
        } else {
          return playersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public int getPlayersCount() {
        if (playersBuilder_ == null) {
          return players_.size();
        } else {
          return playersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player getPlayers(int index) {
        if (playersBuilder_ == null) {
          return players_.get(index);
        } else {
          return playersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder setPlayers(
          int index, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.set(index, value);
          onChanged();
        } else {
          playersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder setPlayers(
          int index, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.set(index, builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder addPlayers(com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.add(value);
          onChanged();
        } else {
          playersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder addPlayers(
          int index, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.add(index, value);
          onChanged();
        } else {
          playersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder addPlayers(
          com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.add(builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder addPlayers(
          int index, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.add(index, builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder addAllPlayers(
          java.lang.Iterable<? extends com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player> values) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          super.addAll(values, players_);
          onChanged();
        } else {
          playersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder clearPlayers() {
        if (playersBuilder_ == null) {
          players_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          playersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public Builder removePlayers(int index) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.remove(index);
          onChanged();
        } else {
          playersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder getPlayersBuilder(
          int index) {
        return getPlayersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder getPlayersOrBuilder(
          int index) {
        if (playersBuilder_ == null) {
          return players_.get(index);  } else {
          return playersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public java.util.List<? extends com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder> 
           getPlayersOrBuilderList() {
        if (playersBuilder_ != null) {
          return playersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(players_);
        }
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder addPlayersBuilder() {
        return getPlayersFieldBuilder().addBuilder(
            com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.getDefaultInstance());
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder addPlayersBuilder(
          int index) {
        return getPlayersFieldBuilder().addBuilder(
            index, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.getDefaultInstance());
      }
      /**
       * <code>repeated .Player players = 3;</code>
       */
      public java.util.List<com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder> 
           getPlayersBuilderList() {
        return getPlayersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder> 
          getPlayersFieldBuilder() {
        if (playersBuilder_ == null) {
          playersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.Player.Builder, com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.PlayerOrBuilder>(
                  players_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          players_ = null;
        }
        return playersBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Group)
    }

    static {
      defaultInstance = new Group(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Group)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Group_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Group_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013group.proto\032\014player.proto\";\n\005Group\022\n\n\002" +
      "id\030\001 \002(\005\022\014\n\004name\030\002 \002(\t\022\030\n\007players\030\003 \003(\0132" +
      "\007.PlayerB6\n(com.xenojoshua.xjf.netty.pro" +
      "tobuf.protosB\nGroupProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Group_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Group_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Group_descriptor,
              new java.lang.String[] { "Id", "Name", "Players", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xenojoshua.xjf.netty.protobuf.protos.PlayerProto.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
