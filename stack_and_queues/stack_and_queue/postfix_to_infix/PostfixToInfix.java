package postfix_to_infix;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
	public static String postfixToInfixConversion(String postfix) {
		Stack<String> stack = new Stack<String>();
		for (int index = 0; index < postfix.length(); index++) {
			Character c = postfix.charAt(index);
			if (Character.isLetterOrDigit(c)) {
				stack.push(String.valueOf(c));
			} else {
				String operand2 = stack.pop();
				String operand1 = stack.pop();
				stack.push("(" + operand1 + c + operand2 + ")");
			}
		}
		return stack.peek();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the postfix input : ");
		String postfix = scanner.nextLine();
		String infix = postfixToInfixConversion(postfix);
		System.out.println("Infix : " + infix);
		scanner.close();
	}
}
