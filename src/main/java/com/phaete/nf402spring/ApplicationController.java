package com.phaete.nf402spring;

import org.springframework.web.bind.annotation.*;

@RestController // This gives this class to become a controller -> this class can accept requests
@RequestMapping("/api/application") //This gives this ApplicationController a path / url
public class ApplicationController {
    // Each path can only take a single get, post, put and delete mapping
    @GetMapping()
    public String saySomething() {
        return "This is a demo application";
    }

    @GetMapping("/{greetform}")
    public String sayCustomGreeting(@PathVariable String greetform, // Variable path in url -> variable name has to be the same as in path
                                    @RequestParam(required = false, defaultValue = "") String name) { // RequestParam is e.g. "?name=" or "?search=" in url
        return greetform + " " + name;
    }

    @PostMapping
    public String readData(@RequestBody Student student) {
        return student.name();
    }
}
