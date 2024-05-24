package com.example.StudyNet.controllers;

import com.example.StudyNet.models.Course;
import com.example.StudyNet.repositories.CourseRepository;
import com.example.StudyNet.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // Άλλες μέθοδοι όπως update, delete
}
