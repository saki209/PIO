package com.saki209.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saki209.beans.Person;

@Controller
public class MainController {
	
	@RequestMapping(path= "/login",method=RequestMethod.GET)  
	public String getname() {
		return "login";
	}
	
	@Autowired
	Person person;
	
	@RequestMapping(method = RequestMethod.POST)
	public String getuser(@ModelAttribute("personForm") Person person) {
		
		System.out.println("name  :"+person.getUsername());
		System.out.println("password :"+person.getPassword());
		
		return "hello";
	}
	
	
	
}
