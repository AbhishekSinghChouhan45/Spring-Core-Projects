package com.nt.sbeans;

public class DTDC implements Courier {
	@Override
	public String getCourier(int oid) {
			return oid+" your order is shipped by DTDC courier services";
	}

}
