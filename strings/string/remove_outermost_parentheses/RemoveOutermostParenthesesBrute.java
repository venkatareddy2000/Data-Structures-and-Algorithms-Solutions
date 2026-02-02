package remove_outermost_parentheses;

import java.util.Scanner;
import java.util.Stack;

public class RemoveOutermostParenthesesBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		String outerParentheses = removeOuterParentheses(s);
		System.out.println("String after removing the outermost parentheses : " + outerParentheses);
		scanner.close();
	}

	public static String removeOuterParentheses(String s) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder result = new StringBuilder();
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) == '(') {
				stack.push(s.charAt(index));
				if (stack.size() > 1) {
					result = result.append(s.charAt(index));
				}
			} else if (s.charAt(index) == ')') {
				stack.pop();
				if (stack.size() > 0) {
					result = result.append(s.charAt(index));
				}
			}
		}
		return result.toString();
	}
}
