package kth_missing_positive_number;

import java.util.Scanner;

public class KthMissingPositiveNumberOptimal {
	public static int findKthPositive(int[] arr, int k) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int missing = arr[mid] - (mid + 1);
			if (missing < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return high + k + 1;
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
		System.out.println("Enter the k value : ");
		int k = scanner.nextInt();
		int missingNumber = findKthPositive(arr, k);
		System.out.println("The missing number from the array is : " + missingNumber);
		scanner.close();
	}
}
