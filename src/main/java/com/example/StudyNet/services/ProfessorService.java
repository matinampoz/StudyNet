package com.example.StudyNet.services;

import com.example.StudyNet.models.Professor;
import com.example.StudyNet.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllTeachers() {
        return professorRepository.findAll();
    }

    public Professor addTeacher(Professor teacher) {
        return professorRepository.save(teacher);
    }

    public void deleteTeacher(Long teacherId) {
        professorRepository.deleteById(teacherId);
    }

    public Professor updateTeacher(Long teacherId, Professor updatedTeacher) {
        // Εδώ μπορεί να υλοποιηθεί η ενημέρωση του καθηγητή
        return professorRepository.save(updatedTeacher);
    }

    public Professor getTeacherById(Long teacherId) {
        return professorRepository.findById(teacherId).orElse(null);
    }
}
