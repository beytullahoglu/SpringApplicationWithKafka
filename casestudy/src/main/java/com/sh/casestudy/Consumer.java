package com.sh.casestudy;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;

public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    
    @KafkaListener(topics = "sh-casestudy", groupId = "group_id")
    public void consume(MappedPackage message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message.toString()));
    }
}
