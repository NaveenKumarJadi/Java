package com.naveen;

import java.util.Scanner;

/**
 * 
 * @author Jadi kumar
 *
 *Palindrome Number: 525, 55255, 9889, Stirngs: MADAM, LOL
 */
public class PlaindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Lower Limit : ");
		int lower = scan.nextInt();
		System.out.println("Enter Upper Limit : ");
		int upper = scan.nextInt();

		System.out.println("Plaindrome Number from " + lower + " to " + upper);
		
		for(int i=lower; i<=upper; i++) {
			int temp = i;
			int  rev =0, r =0;
			while(temp!=0) {
				r = temp%10;
				rev = rev*10+r;
				temp=temp/10;
			}
			if(rev==i) {
				System.out.println(i);
			}
		}

	}

}
