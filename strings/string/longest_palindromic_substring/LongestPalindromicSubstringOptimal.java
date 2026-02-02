package longest_palindromic_substring;

import java.util.Scanner;

public class LongestPalindromicSubstringOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		String result = longestPalindrome(s);
		System.out.println("The largest palindromic substring in the given string is : " + result);
		scanner.close();
	}

	public static String longestPalindrome(String s) {
		if (s.length() == 1) {
			return s;
		}
		String result = "";
		for (int index = 1; index < s.length(); index++) {
			int low = index;
			int high = index;
			while (s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
				if (low == -1 || high == s.length()) {
					break;
				}
			}
			String palindrome = s.substring(low + 1, high);
			if (palindrome.length() > result.length()) {
				result = palindrome;
			}
			low = index - 1;
			high = index;
			while (s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
				if (low == -1 || high == s.length()) {
					break;
				}
			}
			palindrome = s.substring(low + 1, high);
			if (palindrome.length() > result.length()) {
				result = palindrome;
			}
		}
		return result;
	}
}
