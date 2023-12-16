// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol.proto

// Protobuf Java Version: 3.25.1
package ru.ccfit.golubevm.snake.protobuf.protocol;

/**
 * <pre>
 * Параметры идущей игры (не должны меняться в процессе игры) 
 * </pre>
 *
 * Protobuf type {@code snakes.GameConfig}
 */
public final class GameConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:snakes.GameConfig)
    GameConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameConfig.newBuilder() to construct.
  private GameConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameConfig() {
    width_ = 40;
    height_ = 30;
    foodStatic_ = 1;
    stateDelayMs_ = 1000;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GameConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GameConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig.class, ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig.Builder.class);
  }

  private int bitField0_;
  public static final int WIDTH_FIELD_NUMBER = 1;
  private int width_ = 40;
  /**
   * <pre>
   * Ширина поля в клетках (от 10 до 100)
   * </pre>
   *
   * <code>optional int32 width = 1 [default = 40];</code>
   * @return Whether the width field is set.
   */
  @java.lang.Override
  public boolean hasWidth() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Ширина поля в клетках (от 10 до 100)
   * </pre>
   *
   * <code>optional int32 width = 1 [default = 40];</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private int height_ = 30;
  /**
   * <pre>
   * Высота поля в клетках (от 10 до 100)
   * </pre>
   *
   * <code>optional int32 height = 2 [default = 30];</code>
   * @return Whether the height field is set.
   */
  @java.lang.Override
  public boolean hasHeight() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Высота поля в клетках (от 10 до 100)
   * </pre>
   *
   * <code>optional int32 height = 2 [default = 30];</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int FOOD_STATIC_FIELD_NUMBER = 3;
  private int foodStatic_ = 1;
  /**
   * <pre>
   * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
   * </pre>
   *
   * <code>optional int32 food_static = 3 [default = 1];</code>
   * @return Whether the foodStatic field is set.
   */
  @java.lang.Override
  public boolean hasFoodStatic() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
   * </pre>
   *
   * <code>optional int32 food_static = 3 [default = 1];</code>
   * @return The foodStatic.
   */
  @java.lang.Override
  public int getFoodStatic() {
    return foodStatic_;
  }

  public static final int STATE_DELAY_MS_FIELD_NUMBER = 5;
  private int stateDelayMs_ = 1000;
  /**
   * <pre>
   * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 100 до 3000)
   * </pre>
   *
   * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
   * @return Whether the stateDelayMs field is set.
   */
  @java.lang.Override
  public boolean hasStateDelayMs() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 100 до 3000)
   * </pre>
   *
   * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
   * @return The stateDelayMs.
   */
  @java.lang.Override
  public int getStateDelayMs() {
    return stateDelayMs_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, width_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, height_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, foodStatic_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(5, stateDelayMs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, width_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, height_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, foodStatic_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, stateDelayMs_);
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
    if (!(obj instanceof ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig)) {
      return super.equals(obj);
    }
    ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig other = (ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig) obj;

    if (hasWidth() != other.hasWidth()) return false;
    if (hasWidth()) {
      if (getWidth()
          != other.getWidth()) return false;
    }
    if (hasHeight() != other.hasHeight()) return false;
    if (hasHeight()) {
      if (getHeight()
          != other.getHeight()) return false;
    }
    if (hasFoodStatic() != other.hasFoodStatic()) return false;
    if (hasFoodStatic()) {
      if (getFoodStatic()
          != other.getFoodStatic()) return false;
    }
    if (hasStateDelayMs() != other.hasStateDelayMs()) return false;
    if (hasStateDelayMs()) {
      if (getStateDelayMs()
          != other.getStateDelayMs()) return false;
    }
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
    if (hasWidth()) {
      hash = (37 * hash) + WIDTH_FIELD_NUMBER;
      hash = (53 * hash) + getWidth();
    }
    if (hasHeight()) {
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getHeight();
    }
    if (hasFoodStatic()) {
      hash = (37 * hash) + FOOD_STATIC_FIELD_NUMBER;
      hash = (53 * hash) + getFoodStatic();
    }
    if (hasStateDelayMs()) {
      hash = (37 * hash) + STATE_DELAY_MS_FIELD_NUMBER;
      hash = (53 * hash) + getStateDelayMs();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig parseFrom(
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
  public static Builder newBuilder(ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig prototype) {
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
   * Параметры идущей игры (не должны меняться в процессе игры) 
   * </pre>
   *
   * Protobuf type {@code snakes.GameConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:snakes.GameConfig)
      ru.ccfit.golubevm.snake.protobuf.protocol.GameConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GameConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GameConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig.class, ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig.Builder.class);
    }

    // Construct using ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig.newBuilder()
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
      width_ = 40;
      height_ = 30;
      foodStatic_ = 1;
      stateDelayMs_ = 1000;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.SnakesProto.internal_static_snakes_GameConfig_descriptor;
    }

    @java.lang.Override
    public ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig getDefaultInstanceForType() {
      return ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig.getDefaultInstance();
    }

    @java.lang.Override
    public ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig build() {
      ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig buildPartial() {
      ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig result = new ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.width_ = width_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.height_ = height_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.foodStatic_ = foodStatic_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.stateDelayMs_ = stateDelayMs_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig) {
        return mergeFrom((ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig other) {
      if (other == ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig.getDefaultInstance()) return this;
      if (other.hasWidth()) {
        setWidth(other.getWidth());
      }
      if (other.hasHeight()) {
        setHeight(other.getHeight());
      }
      if (other.hasFoodStatic()) {
        setFoodStatic(other.getFoodStatic());
      }
      if (other.hasStateDelayMs()) {
        setStateDelayMs(other.getStateDelayMs());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
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
            case 8: {
              width_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              height_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              foodStatic_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 40: {
              stateDelayMs_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 40
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

    private int width_ = 40;
    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @return Whether the width field is set.
     */
    @java.lang.Override
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {

      width_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000001);
      width_ = 40;
      onChanged();
      return this;
    }

    private int height_ = 30;
    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @return Whether the height field is set.
     */
    @java.lang.Override
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {

      height_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      height_ = 30;
      onChanged();
      return this;
    }

    private int foodStatic_ = 1;
    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @return Whether the foodStatic field is set.
     */
    @java.lang.Override
    public boolean hasFoodStatic() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @return The foodStatic.
     */
    @java.lang.Override
    public int getFoodStatic() {
      return foodStatic_;
    }
    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @param value The foodStatic to set.
     * @return This builder for chaining.
     */
    public Builder setFoodStatic(int value) {

      foodStatic_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @return This builder for chaining.
     */
    public Builder clearFoodStatic() {
      bitField0_ = (bitField0_ & ~0x00000004);
      foodStatic_ = 1;
      onChanged();
      return this;
    }

    private int stateDelayMs_ = 1000;
    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 100 до 3000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @return Whether the stateDelayMs field is set.
     */
    @java.lang.Override
    public boolean hasStateDelayMs() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 100 до 3000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @return The stateDelayMs.
     */
    @java.lang.Override
    public int getStateDelayMs() {
      return stateDelayMs_;
    }
    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 100 до 3000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @param value The stateDelayMs to set.
     * @return This builder for chaining.
     */
    public Builder setStateDelayMs(int value) {

      stateDelayMs_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 100 до 3000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @return This builder for chaining.
     */
    public Builder clearStateDelayMs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      stateDelayMs_ = 1000;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:snakes.GameConfig)
  }

  // @@protoc_insertion_point(class_scope:snakes.GameConfig)
  private static final ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig();
  }

  public static ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GameConfig>
      PARSER = new com.google.protobuf.AbstractParser<GameConfig>() {
    @java.lang.Override
    public GameConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.ccfit.golubevm.snake.protobuf.protocol.GameConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

