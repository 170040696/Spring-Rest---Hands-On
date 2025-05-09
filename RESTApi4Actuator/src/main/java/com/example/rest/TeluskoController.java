package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

@RestController    //Sterotype Annotation .is is combination of @Controller + @ResponseBody
public class TeluskoController {

	@GetMapping("/studentinfo")
	public Student getStudentinfo() {
		Student st=new Student(1,"Akanksha","ongole",25);
		return st;
	}
	
	@GetMapping("/studentinfo1")
	public  ResponseEntity<Student> getStudentinfo1() {
		Student st=new Student(2,"Sushma","ongole",25);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
	}
	
	@PostMapping("/addstudent")
	public  ResponseEntity<Student> AddStudentinfo1(@RequestBody Student st) {
		System.out.println(st);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
	}
}
