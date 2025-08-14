package com.brickstone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("students")
	public List<Student> getStudents() {
		
		List<Student> studs = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("Atul");
		s1.setSpoint(70);
		
		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("Avani");
		s2.setSpoint(60);
		
		Student s3 = new Student();
		s3.setSid(103);
		s3.setSname("Navin");
		s3.setSpoint(50);
		
		studs.add(s1);
		studs.add(s2);
		studs.add(s3);
		return studs;
	}

}
