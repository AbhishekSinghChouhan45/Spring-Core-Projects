package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bd")
public class bluedartCourier implements Courier {

	@Override
	public String getOid(int oid) {
		return oid+" Your Parcel is Shipped by BlueDart Courier Servies";
	}

}
