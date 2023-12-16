// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol.proto

// Protobuf Java Version: 3.25.1
package ru.ccfit.golubevm.snake.protobuf.protocol;

public interface GameMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:snakes.GameMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
   * </pre>
   *
   * <code>required int64 msg_seq = 1;</code>
   * @return Whether the msgSeq field is set.
   */
  boolean hasMsgSeq();
  /**
   * <pre>
   * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
   * </pre>
   *
   * <code>required int64 msg_seq = 1;</code>
   * @return The msgSeq.
   */
  long getMsgSeq();

  /**
   * <pre>
   * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
   * </pre>
   *
   * <code>optional int32 sender_id = 10;</code>
   * @return Whether the senderId field is set.
   */
  boolean hasSenderId();
  /**
   * <pre>
   * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
   * </pre>
   *
   * <code>optional int32 sender_id = 10;</code>
   * @return The senderId.
   */
  int getSenderId();

  /**
   * <pre>
   * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
   * </pre>
   *
   * <code>optional int32 receiver_id = 11;</code>
   * @return Whether the receiverId field is set.
   */
  boolean hasReceiverId();
  /**
   * <pre>
   * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
   * </pre>
   *
   * <code>optional int32 receiver_id = 11;</code>
   * @return The receiverId.
   */
  int getReceiverId();

  /**
   * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
   * @return Whether the ping field is set.
   */
  boolean hasPing();
  /**
   * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
   * @return The ping.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.PingMsg getPing();
  /**
   * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.PingMsgOrBuilder getPingOrBuilder();

  /**
   * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
   * @return Whether the steer field is set.
   */
  boolean hasSteer();
  /**
   * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
   * @return The steer.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.SteerMsg getSteer();
  /**
   * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.SteerMsgOrBuilder getSteerOrBuilder();

  /**
   * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
   * @return Whether the ack field is set.
   */
  boolean hasAck();
  /**
   * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
   * @return The ack.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.AckMsg getAck();
  /**
   * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.AckMsgOrBuilder getAckOrBuilder();

  /**
   * <code>.snakes.GameMessage.StateMsg state = 5;</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <code>.snakes.GameMessage.StateMsg state = 5;</code>
   * @return The state.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.StateMsg getState();
  /**
   * <code>.snakes.GameMessage.StateMsg state = 5;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.StateMsgOrBuilder getStateOrBuilder();

  /**
   * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
   * @return Whether the announcement field is set.
   */
  boolean hasAnnouncement();
  /**
   * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
   * @return The announcement.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.AnnouncementMsg getAnnouncement();
  /**
   * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.AnnouncementMsgOrBuilder getAnnouncementOrBuilder();

  /**
   * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
   * @return Whether the join field is set.
   */
  boolean hasJoin();
  /**
   * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
   * @return The join.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.JoinMsg getJoin();
  /**
   * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.JoinMsgOrBuilder getJoinOrBuilder();

  /**
   * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
   * @return The error.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.ErrorMsg getError();
  /**
   * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.ErrorMsgOrBuilder getErrorOrBuilder();

  /**
   * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
   * @return Whether the roleChange field is set.
   */
  boolean hasRoleChange();
  /**
   * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
   * @return The roleChange.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.RoleChangeMsg getRoleChange();
  /**
   * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.RoleChangeMsgOrBuilder getRoleChangeOrBuilder();

  /**
   * <code>.snakes.GameMessage.DiscoverMsg discover = 12;</code>
   * @return Whether the discover field is set.
   */
  boolean hasDiscover();
  /**
   * <code>.snakes.GameMessage.DiscoverMsg discover = 12;</code>
   * @return The discover.
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.DiscoverMsg getDiscover();
  /**
   * <code>.snakes.GameMessage.DiscoverMsg discover = 12;</code>
   */
  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.DiscoverMsgOrBuilder getDiscoverOrBuilder();

  ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage.TypeCase getTypeCase();
}