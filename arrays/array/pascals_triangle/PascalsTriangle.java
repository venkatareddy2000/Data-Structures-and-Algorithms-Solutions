package pascals_triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an input number to generate the pascal's triangle : ");
		int numRows = scanner.nextInt();
		List<List<Integer>> list = generate(numRows);
		System.out.println("The pascal's triangle : " + list);
		scanner.close();
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int row = 1; row <= numRows; row++) {
			result.add(generateRow(row));
		}
		return result;
	}

	private static List<Integer> generateRow(int row) {
		List<Integer> list = new ArrayList<Integer>();
		int result = 1;
		list.add(1);
		for (int col = 1; col < row; col++) {
			result = result * (row - col);
			result = result / col;
			list.add(result);
		}
		return list;
	}
}
