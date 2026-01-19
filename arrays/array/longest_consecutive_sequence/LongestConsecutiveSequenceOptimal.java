package longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequenceOptimal {
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
		int count = 0;
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashSet.add(nums[index]);
		}
		for (Integer element : hashSet) {
			int x = element;
			count = 1;
			while (hashSet.contains(x + 1)) {
				x = x + 1;
				count = count + 1;
			}
			if (count > longestConsecutiveSequence) {
				longestConsecutiveSequence = count;
			}
		}
		return longestConsecutiveSequence;
	}
}
