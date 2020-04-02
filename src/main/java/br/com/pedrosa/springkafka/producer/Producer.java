package br.com.pedrosa.springkafka.producer;


import br.com.pedrosa.springkafka.dto.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class Producer {

    private static final String TOPIC = "persons";

    private final KafkaTemplate<String, Person> kafkaTemplate;

    public void sendMessage(Person person) {
        log.info("Producing Person: {} ", person);
        this.kafkaTemplate.send(TOPIC, person);
    }
}
