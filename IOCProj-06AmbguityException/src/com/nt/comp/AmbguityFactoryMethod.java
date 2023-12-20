package com.nt.comp;
public class AmbguityFactoryMethod {
	private static AmbguityFactoryMethod err;
	public AmbguityFactoryMethod() {
		System.out.println("AmbguityFactoryMethod Cons");
	}
	public static AmbguityFactoryMethod getAE() {
				if(err == null)
					err = new AmbguityFactoryMethod();
		System.out.println("AEF "+ err.hashCode());
		return new AmbguityFactoryMethod();
	}
}
