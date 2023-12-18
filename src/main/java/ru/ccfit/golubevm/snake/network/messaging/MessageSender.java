package ru.ccfit.golubevm.snake.network.messaging;

import ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage;

public interface MessageSender {
    void sendMessage(GameMessage message);
}
