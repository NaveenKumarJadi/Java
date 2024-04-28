package com.naveen;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Lower Limit : ");
		int lower = scan.nextInt();
		System.out.println("Enter Upper Limit : ");
		int upper = scan.nextInt();

		System.out.println("Prime number from " + lower + " to " + upper);

		for (int i = lower; i <= upper; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}

	}
}
