package com.KafkaDemo.KafkaDemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer2 {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendMsgToTopic(String message){
        kafkaTemplate.send("Topic2", message);
    }
}
