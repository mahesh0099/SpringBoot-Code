package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/show")
	public String showData(Model model) {
		
		
		  Employee emp=new Employee(123, "Mahesh",1324.00); model.addAttribute("ob",
		  emp);
		 		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		model.addAttribute("list", list);
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("1", "Mahesh");
		m.put("2", "Kalyan");
		
		model.addAttribute("map", m);
		
		List<Employee> li = new ArrayList<>();
				
		Employee e=new Employee(101, "A", 3.3);
		Employee e1=new Employee(102, "B", 5.5);
		Employee e2=new Employee(103, "C", 10.10);
		
		li.add(e);
		li.add(e1);
		li.add(e2);
	    model.addAttribute("emps", li);
		
		return "Result";
		
	}
}
