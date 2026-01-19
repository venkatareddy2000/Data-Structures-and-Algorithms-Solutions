package find_the_repeating_and_missing_numbers;

import java.util.HashMap;
import java.util.Scanner;

public class FindTheRepeatingAndMissingNumbersBetter {
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
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
		}
		int repeatingNumber = -1;
		int missingNumber = -1;
		for (int index = 1; index <= nums.length; index++) {
			if (hashMap.containsKey(index)) {
				if (hashMap.get(index) > 1) {
					repeatingNumber = index;
				}
			} else {
				missingNumber = index;
			}
			if (repeatingNumber != -1 && missingNumber != -1) {
				break;
			}
		}
		result[0] = repeatingNumber;
		result[1] = missingNumber;
		return result;
	}
}
