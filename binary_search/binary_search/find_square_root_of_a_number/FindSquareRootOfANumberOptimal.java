package find_square_root_of_a_number;

import java.util.Scanner;

public class FindSquareRootOfANumberOptimal {
	public static int findSquareRoot(int input) {
		int result = 0;
		int start = 1, end = input;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if ((long) (mid * mid) <= input) {
				result = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
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
