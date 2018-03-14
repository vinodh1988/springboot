package com.cgi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class BootController {

@RequestMapping("first.htm")
	public String returnString(){
		return "home";
	}
}
