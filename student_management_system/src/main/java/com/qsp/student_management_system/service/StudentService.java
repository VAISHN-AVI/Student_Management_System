package com.qsp.student_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.qsp.student_management_system.dao.StudentDao;
import com.qsp.student_management_system.dto.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;

		public Student saveStudent( Student student) {
			int securem = student.getSecuredMark();
			int totalm= student.getTotalMark();
			
			if(securem <= totalm) 
			{
				String grade=student.getGrade();
				double percentage=((double) securem/totalm)*100;
				student.setPercentage(percentage);
				
				if(percentage>=85) {
					student.setGrade("Distinction");
				}
				else if(percentage>=70 && percentage<85) {
					student.setGrade("First Class");
				}
				else if(percentage>=49 && percentage<70) {
					student.setGrade("second class");
				}
				else if(percentage>=35 && percentage<49) {
					student.setGrade("pass");
				}
				
				else {
					student.setGrade("fail");
				}
				//return "Detail saved successfully.";
			}
			else {
				//return "enter secured marks.";
			}
		
		
			return dao.saveStudent(student);
		}
		

}
