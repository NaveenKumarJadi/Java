package com.palindromnumbers;

import java.util.Scanner;

/**
 * 
 * @author Jadi Naveen kumar A palindrome number is a number that is same after
 *         reverse. For example 545, 151, 34543, 343, 171, 48984 are the
 *         palindrome numbers. It can also be a string like LOL, MADAM etc
 * 
 *         using recurssion Java program to reverse a number and find if it is a
 *         palindrome or not
 * 
 */
public class PalindromNumbers2 {

	// Recursive function to reverse the digits of number
	static int recursive_func(int n, int rev) {
		if (n < 10) {
			return rev * 10 + n;
		} else {
			int last_digit = n % 10;
			rev = rev * 10 + last_digit;
			return recursive_func(n / 10, rev);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number to check Palindrom : ");
		int n = scan.nextInt();
		
		int rev = recursive_func(n, 0);

		System.out.println("Reverse of n = " + rev);

		if (n == rev)
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");
	}
}