package union_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArraysTwoPointer {
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
		unionOfTwoSortedArraysTwoPointer(nums1, nums2);
		scanner.close();
	}

	private static void unionOfTwoSortedArraysTwoPointer(int[] nums1, int[] nums2) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int firstPointer = 0;
		int secondPointer = 0;
		while (firstPointer < nums1.length && secondPointer < nums2.length) {
			if (nums1[firstPointer] <= nums2[secondPointer]) {
				if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != nums1[firstPointer]) {
					arrayList.add(nums1[firstPointer]);
				}
				firstPointer++;
			} else {
				if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != nums2[secondPointer]) {
					arrayList.add(nums2[secondPointer]);
				}
				secondPointer++;
			}
		}

		while (firstPointer < nums1.length) {
			if (arrayList.get(arrayList.size() - 1) != nums1[firstPointer]) {
				arrayList.add(nums1[firstPointer]);
			}
			firstPointer++;
		}
		while (secondPointer < nums2.length) {
			if (arrayList.get(arrayList.size() - 1) != nums2[secondPointer]) {
				arrayList.add(nums2[secondPointer]);
			}
			secondPointer++;
		}
		System.out.println("Array List : " + arrayList);
	}
}
