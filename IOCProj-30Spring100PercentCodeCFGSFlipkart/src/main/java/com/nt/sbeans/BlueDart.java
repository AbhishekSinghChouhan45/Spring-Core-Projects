package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements Courier{
	public BlueDart() {
		System.out.println("BlueDart()");
	}
	@Override
	public String getOid(int oid) {
		return oid+" Your order is shipped by Blue Dart Courier Services";
	}
	@Override
	public int getDcharge() {
		return 50;
	}
	
}
