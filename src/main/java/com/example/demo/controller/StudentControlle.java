package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Student;

public class StudentControlle {

	
	@GetMapping(value="/getStu",produces = { "application/xml","application/json"})
	public ResponseEntity<Student> getStu(){
		Student stu=new Student();
		stu.setRollno(11);
		stu.setName("Santosh");
		stu.setAddress("pune");
		
		return new ResponseEntity<Student>(stu,HttpStatus.OK);
		
	}
}
