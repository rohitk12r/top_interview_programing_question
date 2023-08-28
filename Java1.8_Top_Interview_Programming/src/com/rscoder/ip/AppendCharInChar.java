package com.rscoder.ip;

import java.util.stream.Stream;

public class AppendCharInChar {

	// Input={A,B,C} ==>output [A_X,B_Y,C_Z] write in java 8
	public static void main(String[] args) {
		Stream<Character> charStream = Stream.of('A', 'B', 'C');
		charStream.forEach(ch -> {
			char newChar = (char) (ch + 23);
			System.out.println(ch + "_" + newChar);
		});

	}
}
