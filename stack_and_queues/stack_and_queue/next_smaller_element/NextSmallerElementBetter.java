package next_smaller_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElementBetter {
	public static int[] nextSmallerElements(int[] nums) {
		int[] result = new int[nums.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int index = nums.length - 1; index >= 0; index--) {
			while (!stack.empty() && stack.peek() > nums[index]) {
				stack.pop();
			}
			result[index] = stack.empty() ? -1 : stack.peek();
			stack.push(nums[index]);
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
