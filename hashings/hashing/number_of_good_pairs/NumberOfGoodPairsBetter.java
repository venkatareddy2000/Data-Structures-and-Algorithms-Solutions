package number_of_good_pairs;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfGoodPairsBetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int goodPairs = numberOfGoodPairsBetter(nums);
		System.out.println("The number of good pairs in the given array is : " + goodPairs);
		scanner.close();
	}

	public static int numberOfGoodPairsBetter(int[] nums) {
		int goodPairs = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums.length; index++) {
			hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
		}
		for (int key : hashMap.keySet()) {
			int val = hashMap.get(key);
			goodPairs = goodPairs + ((val) * (val - 1)) / 2;
		}
		return goodPairs;
	}
}
