package prefix_to_postfix;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
	public static String prefixToPostfixConversion(String prefix) {
		Stack<String> stack = new Stack<String>();
		for (int index = prefix.length() - 1; index >= 0; index--) {
			Character c = prefix.charAt(index);
			if (Character.isLetterOrDigit(c)) {
				stack.push(String.valueOf(c));
			} else {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				stack.push(operand1 + operand2 + c);
			}
		}
		return stack.peek();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the prefix input : ");
		String prefix = scanner.nextLine();
		String postfix = prefixToPostfixConversion(prefix);
		System.out.println("Postfix : " + postfix);
		scanner.close();
	}

}
