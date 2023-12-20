package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class Dtdc implements Courier{
	public Dtdc() {
		System.out.println("Dtdc()");
	}
	@Override
	public String getOid(int oid) {
		return oid+" Your order is shipped by DTDC Courier Services";
	}
	public int getDcharge() {
		return 60;
	}
	
}
