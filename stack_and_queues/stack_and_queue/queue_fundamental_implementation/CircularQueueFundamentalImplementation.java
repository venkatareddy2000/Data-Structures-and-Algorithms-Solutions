package queue_fundamental_implementation;

public class CircularQueueFundamentalImplementation<T> {
	int front;
	int rear;
	int size;
	T[] array;
	int currentSize;

	public CircularQueueFundamentalImplementation(int size) {
		this.size = size;
		this.rear = -1;
		this.front = -1;
		this.array = (T[]) new Object[size];
		this.currentSize = 0;
	}

	private void enqueue(T data) {
		if (isFull()) {
			throw new RuntimeException("Queue is full, we cannot insert anything into the queue");
		}
		if (isEmpty()) {
			front = 0;
		}
		rear = (rear + 1) % size;
		array[rear] = data;
		currentSize++;
	}

	private T dequeue() {
		if (isEmpty()) {
			return null;
		}
		T value = array[front];
		if (currentSize == 1) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % size;
		}
		currentSize--;
		return value;

	}

	private T peek() {
		if (isEmpty()) {
			return null;
		}
		return array[front];
	}

	private boolean isFull() {
		return currentSize == size;
	}

	private boolean isEmpty() {
		return currentSize == 0;
	}

	private void display() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int count = 0;
		int index = (front) % size;
		while (count < currentSize) {
			System.out.print(array[index] + " ");
			count++;
			index = (index + 1) % size;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CircularQueueFundamentalImplementation<Integer> circularQueueFundamentalImplementation = new CircularQueueFundamentalImplementation<Integer>(
				5);
		circularQueueFundamentalImplementation.enqueue(1);
		circularQueueFundamentalImplementation.enqueue(2);
		circularQueueFundamentalImplementation.enqueue(3);
		circularQueueFundamentalImplementation.enqueue(4);
		circularQueueFundamentalImplementation.enqueue(5);
		circularQueueFundamentalImplementation.display();
		System.out.println("Peek element : " + circularQueueFundamentalImplementation.peek());
		System.out.println("Removed element : " + circularQueueFundamentalImplementation.dequeue());
		System.out.println("Removed element : " + circularQueueFundamentalImplementation.dequeue());
		System.out.println("Removed element : " + circularQueueFundamentalImplementation.dequeue());
		System.out.println("Removed element : " + circularQueueFundamentalImplementation.dequeue());
		circularQueueFundamentalImplementation.display();
	}
}
