package count_number_of_substrings_with_k_distinct_characters;

import java.util.HashSet;
import java.util.Scanner;

public class CountNumberOfSubstringsWithKDistinctCharactersBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		System.out.println("Enter the distinct characters to be present in the string : ");
		int k = scanner.nextInt();
		int result = countNumberOfSubstrings(s, k);
		System.out.println("The number of substrings in the given string with K distinct characters is : " + result);
		scanner.close();
	}

	public static int countNumberOfSubstrings(String s, int k) {
		int count = 0;
		for (int outerIndex = 0; outerIndex < s.length(); outerIndex++) {
			HashSet<Character> hashSet = new HashSet<Character>();
			for (int innerIndex = outerIndex; innerIndex < s.length(); innerIndex++) {
				hashSet.add(s.charAt(innerIndex));
				if (hashSet.size() == k) {
					count++;
				}
			}
		}
		return count;
	}
}
