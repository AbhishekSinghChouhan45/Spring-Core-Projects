package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.AppConfig;
import com.nt.sbeans.WishMessageGenrator;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(AppConfig.class);
    	WishMessageGenrator wm = atx.getBean("wmg",WishMessageGenrator.class);
    	System.out.println(wm.wishMessage());
    }
}
