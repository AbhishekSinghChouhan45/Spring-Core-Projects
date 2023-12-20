package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.flipkartFactory;

public class Flipkart {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("fpkt");
		flipkartFactory ff = (flipkartFactory)obj;
		String result = ff.Shopping(new String[] {"jeans,trouser"}, new double[] {2000,900});
		System.out.println(result);
		
	}
}
