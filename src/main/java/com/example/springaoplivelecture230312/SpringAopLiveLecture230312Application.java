package com.example.springaoplivelecture230312;

import com.example.springaoplivelecture230312.course.entity.Course;
import com.example.springaoplivelecture230312.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopLiveLecture230312Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopLiveLecture230312Application.class, args);
	}

	@Autowired
	CourseRepository courseRepository;

	@Bean
	ApplicationRunner applicationRunner() {
		return args -> {
			Course course = new Course("Spring AOP", "robbie", 100000.0);
			courseRepository.save(course);
		};
	}

}
