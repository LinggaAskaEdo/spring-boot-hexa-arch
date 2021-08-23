package com.sbha.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.sbha.infrastructure"})
@EntityScan("com.sbha.infrastructure.entity")
@EnableJpaRepositories("com.sbha.infrastructure.repository")
public class LibraryApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LibraryApplication.class, args);
    }
}