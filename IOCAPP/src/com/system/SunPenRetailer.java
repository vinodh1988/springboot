package com.system;

public class SunPenRetailer implements Retailer{
Invoice invoice;



public Invoice getInvoice() {
	return invoice;
}

public void setInvoice(Invoice invoice) {
	this.invoice = invoice;
}

	@Override
	public void packProduct() {
		// TODO Auto-generated method stub
		System.out.println("Sun is packing pens..");
		
	}

	@Override
	public void dispatchProduct() {
		// TODO Auto-generated method stub
		invoice.generateInvoice("Pens.....");
		System.out.println("Sun is dispatching pens...");
	}

}
