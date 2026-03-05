package nth_root_of_a_number;

import java.util.Scanner;

public class NthRootOfANumberBrute {
	public static int nthRootOfANumber(int m, int n) {
		for (int index = 1; index <= m; index++) {
			if (Math.pow(index, n) == m) {
				return index;
			} else if (Math.pow(index, n) > m) {
				break;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of M : ");
		int m = scanner.nextInt();
		System.out.println("Enter the value of N : ");
		int n = scanner.nextInt();
		int result = nthRootOfANumber(m, n);
		System.out.println("The nth root of the given number is : " + result);
		scanner.close();
	}
}
