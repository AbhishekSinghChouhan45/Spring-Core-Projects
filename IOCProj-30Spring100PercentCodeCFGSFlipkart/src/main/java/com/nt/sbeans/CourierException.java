package com.nt.sbeans;
public class CourierException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourierException() {
		super("Courier Not Found");
		System.out.println("CourierException()");
	}
}
