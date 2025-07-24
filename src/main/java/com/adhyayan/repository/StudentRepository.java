package com.adhyayan.repository;

import org.springframework.data.repository.CrudRepository;

import com.adhyayan.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	public Student findByUsernameAndPassword(String username, String password);
}
