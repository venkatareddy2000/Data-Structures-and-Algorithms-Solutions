package linked_list_fundamental_implementation;

public class DoublyLinkedListFundamentalImplementation<K> {
	private Node head = null;

	class Node {

		private Node previous;
		private K data;
		private Node next;

		public Node(K data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}

	private void insertAtBeginning(K data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			head.previous = node;
			node.next = head;
			head = node;
		}
	}

	private void displayForward() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void insertAtEnd(K data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.previous = temp;
		}
	}

	private void insertAtIndex(int index, K data) {
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		Node node = new Node(data);
		if (head == null || index == 0) {
			insertAtBeginning(data);
		} else if (index == getSize()) {
			insertAtEnd(data);
		} else {
			Node temp = head;
			for (int count = 0; count < index - 1; count++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next.previous = node;
			node.previous = temp;
			temp.next = node;
		}
	}

	private void deleteAtBeginnig() {
		if (head == null) {
			throw new RuntimeException("Linked List is empty");
		}
		if (head.next == null) {
			head = null;
		} else {
			head.next.previous = null;
			head = head.next;
		}
	}

	private void deleteAtEnd() {
		if (head == null) {
			throw new RuntimeException("Linked List is empty");
		}
		if (getSize() == 1) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	private void deleteAtIndex(int index) {
		if (index < 0 || index > getSize() - 1) {
			throw new RuntimeException("Invalid Index");
		}
		if (index == 0) {
			deleteAtBeginnig();
		} else if (index == getSize() - 1) {
			deleteAtEnd();
		} else {
			Node temp = head;
			for (int count = 0; count < index - 1; count++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			temp.next.previous = temp;
		}
	}

	private void displayBackward() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.previous;
		}
		System.out.println();
	}

	private int getSize() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		DoublyLinkedListFundamentalImplementation<Integer> doublyLinkedListFundamentalImplementation = new DoublyLinkedListFundamentalImplementation<Integer>();
		doublyLinkedListFundamentalImplementation.insertAtBeginning(30);
		doublyLinkedListFundamentalImplementation.insertAtBeginning(20);
		doublyLinkedListFundamentalImplementation.insertAtBeginning(10);
		doublyLinkedListFundamentalImplementation.displayForward();
		doublyLinkedListFundamentalImplementation.insertAtEnd(40);
		doublyLinkedListFundamentalImplementation.insertAtEnd(50);
		doublyLinkedListFundamentalImplementation.insertAtEnd(60);
		doublyLinkedListFundamentalImplementation.displayForward();
		doublyLinkedListFundamentalImplementation.insertAtIndex(2, 25);
		doublyLinkedListFundamentalImplementation.displayForward();
		doublyLinkedListFundamentalImplementation.deleteAtBeginnig();
		doublyLinkedListFundamentalImplementation.displayForward();
		doublyLinkedListFundamentalImplementation.deleteAtEnd();
		doublyLinkedListFundamentalImplementation.displayForward();
		doublyLinkedListFundamentalImplementation.deleteAtIndex(2);
		doublyLinkedListFundamentalImplementation.displayForward();
		doublyLinkedListFundamentalImplementation.displayBackward();
	}
}
