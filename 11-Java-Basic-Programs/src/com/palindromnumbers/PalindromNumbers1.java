package com.palindromnumbers;

/**
 * 
 * @author Jadi Naveen kumar A palindrome number is a number that is same after
 *         reverse. For example 545, 151, 34543, 343, 171, 48984 are the
 *         palindrome numbers. It can also be a string like LOL, MADAM etc
 *         
 *         using while loop
 */

public class PalindromNumbers1 {

	public static void main(String[] args) {

		int remainder, sum = 0, temp;
		int n = 565;
		temp = n;
		while (n > 0) {
			remainder = n % 10;
			sum = (sum * 10) + remainder;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println("palindrome Number");
		} else {
			System.out.println("palindrome Number");
		}

	}

}
