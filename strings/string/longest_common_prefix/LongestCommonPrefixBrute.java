package longest_common_prefix;

import java.util.Scanner;

public class LongestCommonPrefixBrute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array strings : ");
		int size = scanner.nextInt();
		String[] strs = new String[size];
		System.out.println("Enter the strings into the array : ");
		for (int index = 0; index < size; index++) {
			strs[index] = scanner.next();
		}
		String longestPrefix = longestCommonPrefix(strs);
		System.out.println("The longest common prefix in the strings is : " + longestPrefix);
		scanner.close();

	}

	public static String longestCommonPrefix(String[] strs) {
		String result = "";
		for (int charIndex = 0; charIndex < strs[0].length(); charIndex++) {
			for (int wordIndex = 1; wordIndex < strs.length; wordIndex++) {
				if ((strs[wordIndex].length() > charIndex)
						&& (strs[0].charAt(charIndex) == strs[wordIndex].charAt(charIndex))) {
					continue;
				} else {
					return result;
				}
			}
			result = result + strs[0].charAt(charIndex);
		}
		return result;
	}
}
