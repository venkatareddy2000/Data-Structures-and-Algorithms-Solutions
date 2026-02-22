package postfix_to_prefix;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {
	public static String postfixToPrefixConversion(String postfix) {
		Stack<String> stack = new Stack<String>();
		for (int index = 0; index < postfix.length(); index++) {
			Character c = postfix.charAt(index);
			if (Character.isLetterOrDigit(c)) {
				stack.push(String.valueOf(c));
			} else {
				String operand2 = stack.pop();
				String operand1 = stack.pop();
				stack.push(c + operand1 + operand2);
			}
		}
		return stack.peek();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the postfix input : ");
		String postfix = scanner.nextLine();
		String prefix = postfixToPrefixConversion(postfix);
		System.out.println("Prefix : " + prefix);
		scanner.close();
	}
}
