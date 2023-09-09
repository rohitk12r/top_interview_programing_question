package com.rscoder.ic;

import java.util.Arrays;

public class ThreeSumArrays {
	public static void main(String[] args) {
		int a[] = { 1, 2, -1, -1, 3, 4, 5, 1, 8, 6 };
		int target = 9;
		Arrays.sort(a);// {-1,-1,1,1,2,3,4,5,6,8}
		// two pointer approach to fix this problem
		for (int i = 0; i < a.length; i++) {
			if ((i == 0) || a[i] != a[i - 1]) {
				int j = i + 1;
				int k = a.length - 1;
				int sno = target - a[i];
				while (j < k) {
					if (a[j] + a[k] == sno) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						// ignore the duplication
						while (j < k && a[j] == a[j + 1])
							j++;
						while (j < k && a[k] == a[k - 1])
							k++;
						j++;
						k--;
					} else if (a[j] + a[k] < sno) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
	}
}
