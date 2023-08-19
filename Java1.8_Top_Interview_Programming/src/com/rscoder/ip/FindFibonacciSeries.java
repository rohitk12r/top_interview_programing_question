package com.rscoder.ip;

import java.util.stream.Stream;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		findFibonacciSeriesByJava8();
		System.out.println();
		findFibonacciSeries();
	}

	public static void findFibonacciSeriesByJava8() {
		Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10).map(f -> f[0])
				.forEach(System.out::println);
	}

	public static void findFibonacciSeries() {
		int curr = 0, next = 1;
		System.out.print(curr + " " + next);// printing 0 and 1
		for (int i = 2; i < 10; i++) {
			int series = curr + next;
			System.out.print(" " + series);
			curr = next;
			next = series;
		}
	}
}
