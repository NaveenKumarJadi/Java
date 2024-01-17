package com.naveen;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		System.out.println("Before swap : a = " + a + ", b = " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap : a = " + a + ", b = " + b);
	}

}
/*
output:
Before swap : a = 5, b = 6
After swap : a = 6, b = 5
*/