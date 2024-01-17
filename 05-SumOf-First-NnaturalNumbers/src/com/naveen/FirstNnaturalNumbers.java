package com.naveen;

import java.util.Scanner;

public class FirstNnaturalNumbers {

	public static void main(String[] args) {

		int n; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n value : ");
		n = scan.nextInt();
		int sum = n*(n+1)/2;
		System.out.println("Sum of First " + n + " numbers : " + sum);
	}

}

/*
output: 
Enter n value : 8
Sum of First 8 numbers : 36
*/