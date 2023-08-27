package com.rscoder.ip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayInReverseOrder {

	public static void main(String[] args) {
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };

		List<Integer> newArra = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());

		System.out.println(newArra);

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int newA[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		// Normal sort using the bubble sort
		sort(newA);
	}

	private static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length - 1; j++) {
				if (a[i] > a[j + 1]) {
					int temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
