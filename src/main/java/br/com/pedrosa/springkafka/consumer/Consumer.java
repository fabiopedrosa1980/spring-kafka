package br.com.pedrosa.springkafka.consumer;


import br.com.pedrosa.springkafka.dto.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Log4j2
public class Consumer {

    @KafkaListener(topics = "users", groupId = "group_id",clientIdPrefix = "json",
            containerFactory = "kafkaListenerContainerFactory")
    public void consume(Person person) throws IOException {
        log.info("Consumed Person: {} ", person);
    }
}