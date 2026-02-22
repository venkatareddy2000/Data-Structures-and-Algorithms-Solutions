package next_greater_element_I;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementIBetter {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for (int nums : nums2) {
			while (!stack.empty() && stack.peek() < nums) {
				hashMap.put(stack.pop(), nums);
			}
			stack.push(nums);
		}
		int[] result = new int[nums1.length];
		for (int index = 0; index < nums1.length; index++) {
			result[index] = hashMap.getOrDefault(nums1[index], -1);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the nums1 : ");
		int nums1Size = scanner.nextInt();
		int[] nums1 = new int[nums1Size];
		System.out.println("Enter the size of the nums2 : ");
		int nums2Size = scanner.nextInt();
		int[] nums2 = new int[nums2Size];
		System.out.println("Enter the elements into the nums1 : ");
		for (int index = 0; index < nums1Size; index++) {
			nums1[index] = scanner.nextInt();
		}
		System.out.println("Enter the elements into the nums2 : ");
		for (int index = 0; index < nums2Size; index++) {
			nums2[index] = scanner.nextInt();
		}
		int[] nextGreaterElement = nextGreaterElement(nums1, nums2);
		System.out.println(Arrays.toString(nextGreaterElement));
		scanner.close();
	}
}
