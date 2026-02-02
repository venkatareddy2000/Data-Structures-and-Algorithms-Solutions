package maximum_nesting_depth_of_the_parentheses;

import java.util.Scanner;

public class MaximumNestingDepthOfTheParentheses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		int maximumDepth = maxDepth(s);
		System.out.println("Maximum depth of the parenthese : " + maximumDepth);
		scanner.close();
	}

	public static int maxDepth(String s) {
		int depth = 0;
		int maximumDepth = 0;
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) == '(') {
				depth++;
				if (depth > maximumDepth) {
					maximumDepth = depth;
				}
			} else if (s.charAt(index) == ')') {
				depth--;
			}
		}
		return maximumDepth;
	}

}
