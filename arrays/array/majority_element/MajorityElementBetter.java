package majority_element;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElementBetter {
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
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
			if (hashMap.get(nums[index]) > nums.length / 2) {
				return nums[index];
			}
		}
		return -1;
	}
}
