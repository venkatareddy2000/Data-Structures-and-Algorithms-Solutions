package next_permutation;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutationBrute {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		nextPermutation(nums);
		System.out.println("The next permutation array : " + Arrays.toString(nums));
		scanner.close();
	}

	public static void nextPermutation(int[] nums) {

	}
}
