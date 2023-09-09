package com.rscoder.ic;

public class CharacterCountInString {

	public static void main(String[] args) {
		String input = "ABACBBAA";
		String characterCountString = characterCountString(input);
		System.out.println("Character Count String: " + characterCountString);
	}

	public static String characterCountString(String input) {
		if (input == null || input.isEmpty()) {
			return input; // Return the input string as-is if it's null or empty.
		}
		StringBuilder compressed = new StringBuilder();
		char currentChar = input.charAt(0);
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			char nextChar = input.charAt(i);

			if (currentChar == nextChar) {
				// If the current character is the same as the next one, increment the count.
				count++;
			} else {
				// If a new character is encountered, append the current character and its count
				// to the result.
				compressed.append(currentChar).append(count);
				currentChar = nextChar; // Update the current character.
				count = 1; // Reset the count for the new character.
			}
		}
		// Append the last character and its count.
		compressed.append(currentChar).append(count);
		return compressed.toString();
	}

}
