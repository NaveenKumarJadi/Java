package com.naveen;

//	Insertion sort

public class DSA4 {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 2, 3, 1, 8, 4 };

		for (int i = 1; i < arr.length; i++) 
		{
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) 
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}

/*
 * output: 1 2 3 4 5 6 8
 * 
 */
