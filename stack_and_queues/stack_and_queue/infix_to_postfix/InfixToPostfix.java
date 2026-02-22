package infix_to_postfix;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	public static String infixToPostfixConversion(String infix) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder result = new StringBuilder();
		for (int index = 0; index < infix.length(); index++) {
			Character c = infix.charAt(index);
			if (Character.isLetterOrDigit(c)) {
				result.append(c);
			} else if (c == '(') {
				stack.push('(');
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
					result.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		return result.toString();
	}

	public static int precedence(Character c) {
		if (c == '^') {
			return 3;
		} else if (c == '*' || c == '/') {
			return 2;
		} else if (c == '+' || c == '-') {
			return 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the infix input : ");
		String infix = scanner.nextLine();
		String postfix = infixToPostfixConversion(infix);
		System.out.println("Postfix : " + postfix);
		scanner.close();
	}

}
