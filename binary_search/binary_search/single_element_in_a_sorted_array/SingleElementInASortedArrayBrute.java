package single_element_in_a_sorted_array;

import java.util.HashMap;
import java.util.Scanner;

public class SingleElementInASortedArrayBrute {
	public static int singleNonDuplicate(int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
		}
		for (int index = 0; index < nums.length; index++) {
			if (hashMap.get(nums[index]) == 1) {
				return nums[index];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int singleElement = singleNonDuplicate(nums);
		System.out.println("Single Element from the sorted array : " + singleElement);
		scanner.close();
	}
}
