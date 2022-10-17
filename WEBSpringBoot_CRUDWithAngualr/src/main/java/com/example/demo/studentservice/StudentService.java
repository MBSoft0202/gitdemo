package com.example.demo.studentservice;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService
{
	public int addtudent(Student student);
	public List<Student> getAlldata();
   public  int delete1(int id);
   
   public Student getSingleStudent(int id);
   
   public   List<Student> update(Student student);
	
}
