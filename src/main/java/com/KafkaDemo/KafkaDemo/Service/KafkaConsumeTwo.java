package com.KafkaDemo.KafkaDemo.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumeTwo {

    @KafkaListener(topics = "Topic2", groupId = "Kafka_ExampleID23")
    public void listenToTopic(String message){
        System.out.println("Consumed message:  Second Consumer this is:" + message);
    }
}
