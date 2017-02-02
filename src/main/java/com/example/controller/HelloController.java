package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloServiceImplOne;

/**
 *REST controller for /hello endpoint
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	private HelloServiceImplOne helloService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
    	helloService = new HelloServiceImplOne();
        return ResponseEntity.status(HttpStatus.OK).body(helloService.sayHello() + helloService.notExposedByTheInterface());
    }
}
