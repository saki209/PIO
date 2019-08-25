package com.saki209.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saki209.beans.FormBean;
import com.saki209.beans.Person;
import com.saki209.beans.ResetPassword;

@Controller
public class MainController {

	@RequestMapping(path = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String gotoLogin(Model model) {
		model.addAttribute("person", new Person());
		return "login";
	}

	@RequestMapping(path = "/home", method = RequestMethod.POST)
	public String gotoHome(@ModelAttribute("person") Person person) {

		System.out.println("name  :" + person.getUsername());
		System.out.println("password :" + person.getPassword());

		return "home";
	}

	@RequestMapping(path = "/singup", method = RequestMethod.POST)
	public String singUpView(Model model) {

		model.addAttribute("formbean", new FormBean());
		return "singup";
	}

	@RequestMapping(path = "/successsingup", method = RequestMethod.POST)
	public String successSingUp(@ModelAttribute("formbean") FormBean formbean) {

		System.out.println("firstname :" + formbean.getFirstname());
		System.out.println("last name :" + formbean.getLastname());
		System.out.println("mobile nuber :" + formbean.getPhnumber());

		return "successsingup";
	}

	@RequestMapping(path = "/reset", method = RequestMethod.GET)
	public String reSetView(Model model) {
		model.addAttribute("resetpassword", new ResetPassword());
		return "passwordreset";
	}
	
	@RequestMapping(path = "/resetsucces", method = RequestMethod.POST)
	public String reSetPassword(@ModelAttribute("resetpassword") ResetPassword resetpassword) {

		System.out.println("firstname :" + resetpassword.getFirstname());
		System.out.println("last name :" + resetpassword.getLastname());
		System.out.println("mobile nuber :" + resetpassword.getPhnumber());

		return "successfulresetpassword";
	}
	
	

}
