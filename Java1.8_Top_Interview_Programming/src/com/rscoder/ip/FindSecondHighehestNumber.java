package com.rscoder.ip;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighehestNumber {

	public static void main(String[] args) {
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };

		int secundMax = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findAny().get();
		System.out.println(secundMax);
		printSecundMax(a);
	}

	private static void printSecundMax(int a[]) {

		int max = a[0];
		int secMax = 0;
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				secMax = max;
				max = a[i];
			} else if (secMax < a[i]) {
				secMax = a[i];
			}
		}
		System.out.println(secMax);
	}
}
