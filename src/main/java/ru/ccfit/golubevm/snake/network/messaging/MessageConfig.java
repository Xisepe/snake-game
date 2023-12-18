package ru.ccfit.golubevm.snake.network.messaging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:static/messaging/messaging.properties")
public class MessageConfig {

    @Value("${receiver.ip}")
    private String receiverIp;
    @Value("${receiver.port}")
    private int receiverPort;

    @Bean
    public MessageReceiver multicastReceiver() {
        return new MulticastReceiver(receiverIp, receiverPort);
    }


}
