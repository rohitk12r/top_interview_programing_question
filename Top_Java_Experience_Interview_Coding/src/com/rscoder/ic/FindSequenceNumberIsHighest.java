package com.rscoder.ic;

public class FindSequenceNumberIsHighest {
	public static void main(String[] args) {
		String str = "11100111111001111011111110011111";
		int prev = 0;
		int next = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				prev++;
			} else if (next < prev) {
				next = prev;
			} else if (str.charAt(i) == '0') {
				prev = 0;
			}
		}
		System.out.println(next);
	}
}
