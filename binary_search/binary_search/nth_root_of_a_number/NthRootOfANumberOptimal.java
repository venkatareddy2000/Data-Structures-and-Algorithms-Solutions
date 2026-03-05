package nth_root_of_a_number;

import java.util.Scanner;

public class NthRootOfANumberOptimal {
	public static int nthRootOfANumber(int m, int n) {
		int start = 1, end = m;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			long power = (long) Math.pow(mid, n);
			if (power == m) {
				return mid;
			} else if (power < m) {
				start = mid + 1;
			} else {
				end = mid - 1;
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
