package com.example.StudyNet.repositories;

import com.example.StudyNet.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findByRole(String role);
}
