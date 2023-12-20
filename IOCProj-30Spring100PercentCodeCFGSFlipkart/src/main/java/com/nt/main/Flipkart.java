package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.CourierException;
import com.nt.sbeans.FlipkartFactory;

public class Flipkart 
{
	public Flipkart() {
		System.out.println("Flipkart()");
	}
    public static void main( String[] args )
    {
    	try {
    		System.out.println(1);
    		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(AppConfig.class);
    		System.out.println(2);
    		FlipkartFactory ff = atx.getBean("ff",FlipkartFactory.class);
    		System.out.println(3);
			String Msg = ff.getCourier(new String[]{"T-shirt,Trouser"}, new double[]{350,650});
			System.out.println(4);
			System.out.println(Msg);
			System.out.println(5);
		} catch( CourierException e) {
			System.out.println(e.getLocalizedMessage());
		}
    	
    }
}
