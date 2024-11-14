package com.jpa;

import com.github.javafaker.Faker;
import com.jpa.models.Author;
import com.jpa.models.specification.AuthorSpecification;
import com.jpa.repositories.AuthorRepository;
import com.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

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
            for(int i=0; i<50; i++) {
                Faker faker = new Faker();
                var author = Author.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .age(faker.number().numberBetween(20, 80))
                        .email(faker.name().username() + "ankitgurung@gmail.com")
                        .build();
                repository.save(author);
            }

//            update all values of author with id=1
            var author = Author.builder()
                .id(1)
                .firstName("Ankit")
                .lastName("Gurung")
                .age(16)
                .email("ankitgurung@gmail.com")
                .build();
//            repository.save(author);

//            update Author a set a.age = 22 where a.id = 1 or update specific value(age) of author where id = 1
//            repository.updateAuthor(22, 1);

//            update all authors
//            repository.updateAllAuthors(99);

            /*
//            Save Author object
            var author = Author.builder()
                    .firstName("Ankit")
                    .lastName("Gurung")
                    .age(16)
                    .email("ankitgurung@gmail.com")
                    .build();
            repository.save(author);
            */

            /*
//            Save Video object
            var video = Video.builder()
                    .name("abc")
                    .size(5)
                    .length(10)
                    .build();
            videoRepository.save(video);
            */

//            repository.findByNamedQuery(70).forEach(System.out::println);

//            repository.updateByNamedQuery(12);

            Specification<Author> spec = Specification
                    .where(AuthorSpecification.hasAge(22))
                    .or(AuthorSpecification.firstNameLike("i"))
                    ;
            repository.findAll(spec).forEach(System.out::println);
        };
    }

}
