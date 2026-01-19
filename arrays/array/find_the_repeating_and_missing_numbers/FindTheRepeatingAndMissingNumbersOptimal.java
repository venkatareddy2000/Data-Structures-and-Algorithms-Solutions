package find_the_repeating_and_missing_numbers;

import java.util.Scanner;

public class FindTheRepeatingAndMissingNumbersOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the elements into the array : ");
		for (int index = 0; index < size; index++) {
			nums[index] = scanner.nextInt();
		}
		int[] repeatingAndMissing = findTheRepeatingAndMissingNumbers(nums);
		System.out.println(
				"Repeating Number : " + repeatingAndMissing[0] + " Missing Number : " + repeatingAndMissing[1]);
		scanner.close();
	}

	private static int[] findTheRepeatingAndMissingNumbers(int[] nums) {
		int n = nums.length;
		int[] result = new int[2];
		int sumOfNNaturalNumbers = ((n) * (n + 1)) / 2;
		int sumOfSquaresOfNNaturalNumbers = ((n) * ((n + 1) * ((2 * n) + 1))) / 6;
		int sumOfNumbers = 0;
		int sumOfSquaresOfNumbers = 0;
		for (int index = 0; index < nums.length; index++) {
			sumOfNumbers = sumOfNumbers + nums[index];
			sumOfSquaresOfNumbers = sumOfSquaresOfNumbers + (nums[index] * nums[index]);
		}
		int value1 = (sumOfNumbers - sumOfNNaturalNumbers);
		int value2 = (sumOfSquaresOfNumbers - sumOfSquaresOfNNaturalNumbers) / value1;
		int repeatingNumber = (value1 + value2) / 2;
		int missingNumber = repeatingNumber - value1;
		result[0] = repeatingNumber;
		result[1] = missingNumber;
		return result;
	}
}
