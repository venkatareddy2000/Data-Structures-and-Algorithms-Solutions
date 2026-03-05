package allocate_minimum_number_of_pages;

import java.util.Scanner;

public class AllocateMinimumNumberOfPagesOptimal {
	public static int minimumPages(int[] arr, int m) {
		if (m > arr.length) {
			return -1;
		}
		int maximum = Integer.MIN_VALUE;
		int totalPages = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maximum) {
				maximum = arr[index];
			}
			totalPages = totalPages + arr[index];
		}
		int low = maximum, high = totalPages;
		while (low <= high) {
			int mid = (low + high) / 2;
			int student = 1, allocatedPages = 0;
			for (int index = 0; index < arr.length; index++) {
				if (allocatedPages + arr[index] > mid) {
					student = student + 1;
					allocatedPages = arr[index];
				} else {
					allocatedPages = allocatedPages + arr[index];
				}
			}
			if (student > m) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			arr[index] = scanner.nextInt();
		}
		System.out.println("Enter the m value : ");
		int m = scanner.nextInt();
		int minimumNumberOfPages = minimumPages(arr, m);
		System.out
				.println("The minimum number of pages that can be allocated to a student is : " + minimumNumberOfPages);
		scanner.close();
	}
}
