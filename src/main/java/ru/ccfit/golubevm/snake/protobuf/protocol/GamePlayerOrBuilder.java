// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol.proto

// Protobuf Java Version: 3.25.1
package ru.ccfit.golubevm.snake.protobuf.protocol;

public interface GamePlayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:snakes.GamePlayer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Имя игрока (для отображения в интерфейсе)
   * </pre>
   *
   * <code>required string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Имя игрока (для отображения в интерфейсе)
   * </pre>
   *
   * <code>required string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Имя игрока (для отображения в интерфейсе)
   * </pre>
   *
   * <code>required string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Уникальный идентификатор игрока в пределах игры
   * </pre>
   *
   * <code>required int32 id = 2;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Уникальный идентификатор игрока в пределах игры
   * </pre>
   *
   * <code>required int32 id = 2;</code>
   * @return The id.
   */
  int getId();

  /**
   * <pre>
   * IPv4 или IPv6 адрес игрока в виде строки. Отсутствует в описании игрока-отправителя сообщения
   * </pre>
   *
   * <code>optional string ip_address = 3;</code>
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   * <pre>
   * IPv4 или IPv6 адрес игрока в виде строки. Отсутствует в описании игрока-отправителя сообщения
   * </pre>
   *
   * <code>optional string ip_address = 3;</code>
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   * <pre>
   * IPv4 или IPv6 адрес игрока в виде строки. Отсутствует в описании игрока-отправителя сообщения
   * </pre>
   *
   * <code>optional string ip_address = 3;</code>
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <pre>
   * Порт UDP-сокета игрока. Отсутствует в описании игрока-отправителя сообщения
   * </pre>
   *
   * <code>optional int32 port = 4;</code>
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   * <pre>
   * Порт UDP-сокета игрока. Отсутствует в описании игрока-отправителя сообщения
   * </pre>
   *
   * <code>optional int32 port = 4;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <pre>
   * Роль узла в топологии
   * </pre>
   *
   * <code>required .snakes.NodeRole role = 5;</code>
   * @return Whether the role field is set.
   */
  boolean hasRole();
  /**
   * <pre>
   * Роль узла в топологии
   * </pre>
   *
   * <code>required .snakes.NodeRole role = 5;</code>
   * @return The role.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.NodeRole getRole();

  /**
   * <pre>
   * Тип игрока
   * </pre>
   *
   * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Тип игрока
   * </pre>
   *
   * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
   * @return The type.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.PlayerType getType();

  /**
   * <pre>
   * Число очков, которые набрал игрок
   * </pre>
   *
   * <code>required int32 score = 7;</code>
   * @return Whether the score field is set.
   */
  boolean hasScore();
  /**
   * <pre>
   * Число очков, которые набрал игрок
   * </pre>
   *
   * <code>required int32 score = 7;</code>
   * @return The score.
   */
  int getScore();
}