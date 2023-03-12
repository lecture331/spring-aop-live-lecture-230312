package com.example.springaoplivelecture230312.course.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String instructor;
    private Double cost;

    public Course(String title, String instructor, Double cost) {
        this.title = title;
        this.instructor = instructor;
        this.cost = cost;
    }
}
