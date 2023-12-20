package com.courier.service;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FirstFlight;
import com.nt.comp.ShipRocket;

public class CourierService2 {
	public static CourierService getInstance(String cname) {
		System.out.println("CourierService2.getInstance()");
			Courier courier = null;
			if(cname.equalsIgnoreCase("dtdc"))
				 courier = new DTDC();
			else if(cname.equalsIgnoreCase("firstflight"))
				courier = new FirstFlight();
			else if(cname.equalsIgnoreCase("BlueDart"))
				courier = new BlueDart();
			else if(cname.equalsIgnoreCase("ShipRocket"))
				courier = new ShipRocket();
			else
				throw new IllegalArgumentException("Invalid Courier Type");
			CourierService cs = new CourierService();
			cs.setCourier(courier);
			System.out.println("CourierService2.getInstance3()");
			return cs;
	}
	
}
