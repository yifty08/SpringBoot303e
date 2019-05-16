package com.example.springboot303e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws  Exception{
        Course course = new Course("Astrophysics", "Neil D Tyson",
                "just a course on stars", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol Henley",
                "rate of change of the rate of change", 5);
        repository.save(course);

        course = new Course("Freshman english", "Geraldine Pegram",
                "learn your language children", 6);
        repository.save(course);
    }
}
