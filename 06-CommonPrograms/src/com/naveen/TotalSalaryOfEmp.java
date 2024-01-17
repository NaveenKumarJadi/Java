package com.naveen;

import java.util.Scanner;

public class TotalSalaryOfEmp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary : ");
		double basicSal = sc.nextDouble();
		double hra = 0.25*basicSal;
		double ta = 0.25*basicSal;
		double da = 0.25*basicSal;
		double total = basicSal + hra + ta + da;
		
		System.out.println("Total Salary : " + total);
	}

}
/*
output: 
Enter Basic Salary : 
14100
Total Salary : 24675.0
*/