package com.example.kafkaprod;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public void sendMessage(MessageDTO msg) {
        kafkaTemplate.send("myTopic",msg);
    }
}
