package valid_anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagramBrute {
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
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int index = 0; index < s.length(); index++) {
			hashMap.put(s.charAt(index), hashMap.getOrDefault(s.charAt(index), 0) + 1);
		}
		for (int index = 0; index < t.length(); index++) {
			hashMap.put(t.charAt(index), hashMap.getOrDefault(t.charAt(index), 0) - 1);
		}
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() > 0) {
				return false;
			}
		}
		return true;
	}
}
