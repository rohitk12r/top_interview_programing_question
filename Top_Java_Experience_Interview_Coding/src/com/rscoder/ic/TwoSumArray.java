package com.rscoder.ic;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
	public static void main(String[] args) {
		int a[] = { 1, 4, 2, 6, 7, 9 };
		int target = 9;
		int[] index = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			Integer temp = target - a[i];
			if (map.containsKey(temp)) {
				index[0] = map.get(temp);
				index[1] = i;
				break;
			}
			map.put(a[i], i);
		}
		System.out.println(index[0] + " " + index[1]);
	}
}
