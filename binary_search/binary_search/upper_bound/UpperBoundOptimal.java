package upper_bound;

import java.util.Scanner;

public class UpperBoundOptimal {
	public static int upperBound(int[] arr, int x) {
		int start = 0, end = arr.length - 1;
		int result = arr.length;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > x) {
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
		int upperBoundIndex = upperBound(arr, x);
		System.out.println("Upper bound index in the array is : " + upperBoundIndex);
		scanner.close();
	}
}
