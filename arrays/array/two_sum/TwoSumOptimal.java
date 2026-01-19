package two_sum;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		System.out.println("Enter a target number : ");
		int target = scanner.nextInt();
		int[] result = twoSum(nums, target);
		System.out.println("The two indices that gives the target number is : " + Arrays.toString(result));
		scanner.close();
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int start = 0, end = nums.length - 1;
		while (start < end) {
			if (nums[start] + nums[end] == target) {
				result[0] = start;
				result[1] = end;
				return result;
			} else if (nums[start] + nums[end] > target) {
				end--;
			} else {
				start++;
			}
		}
		return result;
	}
}
