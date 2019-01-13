package com.example.mac.practise.springbootkafka.controller;

import com.example.mac.practise.springbootkafka.producerService.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {


    @Autowired
    ProducerService producer;
    @RequestMapping(value = "/publish", method= RequestMethod.GET)
    public String sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
        return "message send";
    }
}
