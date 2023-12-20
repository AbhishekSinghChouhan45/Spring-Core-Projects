package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("a")
@Scope("prototype")
public class Amazone {
	public Amazone() {
		System.out.println("Amazone()");
	}
	private String name;
	@Value("${per.name}")
		public void setName(String name) {
		System.out.println("Amazone...setName()");
			this.name = name;
		}
}
