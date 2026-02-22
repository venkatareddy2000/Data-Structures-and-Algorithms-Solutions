package online_stock_pan;

import java.util.Stack;

public class OnlineStockPanBrute {
	Stack<Integer> stack;

	public OnlineStockPanBrute() {
		stack = new Stack<Integer>();
	}

	public int next(int price) {
		stack.push(price);
		int size = stack.size() - 1;
		int count = 1;
		while (size > 0) {
			if (stack.get(size - 1) <= stack.peek()) {
				count++;
				size--;
			} else {
				break;
			}
		}
		return count;
	}
}
