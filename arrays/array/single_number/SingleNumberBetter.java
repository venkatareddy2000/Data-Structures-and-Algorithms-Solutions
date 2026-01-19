package single_number;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumberBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int singleNumberInArray = singleNumber(nums);
		System.out.println("The single number in the array is : " + singleNumberInArray);
		scanner.close();
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
}
