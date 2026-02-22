package implement_stack_using_linked_list;

class Node {
	public int val;
	public Node next;

	public Node(int val) {
		this.val = val;
		next = null;
	}
}

class MyStack {
	Node top;

	public MyStack() {
		this.top = null;
	}

	public void push(int x) {
		Node node = new Node(x);
		node.next = top;
		top = node;
	}

	public int pop() {
		if (top == null) {
			return -1;
		}
		int result = top.val;
		top = top.next;
		return result;
	}

	public int top() {
		if (top == null) {
			return -1;
		}
		return top.val;
	}

	public boolean empty() {
		return top == null;
	}
}
