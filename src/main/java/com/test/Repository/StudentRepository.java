package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.Entity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
}


