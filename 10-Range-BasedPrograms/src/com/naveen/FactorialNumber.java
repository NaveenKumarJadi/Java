package com.naveen;

public class FactorialNumber {

	public static void main(String[] args) {

		for (int n = 2; n <= 7; n++) {

			int fact = 1;
			for (int i = 1; i <= n; i++) {

				fact = fact * i;

			}
			System.out.println("Factorial of " + n + "is : " + fact);
		}

	}

}
