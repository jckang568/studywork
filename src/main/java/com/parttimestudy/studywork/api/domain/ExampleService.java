package com.parttimestudy.studywork.api.domain;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    public ExampleResult processExample(ExampleData exampleData) {
        return new ExampleResult(exampleData.value());
    }
}
