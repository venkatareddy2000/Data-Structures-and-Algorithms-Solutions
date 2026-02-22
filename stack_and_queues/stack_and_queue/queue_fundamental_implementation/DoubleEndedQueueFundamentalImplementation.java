package queue_fundamental_implementation;

public class DoubleEndedQueueFundamentalImplementation<T> {
	int size;
	int front;
	int rear;
	T[] array;
	int currentSize;

	public DoubleEndedQueueFundamentalImplementation(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.array = (T[]) new Object[size];
		this.currentSize = 0;
	}

	private void insertFront(T data) {
		if (isFull()) {
			throw new RuntimeException("Queue is full, cannot insert any elements into the queue");
		}
		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else {
			front = (front - 1 + size) % size;
		}
		array[front] = data;
		currentSize++;
	}

	private T deleteFront() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty, cannot delete any elements from the queue");
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

	private void insertRear(T data) {
		if (isFull()) {
			throw new RuntimeException("Queue is full, cannot insert any elements into the queue");
		}
		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else {
			rear = (rear + 1) % size;
		}
		array[rear] = data;
		currentSize++;
	}

	private T deleteRear() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty, cannot delete any elements from the queue");
		}
		T value = array[rear];
		if (currentSize == 1) {
			front = -1;
			rear = -1;
		} else {
			rear = (rear - 1 + size) % size;
		}
		currentSize--;
		return value;
	}

	private T getFront() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty, cannot delete any elements from the queue");
		}
		return array[front];
	}

	private T getRear() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty, cannot delete any elements from the queue");
		}
		return array[rear];
	}

	private boolean isEmpty() {
		return currentSize == 0;
	}

	private boolean isFull() {
		return currentSize == size;
	}

	public static void main(String[] args) {
		DoubleEndedQueueFundamentalImplementation<Integer> doubleEndedQueueFundamentalImplementation = new DoubleEndedQueueFundamentalImplementation<Integer>(
				5);
		doubleEndedQueueFundamentalImplementation.insertFront(5);
		doubleEndedQueueFundamentalImplementation.insertFront(10);
		doubleEndedQueueFundamentalImplementation.insertFront(15);
		doubleEndedQueueFundamentalImplementation.insertFront(20);
		doubleEndedQueueFundamentalImplementation.insertRear(25);
		doubleEndedQueueFundamentalImplementation.getFront();
		doubleEndedQueueFundamentalImplementation.getRear();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
		doubleEndedQueueFundamentalImplementation.deleteFront();
	}
}
