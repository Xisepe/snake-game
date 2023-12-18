package ru.ccfit.golubevm.snake.network.messaging;

import ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage;

public interface MessageReceiver {
    GameMessage receiveMessage();
}
