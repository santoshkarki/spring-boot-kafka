package com.example.mac.practise.springbootkafka.producerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    private static Logger logger = LoggerFactory.getLogger(ProducerServiceImpl.class);

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Value("${san.kafka.topic}")
    private String kafkaTopic;

    @Override
    public void sendMessage(String message) {

        logger.info(String.format("#### -> Producing message -> %s", message));
        kafkaTemplate.send(kafkaTopic,message);
    }
}

