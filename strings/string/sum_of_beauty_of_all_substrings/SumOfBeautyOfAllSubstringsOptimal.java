package sum_of_beauty_of_all_substrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfBeautyOfAllSubstringsOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		int sumOfSubstrings = beautySum(s);
		System.out.println("The sum of beauty of all substrings : " + sumOfSubstrings);
		scanner.close();
	}

	public static int beautySum(String s) {
		int sum = 0;
		for (int outerLoop = 0; outerLoop < s.length(); outerLoop++) {
			HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
			for (int innerLoop = outerLoop; innerLoop < s.length(); innerLoop++) {
				hashMap.put(s.charAt(innerLoop), hashMap.getOrDefault(s.charAt(innerLoop), 0) + 1);
				int minimum = Integer.MAX_VALUE;
				int maximum = Integer.MIN_VALUE;
				for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
					if (entry.getValue() > maximum) {
						maximum = entry.getValue();
					}
					if (entry.getValue() < minimum) {
						minimum = entry.getValue();
					}
				}
				if (minimum != Integer.MAX_VALUE) {
					sum = sum + (maximum - minimum);
				}
			}
		}
		return sum;
	}
}
