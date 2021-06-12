package com.bfyamada.rabbitmq.demo.publisher;

import com.bfyamada.rabbitmq.demo.config.MessagingConfig;
import com.bfyamada.rabbitmq.demo.dto.Order;
import com.bfyamada.rabbitmq.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{storeName}")
    public ResponseEntity<Void> bookOrder(@RequestBody Order order, @PathVariable String storeName){
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS","order placed successfully in "+storeName);
        template.convertAndSend(MessagingConfig.EXCHANGE,MessagingConfig.ROUNTING_KEY, orderStatus);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
