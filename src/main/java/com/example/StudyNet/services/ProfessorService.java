package com.example.StudyNet.services;

import com.example.StudyNet.models.Professor;
import com.example.StudyNet.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Professor addProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public void deleteProfessor(Long professorId) {
        professorRepository.deleteById(professorId);
    }

    public Professor updateProfessor(Long professorId, Professor updatedProfessor) {
        return professorRepository.findById(professorId)
                .map(professor -> {
                    professor.setName(updatedProfessor.getName());
                    professor.setEmail(updatedProfessor.getEmail());
                    professor.setRole(updatedProfessor.getRole());
                    // Ενημερώστε άλλα πεδία όπως απαιτείται
                    return professorRepository.save(professor);
                })
                .orElseGet(() -> {
                    updatedProfessor.setId(professorId);
                    return professorRepository.save(updatedProfessor);
                });
    }

    public Professor getTeacherById(Long professorId) {
        return professorRepository.findById(professorId).orElse(null);
    }

    public Professor updateProfessorRole(Long userId, String role) {
        Professor user = professorRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setRole(role);
            return professorRepository.save(user);
        }
        return null;
    }

    public List<Professor> getProfessorsByRole(String role) {
        return professorRepository.findByRole(role);
    }
}
