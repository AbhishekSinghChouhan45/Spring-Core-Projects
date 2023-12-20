package com.nt.sbeans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.MethodReplacer;

public class Replacer implements MethodReplacer {
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		String msg;
		if(age < 18)
			msg = "Mrs."+name+" your not eligible to vote";
		else
			msg = "Mrs."+name+" your eligible to vote";
		return msg;
	}

}
