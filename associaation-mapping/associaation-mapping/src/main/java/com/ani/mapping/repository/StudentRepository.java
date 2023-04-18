package com.ani.mapping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.mapping.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    @Override
    default Optional<Student> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

}