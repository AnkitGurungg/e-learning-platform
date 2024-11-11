package com.jpa;

import com.jpa.models.Video;
import com.jpa.repositories.AuthorRepository;
import com.jpa.repositories.VideoRepository;
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
    public CommandLineRunner commandLineRunner(
            AuthorRepository repository,
            VideoRepository videoRepository
    ) {
        return args -> {
            /*
            var author = Author.builder()
                    .firstName("Ankit")
                    .lastName("Gurung")
                    .age(16)
                    .email("ankitgurung@gmail.com")
                    .build();
            repository.save(author);
            */

            var video = Video.builder()
                    .name("abc")
                    .size(5)
                    .build();
            videoRepository.save(video);
        };
    }

}
