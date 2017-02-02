package com.example.service;

import org.springframework.stereotype.Service;

/**
 * English Impl of HelloService
 */
@Service("english")
public class HelloServiceImplOne implements HelloService {

    @Override
    public String sayHello() {
        return "Hello from HelloServiceImplOne!\n";
    }

    public String notExpostedByTheInterface() {
    	return "I am not exposed by the interface!!";
    }
}
