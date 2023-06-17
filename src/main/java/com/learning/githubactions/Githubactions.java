package com.learning.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Githubactions {

    @GetMapping("/welcome")
    public String welcome() {
        return "TheCoders TV";
    }
    @GetMapping("/welcome1")
    public String welcome1() {
        return "TheCoders TV12";
    }
    public static void main(String[] args) {
        SpringApplication.run(Githubactions.class, args);
    }

}
