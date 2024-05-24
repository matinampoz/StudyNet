package com.example.StudyNet.repositories;

import com.example.StudyNet.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}
