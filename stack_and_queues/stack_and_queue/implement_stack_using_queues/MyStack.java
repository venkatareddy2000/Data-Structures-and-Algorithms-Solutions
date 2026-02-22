package implement_stack_using_queues;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
	Queue<Integer> queue;

	public MyStack() {
		queue = new ArrayDeque<Integer>();
	}

	public void push(int x) {
		int size = queue.size();
		queue.add(x);
		for (int index = 0; index < size; index++) {
			queue.add(queue.peek());
			queue.poll();
		}
	}

	public int pop() {
		return queue.poll();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.size() == 0;
	}
}
