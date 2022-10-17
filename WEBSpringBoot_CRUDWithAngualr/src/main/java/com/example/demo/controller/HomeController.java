package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.studentservice.StudentService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/student")
public class HomeController {

	@Autowired
	private StudentService studentservice;

	@PostMapping(value = "/")
	public int addStudent(@RequestBody Student student) {
		int id = studentservice.addtudent(student);
		return id;
	}

	@GetMapping(value = "/")
	public List<Student> getalldata() {
		List<Student> slist = studentservice.getAlldata();
		return slist;
	}

	@DeleteMapping("/dele/{id}")
	public int delete(@PathVariable int id) {
		int i = studentservice.delete1(id);
		return i;
	}

	@GetMapping(value = "/singledata/{id}")
	public Student getSingleStudent(@PathVariable int id) {
		Student stu = studentservice.getSingleStudent(id);
		return stu;
	}

	@PutMapping(value = "/")
	public  List<Student> update1(@RequestBody Student student) {
		List<Student> x = studentservice.update(student);
		return x;
	}

}










