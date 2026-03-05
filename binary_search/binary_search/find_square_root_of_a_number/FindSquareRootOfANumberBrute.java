package find_square_root_of_a_number;

import java.util.Scanner;

public class FindSquareRootOfANumberBrute {
	public static int findSquareRoot(int input) {
		int result = 0;
		for (int index = 1; index <= input; index++) {
			if ((index * index) <= input) {
				result = index;
			} else {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an input number : ");
		int input = scanner.nextInt();
		int result = findSquareRoot(input);
		System.out.println("The square root of the given number is : " + result);
		scanner.close();
	}
}
