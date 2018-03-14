package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.TestService;

@Controller
public class FirstController {
@Autowired
TestService service;
	@RequestMapping("/hello")
	public String first(ModelMap m){
		
		m.addAttribute("data", "This is my first ever spring MVC app");
		m.addAttribute("info",service.sendData());
		return "greet";
	}
	
	

}
