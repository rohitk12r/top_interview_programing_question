package com.rscoder.ip;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumArray {

	public static void main(String[] args) {
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };

		int sumValue = Arrays.stream(a).boxed().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sumValue);

		// without using the sum method in java 8
		int sum = Arrays.stream(a).boxed().reduce(0, (x, y) -> x + y).intValue();
		System.out.println(sum);

		sum(a);
	}

	private static void sum(int a[]) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
