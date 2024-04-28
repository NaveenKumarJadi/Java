package com.naveen;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Lower Limit : ");
		int lower = scan.nextInt();
		System.out.println("Enter Upper Limit : ");
		int upper = scan.nextInt();

		for (int n = lower; n <= upper; n++) {

			System.out.println("Table " + n);

			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " x " + i + " = " + (n * i));
			}

		}

	}

}
