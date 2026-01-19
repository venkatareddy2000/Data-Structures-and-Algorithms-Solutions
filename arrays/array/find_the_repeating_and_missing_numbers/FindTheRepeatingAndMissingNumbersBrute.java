package find_the_repeating_and_missing_numbers;

import java.util.Scanner;

public class FindTheRepeatingAndMissingNumbersBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int[] repeatingAndMissing = findTheRepeatingAndMissingNumbers(nums);
		System.out.println(
				"Repeating Number : " + repeatingAndMissing[0] + " Missing Number : " + repeatingAndMissing[1]);
		scanner.close();
	}

	private static int[] findTheRepeatingAndMissingNumbers(int[] nums) {
		int[] result = new int[2];
		int repeatingNumber = -1;
		int missingNumber = -1;
		for (int outerIndex = 1; outerIndex <= nums.length; outerIndex++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < nums.length; innerIndex++) {
				if (outerIndex == nums[innerIndex]) {
					count++;
				}
			}
			if (count == 2) {
				repeatingNumber = outerIndex;
			} else if (count == 0) {
				missingNumber = outerIndex;
			}
		}
		result[0] = repeatingNumber;
		result[1] = missingNumber;
		return result;
	}
}
