package next_smaller_element;

import java.util.Arrays;
import java.util.Scanner;

public class NextSmallerElementBrute {
	public static int[] nextSmallerElements(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = -1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					result[i] = nums[j];
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
		int[] nextSmallerElement = nextSmallerElements(nums);
		System.out.println(Arrays.toString(nextSmallerElement));
		scanner.close();
	}
}
