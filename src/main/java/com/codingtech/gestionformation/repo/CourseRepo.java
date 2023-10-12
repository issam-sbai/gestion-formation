package com.codingtech.gestionformation.repo;

import com.codingtech.gestionformation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
