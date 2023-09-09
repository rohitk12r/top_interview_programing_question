package com.rscoder.ic;

public class FindStringPatterns {
	public static void main(String[] args) {
		String str = "abcdefghi";
		String pattern = "def";
		int startIndex = str.indexOf(pattern);
		if (startIndex != -1) {
			System.out.println("Pattern starts at index: " + startIndex);
		} else {
			System.out.println("Pattern not found in the string.");
		}
		System.out.println("Find pattern by brute force algo : " + isFindPattern(str, pattern));
	}

// It is brute force algorithm to find the index
	private static int isFindPattern(String str, String pattern) {
		int ms = str.length();
		int ps = pattern.length();
		int index = 0;
		for (int i = 0; i < ms - ps + 1; i++) {
			boolean flag = true;
			for (int j = 0; j < ps && flag; j++) {
				if (str.charAt(j + i) != pattern.charAt(j)) {
					flag = false;
				}
			}
			if (flag) {
				index = i;
				break;
			}
		}
		return index;
	}
}
