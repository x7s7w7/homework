package com.example.springcloudstream.controller;

import com.example.springcloudstream.integration.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private Order order;

    @PostMapping("order")
    public String createOrder(String id){
        order.order().send(MessageBuilder.withPayload(id).build());
        return "success";
    }
}
