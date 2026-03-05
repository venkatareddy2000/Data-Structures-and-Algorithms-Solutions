package aggressive_cows;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCowsOptimal {
	public static int maximumDistance(int[] arr, int k) {
		Arrays.sort(arr);
		int low = 1, high = arr[arr.length - 1] - arr[0];
		while (low <= high) {
			int mid = (low + high) / 2;
			if (canWePlace(arr, k, mid) == true) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return high;

	}

	private static boolean canWePlace(int[] arr, int k, int distance) {
		int countCows = 1, last = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (arr[index] - last >= distance) {
				countCows++;
				last = arr[index];
			}
		}
		if (countCows >= k) {
			return true;
		}
		return false;
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
		int maximumDistanceBetweenCows = maximumDistance(arr, k);
		System.out.println("The maximum distance between the cows : " + maximumDistanceBetweenCows);
		scanner.close();
	}
}
