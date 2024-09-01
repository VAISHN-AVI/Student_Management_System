package com.qsp.student_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.student_management_system.dto.Student;
import com.qsp.student_management_system.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@PostMapping("/saveall")
	public List<Student> saveStudent(@RequestBody List<Student> list) {
		return service.saveAll(list);
	}

}
