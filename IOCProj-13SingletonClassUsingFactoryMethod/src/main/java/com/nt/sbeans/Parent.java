package com.nt.sbeans;

public class Parent {
	private static Parent Instance;
	private Parent() {
		System.out.println("Parent Constructor");
	}
	public static Parent getInstance() {
		System.out.println("Parent.get()");
		if(Instance == null) {
			Instance = new Parent();
			System.out.println("Intializing");
		}
		return Instance;
	}
}
