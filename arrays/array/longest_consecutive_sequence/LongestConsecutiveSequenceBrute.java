package longest_consecutive_sequence;

import java.util.Scanner;

public class LongestConsecutiveSequenceBrute {
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
		int longestConsecutiveSequence = 0;
		for (int index = 0; index < nums.length; index++) {
			int count = 1;
			int x = nums[index];
			while (linearSearch(x + 1, nums) == true) {
				x = x + 1;
				count = count + 1;
			}
			if (count > longestConsecutiveSequence) {
				longestConsecutiveSequence = count;
			}
		}
		return longestConsecutiveSequence;
	}

	public static boolean linearSearch(int target, int[] nums) {
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == target) {
				return true;
			}
		}
		return false;
	}
}
