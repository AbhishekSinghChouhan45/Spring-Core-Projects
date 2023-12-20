package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class flipkartFactory {
		@Autowired
		@Qualifier("SR")
		private Courier courier;
		
		public String Shopping(String items[],double []prices) {
				System.out.println("Step 1");
					double billAmt = 0.0;
					for(double d : prices) {
						billAmt = d + billAmt;
					}
					int oid  = new Random().nextInt(1000);
					System.out.println("Step 2"+courier.getClass());
					String msg = courier.deliver(oid);
					System.out.println("Step4");
					return "items with bill amount "+billAmt+" "+msg;
		}
}
