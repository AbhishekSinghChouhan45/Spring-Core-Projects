package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ff")
public class FlipkartFactory {
	//Field Injection
	private Courier courier;
	@Autowired
	@Qualifier("transport")
	public void setCourier(Courier courier) {
		System.out.println("setCourier()");
		this.courier = courier;
	}
	public FlipkartFactory() {
		System.out.println("FlipkartFactory()");
	}
	//Setter Methods
	public String getCourier(String [] items,double []prices) throws CourierException{
		System.out.println("getCourier()");
		double Total =0.0;
		for(double amt:prices) {
			Total = amt + Total;
		}
		int oid = new Random().nextInt(1000);
		int dCharge = courier.getDcharge();
		return courier.getOid(oid)+" and your order items are:: "+Arrays.toString(items)+"\n Total Bill Amount: "+(Total+dCharge)+"(including shipment of)"+dCharge;
	}
}
