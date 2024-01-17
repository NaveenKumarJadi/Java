package com.naveen;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year : ");
		int n = scan.nextInt();
		if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0))
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
	}
}
/*
Enter year : 
1997
Not a leap year

Enter year : 
2000
Leap year
*/