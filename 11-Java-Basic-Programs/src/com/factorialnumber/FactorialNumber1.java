package com.factorialnumber;

/**
 * 
 * @author Jadi Naveen kumar
 *
 *         4! = 4*3*2*1 = 24 
 *         5! = 5*4*3*2*1 = 120
 *
 */

public class FactorialNumber1 {

	public static void main(String[] args) {

		int fact = 1;
		int number = 5;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
