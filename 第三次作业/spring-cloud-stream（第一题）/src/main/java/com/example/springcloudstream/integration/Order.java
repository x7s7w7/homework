package com.example.springcloudstream.integration;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Order {
    String order = "order";

    @Output(order)
    MessageChannel order();
}
