package sliding_window_maximum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlidingWindowMaximumBrute {
	public static int[] maxSlidingWindow(int[] nums, int k) {
		List<Integer> list = new ArrayList<Integer>();
		for (int outerIndex = 0; outerIndex <= nums.length - k; outerIndex++) {
			int maximum = Integer.MIN_VALUE;
			for (int innerIndex = outerIndex; innerIndex < outerIndex + k; innerIndex++) {
				if (nums[innerIndex] > maximum) {
					maximum = nums[innerIndex];
				}
			}
			list.add(maximum);
		}
		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the nums : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		System.out.println("Enter the k value : ");
		int k = scanner.nextInt();
		int[] maxSlidingWindowArray = maxSlidingWindow(nums, k);
		System.out.println("Maximum elements in the sliding window : " + maxSlidingWindowArray.toString());
		scanner.close();
	}
}
