package com.nt.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.sbeans.Check;
public class SBLCMain {
	public static void main(String[] args) {
		System.out.println(1);
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println(2);
		Check check = ctx.getBean("check",Check.class);
		System.out.println(3);
		System.out.println(check.check());
		System.out.println(4);
		ctx.close();
		System.out.println(check.getDate());
	}
}
