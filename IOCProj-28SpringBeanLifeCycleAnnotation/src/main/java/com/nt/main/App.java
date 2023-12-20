package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingCheck;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	VotingCheck vc = ctx.getBean("check",VotingCheck.class);
    	System.out.println(vc.check());
    	ctx.close();
    }
}
