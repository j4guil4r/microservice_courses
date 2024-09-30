package org.example.microservice_courses.Course.infrastructure;

import org.example.microservice_courses.Course.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
