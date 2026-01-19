package four_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSumOptimal {
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
		List<List<Integer>> quadruplets = fourSum(nums, target);
		System.out.println("The quadruplets that sums to target is : " + quadruplets);
		scanner.close();
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int firstLoop = 0; firstLoop < nums.length; firstLoop++) {
			if (firstLoop > 0 && nums[firstLoop] == nums[firstLoop - 1]) {
				continue;
			}
			for (int secondLoop = firstLoop + 1; secondLoop < nums.length; secondLoop++) {
				if (secondLoop > firstLoop + 1 && nums[secondLoop] == nums[secondLoop - 1]) {
					continue;
				}
				int firstPointer = secondLoop + 1;
				int lastPointer = nums.length - 1;
				while (firstPointer < lastPointer) {
					long sum = (long) nums[firstLoop] + nums[secondLoop] + nums[firstPointer] + nums[lastPointer];
					if (sum < target) {
						firstPointer++;
					} else if (sum > target) {
						lastPointer--;
					} else {
						List<Integer> arrayList = new ArrayList<Integer>();
						arrayList.add(nums[firstLoop]);
						arrayList.add(nums[secondLoop]);
						arrayList.add(nums[firstPointer]);
						arrayList.add(nums[lastPointer]);
						result.add(arrayList);
						firstPointer++;
						lastPointer--;
						while (firstPointer < lastPointer && nums[firstPointer] == nums[firstPointer - 1]) {
							firstPointer++;
						}
						while (firstPointer < lastPointer && nums[lastPointer] == nums[lastPointer + 1]) {
							lastPointer--;
						}
					}
				}
			}
		}
		return result;
	}
}
