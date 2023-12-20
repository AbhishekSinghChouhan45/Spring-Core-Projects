package com.nt.main;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comp.AmbguityException;

public class AmbugityExceptionMain {
	public static void main(String[] args) {
		System.out.println("IN main 1");	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("IN main 2");	
		AmbguityException ae = ctx.getBean("AE",AmbguityException.class);
		System.out.println("AE Obj in main"+ae.hashCode());
	}	
}
