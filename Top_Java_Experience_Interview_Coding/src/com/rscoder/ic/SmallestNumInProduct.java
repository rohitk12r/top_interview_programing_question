package com.rscoder.ic;

public class SmallestNumInProduct {

	public static void main(String[] args) {

		int no = 81000;

		String str = "";
		for (int div = 9; div >= 2; div--) {
			while (no % div == 0) {
				no = no / div;
				str = div + str;
			}
		}
		if (no != 1) {
			System.out.println(-1);
		} else {
			System.out.println(Integer.parseInt(str));
		}
	}
}
