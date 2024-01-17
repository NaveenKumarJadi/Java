package com.naveen;

import java.util.Scanner;

public class CheckPersonCanVoteOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = scan.nextInt();
		if (age >= 18)
			System.out.println("Eligible for Vote");
		else
			System.out.println("Wait " + (18 - age) + " more years to vote");

	}
}

/*
output:
Enter age : 12
Wait 6 more years to vote

Enter age : 23
Eligible for Vote

*/