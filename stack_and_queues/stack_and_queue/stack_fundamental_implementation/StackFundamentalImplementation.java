package stack_fundamental_implementation;

public class StackFundamentalImplementation<T> {
	int size;
	int top;
	T[] array;

	public StackFundamentalImplementation(int size) {
		this.size = size;
		this.top = -1;
		this.array = (T[]) new Object[size];
	}

	private void push(T data) {
		if (isStackFull()) {
			throw new RuntimeException("Stack is full, you cannot insert anything into the stack");
		} else {
			array[++top] = data;
		}
	}

	private T pop() {
		if (isStackEmpty()) {
			throw new RuntimeException("Stack is empty, you cannot remove anything from the stack");
		}
		return array[top--];
	}

	private T peek() {
		if (isStackEmpty()) {
			throw new RuntimeException("Stack is empty, there are no elements in the stack");
		}
		return array[top];
	}

	public void display() {
		if (isStackEmpty()) {
			throw new RuntimeException("Stack is empty, there are no elements to display");
		} else {
			for (int index = top; index >= 0; index--) {
				System.out.print(array[index] + " ");
			}
			System.out.println();
		}
	}

	private boolean isStackFull() {
		return top == size - 1;
	}

	private boolean isStackEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		StackFundamentalImplementation<Integer> stackFundamentalImplementation = new StackFundamentalImplementation<Integer>(
				5);
		stackFundamentalImplementation.push(1);
		stackFundamentalImplementation.push(2);
		stackFundamentalImplementation.push(3);
		stackFundamentalImplementation.push(4);
		stackFundamentalImplementation.push(5);
		stackFundamentalImplementation.display();
		System.out.println("Top of the stack : " + stackFundamentalImplementation.peek());
		System.out.println("Popped element : " + stackFundamentalImplementation.pop());
		System.out.println("Popped element : " + stackFundamentalImplementation.pop());
		System.out.println("Popped element : " + stackFundamentalImplementation.pop());
		System.out.println("Popped element : " + stackFundamentalImplementation.pop());
		System.out.println("Popped element : " + stackFundamentalImplementation.pop());
		System.out.println("Popped element : " + stackFundamentalImplementation.pop());
	}
}
