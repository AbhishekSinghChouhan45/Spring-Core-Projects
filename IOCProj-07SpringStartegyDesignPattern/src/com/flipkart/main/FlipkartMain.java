package com.flipkart.main;

import com.flipkart.factory.*;
public class FlipkartMain {
	public static void main(String[] args) {
		FlipkartFactory ff = Flipkart.getObj("shiprocket");
		String msg =ff.getCourierName(new String[] {"jeans,shirt"}, new double[] {200,900});
		System.out.println(msg);
	}
}
