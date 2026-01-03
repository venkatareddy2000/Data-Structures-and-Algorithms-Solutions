package even_odd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find if it is even or odd : ");
		int input = scanner.nextInt();
		if (input % 2 == 0) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The given number is odd");
		}
		scanner.close();
	}

}
