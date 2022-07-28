package com.example.kafkaprod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageDTO {
    private String name;
    private Integer age;
    private Boolean check;
}
