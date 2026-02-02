package valid_anagram;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagramBetter {
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
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		String SSorted = new String(sArray);
		String TSorted = new String(tArray);
		for (int index = 0; index < SSorted.length(); index++) {
			if (SSorted.charAt(index) != TSorted.charAt(index)) {
				return false;
			}
		}
		return true;
	}
}
