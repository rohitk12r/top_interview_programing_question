package com.rscoder.ic;

import java.util.Stack;

//Reverse Polish Notation (RPN), also known as postfix notation, is a mathematical notation in which 
// every operator follows all of its operands.
public class ReversePoliseNotation {

	public static void main(String[] args) {

		String exp[] = { "2", "3", "12", "8", "2", "/", "*", "+", "-" };

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < exp.length; i++) {

			String v = exp[i];
			if (v.equals("+") || v.equals("-") || v.equals("*") || v.equals("/")) {

				int pop1 = stack.pop();
				int pop2 = stack.pop();
				stack.push(solve(pop2, pop1, v));
			} else {
				// Token is an operand
				stack.push(Integer.parseInt(v));
			}
		}
		System.out.println(stack.pop());
	}

	private static Integer solve(int pop2, int pop1, String v) {
		if (v.equals("+")) {
			return pop2 + pop1;
		}
		if (v.equals("-")) {
			return pop2 - pop1;
		}
		if (v.equals("*")) {
			return pop2 * pop1;
		}
		if (v.equals("/")) {
			return pop2 / pop1;
		}
		return 0;
	}
}
