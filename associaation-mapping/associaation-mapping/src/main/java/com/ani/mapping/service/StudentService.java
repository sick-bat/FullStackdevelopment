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
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public void insertStudent(String name, Integer marks, List<Long> courseIds) {
        Student student = new Student();
        student.setName(name);
        student.setMarks(marks);
        student = studentRepository.save(student);
        List<Course> courses = courseRepository.findAllById(courseIds);
        student.setCourses(courses);
        studentRepository.save(student);
    }
    public List<Student> listAll() {
        return studentRepository.findAll();
    }

}
