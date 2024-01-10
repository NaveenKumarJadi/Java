package com.naveen;

import java.util.Scanner;

public class RemoveLastDigit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		n = n/10;
		System.out.println("Without digit of " + n + " is : " + n);
	}

}

/*
output: 
Enter a number: 
1256
Without digit of 125 is : 125
*/