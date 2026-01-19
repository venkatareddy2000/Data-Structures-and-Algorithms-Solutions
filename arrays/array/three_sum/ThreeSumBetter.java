package three_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ThreeSumBetter {
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
		HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
		for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
			HashSet<Integer> hash = new HashSet<Integer>();
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
				int thirdElement = -(nums[outerIndex] + nums[innerIndex]);
				if (hash.contains(thirdElement)) {
					ArrayList<Integer> arrayList = new ArrayList<Integer>();
					arrayList.add(nums[outerIndex]);
					arrayList.add(nums[innerIndex]);
					arrayList.add(thirdElement);
					Collections.sort(arrayList);
					hashSet.add(arrayList);
				}
				hash.add(nums[innerIndex]);
			}
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>(hashSet);
		return result;
	}
}
