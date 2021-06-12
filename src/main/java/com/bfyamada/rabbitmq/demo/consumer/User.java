package com.bfyamada.rabbitmq.demo.consumer;

import com.bfyamada.rabbitmq.demo.config.MessagingConfig;
import com.bfyamada.rabbitmq.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = {MessagingConfig.QUEUE})
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        System.out.println("Message received from queue: "+ orderStatus);
    }
}
