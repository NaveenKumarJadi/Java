package com.naveen;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = scan.next().charAt(0);
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println(ch + " it is a Alphabet");
		}else {
			System.out.println(ch + " it is not a Alphabet");
		}
	}
}
/*
Enter a character : a
a it is a Alphabet

Enter a character : 8
8 it is not a Alphabet

*/
