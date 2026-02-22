package next_greater_element_II;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementIIBetter {
	public static int[] nextGreaterElements(int[] nums) {
		int[] result = new int[nums.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int index = 2 * nums.length - 1; index >= 0; index--) {
			while (!stack.empty() && stack.peek() <= nums[index % nums.length]) {
				stack.pop();
			}
			if (index < nums.length) {
				result[index] = stack.empty() ? -1 : stack.peek();
			}
			stack.push(nums[index % nums.length]);
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
