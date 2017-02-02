package com.example.service;

import org.springframework.stereotype.Service;

/**
 * Spanish Impl
 */
@Service("spanish")
public class HelloServiceImplTwo implements HelloService {

    @Override
    public String sayHello() {
        return "Hola de HelloServiceImplTwo!\n";
    }
}
