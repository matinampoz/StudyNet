package com.example.StudyNet.services;

import com.example.StudyNet.models.Course;
import com.example.StudyNet.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    public Course updateCourse(Long courseId, Course updatedCourse) {
        // Εδώ μπορεί να υλοποιηθεί η ενημέρωση του μαθήματος
        return courseRepository.save(updatedCourse);
    }

    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }
}
