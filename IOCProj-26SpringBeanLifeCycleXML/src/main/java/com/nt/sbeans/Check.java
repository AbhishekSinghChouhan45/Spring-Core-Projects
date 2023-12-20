package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public  class Check {
		private String name;
		private int age;
		private Date date;
		public void setAge(int age) {
			System.out.println("Check setAge()");
			this.age = age;
		}
		public void setName(String name) {
			System.out.println("Check setName()");
			this.name = name;
		}
		
		public Date getDate() {
			return date;
		}
		public String check() {
			System.out.println("Check check()");
			if(age < 18)
					return "Miss "+name+" you'r not aligible to vote" + date;
			else
				return "Miss "+name+" you'r aligible to vote" + date;
		}
		public void myinit() {
			date = new Date();
			System.out.println("Check myinit()");
			if(name==null || name.length()==0 || age<0) {
				throw new IllegalArgumentException("Wrong Inputs");
			}
		}
		public void mydestroyed() {
			System.out.println("Check mydestroyed()");
			date = null;
		}
		public Check() {
			System.out.println("Check 0-param constructor");
		}
		
		
}
