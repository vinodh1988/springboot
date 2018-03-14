package app.restful.cgi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.restful.cgi.repositories.Person;
import app.restful.cgi.repositories.PersonDAO;


@RestController
@RequestMapping("/restservice")
public class RestfulController{
@Autowired
	PersonDAO persondao;
	
	@RequestMapping("/data")
	public String sendText(){
		return "Rest API is Working!!!!!";
	}
	
	@RequestMapping("/people")
	public List<Person> getPeople(){
		return (List<Person>)persondao.findAll();
	}
	
	 @RequestMapping(value="/addperson",method=RequestMethod.POST)
	  public Person addMessage(@RequestBody Person person){
		  return persondao.save(person);
		  
	  }
	 
	 @RequestMapping(value="/people/{sno}")
	 public Person getPerson(@PathVariable int sno){
		 return persondao.getPerson(sno);
	 }
	 
	  
	
}


