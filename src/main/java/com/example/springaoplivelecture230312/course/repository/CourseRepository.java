package com.example.springaoplivelecture230312.course.repository;

import com.example.springaoplivelecture230312.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findByInstructor(String instructor);
}
