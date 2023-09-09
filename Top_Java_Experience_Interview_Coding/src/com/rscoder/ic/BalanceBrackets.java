package com.rscoder.ic;

import java.util.Stack;

public class BalanceBrackets {

	public static void main(String[] args) {
		String str = "((}}))";
		boolean isBalanced = isBalanced(str);
		System.out.println("Is the string balanced? " + isBalanced);
	}

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false; // Closing bracket with no matching opening bracket
				}
				char top = stack.pop();
				// Check if the current closing bracket matches the last opening bracket
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		// If the stack is empty, all brackets are balanced
		return stack.isEmpty();
	}
}
