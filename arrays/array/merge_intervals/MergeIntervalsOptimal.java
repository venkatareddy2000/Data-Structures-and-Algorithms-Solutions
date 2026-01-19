package merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervalsOptimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows in the array : ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of columns in the array : ");
		int columns = scanner.nextInt();
		int[][] intervals = new int[rows][columns];
		System.out.println("Enter the elements into the array : ");
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				intervals[row][column] = scanner.nextInt();
			}
		}
		int[][] mergeIntervals = merge(intervals);
		System.out.println("Merged Intervals : ");
		for (int row = 0; row < mergeIntervals.length; row++) {
			for (int column = 0; column < mergeIntervals[row].length; column++) {
				System.out.print(mergeIntervals[row][column] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int index = 0; index < intervals.length; index++) {
			int start = intervals[index][0];
			int end = intervals[index][1];
			if (result.isEmpty() || intervals[index][0] > result.get(result.size() - 1).get(1)) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(start);
				temp.add(end);
				result.add(temp);
			} else {
				List<Integer> last = result.get(result.size() - 1);
				last.set(1, Math.max(last.get(1), end));
			}
		}
		int[][] resultArray = new int[result.size()][result.get(0).size()];
		for (int outerIndex = 0; outerIndex < resultArray.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex < resultArray[outerIndex].length; innerIndex++) {
				resultArray[outerIndex][innerIndex] = result.get(outerIndex).get(innerIndex);
			}
		}
		return resultArray;
	}
}
