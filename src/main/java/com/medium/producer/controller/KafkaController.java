package com.medium.producer.controller;

import com.medium.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final TopicProducer topicProducer;

    @GetMapping("/send")
    public void send(){
        topicProducer.send("Mensagem de teste enviada ao tópico");
    }
}
