package com.armstrong;

/**
 * 
 * @author Jadi Naveen kumar
 * 
 * 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
 * 370
 * 1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643
 *
 */
public class ArmStrongNumber1 {

	public static void main(String[] args) {

		int n = 370;
		int temp = n;
		int r, sum = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum) {
			System.out.println(" Is an Armstrong Number");
		} else {
			System.out.println(" Is Not an Armstrong Number");
		}

	}

}


