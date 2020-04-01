package br.com.pedrosa.springkafka.controller;


import br.com.pedrosa.springkafka.dto.Person;
import br.com.pedrosa.springkafka.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final Producer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody Person person) {
        this.producer.sendMessage(person);
    }
}