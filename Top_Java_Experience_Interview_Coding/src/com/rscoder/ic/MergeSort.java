package com.rscoder.ic;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		mergeSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		// copy left arrays
		System.arraycopy(arr, 0, left, 0, mid);
		// copy right arrays
		System.arraycopy(arr, mid, right, 0, arr.length - mid);
		// Using the recursive approach
		mergeSort(left);
		mergeSort(right);

		// merge the both array in single array
		merge(arr, left, right);
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		// Copy remaining elements from left if any
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		// Copy remaining elements from right, if any
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}
}
