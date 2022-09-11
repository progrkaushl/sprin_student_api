package com.kman.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            Student John = new Student(
                    "John",
                    LocalDate.of(2003, 04, 27),
                    "john@gmail.com"
            );

            Student Andrew = new Student(
                    "Andrew",
                    LocalDate.of(1981, 07, 14),
                    "Andrew@gmail.com"
            );

            repository.saveAll(List.of(John, Andrew));

        };
    }
}
