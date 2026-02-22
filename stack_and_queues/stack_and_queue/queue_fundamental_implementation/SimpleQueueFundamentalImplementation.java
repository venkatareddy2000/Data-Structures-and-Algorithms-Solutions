package queue_fundamental_implementation;

public class SimpleQueueFundamentalImplementation<T> {
	int front;
	int rear;
	int size;
	T[] array;

	public SimpleQueueFundamentalImplementation(int size) {
		this.size = size;
		this.rear = -1;
		this.front = 0;
		this.array = (T[]) new Object[size];
	}

	private void enqueue(T data) {
		if (isFull()) {
			throw new RuntimeException("Queue is full, we cannot insert anything into the queue");
		}
		array[++rear] = data;
	}

	private T dequeue() {
		if (isEmpty()) {
			return null;
		}
		return array[front++];
	}

	private T peek() {
		if (isEmpty()) {
			return null;
		}
		return array[front];
	}

	private boolean isFull() {
		return rear == size - 1;
	}

	private boolean isEmpty() {
		return front > rear;
	}

	private void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for (int index = front; index <= rear; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println();
	}

	private int size() {
		return rear - front + 1;
	}

	public static void main(String[] args) {
		SimpleQueueFundamentalImplementation<Integer> simpleQueueFundamentalImplementation = new SimpleQueueFundamentalImplementation<Integer>(
				5);
		simpleQueueFundamentalImplementation.enqueue(1);
		simpleQueueFundamentalImplementation.enqueue(2);
		simpleQueueFundamentalImplementation.enqueue(3);
		simpleQueueFundamentalImplementation.enqueue(4);
		simpleQueueFundamentalImplementation.enqueue(5);
		System.out.println("Peek element : " + simpleQueueFundamentalImplementation.peek());
		simpleQueueFundamentalImplementation.display();
		System.out.println("Size of the queue : " + simpleQueueFundamentalImplementation.size());
		System.out.println("Removed element : " + simpleQueueFundamentalImplementation.dequeue());
		System.out.println("Size of the queue : " + simpleQueueFundamentalImplementation.size());
		System.out.println("Removed element : " + simpleQueueFundamentalImplementation.dequeue());
		System.out.println("Removed element : " + simpleQueueFundamentalImplementation.dequeue());
		System.out.println("Size of the queue : " + simpleQueueFundamentalImplementation.size());
		System.out.println("Removed element : " + simpleQueueFundamentalImplementation.dequeue());
		System.out.println("Size of the queue : " + simpleQueueFundamentalImplementation.size());
	}
}
