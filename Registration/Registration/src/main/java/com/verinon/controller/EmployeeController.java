package com.verinon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.verinon.entity.Employee;
import com.verinon.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(path="/")
	public String registrationForm() {
		return "register";
	}
	
	@PostMapping(path="/register")
	public String registerEmployee(Employee employee) {
		
		service.registerEmployee(employee);
		return "success";
		
	}

}
