package com.example.neo4jexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Neo4jExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(Neo4jExampleApplication.class, args);
        log.info("Neo4j Example Application Started!");
    }
}
