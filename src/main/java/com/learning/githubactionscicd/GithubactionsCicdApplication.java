package com.learning.githubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionsCicdApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "TheCoders TV";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubactionsCicdApplication.class, args);
    }

}
