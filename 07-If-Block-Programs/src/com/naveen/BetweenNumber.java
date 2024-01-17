package com.naveen;
import java.util.Scanner;

public class BetweenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number between 30 and 50 : ");
		int num = scan.nextInt();
		if (num >= 30 && num <= 50)
			System.out.println("Valid number entered");
		else
			System.out.println("Invalid number entered");

	}

}
/*
output:
Enter number between 30 and 50 : 25
Invalid number entered

Enter number between 30 and 50 : 45
Valid number entered
*/