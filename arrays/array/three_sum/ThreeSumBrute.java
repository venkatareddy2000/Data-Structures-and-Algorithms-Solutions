package three_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ThreeSumBrute {
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
		for (int outerIndex = 0; outerIndex < nums.length - 2; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length - 1; innerIndex++) {
				for (int thirdLoop = innerIndex + 1; thirdLoop < nums.length; thirdLoop++) {
					if ((nums[outerIndex] + nums[innerIndex] + nums[thirdLoop] == 0)) {
						List<Integer> arrayList = new ArrayList<Integer>();
						arrayList.add(nums[outerIndex]);
						arrayList.add(nums[innerIndex]);
						arrayList.add(nums[thirdLoop]);
						Collections.sort(arrayList);
						hashSet.add(arrayList);
					}
				}
			}
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>(hashSet);
		return result;
	}
}
