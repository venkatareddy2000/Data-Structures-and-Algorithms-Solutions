package next_permutation;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutationOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		nextPermutation(nums);
		System.out.println("The next permutation array : " + Arrays.toString(nums));
		scanner.close();
	}

	public static void nextPermutation(int[] nums) {
		int dipIndex = -1;
		for (int index = nums.length - 2; index >= 0; index--) {
			if (nums[index] < nums[index + 1]) {
				dipIndex = index;
				break;
			}
		}
		if (dipIndex == -1) {
			reverseArray(nums, 0, nums.length - 1);
			return;
		}
		for (int index = nums.length - 1; index > dipIndex; index--) {
			if (nums[index] > nums[dipIndex]) {
				int temp = nums[index];
				nums[index] = nums[dipIndex];
				nums[dipIndex] = temp;
				break;
			}
		}
		reverseArray(nums, dipIndex + 1, nums.length - 1);
	}

	private static void reverseArray(int[] nums, int start, int end) {
		while (start <= end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
