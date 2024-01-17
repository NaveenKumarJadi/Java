package com.naveen;

import java.util.Scanner;

public class DaysToYearsAndWeeksAndDays {

	public static void main(String[] args) {

		int days, weeks, years;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter days : ");
		days = scan.nextInt();
		
		years = days/365;
		weeks = (days - (years * 365))/7;
		days = (days - (years * 365) + (weeks * 7));
		
		System.out.println(years + " years , " + weeks + " weeks , " + days + " days");
		
	}

}

/*
years = days/365
weeks = (days - (years * 365))/7
days =  days - ((years * 365) + (weeks * 7))

output: 
Enter days : 
500
1 years , 19 weeks , 268 days

*/