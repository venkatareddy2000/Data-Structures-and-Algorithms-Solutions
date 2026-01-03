package sum_of_digits;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find the sum of digits : ");
		int input = scanner.nextInt();
		int sum = 0;
		while (input != 0) {
			int remainder = input % 10;
			sum = sum + remainder;
			input = input / 10;
		}
		System.out.println("The sum of the digits of the given number is : " + sum);
		scanner.close();
	}
}
