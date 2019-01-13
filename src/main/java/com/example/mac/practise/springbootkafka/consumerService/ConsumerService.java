package com.example.mac.practise.springbootkafka.consumerService;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerService {

    public void receive(String message);
}
