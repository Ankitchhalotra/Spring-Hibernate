package com.ankit.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ankit.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Student addStudent(Student s) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(s);
		tr.commit();
		session.close();
		return s;
	}

	public Student getStudentbyCode(int rno) {
		Session session = sessionFactory.openSession();
		Student s = session.get(Student.class, rno);
		session.close();
		return s;
	}

	public List<Student> getAllStudent() {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Student.class);
		List<Student> list = cr.list();
		session.close();
		return list;
	}

	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student deleteStudent(int code) {
		Session session = sessionFactory.openSession();
		Student s = session.get(Student.class, code);
		Transaction tr = session.beginTransaction();
		session.delete(s);
		tr.commit();
		session.close();
		return s;
	}

}
