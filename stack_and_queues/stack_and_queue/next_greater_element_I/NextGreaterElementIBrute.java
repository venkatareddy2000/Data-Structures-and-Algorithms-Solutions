package next_greater_element_I;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElementIBrute {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			result[i] = -1;
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					for (int k = j + 1; k < nums2.length; k++) {
						if (nums2[k] > nums1[i]) {
							result[i] = nums2[k];
							break;
						}
					}
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the nums1 : ");
		int nums1Size = scanner.nextInt();
		int[] nums1 = new int[nums1Size];
		System.out.println("Enter the size of the nums2 : ");
		int nums2Size = scanner.nextInt();
		int[] nums2 = new int[nums2Size];
		System.out.println("Enter the elements into the nums1 : ");
		for (int index = 0; index < nums1Size; index++) {
			nums1[index] = scanner.nextInt();
		}
		System.out.println("Enter the elements into the nums2 : ");
		for (int index = 0; index < nums2Size; index++) {
			nums2[index] = scanner.nextInt();
		}
		int[] nextGreaterElement = nextGreaterElement(nums1, nums2);
		System.out.println(Arrays.toString(nextGreaterElement));
		scanner.close();
	}
}
