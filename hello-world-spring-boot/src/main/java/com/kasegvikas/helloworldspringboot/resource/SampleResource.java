package com.kasegvikas.helloworldspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SampleResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World !!";
    }
}
