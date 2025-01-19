package com.KafkaDemo.KafkaDemo.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", groupId = "Kafka_ExampleID")
    public void listenToTopic(String msg){
        System.out.println("Consumed message: " + msg);
    }
}
