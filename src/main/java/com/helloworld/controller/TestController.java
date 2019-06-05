package com.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helloworld.model.Student;

@CrossOrigin(origins = "http://localhost:4200")
public class TestController {
	
	private List<Student> students = createStudentList();

	@RequestMapping(value="/students", method=RequestMethod.GET, produces="application/json")
	public List<Student> firstPage() {
		return students;
	}
	
	private static List<Student> createStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		
		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setFirstname("Albert");
		student1.setLastname("Einstein");
		student1.setCourse("General Relativity");
		student1.setMajor("Aestrophyics");
	
		Student student2 = new Student();
		student2.setStudentId(1);
		student2.setFirstname("Nikola");
		student2.setLastname("Tesla");
		student2.setCourse("Alternating Current");
		student2.setMajor("Electromagnetism");
	
		Student student3 = new Student();
		student3.setStudentId(1);
		student3.setFirstname("David");
		student3.setLastname("Gilbert");
		student3.setCourse("Abstract Algebra");
		student3.setMajor("Mathematics");
	
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		return studentList;
	}
	
	
}
