package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("sr")
public class shiprocketCourier implements Courier {

	@Override
	public String getOid(int oid) {
		return oid+" Your Parcel is Shipped by Ship Rocket Courier Servies";
	}

}
