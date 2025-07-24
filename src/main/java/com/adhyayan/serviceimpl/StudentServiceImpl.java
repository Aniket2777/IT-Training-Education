package com.adhyayan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adhyayan.model.Student;
import com.adhyayan.repository.StudentRepository;
import com.adhyayan.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveStudent(Student s) {
		
		System.out.println("In Service = " +s);
		sr.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return (List<Student>) sr.findAll();
	}

	@Override
	public void deleteRecord(int rollno) {
		
		sr.deleteById(rollno);
	}

	@Override
	public Student getStudentByRollno(int rollno) {
		
		return sr.findById(rollno).get();
	}

	@Override
	public Student loginCheck(String username, String password) {
		
		return sr.findByUsernameAndPassword(username, password);
	}

	
}
