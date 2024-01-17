package com.naveen;

import java.util.Scanner;

public class BonusOnSalary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter salary : ");
		double salary = scan.nextDouble();
		
		System.out.println("Enter experience : ");
		int experience = scan.nextInt();
		
		if(experience > 5) {
			double bonus = 0.2*salary;
			salary = salary + bonus;
		}
		System.out.println("Salary to pay : " + salary);
	}

}
/*
Program to give 20% bonus on salary if the employee has more than 5 years of 
experience:
output:
Enter salary : 
10000
Enter experience : 
6
Salary to pay : 12000.0

*/