package com.model;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonDAO {
@Autowired
   SessionFactory sessionFactory;
   public List<Person> getPerson(){
	   return sessionFactory.getCurrentSession().createCriteria(Person.class).list();
   }
  
   public void addPerson(Person p){
	   sessionFactory.getCurrentSession().save(p);
   }
}
