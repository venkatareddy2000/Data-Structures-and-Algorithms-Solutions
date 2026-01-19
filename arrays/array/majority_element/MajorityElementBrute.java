package majority_element;

import java.util.Scanner;

public class MajorityElementBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int majorityElement = majorityElement(nums);
		System.out.println("The majority element in the array is : " + majorityElement);
		scanner.close();
	}

	public static int majorityElement(int[] nums) {
		for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < nums.length; innerIndex++) {
				if (nums[innerIndex] == nums[outerIndex]) {
					count++;
				}
				if (count > nums.length / 2) {
					return nums[outerIndex];
				}
			}
		}
		return -1;
	}
}
