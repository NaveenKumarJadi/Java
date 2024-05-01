package com.factorialnumber;

/**
 * @author Jadi Naveen kumar
 *
 *         4! = 4*3*2*1 = 24 
 *         5! = 5*4*3*2*1 = 120
 */

public class FactorialNumber2 {

	static int factorial(int number) {

		if (number == 0) {
			return 1;
		} else {
			return (number * factorial(number - 1));
		}
	}

	public static void main(String args[]) {
		
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		
		fact = factorial(number);
		
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
