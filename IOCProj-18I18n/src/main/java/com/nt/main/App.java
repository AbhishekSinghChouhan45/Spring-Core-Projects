package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter language:: ");
    	String lang = sc.nextLine();
    	lang  = lang.toLowerCase();
    	System.out.print("Enter Country:: ");
    	String cont = sc.nextLine();
    	cont =  cont.toUpperCase();
    	Locale l = new Locale(lang,cont);
    	String msg1 = ctx.getMessage("goodmorning.msg",new Object[] {}, l);
    	String msg2 = ctx.getMessage("goodbye.msg",new Object[] {}, l);
    	System.out.println(msg1);
    	System.out.println(msg2);
    }
}
