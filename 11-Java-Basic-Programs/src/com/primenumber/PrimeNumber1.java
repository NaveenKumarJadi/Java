package com.primenumber;

import java.util.Scanner;

/**
 * 
 * @author Jadi Naveen kumar
 *
 */
public class PrimeNumber1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = scan.nextInt(); // it is the number to be checked

		int i, m = 0, count = 0;
		m = number / 2;

		if (number == 0 || number == 1) {
			
			System.out.println(number + " is not prime number");
		} else {
			
			for (i = 2; i <= m; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not prime number");
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(number + " is prime number");
			}
		}

	}

}
