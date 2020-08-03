package com.example.userservice;

import com.example.userservice.entities.User;
import com.example.userservice.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

    private UserRepository userRepository;

    public UserServiceApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("John Doe","john@luv2code.com"));
        userRepository.save(new User("Marry Public","marry@luv2code.com"));

    }
}
