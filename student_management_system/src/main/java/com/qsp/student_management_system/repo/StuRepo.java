package com.qsp.student_management_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.student_management_system.dto.Student;

public interface StuRepo extends JpaRepository<Student, Integer>{

}
