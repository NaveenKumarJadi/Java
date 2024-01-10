package com.naveen;

import java.util.Scanner;

public class PrintLastDigit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int d = n%10;
		System.out.println("Last digit of " + n + " is : " + d);
	}

}

/*
Output:
Enter a number: 
56259
Last digit of 56259 is : 9
*/