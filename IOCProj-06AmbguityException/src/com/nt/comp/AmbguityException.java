package com.nt.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("AE")
public class AmbguityException {
	private static  AmbguityException ae;
	private AmbguityFactoryMethod ldt;
	@Autowired
	@Qualifier("ae1")
	public void setDate(AmbguityFactoryMethod ldt) {
			this.ldt =ldt;
			System.out.println("AE 1 "+ ldt.hashCode());
		}
	@Autowired
	@Qualifier("ae2")
	public void setDat(AmbguityFactoryMethod ldt) {
		this.ldt =ldt;
		System.out.println("AE 2 "+ ldt.hashCode());
	}
	public AmbguityException() {
		System.out.println("AE Con");
	}
//	@Autowired
	public  static AmbguityException getTime() {
			ae = new AmbguityException();
			System.out.println("AE Obj "+ae.hashCode());
			return ae;
	}
}
