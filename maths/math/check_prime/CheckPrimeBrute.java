package check_prime;

import java.util.Scanner;

public class CheckPrimeBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number to find whether it is a prime or not : ");
		int number = scanner.nextInt();
		boolean isPrime = checkPrime(number);
		System.out.println("Is the given number prime : " + isPrime);
		scanner.close();
	}

	private static boolean checkPrime(int number) {
		int count = 0;
		for (int index = 1; index <= number; index++) {
			if (number % index == 0) {
				count++;
			}
		}
		if (count == 2)
			return true;
		return false;
	}
}
