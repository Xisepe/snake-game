package ru.ccfit.golubevm.snake;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.ccfit.golubevm.snake.network.messaging.MessageReceiver;

@SpringBootApplication
@RequiredArgsConstructor
public class SnakeApplication {

    private final MessageReceiver receiver;

    public static void main(String[] args) {
        SpringApplication.run(SnakeApplication.class, args);
    }

}
