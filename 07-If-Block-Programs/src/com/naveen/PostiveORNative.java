package com.naveen;

import java.util.Scanner;

public class PostiveORNative {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer : ");
		int n = scan.nextInt();
		
		if(n>=0) {
			System.out.println("Positive Number");
		}else {
			System.out.println("Negative Number");
		}
	}

}
/*
Output:
Enter a integer : 
-5
Negative Number
*/