package min_stack;

import java.util.Stack;

public class MinStackBetter {
	class Pair {
		private int first;
		private int second;

		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	Stack<Pair> stack;

	public MinStackBetter() {
		stack = new Stack<Pair>();
	}

	public void push(int val) {
		if (stack.isEmpty()) {
			stack.push(new Pair(val, val));
		} else {
			stack.push(new Pair(val, Math.min(val, stack.peek().second)));
		}

	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek().first;
	}

	public int getMin() {
		return stack.peek().second;
	}
}
