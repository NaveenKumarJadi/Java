package com.naveen;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " % " + b + " = " + (a%b));
	}

}

/*
output:
Enter two integers : 
Enter two integers : 
9
7
9 + 7 = 16
9 - 7 = 2
9 * 7 = 63
9 / 7 = 1
9 % 7 = 2
*/