package union_of_two_sorted_arrays;

import java.util.HashMap;
import java.util.Scanner;

public class UnionOfTwoSortedArraysHashMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the first array : ");
		int firstArraySize = scanner.nextInt();
		System.out.println("Enter the size of the second array : ");
		int secondArraySize = scanner.nextInt();
		int[] nums1 = new int[firstArraySize];
		int[] nums2 = new int[secondArraySize];
		System.out.println("Enter the elements into the first array : ");
		for (int index = 0; index < firstArraySize; index++) {
			nums1[index] = scanner.nextInt();
		}
		System.out.println("Enter the elements into the second array : ");
		for (int index = 0; index < secondArraySize; index++) {
			nums2[index] = scanner.nextInt();
		}
		unionOfTwoSortedArraysHashMap(nums1, nums2);
		scanner.close();
	}

	private static void unionOfTwoSortedArraysHashMap(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < nums1.length; index++) {
			if (!hashMap.containsKey(nums1[index])) {
				hashMap.put(nums1[index], null);
			}
		}
		for (int index = 0; index < nums2.length; index++) {
			if (!hashMap.containsKey(nums2[index])) {
				hashMap.put(nums2[index], null);
			}
		}
		System.out.println("HashMap : " + hashMap.keySet());
	}
}
