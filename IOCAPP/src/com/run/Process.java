package com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.system.Retailer;

public class Process {
   public static void main(String[] args) {
	  ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	  Retailer r=(Retailer)ac.getBean("mobiles");
	  r.packProduct();
	  r.dispatchProduct();
	  System.out.println("---------------------------------------");
	  r= (Retailer)ac.getBean("pens");
	  r.packProduct();
	  r.dispatchProduct();
	  
   }
}
