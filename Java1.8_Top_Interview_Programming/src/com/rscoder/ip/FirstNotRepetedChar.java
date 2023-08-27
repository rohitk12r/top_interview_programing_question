package com.rscoder.ip;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNotRepetedChar {

	public static void main(String[] args) {
		String input = "Java Stream API is very good concept";

		char firstNotRepetedChar = input.chars().mapToObj(x -> Character.toUpperCase((char) x))//converting the object format
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))// find duplicate freq in linkedHashMap
				.entrySet().stream().filter(x -> x.getValue() == 1L).map(x -> x.getKey()).findFirst().get();//filtering the freq whihc is not first time

		System.out.println("First non repeated char  : " + firstNotRepetedChar);
		findNonReatedChar(input);
	}

	public static void findNonReatedChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();// Insertion order is preserved
		String atrArray[] = str.split(" ");
		for (String splitValue : atrArray) {
			for (char c : splitValue.toCharArray()) {
				map.put(Character.toUpperCase(c), map.getOrDefault(Character.toUpperCase(c), 0) + 1);
			}
		}
		for (Character ch : map.keySet()) {
			if (map.get(ch) == 1) {
				System.out.println("First non repeated char  : " + ch);
				break;
			}
		}
	}
}
