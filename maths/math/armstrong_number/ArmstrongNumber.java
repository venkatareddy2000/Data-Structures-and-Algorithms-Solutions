package armstrong_number;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input number to check armstrong : ");
		number = scanner.nextInt();
		boolean isArmstrong = checkArmstrong(number);
		System.out.println("Is the given input number armstrong  : " + isArmstrong);
		scanner.close();
	}

	private static boolean checkArmstrong(int inputNumber) {
		int number = inputNumber;
		int countOfDigits = countDigits(number);
		int remainder = 0;
		int armstrongNumber = 0;
		while (number != 0) {
			remainder = number % 10;
			armstrongNumber = (int) Math.pow(remainder, countOfDigits) + armstrongNumber;
			number = number / 10;
		}
		if (inputNumber == armstrongNumber)
			return true;
		return false;
	}

	private static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

}
