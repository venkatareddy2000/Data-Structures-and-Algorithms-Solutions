package lower_bound;

import java.util.Scanner;

public class LowerBoundBrute {
	public static int lowerBound(int[] arr, int x) {
		int result = arr.length;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= x) {
				return index;
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
