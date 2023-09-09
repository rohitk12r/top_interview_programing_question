package com.rscoder.ic;

import java.util.Arrays;

public class CycleShiftArray {

	public static void main(String[] args) {
		int shiftBy = 2; // Shift right by 2 positions

		int[] rightArr = { 1, 2, 3, 4, 5 };
		rightShift(rightArr, shiftBy);
		System.out.println(Arrays.toString(rightArr));
		// Output: [4, 5, 1, 2, 3]

		int[] leftArr = { 1, 2, 3, 4, 5 };
		leftShift(leftArr, shiftBy);
		System.out.println(Arrays.toString(leftArr));
		// Output: [3, 4, 5, 1, 2]
	}

	public static void leftShift(int[] arr, int n) {
		int len = arr.length;
		n = n % len;
		reverse(arr, 0, n - 1);// concentrate on this
		reverse(arr, n, len - 1);
		reverse(arr, 0, len - 1);
	}

	public static void rightShift(int[] arr, int n) {
		int len = arr.length;
		n = n % len;
		reverse(arr, 0, len - 1);// concentrate on this
		reverse(arr, 0, n - 1);
		reverse(arr, n, len - 1);
	}

	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
