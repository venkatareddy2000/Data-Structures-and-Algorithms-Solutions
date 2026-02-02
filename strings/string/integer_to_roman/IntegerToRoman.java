package integer_to_roman;

import java.util.Scanner;

public class IntegerToRoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		int num = scanner.nextInt();
		String integerToRoman = intToRoman(num);
		System.out.println("After converting from Integer to Roman : " + integerToRoman);
		scanner.close();
	}

	public static String intToRoman(int num) {
		StringBuilder result = new StringBuilder("");
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		while (num > 0) {
			int index;
			for (index = 0; index < values.length; index++) {
				if (values[index] <= num) {
					result = result.append(symbols[index]);
					num = num - values[index];
					break;
				}
			}
		}
		return result.toString();
	}
}
