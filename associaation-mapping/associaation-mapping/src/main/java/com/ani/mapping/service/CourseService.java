package com.ani.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.mapping.domain.Course;
import com.ani.mapping.domain.Student;
import com.ani.mapping.repository.CourseRepository;
import com.ani.mapping.repository.StudentRepository;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    public void addStudentToCourse(Long courseId, Long studentId) {
        Optional<Course> courseOp = courseRepository.findById(courseId);
        Optional<Student> studentOp = studentRepository.findById(studentId);

        Course course = courseOp.orElseThrow(RuntimeException::new);
        Student student = studentOp.orElseThrow(RuntimeException::new);

        course.getStudents().add(student);
        courseRepository.save(course);
    }

    public List<Course> listAll() {
        return courseRepository.findAll();
    }
}