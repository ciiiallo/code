package com.gcche.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gcche")
public class GccheApplication {
    public static void main(String[] args) {
        SpringApplication.run(GccheApplication.class, args);
    }
}