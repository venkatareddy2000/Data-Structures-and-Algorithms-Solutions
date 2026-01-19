package majority_element;

import java.util.Scanner;

public class MajorityElementOptimal {
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
		int element = 0;
		int count = 0;
		for (int index = 0; index < nums.length; index++) {
			if (count == 0) {
				count = 1;
				element = nums[index];
			} else if (nums[index] == element) {
				count++;
			} else {
				count--;
			}
		}
		count = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == element) {
				count++;
			}
		}
		if (count > nums.length / 2) {
			return element;
		}
		return -1;
	}
}
