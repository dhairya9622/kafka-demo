package com.kafkademo.rest;

import com.kafkademo.payload.Student;
import com.kafkademo.producer.KafkaJsonProducer;
import com.kafkademo.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaJsonProducer kafkaJsonProducer;
    private final KafkaProducer kafkaProducer;

    @PostMapping("/json")
    public ResponseEntity<String> sendMessage(@RequestBody Student message) {
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka topic successfully!");
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka topic successfully!");
    }
}
