package merge_sorted_array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the nums1 array : ");
		int m = scanner.nextInt();
		System.out.println("Enter the size of the nums2 array : ");
		int n = scanner.nextInt();
		int[] nums1 = new int[m + n];
		int[] nums2 = new int[n];
		System.out.println("Enter the element into the nums1 array : ");
		for (int index = 0; index < m; index++) {
			nums1[index] = scanner.nextInt();
		}
		System.out.println("Enter the element into the nums2 array : ");
		for (int index = 0; index < n; index++) {
			nums2[index] = scanner.nextInt();
		}
		merge(nums1, m, nums2, n);
		System.out.println("Array after merging : ");
		System.out.println(Arrays.toString(nums1));
		scanner.close();
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int middlePointer = (m + n) - 1;
		int firstPointer = m - 1;
		int lastPointer = n - 1;
		while (firstPointer >= 0 && lastPointer >= 0) {
			if (nums1[firstPointer] > nums2[lastPointer]) {
				nums1[middlePointer] = nums1[firstPointer];
				firstPointer--;
				middlePointer--;
			} else {
				nums1[middlePointer] = nums2[lastPointer];
				lastPointer--;
				middlePointer--;
			}
		}
		while (lastPointer >= 0) {
			nums1[middlePointer] = nums2[lastPointer];
			lastPointer--;
			middlePointer--;
		}
	}
}
