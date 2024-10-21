package com.example.todo_api.repository.sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface SampleRepository {
    @Select("SELECT content FROM samples ORDER BY id LIMIT 1")
    SampleRecord select();
}
