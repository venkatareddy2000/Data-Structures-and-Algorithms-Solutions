package isomorphic_strings;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		System.out.println("Enter the input string : ");
		String t = scanner.next();
		boolean isomorphic = isIsomorphic(s, t);
		System.out.println("Is the given strings isomorphic : " + isomorphic);
		scanner.close();
	}

	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> hashMapST = new HashMap<Character, Character>();
		HashMap<Character, Character> hashMapTS = new HashMap<Character, Character>();
		for (int index = 0; index < s.length(); index++) {
			char sChar = s.charAt(index);
			char tChar = t.charAt(index);

			if (hashMapST.containsKey(sChar)) {
				if (hashMapST.get(sChar) != tChar) {
					return false;
				}
			} else {
				hashMapST.put(sChar, tChar);
			}

			if (hashMapTS.containsKey(tChar)) {
				if (hashMapTS.get(tChar) != sChar) {
					return false;
				}
			} else {
				hashMapTS.put(tChar, sChar);
			}
		}
		return true;
	}
}
