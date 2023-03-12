package com.example.springaoplivelecture230312.course.service;

import com.example.springaoplivelecture230312.course.entity.Course;
import com.example.springaoplivelecture230312.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    @Transactional
    public Course saveCourse() {
        System.out.println("saveCourse()");
        Course course = new Course("Spring AOP", "robbie", 100000.0);
        return courseRepository.save(course);
    }

    public List<Course> getCourseList() {
        System.out.println("getCourseList()");
        return courseRepository.findAll();
    }

    @Transactional
    public String deleteCourse(String instructor) {
        System.out.println("deleteCourse()");
        Course course = courseRepository.findByInstructor(instructor).orElseThrow(
                () -> new NullPointerException("Not null")
        );
        courseRepository.delete(course);
        return "Delete Success";
    }

}
