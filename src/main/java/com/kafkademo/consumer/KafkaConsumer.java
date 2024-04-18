package com.kafkademo.consumer;

import com.kafkademo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {
//    @KafkaListener(topics = "topic1", groupId = "myGroup")
//    public void consume(String message) {
//        log.info(format("#### -> consuming message from topic 1 -> %s", message));
//    }

    @KafkaListener(topics = "topic1", groupId = "myGroup")
    public void consumeJson(Student student) {
        log.info(format("#### -> consuming message from topic 1 JSON format -> %s", student.toString()));
    }
}
