package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/reg")
	public ModelAndView showReg()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Register");
		System.out.println("This is student controller");
		return mv;
		
	}
	
	@RequestMapping("/home")
	public ModelAndView showHome()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Home");
		mv.addObject("sid", 100);
		mv.addObject("sname", "Mahesh");
		mv.addObject("ssal", 216.0);
		return mv;
		
	}
}
