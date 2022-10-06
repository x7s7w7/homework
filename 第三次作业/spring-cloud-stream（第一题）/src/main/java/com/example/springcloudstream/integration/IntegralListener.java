package com.example.springcloudstream.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class IntegralListener {
    @StreamListener(Order.order)
    public void listenOrders(String id) {
        log.info("order id :{}",id);
    }
}
