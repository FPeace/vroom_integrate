package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VroomIntegrateApplication {

    public static void main(String[] args) {
        SpringApplication.run(VroomIntegrateApplication.class, args);
    }

}
