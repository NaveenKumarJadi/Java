package com.naveen;

import java.util.Scanner;

public class DiscountClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter bill amount : ");
		double bill = scan.nextDouble();
		if(bill > 5000) {
			double discount = 0.15*bill;
			bill = bill - discount;
		}
		System.out.println("Bill after Discount : " + bill);
	}
}

/*
Q) Program to give 15% discount on bill if the bill amount is greater than 5000
output:
Enter bill amount : 6000
Bill after Discount : 5100.0
*/