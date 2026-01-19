package largest_subarray_with_0_sum;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubarrayWith0SumOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int largestSubarray = largestSubarrayWith0SumOptimal(nums);
		System.out.println("The largest subarray with 0 sum is : " + largestSubarray);
		scanner.close();
	}

	public static int largestSubarrayWith0SumOptimal(int[] nums) {
		int largestSubarray = Integer.MIN_VALUE;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			sum = sum + nums[index];
			if (sum == 0) {
				largestSubarray = index + 1;
			} else if (hashMap.containsKey(sum)) {
				if ((index - hashMap.get(sum) > largestSubarray)) {
					largestSubarray = index - hashMap.get(sum);
				}
			} else {
				hashMap.put(sum, index);
			}
		}
		return largestSubarray;
	}
}
