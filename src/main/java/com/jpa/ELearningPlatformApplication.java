package com.jpa;

import com.jpa.models.Author;
import com.jpa.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ELearningPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(ELearningPlatformApplication.class, args);
    }

    @Bean
    @Autowired
    public CommandLineRunner commandLineRunner(
            AuthorRepository repository
    ) {
        return args -> {
            var author = Author.builder()
                    .firstName("Ankit")
                    .lastName("Gurung")
                    .age(16)
                    .email("ankitgurung@gmail.com")
                    .build();
            repository.save(author);
        };
    }

}
