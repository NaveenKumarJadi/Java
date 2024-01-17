package com.naveen;
import java.util.Scanner;

public class CashBackClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Credit card bill amount : ");
		double  bill = scan.nextDouble();
		
		System.out.println("Enter amount to Pay : ");
		double amount = scan.nextDouble();
		
		double min = 0.5 * bill;
		int cashback = 0;
		if(amount > min) {
			cashback = 200;
		}
		System.out.println("Thank you for payment of : " + amount);
		System.out.println("Your cashback is : " + cashback);
	}
}

/*
Program to give 200 rupees cash back if the customer pay minimum 50% amount of credit bill:
output:
Enter the Credit card bill amount : 
20000
Enter amount to Pay : 
12000
Thank you for payment of : 12000.0
Your cashback is : 200
*/
