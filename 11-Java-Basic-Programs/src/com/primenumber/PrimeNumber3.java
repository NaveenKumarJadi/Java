package com.primenumber;

public class PrimeNumber3 {

	static void checkPrime(int number) {
		int i, m = 0, count = 0;
		m = number / 2;
		if (number == 0 || number == 1) {
			System.out.println(number + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not prime number");
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(number + " is prime number");
			}
		} 
	}

	public static void main(String args[]) {
		checkPrime(1);
		checkPrime(3);
		checkPrime(17);
		checkPrime(20);
		checkPrime(93);
	}
}
