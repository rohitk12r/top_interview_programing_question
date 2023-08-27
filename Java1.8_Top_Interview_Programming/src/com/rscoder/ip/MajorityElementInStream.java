package com.rscoder.ip;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

///Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times
public class MajorityElementInStream {

	public static void main(String[] args) {
		int majorityArray[] = { 5, 3, 2, 1, 2, 4, 3, 2, 2, 6, 2, 3, 2, 2, 2 };
		int notMajorityArray[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		printMajorityElementByJava8(majorityArray);
		printMajorityElementByJava8(notMajorityArray);
		printMajorityElement(majorityArray);
		printMajorityElement(notMajorityArray);
	}

	private static void printMajorityElementByJava8(int a[]) {
		int majorityElement = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting())).entrySet()
				.stream().filter(k -> k.getValue() >= a.length / 2).map(Entry::getKey).findFirst().orElse(0);

		System.out.println(majorityElement);
	}

	private static void printMajorityElement(int a[]) {// Time O(n*n), Space O(1)
		int count = 0;
		int len = a.length;
		int majorityElement = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count >= len / 2) {
				majorityElement = a[i];
				break;
			}
			count = 0;
		}
		System.out.println(majorityElement);
	}
}
