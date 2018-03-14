package com.system;

public class PheonixMobileRetailer  implements Retailer {

Invoice invoice;

 public  PheonixMobileRetailer(Invoice invoice)
 {
	 this.invoice=invoice;
 }
 
	@Override
	public void packProduct() {
		// TODO Auto-generated method stub
		System.out.println("Pheonix is packing mobiles");
		
	}

	@Override
	public void dispatchProduct() {
		// TODO Auto-generated method stub
		invoice.generateInvoice("Mobile...");
		System.out.println("Pheonix is Dispatching mobiles");
	}

}
