package com.nt.sbeans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class VotingCheck {
	private String name;
	private int age;
	private String gender;
	//Setter Methods
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	@Autowired
	public void setAge(int age) {
		this.age = age;
	}
	@Autowired
	public void setGender(String gender) {
		this.gender = gender;
	}
	//Life Cycle Methods
	@PostConstruct
	public void Initmethod() {
		System.out.println("VotingCheck.Initmethod()");
		if(name.length()==0 || name == null || age < 0)
			throw new IllegalArgumentException("Invalid Inputs");
	}
	@PreDestroy
	public void Destroy() {
		System.out.println("VotingCheck.Destroy()");
	}
	//Bussiness Logic
	public String check() {
		if(age < 18)
			return "Miss."+name+" your not eligible to vote";
		else
			return "Miss."+name+" your eligible to vote";
	}
}
