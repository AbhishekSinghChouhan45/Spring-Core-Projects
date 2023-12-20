package com.nt.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.Amazone;
import com.nt.sbeans.AppConfig;
import com.nt.sbeans.Flipkart;

public class App 
{
	public App() {
		System.out.println("App()");
	}
    public static void main( String[] args )
    {
    	System.out.println(1);
    	AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(AppConfig.class);
    	System.out.println(atx.hashCode()+"...."+atx.getClass());
    	//Created this class as Singleton Scope using private Construcor
    	Flipkart f = atx.getBean("f",Flipkart.class);
    	Flipkart ff = atx.getBean("ff",Flipkart.class);
    	Flipkart fff = atx.getBean("fff",Flipkart.class);
    	System.out.println(f.hashCode()+" "+f.getClass());
    	System.out.println(ff.hashCode()+" "+ff.getClass());
    	System.out.println(fff.hashCode()+" "+fff.getClass());
    	//Created this class as partiallt singleton class
    	Amazone a = atx.getBean("a",Amazone.class); // -> prototype scope class 
    	Amazone aa = atx.getBean("aa",Amazone.class);
    	System.out.println(a.hashCode()+"..."+a.getClass());
    	System.out.println(aa.hashCode()+"..."+aa.getClass());
    }
}
