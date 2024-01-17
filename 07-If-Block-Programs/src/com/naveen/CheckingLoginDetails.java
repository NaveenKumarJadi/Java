package com.naveen;
import java.util.Scanner;

public class CheckingLoginDetails {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Username : ");
		String username = scan.nextLine();

		System.out.print("Enter Password : ");
		String password = scan.nextLine();
		
		if(username.equals("navin") && password.equals("123456")) {
			System.out.println("Login Success");
		}else {
			System.out.println("Error : Invalid login");
		}
	}
}
/*
output:
Enter Username : navin
Enter Password : 123456
Login Success

Enter Username : naveen
Enter Password : 654321
Error : Invalid login
*/