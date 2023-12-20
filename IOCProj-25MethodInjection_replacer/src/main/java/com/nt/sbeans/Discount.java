package com.nt.sbeans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Discount implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		String name = (String) args[0];
		return name+" Dicount Season Started you got it buddy";
	}

}
