package longest_palindromic_substring;

import java.util.Scanner;

public class LongestPalindromicSubstringBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		String result = longestPalindrome(s);
		System.out.println("The largest palindromic substring in the given string is : " + result);
		scanner.close();
	}

	public static String longestPalindrome(String s) {
		if (s.length() <= 1) {
			return s;
		}
		int maximumLength = 1, leftIndex = 0;
		for (int left = 0; left < s.length(); left++) {
			for (int right = left; right < s.length(); right++) {
				if (checkPalindrome(s, left, right) && (right - left + 1) > maximumLength) {
					leftIndex = left;
					maximumLength = (right - left) + 1;
				}
			}
		}
		return s.substring(leftIndex, leftIndex + maximumLength);
	}

	public static boolean checkPalindrome(String s, int left, int right) {
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
}
