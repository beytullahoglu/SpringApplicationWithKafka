package com.sh.casestudy;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
    
    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "sh-casestudy";
    
    private KafkaTemplate<String, MappedPackage> kafkaTemplate;

    public Producer(KafkaTemplate<String, MappedPackage> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(List<MappedPackage> messages) {
        logger.info(String.format("#### -> Producing message -> " + messages));
        messages.forEach(message -> kafkaTemplate.send(TOPIC, message));
    }
}
