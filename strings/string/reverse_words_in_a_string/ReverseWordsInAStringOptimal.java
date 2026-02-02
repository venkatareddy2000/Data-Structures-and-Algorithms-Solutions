package reverse_words_in_a_string;

import java.util.Scanner;

public class ReverseWordsInAStringOptimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.nextLine();
		String reversedWords = reverseWords(s);
		System.out.println("String after reversing the words : " + reversedWords);
		scanner.close();
	}

	public static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		s = s.trim();
		int end = s.length();
		int index;
		for (index = s.length() - 1; index >= 0; index--) {
			if (s.charAt(index) == ' ') {
				if (index + 1 < end) {
					result = result.append(s.substring(index + 1, end));
					result.append(" ");
				}
				end = index;
			}
		}
		result.append(s.substring(0, end));
		return result.toString();
	}
}
