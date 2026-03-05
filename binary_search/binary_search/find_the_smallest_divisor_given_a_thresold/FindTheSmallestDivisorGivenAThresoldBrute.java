package find_the_smallest_divisor_given_a_thresold;

import java.util.Scanner;

public class FindTheSmallestDivisorGivenAThresoldBrute {
	public static int smallestDivisor(int[] nums, int threshold) {
		int maximum = Integer.MIN_VALUE;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] > maximum) {
				maximum = nums[index];
			}
		}
		for (int index = 1; index <= maximum; index++) {
			int sum = 0;
			for (int numsIndex = 0; numsIndex < nums.length; numsIndex++) {
				sum = sum + (nums[numsIndex] + index - 1) / index;
			}
			if (sum <= threshold) {
				return index;
			}
		}
		return -1;
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
		System.out.println("Enter the threshold value : ");
		int threshold = scanner.nextInt();
		int smallest = smallestDivisor(nums, threshold);
		System.out.println("The smallest divisor that sums upto less than or equal to thresold : " + smallest);
		scanner.close();
	}
}
