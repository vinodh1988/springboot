package com.system;

import org.springframework.beans.factory.annotation.Autowired;

public class MobileInvoiceProvider implements Invoice {
@Autowired
Tax mobiletax;
	@Override
	public void generateInvoice(String product) {
		// TODO Auto-generated method stub
		mobiletax.calculateTax();
		System.out.println("MNM Systems generated invoice for "+product+" order");

	}

}
