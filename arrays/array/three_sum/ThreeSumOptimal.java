package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSumOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		List<List<Integer>> triplets = threeSum(nums);
		System.out.println("The triplets that sums upto zero is : " + triplets);
		scanner.close();
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int index = 0; index < nums.length; index++) {
			if (index > 0 && nums[index] == nums[index - 1]) {
				continue;
			}
			int firstPointer = index + 1;
			int lastPointer = nums.length - 1;
			while (firstPointer < lastPointer) {
				int sum = nums[index] + nums[firstPointer] + nums[lastPointer];
				if (sum < 0) {
					firstPointer++;
				} else if (sum > 0) {
					lastPointer--;
				} else {
					List<Integer> arrayList = new ArrayList<Integer>();
					arrayList.add(nums[index]);
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
		return result;
	}
}
