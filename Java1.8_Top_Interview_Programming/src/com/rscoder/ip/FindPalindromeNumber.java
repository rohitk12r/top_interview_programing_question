package com.rscoder.ip;

import java.util.stream.IntStream;

//A Palindromic number is a number (such as 16461) that remains the same when its digits are reversed.
public class FindPalindromeNumber {
	public static void main(String[] args) {
		System.out.println(" Is Palindrome No : " + isPalindromeNumberByJava8(16461));
		System.out.println(" Is Palindrome No : " + isPalindromeNumber(712));
	}

	private static boolean isPalindromeNumberByJava8(int n) {
		String value = String.valueOf(n);
		int len = value.length();
		boolean isPalindromeNumber = IntStream.range(0, len / 2)
				.anyMatch(index -> value.charAt(index) == value.charAt(len - index - 1));
		return isPalindromeNumber;
	}

	private static boolean isPalindromeNumber(int n) {
		String value = String.valueOf(n);
		int len = value.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + value.charAt(i);
		}
		return value.equals(rev);
	}
}
