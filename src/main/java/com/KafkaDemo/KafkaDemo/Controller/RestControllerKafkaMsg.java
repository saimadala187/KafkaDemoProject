package com.KafkaDemo.KafkaDemo.Controller;

import com.KafkaDemo.KafkaDemo.Service.KafkaProducer;
import com.KafkaDemo.KafkaDemo.Service.KafkaProducer2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class RestControllerKafkaMsg {

    @Autowired
    KafkaProducer kafkaProducer;

    @Autowired
    KafkaProducer2 kafkaProducer2;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/send")
    public void getMsgFromClient(@RequestParam("msg") String msg){
        kafkaProducer.sendMsgToTopic(msg);
        kafkaProducer2.sendMsgToTopic(msg);

    }
}
