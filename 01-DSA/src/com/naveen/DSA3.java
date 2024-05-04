package com.naveen;

//	Selection sort

public class DSA3 {

	public static void main(String[] args) {

		int[] nums = { 6, 5, 2, 8, 9, 4 };
		int size = nums.length;
		int temp = 0;
		int minIndex = -1;

		System.out.println("Before Sorting : ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int i = 0; i < size - 1; i++) 
		{
			minIndex = i;
			for (int j = i+1; j < size; j++) 
			{
				if (nums[minIndex] > nums[j]) 
				{
					minIndex = j;
				}

			}
			temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;

			System.out.println();
			for (int num : nums) {
				System.out.print(num + " ");
			}
		}

		System.out.println();
		System.out.println("After Sorting : ");
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}

}

/*
output:
Before Sorting : 
6 5 2 8 9 4 

2 5 6 8 9 4 
2 4 6 8 9 5 
2 4 5 8 9 6 
2 4 5 6 9 8 
2 4 5 6 8 9 
After Sorting : 
2 4 5 6 8 9 
*/
