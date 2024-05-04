package com.naveen;

//	Quick sort 

public class DSA5 {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 81, 62, 2, 3, 99, 1, 8, 4 };

		quickSort(arr, 0, arr.length - 1);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}

/*
output:
1 2 3 4 5 6 8 62 81 99 
*/
