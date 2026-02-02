package valid_anagram;

import java.util.Scanner;

public class ValidAnagramOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		System.out.println("Enter the input string : ");
		String t = scanner.next();
		boolean anagram = isAnagram(s, t);
		System.out.println("Is the given strings anagram : " + anagram);
		scanner.close();
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] count = new int[26];
		for (int index = 0; index < s.length(); index++) {
			count[s.charAt(index) - 'a']++;
		}
		for (int index = 0; index < t.length(); index++) {
			count[t.charAt(index) - 'a']--;
		}
		for (int frequency : count) {
			if (frequency != 0) {
				return false;
			}
		}
		return true;
	}
}
