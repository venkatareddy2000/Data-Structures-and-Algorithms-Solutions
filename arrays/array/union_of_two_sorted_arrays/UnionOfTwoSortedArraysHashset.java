package union_of_two_sorted_arrays;

import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoSortedArraysHashset {
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
		unionOfTwoSortedArraysHashSet(nums1, nums2);
		scanner.close();
	}

	private static void unionOfTwoSortedArraysHashSet(int[] nums1, int[] nums2) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int index = 0; index < nums1.length; index++) {
			if (!hashSet.contains(nums1[index])) {
				hashSet.add(nums1[index]);
			}
		}
		for (int index = 0; index < nums2.length; index++) {
			if (!hashSet.contains(nums2[index])) {
				hashSet.add(nums2[index]);
			}
		}
		System.out.println("HashSet : " + hashSet);
	}
}
