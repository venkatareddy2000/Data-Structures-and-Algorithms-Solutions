package string_to_integer;

import java.util.Scanner;

public class StringToIntegerBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String s = scanner.next();
		int stringToInteger = myAtoi(s);
		System.out.println("After converting from String to Integer : " + stringToInteger);
		scanner.close();
	}

	public static int myAtoi(String s) {
		int result = 0;
		int index = 0;
		int sign = 1;
		while (index < s.length() && s.charAt(index) == ' ') {
			index++;
		}
		if (index < s.length()) {
			if (s.charAt(index) == '-') {
				sign = -1;
				index++;
			} else if (s.charAt(index) == '+') {
				sign = 1;
				index++;
			}
		}
		while (index < s.length()) {
			if (s.charAt(index) < '0' || s.charAt(index) > '9') {
				break;
			}
			int digit = s.charAt(index) - '0';

			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			result = result * 10 + digit;
			index++;

		}
		if (sign == -1) {
			result = sign * result;
		}
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return result;
	}
}
