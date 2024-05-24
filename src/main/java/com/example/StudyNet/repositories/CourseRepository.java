package com.example.StudyNet.repositories;

import com.example.StudyNet.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}
