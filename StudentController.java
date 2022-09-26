package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping("login")
	public String welcome() {
		return "stud";
	}
	
	@RequestMapping("stud")
	public ModelAndView fetchStudent() {
		ModelAndView modelAndView = new ModelAndView();
		List<Student> list=new ArrayList<>();
		list.add(new Student(101,"akash"));
		list.add(new Student(102,"sagar"));
		list.add(new Student(103,"shubh"));
		modelAndView.addObject("studlist",list);
		modelAndView.setViewName("stud.jsp");
		return modelAndView;
		
	}
}
