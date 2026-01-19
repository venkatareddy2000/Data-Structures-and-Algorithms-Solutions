package majority_element_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElementIIOptimal {
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
		int element1 = 0, element2 = 0;
		int count1 = 0, count2 = 0;
		for (int index = 0; index < nums.length; index++) {
			if (count1 == 0 && nums[index] != element2) {
				count1 = 1;
				element1 = nums[index];
			} else if (count2 == 0 && nums[index] != element1) {
				count2 = 1;
				element2 = nums[index];
			} else if (nums[index] == element1) {
				count1++;
			} else if (nums[index] == element2) {
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == element1) {
				count1++;
			}
		}
		if (count1 > nums.length / 3 && !result.contains(element1)) {
			result.add(element1);
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == element2) {
				count2++;
			}
		}
		if (count2 > nums.length / 3 && !result.contains(element2)) {
			result.add(element2);
		}
		return result;
	}
}
