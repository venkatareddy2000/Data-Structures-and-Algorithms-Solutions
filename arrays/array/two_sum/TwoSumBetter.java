package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumBetter {
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
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			if (hashMap.containsKey(target - nums[index])) {
				result[0] = hashMap.get(target - nums[index]);
				result[1] = index;
				return result;
			}
			hashMap.put(nums[index], index);
		}
		return result;
	}
}
