package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
  Single = one
  ton = object 
  What is Singleton class ?
  =>	SIngleton is class which allow us to create one object of class if we create another object of 
  		that class than it will give same object ref
  		
 	We can say that this class is singleton java class because of @Scope Annotation but
 	this class is not pure singelton class because @Scope Annotation can stop creating same object 
 	 twice and if we create same object twice than it will give us same object ref but this is only 
 	 apply on same bean id
 	 If we give another bean id of same class than it will create another object
 	 
 	 @Scope is perBean singleton not a per class singleton
 */
@Component("p")
@Scope("singleton")
public class Parent {
	public Parent() {
		System.out.println("Parent Constructor");
	}
	public void get() {
		System.out.println("Parent.get()");
	}
}
