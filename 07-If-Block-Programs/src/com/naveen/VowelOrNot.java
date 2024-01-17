package com.naveen;
import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter character : ");
		char ch = scan.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("Vowel");
		else
			System.out.println("Not vowel");
	}
}
/*
Enter character : g
Not vowel

Enter character : e
Vowel
*/