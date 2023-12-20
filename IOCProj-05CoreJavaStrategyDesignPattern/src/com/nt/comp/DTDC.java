package com.nt.comp;

public class DTDC implements Courier {

	@Override
	public String Orderid(int oid) {
		return oid+" Your odrder shipped by DTDC Courier Service";
	}

}
