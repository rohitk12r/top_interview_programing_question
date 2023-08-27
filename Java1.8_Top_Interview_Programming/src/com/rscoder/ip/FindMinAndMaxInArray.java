package com.rscoder.ip;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinAndMaxInArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 1, 22, 11, 33, 5 };

		int max = Arrays.stream(a).boxed().max(Integer::compareTo).get();

		System.out.println("Max Value by java 8 : "+max);
		findMaxValue(a);

		// Find the min number
		int min = Arrays.stream(a).boxed().max(Comparator.reverseOrder()).get();

		System.out.println("Min Value by java 8 : "+min);
		findMinValue(a);

	}

	private static void findMaxValue(int a[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Max Value by java 7 : "+max);
	}

	private static void findMinValue(int a[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Min Value by java 7 : "+min);

	}
}
