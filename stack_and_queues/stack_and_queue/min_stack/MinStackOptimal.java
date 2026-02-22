package min_stack;

import java.util.Stack;

public class MinStackOptimal {
	Stack<Long> stack;
	Long min;

	public MinStackOptimal() {
		stack = new Stack<Long>();
		min = Long.MAX_VALUE;
	}

	public void push(int val) {
		Long value = (long) val;
		if (stack.isEmpty()) {
			stack.push(value);
			min = value;
		} else if (value > min) {
			stack.push(value);
		} else {
			stack.push(2 * value - min);
			min = value;
		}
	}

	public void pop() {
		if (stack.isEmpty()) {
			return;
		} else if (stack.peek() < min) {
			min = 2 * min - stack.peek();
		}
		stack.pop();
	}

	public int top() {
		if (stack.isEmpty()) {
			return -1;
		}
		if (stack.peek() < min) {
			return min.intValue();
		}
		return stack.peek().intValue();
	}

	public int getMin() {
		return min.intValue();
	}
}
