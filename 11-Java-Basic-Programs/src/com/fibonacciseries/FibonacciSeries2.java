package com.fibonacciseries;

/**
 * @author Jadi Naveen kumar
 *
 *         Fibonacci Series :: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The
 *         first two numbers of fibonacci series are 0 and 1.
 */

public class FibonacciSeries2 {

	static int num1 = 0;
	static int num2 = 1;
	static int num3;

	static void fibo(int count) {
		if (count > 0) {

			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(", " + num3);
		}
	}

	public static void main(String[] args) {
		int count = 10;
		System.out.print(num1 + ", " + num2);

		fibo(count - 2);

	}

}
