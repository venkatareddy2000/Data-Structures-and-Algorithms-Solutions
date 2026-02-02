package reverse_words_in_a_string;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInAStringBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.nextLine();
		String reversedWords = reverseWords(s);
		System.out.println("String after reversing the words : " + reversedWords);
		scanner.close();
	}

	public static String reverseWords(String s) {
		int start = 0;
		StringBuilder result = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		int index;
		s = s.trim();
		for (index = 0; index < s.length(); index++) {
			if (s.charAt(index) == ' ' && start < index) {
				stack.push(s.substring(start, index));
				start = index + 1;
			} else if (s.charAt(index) == ' ') {
				start = index + 1;
			}
		}
		stack.push(s.substring(start, index));
		System.out.println(stack);
		while (!stack.isEmpty() && stack.size() > 1) {
			result.append(stack.pop());
			result.append(" ");
		}
		result.append(stack.pop());
		return result.toString();
	}
}
