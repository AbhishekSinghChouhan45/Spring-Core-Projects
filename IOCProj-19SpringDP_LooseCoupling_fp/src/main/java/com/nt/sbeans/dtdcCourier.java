package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class dtdcCourier implements Courier {

	@Override
	public String getOid(int oid) {
		return oid+" Your Parcel is Shipped by DTDC Courier Servies";
	}
	public dtdcCourier() {
	System.out.println("dtdcCourier.dtdcCourier()");	
	}

}
