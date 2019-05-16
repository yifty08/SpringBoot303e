package com.example.springboot303e;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository <Course, Long> {
}
