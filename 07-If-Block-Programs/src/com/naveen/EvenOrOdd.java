package com.naveen;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}

	}

}
/*
output:
Enter a number : 
5
Odd Number

*/