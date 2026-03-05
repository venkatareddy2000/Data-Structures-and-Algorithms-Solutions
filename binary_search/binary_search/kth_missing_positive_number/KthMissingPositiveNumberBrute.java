package kth_missing_positive_number;

import java.util.Scanner;

public class KthMissingPositiveNumberBrute {
	public static int findKthPositive(int[] arr, int k) {
		int missingCount = 0, number = 1, missingNumber = -1;
		while (missingCount < k) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] == number) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				missingCount++;
				missingNumber = number;
			}
			number++;
		}
		return missingNumber;
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
