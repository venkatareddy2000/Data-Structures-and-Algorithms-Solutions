package valid_palindrome;

import java.util.Scanner;

public class ValidPalindromeOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.nextLine();
		boolean palindrome = isPalindrome(s);
		System.out.println("Is the given string palindrome : " + palindrome);
		scanner.close();
	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
				continue;
			}
			if (!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
				continue;
			}
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
