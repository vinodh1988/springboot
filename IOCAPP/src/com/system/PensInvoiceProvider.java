package com.system;

import org.springframework.beans.factory.annotation.Autowired;

public class PensInvoiceProvider implements Invoice {
@Autowired
	Tax pentax;
	@Override
	public void generateInvoice(String product) {
		// TODO Auto-generated method stub
	    pentax.calculateTax();
		System.out.println("ABC Systems generated invoice for "+product+" order");
	}

}
