package com.example.StudyNet.repositories;

import com.example.StudyNet.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {}
