package com.qsp.student_management_system.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student")
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stu_id")
	private int id;
	
	@Column(name="stu_name")
	private String name;
	
	@Column(name="stu_fathername")
	private String fatherName;
	
	@Column(name="stu_mothername")
	private String motherName;
	
	@Column(name="stu_phone")
	private long phone;
	
	@Column(name="stu_address")
	private String address;
	
	@Column(name="stu_email")
	private String email;
	
	@Column(name="stu_password")
	private String password;
	
	@Column(name="stu_securedMark")
	private int securedMark;
	
	@Column(name="stu_totalMark")
	private int totalMark;
	
	@Column(name="stu_percentage")
	private double percentage;
	
	@Column(name="stu_grade")
	private String grade;

}
