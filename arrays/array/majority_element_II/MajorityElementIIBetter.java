package majority_element_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MajorityElementIIBetter {
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
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
			if (hashMap.get(nums[index]) > nums.length / 3 && !result.contains(nums[index])) {
				result.add(nums[index]);
			}
		}
		return result;
	}
}
