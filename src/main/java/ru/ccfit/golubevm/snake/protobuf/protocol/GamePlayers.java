// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol.proto

// Protobuf Java Version: 3.25.1
package ru.ccfit.golubevm.snake.protobuf.protocol;

/**
 * <pre>
 * Игроки конкретной игры 
 * </pre>
 *
 * Protobuf type {@code snakes.GamePlayers}
 */
public final class GamePlayers extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:snakes.GamePlayers)
    GamePlayersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GamePlayers.newBuilder() to construct.
  private GamePlayers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GamePlayers() {
    players_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GamePlayers();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GamePlayers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GamePlayers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers.class, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers.Builder.class);
  }

  public static final int PLAYERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer> players_;
  /**
   * <pre>
   * Список всех игроков
   * </pre>
   *
   * <code>repeated .snakes.GamePlayer players = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer> getPlayersList() {
    return players_;
  }
  /**
   * <pre>
   * Список всех игроков
   * </pre>
   *
   * <code>repeated .snakes.GamePlayer players = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayerOrBuilder> 
      getPlayersOrBuilderList() {
    return players_;
  }
  /**
   * <pre>
   * Список всех игроков
   * </pre>
   *
   * <code>repeated .snakes.GamePlayer players = 1;</code>
   */
  @java.lang.Override
  public int getPlayersCount() {
    return players_.size();
  }
  /**
   * <pre>
   * Список всех игроков
   * </pre>
   *
   * <code>repeated .snakes.GamePlayer players = 1;</code>
   */
  @java.lang.Override
  public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer getPlayers(int index) {
    return players_.get(index);
  }
  /**
   * <pre>
   * Список всех игроков
   * </pre>
   *
   * <code>repeated .snakes.GamePlayer players = 1;</code>
   */
  @java.lang.Override
  public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayerOrBuilder getPlayersOrBuilder(
      int index) {
    return players_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getPlayersCount(); i++) {
      if (!getPlayers(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < players_.size(); i++) {
      output.writeMessage(1, players_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < players_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, players_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers)) {
      return super.equals(obj);
    }
    ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers other = (ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers) obj;

    if (!getPlayersList()
        .equals(other.getPlayersList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPlayersCount() > 0) {
      hash = (37 * hash) + PLAYERS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Игроки конкретной игры 
   * </pre>
   *
   * Protobuf type {@code snakes.GamePlayers}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:snakes.GamePlayers)
      ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GamePlayers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GamePlayers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers.class, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers.Builder.class);
    }

    // Construct using ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (playersBuilder_ == null) {
        players_ = java.util.Collections.emptyList();
      } else {
        players_ = null;
        playersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GamePlayers_descriptor;
    }

    @java.lang.Override
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers getDefaultInstanceForType() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers.getDefaultInstance();
    }

    @java.lang.Override
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers build() {
      ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers buildPartial() {
      ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers result = new ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers result) {
      if (playersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          players_ = java.util.Collections.unmodifiableList(players_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.players_ = players_;
      } else {
        result.players_ = playersBuilder_.build();
      }
    }

    private void buildPartial0(ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers) {
        return mergeFrom((ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers other) {
      if (other == ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers.getDefaultInstance()) return this;
      if (playersBuilder_ == null) {
        if (!other.players_.isEmpty()) {
          if (players_.isEmpty()) {
            players_ = other.players_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
            playersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlayersFieldBuilder() : null;
          } else {
            playersBuilder_.addAllMessages(other.players_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      for (int i = 0; i < getPlayersCount(); i++) {
        if (!getPlayers(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer m =
                  input.readMessage(
                      ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.PARSER,
                      extensionRegistry);
              if (playersBuilder_ == null) {
                ensurePlayersIsMutable();
                players_.add(m);
              } else {
                playersBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer> players_ =
      java.util.Collections.emptyList();
    private void ensurePlayersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        players_ = new java.util.ArrayList<ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer>(players_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayerOrBuilder> playersBuilder_;

    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public java.util.List<ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer> getPlayersList() {
      if (playersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(players_);
      } else {
        return playersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public int getPlayersCount() {
      if (playersBuilder_ == null) {
        return players_.size();
      } else {
        return playersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer getPlayers(int index) {
      if (playersBuilder_ == null) {
        return players_.get(index);
      } else {
        return playersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder setPlayers(
        int index, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer value) {
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
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder setPlayers(
        int index, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder builderForValue) {
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
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder addPlayers(ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer value) {
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
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder addPlayers(
        int index, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer value) {
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
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder addPlayers(
        ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder builderForValue) {
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
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder addPlayers(
        int index, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder builderForValue) {
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
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder addAllPlayers(
        java.lang.Iterable<? extends ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer> values) {
      if (playersBuilder_ == null) {
        ensurePlayersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, players_);
        onChanged();
      } else {
        playersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public Builder clearPlayers() {
      if (playersBuilder_ == null) {
        players_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        playersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
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
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder getPlayersBuilder(
        int index) {
      return getPlayersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayerOrBuilder getPlayersOrBuilder(
        int index) {
      if (playersBuilder_ == null) {
        return players_.get(index);  } else {
        return playersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public java.util.List<? extends ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayerOrBuilder> 
         getPlayersOrBuilderList() {
      if (playersBuilder_ != null) {
        return playersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(players_);
      }
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder addPlayersBuilder() {
      return getPlayersFieldBuilder().addBuilder(
          ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.getDefaultInstance());
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder addPlayersBuilder(
        int index) {
      return getPlayersFieldBuilder().addBuilder(
          index, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.getDefaultInstance());
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    public java.util.List<ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder> 
         getPlayersBuilderList() {
      return getPlayersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayerOrBuilder> 
        getPlayersFieldBuilder() {
      if (playersBuilder_ == null) {
        playersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayer.Builder, ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayerOrBuilder>(
                players_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        players_ = null;
      }
      return playersBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:snakes.GamePlayers)
  }

  // @@protoc_insertion_point(class_scope:snakes.GamePlayers)
  private static final ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers();
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GamePlayers>
      PARSER = new com.google.protobuf.AbstractParser<GamePlayers>() {
    @java.lang.Override
    public GamePlayers parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GamePlayers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GamePlayers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.ccfit.golubevm.snake.protobuf.protocol.GamePlayers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

