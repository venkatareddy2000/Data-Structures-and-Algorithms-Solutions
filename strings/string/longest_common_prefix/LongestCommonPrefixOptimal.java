package longest_common_prefix;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefixOptimal {

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
		Arrays.sort(strs);
		int index = 0;
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		String firstWord = strs[0];
		String lastWord = strs[strs.length - 1];
		while (index < firstWord.length() && index < lastWord.length()) {
			if (firstWord.charAt(index) != lastWord.charAt(index)) {
				break;
			} else {
				index++;
			}
		}
		return firstWord.substring(0, index);
	}
}
