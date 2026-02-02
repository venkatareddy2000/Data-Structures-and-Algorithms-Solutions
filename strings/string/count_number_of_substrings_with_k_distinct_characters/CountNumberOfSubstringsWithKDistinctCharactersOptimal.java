package count_number_of_substrings_with_k_distinct_characters;

import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOfSubstringsWithKDistinctCharactersOptimal {

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
		return atMost(s, k) - atMost(s, k - 1);
	}

	public static int atMost(String s, int k) {
		int count = 0;
		int left = 0;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int right = 0; right < s.length(); right++) {
			hashMap.put(s.charAt(right), hashMap.getOrDefault(s.charAt(right), 0) + 1);
			while (hashMap.size() > k) {
				hashMap.put(s.charAt(left), hashMap.get(s.charAt(left)) - 1);
				if (hashMap.get(s.charAt(left)) == 0) {
					hashMap.remove(s.charAt(left));
				}
				left++;
			}
			count = count + (right - left) + 1;

		}
		return count;
	}
}
