package ru.ccfit.golubevm.snake.exception.network.messaging;

import ru.ccfit.golubevm.snake.exception.network.NetworkException;

public class MulticastReceiverException extends NetworkException {
    public MulticastReceiverException(String message, Throwable cause) {
        super(message, cause);
    }
}
