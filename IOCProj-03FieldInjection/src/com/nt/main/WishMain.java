package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WIshHelper;

public class WishMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ct = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj = ct.getBean("w");
		WIshHelper wh = (WIshHelper) obj;
		String msg = wh.GenrateMessage("Dilli");
		System.out.println(msg);
	}
}
