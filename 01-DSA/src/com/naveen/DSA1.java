package com.naveen;

public class DSA1 {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 9, 11, 13 }; // sorted Array

		int target = 13;

//		int result1 = linearSearch(nums, target);
//		int result = binarySearch(nums, target);
		int result = binarySearch(nums, target, 0, nums.length-1);

		if (result != -1) {
			System.out.println("Element found at Index : " + result);
		} else {
			System.out.println("Element Not found ");
		}

		// for Linear search no need sorted Array
		// for Binary search we need sorted Array

	}

	public static int linearSearch(int[] nums, int target) {

		int steps = 0;
		for (int i = 0; i < nums.length; i++) {
			steps++;
			if (nums[i] == target) {
				System.out.println("Steps taken by Linear : " + steps);
				return i;
			}
		}
		System.out.println("Steps taken by Linear : " + steps);
		return -1;
	}

	public static int binarySearch(int[] nums, int target, int left, int right) {
		int steps = 0;
//		int left = 0;
//		int right = nums.length - 1;

		if (left <= right) {
			steps++;
			int mid = (left + right) / 2;
			
			if (nums[mid] == target) {
				System.out.println("Steps taken by Binary : " + steps);
				return mid;
			} else if (nums[mid] < target) {
				return binarySearch(nums, target, mid + 1, right);
			} else if (nums[mid] > target) {
				return binarySearch(nums, target, left, mid - 1);
			}
		}
		
		
//		while (left <= right) {
//			steps++;
//			int mid = (left + right) / 2;
//
//			if (nums[mid] == target) {
//				System.out.println("Steps taken by Binary : " + steps);
//				return mid;
//			} else if (nums[mid] < target) {
//				left = mid + 1;
//			} else if (nums[mid] > target) {
//				right = mid - 1;
//			}
//		}
		
		System.out.println("Steps taken by Binary : " + steps);
		return -1;
	}

}
