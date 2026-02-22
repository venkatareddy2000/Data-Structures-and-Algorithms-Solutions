package valid_parentheses;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) == '(' || s.charAt(index) == '[' || s.charAt(index) == '{') {
				stack.push(s.charAt(index));
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					Character openingChar = stack.pop();
					if (openingChar == '(' && s.charAt(index) == ')' || openingChar == '{' && s.charAt(index) == '}'
							|| openingChar == '[' && s.charAt(index) == ']') {
						continue;
					} else {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		System.out.println("Is given string a valid parentheses : " + isValid(s));
		scanner.close();
	}
}
