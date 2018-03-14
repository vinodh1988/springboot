package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Person;
import com.model.PersonDAO;

@Service("dataservice")
public class DataService {
@Autowired
   PersonDAO personDAO;
	public String emitString(){
		List<Person> l=personDAO.getPerson();
		return "Autowiring is working!!! and size of person table "+l.size();
	}
	
	public List<Person> getPersons(){
		return personDAO.getPerson();
	}
	
	public void addPerson(Person p){
		personDAO.addPerson(p);
	}
}
