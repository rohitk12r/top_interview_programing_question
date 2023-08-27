package com.rscoder.ip;

import java.util.stream.IntStream;

public class PrintEvenOddNumber {

	public static void main(String[] args) {

		printEvenNumberByJava8();
		printOddNumberByJava8();

	}

	private static void printEvenNumberByJava8() {

		IntStream.rangeClosed(0, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

	}

	private static void printOddNumberByJava8() {

		IntStream.rangeClosed(0, 10).filter(x -> x % 2 != 0).forEach(System.out::println);

	}
}
