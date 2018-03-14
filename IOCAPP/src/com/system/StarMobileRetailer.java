package com.system;

public class StarMobileRetailer implements Retailer {
Invoice invoice;
	@Override
	public void packProduct() {
		// TODO Auto-generated method stub
		System.out.println("Star is packing mobiles");
	}

	@Override
	public void dispatchProduct() {
		// TODO Auto-generated method stub
		System.out.println("Star is Dispatching mobiles");
	}

}
