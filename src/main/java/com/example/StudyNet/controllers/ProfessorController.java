package com.example.StudyNet.controllers;

import com.example.StudyNet.models.Professor;
import com.example.StudyNet.repositories.ProfessorRepository;
import com.example.StudyNet.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.addProfessor(professor);
    }

    @PutMapping("/{userId}/role")
    public ResponseEntity<Professor> updateUserRole(@PathVariable Long userId, @RequestParam String role) {
        Professor updatedUser = professorService.updateProfessorRole(userId, role);
        if (updatedUser != null) {
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/byRole")
    public ResponseEntity<List<Professor>> getTeachersByRole(@RequestParam String role) {
        List<Professor> teachers = professorService.getProfessorsByRole(role);
        if (!teachers.isEmpty()) {
            return new ResponseEntity<>(teachers, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<Professor> updateStudent(@PathVariable Long studentId, @RequestBody Professor updatedStudent) {
        Professor student = professorService.updateProfessor(studentId, updatedStudent);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long studentId) {
        professorService.deleteProfessor(studentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
