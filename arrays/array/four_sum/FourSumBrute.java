package four_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FourSumBrute {
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
		HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
		for (int firstLoop = 0; firstLoop < nums.length - 3; firstLoop++) {
			for (int secondLoop = firstLoop + 1; secondLoop < nums.length - 2; secondLoop++) {
				for (int thirdLoop = secondLoop + 1; thirdLoop < nums.length - 1; thirdLoop++) {
					for (int fourthLoop = thirdLoop + 1; fourthLoop < nums.length; fourthLoop++) {
						if ((nums[firstLoop] + nums[secondLoop] + nums[thirdLoop] + nums[fourthLoop] == target)) {
							List<Integer> arrayList = new ArrayList<Integer>();
							arrayList.add(nums[firstLoop]);
							arrayList.add(nums[secondLoop]);
							arrayList.add(nums[thirdLoop]);
							arrayList.add(nums[fourthLoop]);
							Collections.sort(arrayList);
							hashSet.add(arrayList);
						}
					}
				}
			}
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>(hashSet);
		return result;
	}
}
