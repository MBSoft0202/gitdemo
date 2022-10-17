package com.example.demo.studentserviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import com.example.demo.studentservice.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studao;

	@Override
	public int addtudent(Student student) {

		Student stu = studao.save(student);

		return stu.getSid();
	}

	@Override
	public List<Student> getAlldata() {
		List<Student> slist = studao.findAll();

		return slist;
	}

	@Override
	public int delete1(int id) {
		studao.deleteById(id);
		return id;
	}

	@Override
	public List<Student> update(Student student) {
		 studao.save(student);
		return studao.findAll();
	}

	@Override
	public Student getSingleStudent(int id) {
		Student stu = studao.findById(id).get();

		return stu;
	}

}
