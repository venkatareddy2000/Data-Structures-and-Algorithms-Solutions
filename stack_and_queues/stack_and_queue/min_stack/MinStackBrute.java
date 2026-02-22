package min_stack;

import java.util.Stack;

public class MinStackBrute {
	Stack<Integer> stack;

	public MinStackBrute() {
		stack = new Stack<Integer>();
	}

	public void push(int val) {
		stack.push(val);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		int size = stack.size();
		int min = Integer.MAX_VALUE;
		for (int index = 0; index < size; index++) {
			if (stack.get(index) < min)
				min = stack.get(index);
		}
		return min;
	}
}
