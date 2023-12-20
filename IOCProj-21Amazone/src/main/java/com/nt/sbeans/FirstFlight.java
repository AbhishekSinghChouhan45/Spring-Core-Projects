package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ff")
public class FirstFlight implements Courier {
	@Override
	public String getCourier(int oid) {
			return oid+" your order is shipped by First Flight courier services";
	}

	@Override
	public double shipmentAmt(int pincode) {
		double pinamt =0.0;
		if(pincode==451331) {
			pinamt = 10;
		}
		else if(pincode ==451332) {
			pinamt = 30;
		}
		else if (pincode == 451333) {
			pinamt = 40;
		}
		else if (pincode==451334) {
			pinamt = 20;
		}
		else if (pincode== 451335) {
			pinamt = 15;
		}
		return pinamt;
	}
	@Override
	public String getCity(int pincode) {
		String city = null;
		if(pincode==451331) {
			city = "Bamnala";
		}
		else if(pincode ==451332) {
			city = "Gogava";
		}
		else if (pincode == 451333) {
			city = "Bhikangaon";
		}
		else if (pincode==451334) {
			city = "Khargoan";
		}
		else if (pincode== 451335) {
			city = "Selda";
		}
		return city;
	}
}
