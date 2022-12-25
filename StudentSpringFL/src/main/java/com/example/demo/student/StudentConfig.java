package com.example.demo.student;

import org.hibernate.mapping.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student stas = new Student(
                    "Stas",
                    "stanislav.oshkin@mail.ru",
                    LocalDate.of(1996, Month.APRIL, 15));
            Student vlad = new Student(
                    "Vlad",
                    "vlad.oshkin@mail.ru",
                    LocalDate.of(1998, Month.JULY, 19));

            repository.save(stas);

            repository.save(vlad);

        };
    }
}
