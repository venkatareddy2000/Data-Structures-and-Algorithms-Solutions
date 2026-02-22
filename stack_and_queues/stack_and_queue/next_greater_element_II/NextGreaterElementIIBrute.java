package next_greater_element_II;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElementIIBrute {
	public static int[] nextGreaterElements(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = -1;
			for (int j = i + 1; j <= i + nums.length - 1; j++) {
				int index = j % nums.length;
				if (nums[index] > nums[i]) {
					result[i] = nums[index];
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the nums : ");
		int numsSize = scanner.nextInt();
		int[] nums = new int[numsSize];
		System.out.println("Enter the elements into the nums : ");
		for (int index = 0; index < numsSize; index++) {
			nums[index] = scanner.nextInt();
		}
		int[] nextGreaterElement = nextGreaterElements(nums);
		System.out.println(Arrays.toString(nextGreaterElement));
		scanner.close();
	}
}
