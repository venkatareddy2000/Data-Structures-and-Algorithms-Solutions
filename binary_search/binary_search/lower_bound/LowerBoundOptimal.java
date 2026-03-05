package lower_bound;

import java.util.Scanner;

public class LowerBoundOptimal {
	public static int lowerBound(int[] arr, int x) {
		int start = 0, end = arr.length - 1;
		int result = arr.length;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= x) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;
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
		System.out.println("Enter the target element : ");
		int x = scanner.nextInt();
		int lowerBoundIndex = lowerBound(arr, x);
		System.out.println("Lower bound index in the array is : " + lowerBoundIndex);
		scanner.close();
	}
}
