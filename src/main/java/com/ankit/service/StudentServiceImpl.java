package com.ankit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.model.Student;
import com.ankit.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student addStudent(Student s) {
		return repository.addStudent(s);
	}

	public Student getStudentbyCode(int rno) {
		return repository.getStudentbyCode(rno);
	}

	public List<Student> getAllStudent() {
		return repository.getAllStudent();
	}

	public Student updateStudent(Student s) {
		return repository.addStudent(s);
	}

	public Student deleteStudent(int code) {
		return repository.deleteStudent(code);
	}

}
