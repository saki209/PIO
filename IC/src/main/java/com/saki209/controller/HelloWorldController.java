package com.saki209.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saki209.beans.HelloWorld;
import com.saki209.services.UserService;

@Controller
public class HelloWorldController {

	@Autowired
	private UserService userService;

	@RequestMapping("/helloworld")
	public String handler(Model model) {

		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld", helloWorld);
		return "helloworld";
	}

	@RequestMapping("/users")
	public String userhandler(Model model) {
		List userDetails = userService.getUserDetails();
		model.addAttribute("users", userDetails);
		return "users";
	}

}
