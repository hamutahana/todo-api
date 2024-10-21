package com.example.todo_api.service.sample;

import com.example.todo_api.repository.sample.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository repository;

    public SampleEntity find() {
        var record = repository.select();
        return new SampleEntity(record.getContent());
    }
}
