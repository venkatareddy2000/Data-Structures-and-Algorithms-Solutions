package remove_outermost_parentheses;

import java.util.Scanner;

public class RemoveOutermostParenthesesOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		String outerParentheses = removeOuterParentheses(s);
		System.out.println("String after removing the outermost parentheses : " + outerParentheses);
		scanner.close();
	}

	public static String removeOuterParentheses(String s) {
		StringBuilder result = new StringBuilder();
		int depth = 0;
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) == '(') {
				if (depth == 0) {
					depth++;
				} else {
					result = result.append(s.charAt(index));
					depth++;
				}

			} else if (s.charAt(index) == ')') {
				depth--;
				if (depth > 0) {
					result.append(s.charAt(index));
				}
			}
		}
		return result.toString();
	}
}
