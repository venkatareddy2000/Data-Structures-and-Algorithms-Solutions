package number_of_good_pairs;

import java.util.Scanner;

public class NumberOfGoodPairsBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int goodPairs = numberOfGoodPairsBrute(nums);
		System.out.println("The number of good pairs in the given array is : " + goodPairs);
		scanner.close();
	}

	public static int numberOfGoodPairsBrute(int[] nums) {
		int goodPairs = 0;
		for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
				if (nums[outerIndex] == nums[innerIndex]) {
					if (outerIndex < innerIndex)
						goodPairs += 1;
				}
			}
		}
		return goodPairs;
	}
}
