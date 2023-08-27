package com.rscoder.ip;

import java.util.Arrays;

public class FindSecondLowestNumber {

	public static void main(String[] args) {
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22, 2 };

		int secundMin = Arrays.stream(a).boxed().sorted().skip(1).findAny().get();
		System.out.println(secundMin);
		printSecundMin(a);
	}

	private static void printSecundMin(int[] a) {
		int min = a[0];
		int secMin = 0;
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				secMin = min;
				min = a[i];
			} else if (secMin > a[i]) {
				secMin = a[i];
			}
		}
		System.out.println(secMin);
	}
}
