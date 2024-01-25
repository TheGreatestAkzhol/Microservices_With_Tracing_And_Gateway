package com.example.serverlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServerLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerLibraryApplication.class, args);
    }

}
