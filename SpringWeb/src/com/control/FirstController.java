package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Person;
import com.service.DataService;

@Controller
public class FirstController {
	@Autowired
	DataService dataservice;
	@Autowired
	Person person;
	@RequestMapping("test.htm")
	public String mapData(ModelMap m){
		m.addAttribute("data",dataservice.emitString());
		m.addAttribute("person",dataservice.getPersons());
		return "hello";
	}
	
	@RequestMapping("form.htm")
	public ModelAndView formView(){
		
		return new ModelAndView("form","person",person);
		
	}
	
	@RequestMapping(value="add.htm",method=RequestMethod.POST)
	public String redirect(@ModelAttribute("person") Person p){
		dataservice.addPerson(p);
		return "success";
		
	}
	
	

}
