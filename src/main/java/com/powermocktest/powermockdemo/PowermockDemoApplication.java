package com.powermocktest.powermockdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PowermockDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PowermockDemoApplication.class, args);
    }

    @RestController
    @RequestMapping
    public class SimpleApi{

        @GetMapping
        public Message sayHello(){
            return new Message("Hello !!");
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    class Message {
        private String content;
    }
}
