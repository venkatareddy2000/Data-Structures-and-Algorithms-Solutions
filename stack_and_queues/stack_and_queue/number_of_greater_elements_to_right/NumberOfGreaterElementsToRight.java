package number_of_greater_elements_to_right;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfGreaterElementsToRight {
	public static int[] numberOfGreaterElements(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			result[i] = -1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					count++;
				}
			}
			result[i] = count;
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
		int[] numberOfGreaterElement = numberOfGreaterElements(nums);
		System.out.println(Arrays.toString(numberOfGreaterElement));
		scanner.close();
	}
}
