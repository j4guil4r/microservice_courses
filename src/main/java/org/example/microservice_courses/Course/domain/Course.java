package org.example.microservice_courses.Course.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_course;

    @Column(nullable = false)
    private String course_name;

    @Column(nullable = false)
    private String course_description;

    @Column(nullable = false)
    private int id_career;
}
