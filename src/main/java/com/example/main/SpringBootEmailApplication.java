package com.example.main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.example.emailservice.UserService;

@SpringBootApplication
public class SpringBootEmailApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEmailApplication.class, args);
    }
     }