package com.nt.sbeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component("c")
public class VotingCheck  implements InitializingBean,DisposableBean{
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Override
	public void destroy() throws Exception {
		System.out.println("VotingCheck.destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if(name.length()==0 || age < 0) 
			throw new IllegalArgumentException("Wrong Inputs");
	}
	public void check() {
		if(age<18)
			System.out.println(name+" your not elligible to vote");
		else
			System.out.println(name+" your elligible to vote");
	}
}
