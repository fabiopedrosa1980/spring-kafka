package br.com.pedrosa.springkafka.dto;

import lombok.Data;

@Data
public class Person {
    private Long id;
    private String name;
    private Integer age;
}
