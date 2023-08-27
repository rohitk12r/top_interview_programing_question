package com.rscoder.ip;

import java.util.stream.IntStream;

//Prime numbers are natural numbers that are divisible by only 1 and the number itself
public class FindPrimeNumber {

	public static void main(String[] args) {

		System.out.println(" Is Prime No : " + isPrimeByJava8(7));
		System.out.println(" Is Prime No : " + isPrime(7));

	}

	private static boolean isPrimeByJava8(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		boolean isPrime = IntStream.rangeClosed(2, n / 2).noneMatch(x -> n % 2 == 0);
		return isPrime;
	}

	private static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
