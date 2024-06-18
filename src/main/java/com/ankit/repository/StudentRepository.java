package com.ankit.repository;

import java.util.List;

import com.ankit.model.Student;

public interface StudentRepository {

	public Student addStudent(Student s);
	public Student getStudentbyCode(int rno);
	public List<Student> getAllStudent();
	public Student updateStudent(Student s);
	public Student deleteStudent(int code);
}
