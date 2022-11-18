package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    //whatever request I want to execute I map that into this perticular method
//    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String helloWorld(){
        return "Welcome adsordng";
    }
}

//mvn spring-boot:run
//stop and start server too annoying
//solution - dev tools depency to be added
//controller layer - get perticular req and response back - routing perpose
//service layer - business layer - logic
//data access layer - db operations / spring data JPA
//database
//h2 inmemory database?