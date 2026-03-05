package find_minimum_in_rotated_sorted_array;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArrayOptimal {
	public static int findMin(int[] nums) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return nums[start];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int minimumElement = findMin(nums);
		System.out.println("Minimum element in the array : " + minimumElement);
		scanner.close();
	}
}
