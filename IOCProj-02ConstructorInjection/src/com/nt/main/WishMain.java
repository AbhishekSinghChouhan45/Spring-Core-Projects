package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishHelper;

public class WishMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext c = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj = c.getBean("wmg");
		WishHelper wh = (WishHelper) obj;
		String msg = wh.GenrateMessage("rajau");
		System.out.println(msg);
		
	}

}
