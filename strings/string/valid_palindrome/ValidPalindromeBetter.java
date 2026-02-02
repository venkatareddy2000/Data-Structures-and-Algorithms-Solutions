package valid_palindrome;

import java.util.Scanner;

public class ValidPalindromeBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.nextLine();
		boolean palindrome = isPalindrome(s);
		System.out.println("Is the given string palindrome : " + palindrome);
		scanner.close();
	}

	public static boolean isPalindrome(String s) {
		String result = "";
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') {
				result = result + (char) (s.charAt(index) + 32);
			}
			if (s.charAt(index) >= 'a' && s.charAt(index) <= 'z' || s.charAt(index) >= '0' && s.charAt(index) <= '9') {
				result = result + (s.charAt(index));
			}
		}
		int left = 0;
		int mid = result.length() / 2;
		while (left < mid) {
			if (result.charAt(left) != result.charAt(result.length() - left - 1)) {
				return false;
			}
			left++;
		}
		return true;
	}
}
