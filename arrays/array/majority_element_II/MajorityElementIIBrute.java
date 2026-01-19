package majority_element_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElementIIBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		List<Integer> majorityElements = majorityElement(nums);
		System.out.println("The majority elements in the array is : " + majorityElements);
		scanner.close();
	}

	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < nums.length; innerIndex++) {
				if (nums[innerIndex] == nums[outerIndex]) {
					count++;
				}
			}
			if (count > nums.length / 3 && !result.contains(nums[outerIndex])) {
				result.add(nums[outerIndex]);
			}
		}
		return result;
	}
}
