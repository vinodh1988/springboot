package com.system;

import org.springframework.stereotype.Component;

@Component("mobiletax")
public class MobileTax implements Tax{

	@Override
	public void calculateTax() {
	   System.out.println("Tax for the mobile device is applied");
		
	}
 
}
