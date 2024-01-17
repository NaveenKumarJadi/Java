package com.naveen;

import java.util.Scanner;

public class AmountBasedOnQuantity {

	public static void main(String[] args) {

		double cost, quantity, amount;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Cost for Dozen Banana's : ");
		cost = scan.nextDouble();

		System.out.print("Enter Quantity : ");
		quantity = scan.nextDouble();

		amount = quantity/12 * cost;
		System.out.println("Amount is : " + amount);
	}
}
/*
output:
Enter Cost for Dozen Banana's : 40
Enter Quantity : 60
Amount is : 200.0
*/