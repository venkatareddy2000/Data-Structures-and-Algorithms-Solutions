package implement_queue_using_linked_list;

class Node {
	public int val;
	public Node next;

	public Node(int val) {
		this.val = val;
		next = null;
	}
}

class MyQueue {
	private Node front;
	private Node rear;

	public MyQueue() {
		this.front = null;
		this.rear = null;
	}

	public void push(int x) {
		Node node = new Node(x);
		if (front == null && rear == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}

	public int pop() {
		if (front == null && rear == null) {
			return -1;
		}
		int result = front.val;
		if (front == rear) {
			front = null;
			rear = null;
		} else {
			front = front.next;
		}
		return result;
	}

	public int peek() {
		if (front == null) {
			return -1;
		}
		return front.val;
	}

	public boolean empty() {
		return (front == null);
	}
}