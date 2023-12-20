package com.flipkart.main;

import com.courier.service.CourierService;
import com.courier.service.CourierService2;

public class FlipkartMain {
	public static void main(String[] args) {
			CourierService cs = new CourierService2().getInstance("shiprocket");
			System.out.println(cs);
			System.out.println(cs);
			CourierService cs1 = new CourierService();
			System.out.println(cs1);
			System.out.println(cs1);
			System.out.println("FlipkartMain.main()");
			String msg = cs.OrderDetails(new String[] {"jeans","Shirt"}, new double[] {1000,5000});
			System.out.println(msg);
	}
}
