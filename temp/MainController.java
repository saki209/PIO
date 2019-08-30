package com.verinon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.verinon.beans.Monthly;

@Controller
public class MainController {

	@RequestMapping(path="/hi",method={RequestMethod.GET,RequestMethod.POST})
public String getview(Model model) {
		model.addAttribute(new Monthly());
		return "hi";
}
	@RequestMapping(path="/hello",method= {RequestMethod.GET,RequestMethod.POST})
	public String gethello(@ModelAttribute("monthly") Monthly mothly,BindingResult result,Model model) {
		System.out.println(mothly.getFirstname());
		System.out.println(mothly.getLastname());
		System.out.println(mothly.getAddress());
		System.out.println(mothly.getSonof());
		System.out.println(mothly.getAmount());
		System.out.println(mothly.getInterest());
		model.addAttribute("monthly", mothly);
		
			return "success";
	}
	@RequestMapping(path="/pdf",method= {RequestMethod.GET,RequestMethod.POST})
public String getsuccess(Model model) {
		model.addAttribute("pdf", "pdf is generated");
		return "pdfsuccess";
}

}
