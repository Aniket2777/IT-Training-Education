package com.adhyayan.servicei;

import java.util.List;

import com.adhyayan.model.Student;

public interface StudentServiceI {

	//abstract methods
	
	public void saveStudent(Student s);
	
	public List<Student> getAllStudents();
	
	public void deleteRecord(int rollno);
	
	public Student getStudentByRollno(int rollno);
	
	public Student loginCheck(String username, String password);
	
}
