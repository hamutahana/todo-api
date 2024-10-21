package com.example.todo_api.controller.sample;

import lombok.Value;
import java.time.LocalDateTime;

@Value
public class SampleDTO {
    String content;
    LocalDateTime timestamp;
}
