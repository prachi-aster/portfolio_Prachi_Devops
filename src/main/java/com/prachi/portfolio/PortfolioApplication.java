package com.prachi.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PortfolioApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }
}

@RestController
class PortfolioController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Prachi's DevOps Portfolio 🚀";
    }

    @GetMapping("/about")
    public String about() {
        return "Hi, I'm Prachi - DevOps Engineer | Skilled in CI/CD, Jenkins, Docker, Kubernetes, AWS";
    }
}

