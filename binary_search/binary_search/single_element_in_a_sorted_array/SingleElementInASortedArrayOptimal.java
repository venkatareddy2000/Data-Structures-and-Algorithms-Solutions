package single_element_in_a_sorted_array;

import java.util.Scanner;

public class SingleElementInASortedArrayOptimal {
	public static int singleNonDuplicate(int[] nums) {
		int start = 0, end = nums.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (mid % 2 == 1) {
				mid--;
			}
			if (nums[mid] == nums[mid + 1]) {
				start = mid + 2;
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
		int singleElement = singleNonDuplicate(nums);
		System.out.println("Single Element from the sorted array : " + singleElement);
		scanner.close();
	}
}
