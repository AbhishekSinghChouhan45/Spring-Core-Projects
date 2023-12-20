package com.courier.service;

import java.util.Random;

import com.nt.comp.Courier;

public class CourierService {
		public Courier courier;
		
		public void setCourier(Courier courier) {
			System.out.println("CourierService.setCourier()");
				this.courier = courier;
		}
		public String OrderDetails(String item[],double prices[]) {
			System.out.println("CourierService.OrderDetails()");
				double billAmt = 0.0;
				for(double p : prices) {
					billAmt = billAmt + p;
				}
				int oid = new Random().nextInt(1000);
//				System.out.println(courier.getClass());
				String msg = courier.Orderid(oid);
				return msg+" and your Total is "+billAmt;
		}
}
