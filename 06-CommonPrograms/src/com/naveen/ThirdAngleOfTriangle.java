package com.naveen;

import java.util.Scanner;

public class ThirdAngleOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Angels of Triangle : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 180- (a + b);
		System.out.println("Third angle is : " + c);
	}

}
/*
output: 
Enter Two Angels of Triangle : 
65
75
Third angle is : 40
*/