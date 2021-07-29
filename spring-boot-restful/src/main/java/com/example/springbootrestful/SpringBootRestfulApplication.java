package com.example.springbootrestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringBootRestfulApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootRestfulApplication.class, args);

        SpringApplication app = new SpringApplication(SpringBootRestfulApplication.class);
        app.addListeners(new MyApplicationStartedEventListener());
        app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
        app.addListeners(new MyApplicationPreparedEventListener());
        app.addListeners(new MyApplicationFailedEventListener());
        app.run(args);
    }

}
