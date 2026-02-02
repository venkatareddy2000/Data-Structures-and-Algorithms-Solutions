package largest_odd_number_in_string;

import java.util.Scanner;

public class LargestOddNumberInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String num = scanner.nextLine();
		String largestOddNumberInString = largestOddNumber(num);
		System.out.println("The largest odd number in the string : " + largestOddNumberInString);
		scanner.close();
	}

	public static String largestOddNumber(String num) {
		int index;
		for (index = num.length() - 1; index >= 0; index--) {
			if ((num.charAt(index) - '0') % 2 != 0) {
				break;
			}
		}
		return num.substring(0, index + 1);
	}
}
