package com.rscoder.ip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatteringList {

	public static void main(String[] args) {
		List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9, 11);
		List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10);
		List<List<Integer>> listOfList = Arrays.asList(oddList, evenList);
		System.out.println(listOfList);
		List<Integer> flatList = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

		System.out.println(flatList);
	}
}
