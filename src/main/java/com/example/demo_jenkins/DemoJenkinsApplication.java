package com.example.demo_jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {
    public static Logger logger = LoggerFactory.getLogger(DemoJenkinsApplication.class);

    public void init(){
        logger.info("Application started...");
    }
    public static void main(String[] args) {
        logger.info("Application executed...");
        SpringApplication.run(DemoJenkinsApplication.class, args);
    }

}
