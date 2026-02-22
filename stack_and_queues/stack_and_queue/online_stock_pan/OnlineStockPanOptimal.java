package online_stock_pan;

import java.util.Stack;

public class OnlineStockPanOptimal {
	class Pair {
		int val;
		int index;

		public Pair(int val, int index) {
			this.val = val;
			this.index = index;
		}
	}

	Stack<Pair> stack;
	int index;

	public OnlineStockPanOptimal() {
		stack = new Stack<Pair>();
		index = -1;
	}

	public int next(int price) {
		index = index + 1;
		while (!stack.isEmpty() && stack.peek().val <= price) {
			stack.pop();
		}
		int count = 0;
		if (!stack.isEmpty()) {
			count = index - stack.peek().index;
		} else {
			count = index - (-1);
		}
		stack.push(new Pair(price, index));
		return count;
	}
}
