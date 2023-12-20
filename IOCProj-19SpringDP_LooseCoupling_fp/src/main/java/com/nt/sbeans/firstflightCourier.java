package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ff")
public class firstflightCourier implements Courier {

	@Override
	public String getOid(int oid) {
		return oid+" Your Parcel is Shipped by First Flight Courier Servies";
	}
	public firstflightCourier() {
		System.out.println("firstflightCourier.firstflightCourier()");
	}
}
