package com.naveen;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		
		System.out.println("Before swap : a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap : a = " + a + ", b = " + b);
	}
}

/*
ouptut:
Before swap : a = 5, b = 3
After swap : a = 3, b = 5
*/