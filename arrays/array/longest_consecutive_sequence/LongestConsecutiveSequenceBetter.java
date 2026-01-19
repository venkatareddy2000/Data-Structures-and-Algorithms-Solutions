package longest_consecutive_sequence;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequenceBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int longestConsecutiveSequence = longestConsecutive(nums);
		System.out.println("The longest consecutive sequence in the given array : " + longestConsecutiveSequence);
		scanner.close();
	}

	public static int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		int longestConsecutiveSequence = 0;
		int count = 0;
		int lastSmallerElement = Integer.MIN_VALUE;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] - 1 == lastSmallerElement) {
				count++;
				lastSmallerElement = nums[index];
			} else if (lastSmallerElement != nums[index]) {
				count = 1;
				lastSmallerElement = nums[index];
			}
			if (count > longestConsecutiveSequence) {
				longestConsecutiveSequence = count;
			}
		}
		return longestConsecutiveSequence;
	}
}
