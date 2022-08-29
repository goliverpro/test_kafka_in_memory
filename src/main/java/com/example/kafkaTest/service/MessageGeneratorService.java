package com.example.kafkaTest.service;

import com.example.kafkaTest.integration.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageGeneratorService {

    @Autowired
    private KafkaProducer producer;

    @Value("${spring.kafka.topic}")
    private String topic;

    public void sendMessage(String message){
        producer.send(topic, message);

    }
}
