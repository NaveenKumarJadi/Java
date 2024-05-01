package com.perfectnumbers;

/**
 * 
 * @author Jadi Naveen kumar
 * 
 *         6 -> 1 + 2 + 3 = 6 28 -> 1 + 2 + 4 + 7 + 14 = 28
 *
 */
public class PerfectNumber {

	public static void main(String[] args) {

		int n = 28;
		boolean b = isPerfect(n);
		if (b)
			System.out.println("Its a perfect Number");
		else
			System.out.println("Its Not a perfect Number");
	}

	public static boolean isPerfect(int n) {

		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i; //sum += i;
			}
		}
		if (n == sum) {
			return true;
		}
		return false;
	}

}
