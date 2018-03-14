package com.system;

import org.springframework.stereotype.Component;

@Component("pentax")
public class PenTax implements Tax{

	@Override
	public void calculateTax() {
		// TODO Auto-generated method stub
		System.out.println("Pen tax is applied");
	}
  
}
