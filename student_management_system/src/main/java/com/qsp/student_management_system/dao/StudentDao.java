package com.qsp.student_management_system.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.qsp.student_management_system.dto.Student;
import com.qsp.student_management_system.repo.*                                                                                                 ;

@Repository
public class StudentDao {
	@Autowired
	private StuRepo repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	

	

}
