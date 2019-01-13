package com.example.mac.practise.springbootkafka.consumerService;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServieImpl implements ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(ConsumerServieImpl.class);

    @Value("${san.kafka.topic}")
    private String kafkaTopic;

    @KafkaListener(topics = "${san.kafka.topic}")
    public void receive(String message) {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
