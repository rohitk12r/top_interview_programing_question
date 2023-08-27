package com.rscoder.ip;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInString {

	public static void main(String[] args) {
		String input = "JavaAPI";

		List<Character> list = input.chars().mapToObj(x -> Character.toUpperCase((char) x))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1L).map(Entry::getKey).collect(Collectors.toList());

		System.out.println(list);
		printDulicate(input);
	}

	public static void printDulicate(String str) {
		List<Character> duplicateList = new ArrayList<>();
		Set<Character> set = new HashSet<>();
		for (Character c : str.toUpperCase().toCharArray()) {
			if (!set.add(c) && !duplicateList.contains(c)) {
				duplicateList.add(c);
			}
		}
		System.out.println(duplicateList);
	}
}
