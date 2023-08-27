package com.rscoder.ip;

import java.util.Arrays;

public class FindMinAndMaxInArrayWithoutMaxFunction {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 22, 11, 33, 5 };
		int max = Arrays.stream(arr).boxed().reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b)).intValue();
		int min = Arrays.stream(arr).boxed().reduce(Integer.MAX_VALUE, (a, b) -> Integer.min(a, b)).intValue();
		System.out.println("Max : " + max + "  Min : " + min);

		System.out.println();
		// Using the method reference;
		int max1 = Arrays.stream(arr).boxed().reduce(Integer::max).get();
		int min1 = Arrays.stream(arr).boxed().reduce(Integer::min).get();
		System.out.println("Max : " + max1 + "  Min : " + min1);
	}
}
