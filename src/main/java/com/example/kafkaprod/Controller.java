package com.example.kafkaprod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    ProducerService producerService;

    @PostMapping
    public String sendKafka(@RequestBody MessageDTO message){
            producerService.sendMessage(message);
        return "OK : " + message;
    }
}
