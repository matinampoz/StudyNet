package com.example.StudyNet.controllers;

import com.example.StudyNet.models.Professor;
import com.example.StudyNet.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }

    // Άλλες μέθοδοι όπως update, delete
}
