package com.naveen;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range : ");
		int range = scan.nextInt();

		for (int n = 1; n <= range; n++) {
			if (n % 2 == 0) {
				System.out.println(n + " ");
			}
		}

	}

}
