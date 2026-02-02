package roman_to_integer;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		int romanToInteger = romanToInt(s);
		System.out.println("After converting from Roman to Integer : " + romanToInteger);
		scanner.close();
	}

	public static int romanToInt(String s) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);
		int result = 0;
		int index;
		for (index = 0; index < s.length() - 1; index++) {
			Integer current = hashMap.get(s.charAt(index));
			Integer next = hashMap.get(s.charAt(index + 1));
			if (current >= next) {
				result = result + current;
			} else {
				result = result - current;
			}
		}
		result = result + hashMap.get(s.charAt(index));
		return result;
	}
}
