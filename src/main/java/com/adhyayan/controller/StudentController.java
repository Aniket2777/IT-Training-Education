package com.adhyayan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adhyayan.model.Student;
import com.adhyayan.servicei.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String regPage()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Student s)
	{
		System.out.println("In Controller => " +s);
		ssi.saveStudent(s);  
		return "login";
	}
	
	@RequestMapping("/loginsuccess")
	public String loginSuccess(@RequestParam("username") String un, 
			@RequestParam("password") String ps, Model m)
	{
		Student std = ssi.loginCheck(un, ps);
		System.out.println(std);
		if(un.equals("admin") && ps.equals("1234"))
		{
			List<Student> allStudents = ssi.getAllStudents();
			m.addAttribute("students", allStudents);
			allStudents.forEach(s -> System.out.println(s));
			return "loginsuccess";
		}
		else if(std!=null)
		{
			List<Student> stList = new ArrayList<>();
			stList.add(std);
			m.addAttribute("students", stList);
			return "loginsuccess";
		}
		else
		{
			return "login";
		}
		
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("rollno") int rollno, Model m)
	{
		ssi.deleteRecord(rollno);
		List<Student> allStudents = ssi.getAllStudents();
		m.addAttribute("students", allStudents);
		return "loginsuccess";
	}
	
	@RequestMapping("/edit")
	public String editPage(@RequestParam("rollno") int rollno, Model m)
	{
		Student stu = ssi.getStudentByRollno(rollno);
		m.addAttribute("st", stu);
		System.out.println(stu);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updateDetails(@ModelAttribute Student st, Model m)
	{
		ssi.saveStudent(st);
		List<Student> allStudents = ssi.getAllStudents();
		m.addAttribute("students", allStudents);
		return "loginsuccess";
	}
	
}
