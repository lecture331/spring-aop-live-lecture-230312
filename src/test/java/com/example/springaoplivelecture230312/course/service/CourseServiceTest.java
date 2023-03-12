package com.example.springaoplivelecture230312.course.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseServiceTest {

    @Autowired
    CourseService courseService;

    @Test
    @DisplayName("Before, After 테스트")
    public void beforeAfterTest() {
        courseService.saveCourse();
    }

    @Test
    @DisplayName("Around 테스트")
    public void aroundTest() {
        courseService.getCourseList();
    }

    @Test
    @DisplayName("AfterReturning 테스트")
    public void afterReturningTest() {
        courseService.deleteCourse("robbie");
    }

    @Test
    @DisplayName("AfterThrowing 테스트")
    public void afterThrowingTest() {
        courseService.deleteCourse("bin");
    }

}