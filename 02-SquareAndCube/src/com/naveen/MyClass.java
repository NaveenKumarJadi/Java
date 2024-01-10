package com.naveen;

public class MyClass {

	public static void main(String[] args) {
		
		int number = 5;
		int sq = number * number;
		int cu = number * number * number;
		
		//Sumb of Square and Cube of a Number
		int sum = sq + cu;
		
		System.out.println("Square of " + number + " is : " + sq);
		System.out.println("Cube of " + number + " is : " + cu);
		System.out.println("Sum of Square and Qube of a Number is : " + sum);
	}

}

/*
output: 
Square of 5 is : 25
Cube of 5 is : 125
Sum of Square and Qube of a Number is : 150
*/