package com.nt.sbeans;

import java.util.List;

public interface Courier {
	public String getCourier(int oid);
	public double shipmentAmt(int pincode);
	public String getCity(int pin);
}
