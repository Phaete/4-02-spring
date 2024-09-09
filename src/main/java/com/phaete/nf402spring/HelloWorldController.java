package com.phaete.nf402spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

    @GetMapping()
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/{name}")
    public String greetName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
