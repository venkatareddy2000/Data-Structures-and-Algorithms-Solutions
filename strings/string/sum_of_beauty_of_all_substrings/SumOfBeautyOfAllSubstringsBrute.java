package sum_of_beauty_of_all_substrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfBeautyOfAllSubstringsBrute {
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
		for (int firstLoop = 0; firstLoop < s.length(); firstLoop++) {
			for (int secondLoop = firstLoop; secondLoop < s.length(); secondLoop++) {
				HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
				for (int thirdLoop = firstLoop; thirdLoop <= secondLoop; thirdLoop++) {
					hashMap.put(s.charAt(thirdLoop), hashMap.getOrDefault(s.charAt(thirdLoop), 0) + 1);
				}
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
