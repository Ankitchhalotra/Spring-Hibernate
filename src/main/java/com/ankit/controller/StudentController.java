package com.ankit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ankit.model.Student;
import com.ankit.service.StudentService;

@Controller
@ComponentScan(basePackages="com.ankit")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("show")
    @ResponseBody
	public String name() {
		return new java.util.Date().toString();
	}
	
	
	@RequestMapping("add")
	public String addStudent() {
		return "addStudent.jsp";
	}
	@RequestMapping("addData")
	public ModelAndView addStudents(@ModelAttribute Student student) {
		Student s = service.addStudent(student);
		ModelAndView mv = new ModelAndView();
		mv.addObject("info",s);
		mv.setViewName("addedinfo.jsp");
		return mv;
	}
	
	@RequestMapping("search")
	public String searchStudent() {
		return "search.jsp";
	}	
	@RequestMapping("searchdata")
	public ModelAndView searchinfo(@RequestParam ("rno") int code) {
		Student student = service.getStudentbyCode(code);
		ModelAndView mv = new ModelAndView();
		mv.addObject("info",student);
		mv.setViewName("getdata.jsp");
		return mv;
	}	
	
	
	
	@RequestMapping("searchAll")
	public ModelAndView showAllStudent() {
		List<Student> list = service.getAllStudent();
		ModelAndView mv = new ModelAndView("showAllStudent.jsp");
		mv.addObject("info", list);
		return mv;
	}
	
	
	
	@RequestMapping("deletedata")
	public String deleteStudent() {
		return "deleteData.jsp";
	}	
	@RequestMapping("delete")
	public ModelAndView deleteData(@RequestParam ("rno")int code) {
		Student student = service.deleteStudent(code);
		ModelAndView mv = new ModelAndView();
		mv.addObject("info",student);
		mv.setViewName("deleteConfirm.jsp");
		return mv;
	}
	
	
	@RequestMapping("update")
	public ModelAndView updateData(@RequestParam ("rno") int rno) {
		Student s = service.getStudentbyCode(rno);
		ModelAndView mv = new ModelAndView("updateData.jsp");
		mv.addObject("info", s);
		return mv;
	}
	
	@RequestMapping("updatedata")
	public ModelAndView updatedata(@ModelAttribute Student student) {
		service.updateStudent(student);
		ModelAndView mv = new ModelAndView("index.jsp");
		return mv;
	}
	
}
