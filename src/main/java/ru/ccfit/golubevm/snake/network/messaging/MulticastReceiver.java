package ru.ccfit.golubevm.snake.network.messaging;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ru.ccfit.golubevm.snake.exception.network.messaging.MulticastReceiverException;
import ru.ccfit.golubevm.snake.protobuf.protocol.GameMessage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
@RequiredArgsConstructor
@Slf4j
public class MulticastReceiver implements MessageReceiver {
    private final MulticastSocket socket;

    public MulticastReceiver(String groupAddress, int port) {
        try {
            log.info("Creating new Receiver");
            this.socket = new MulticastSocket(port);
            socket.joinGroup(new InetSocketAddress(groupAddress, 0), null);
        } catch (IOException e) {
            log.error("Failed to create MulticastReceiver with address:port={}:{}", groupAddress, port);
            throw new MulticastReceiverException("Cannot create MulticastReceiver", e);
        }
    }

    @Override
    public GameMessage receiveMessage() {
        return null;
    }
}
