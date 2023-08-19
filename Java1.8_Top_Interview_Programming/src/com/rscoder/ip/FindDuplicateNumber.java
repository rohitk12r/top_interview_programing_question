package com.rscoder.ip;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 2, 12, 34, 2, 11 };

		System.out.println("Duplicate number by java 1.8 : " + findDuplicateNumberByJava1_8(a));
		System.out.println("Duplicate number: " + findDuplicateNumber(a));
	}

	// Using Java 1.8 to find the duplicate
	public static int findDuplicateNumberByJava1_8(int[] a) {
		Map<Integer, Long> map = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int duplicate = map.keySet().stream().filter(x -> map.get(x) > 1).findFirst().orElse(0);

		// If there have more then one duplicate then used this
		map.keySet().stream().filter(x -> map.get(x) > 1).forEach(System.out::println);

		return duplicate;
	}

	public static int findDuplicateNumber(int[] a) {// Time complexity is O(n) and Space complexity O(n)
		Set<Integer> set = new HashSet<>();
		for (int v : a) {
			if (!set.add(v)) {
				return v;
			}
		}
		return 0;
	}
}
