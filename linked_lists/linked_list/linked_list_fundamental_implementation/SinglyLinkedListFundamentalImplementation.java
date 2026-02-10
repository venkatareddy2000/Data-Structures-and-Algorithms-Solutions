package linked_list_fundamental_implementation;

public class SinglyLinkedListFundamentalImplementation<K> {
	private Node head = null;

	class Node {
		private K data;
		private Node next;

		public Node(K data) {
			this.data = data;
			this.next = null;
		}
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
		}
	}

	private void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void insertAtBeginning(K data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	private void insertAtIndex(int index, K data) {
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		if (index == 0) {
			insertAtBeginning(data);
		} else if (index == getSize()) {
			insertAtEnd(data);
		} else {
			Node node = new Node(data);
			Node temp = head;
			for (int count = 0; count < index - 1; count++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	private int getSize() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	private void deleteAtBeginning() {
		if (head == null) {
			throw new RuntimeException("Linked List is empty");
		} else {
			head = head.next;
		}
	}

	private void deleteAtEnd() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	private void deleteAtIndex(int index) {
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		if (index == 1) {
			deleteAtBeginning();
		} else if (index == getSize()) {
			deleteAtEnd();
		} else {
			Node temp = head;
			for (int count = 0; count < index - 1; count++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}

	}

	private void reverseLinkedList() {
		Node previous = null;
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

	public static void main(String[] args) {
		SinglyLinkedListFundamentalImplementation<Integer> singlyLinkedListFundamentalImplementation = new SinglyLinkedListFundamentalImplementation<Integer>();
		singlyLinkedListFundamentalImplementation.insertAtEnd(10);
		singlyLinkedListFundamentalImplementation.insertAtEnd(20);
		singlyLinkedListFundamentalImplementation.insertAtEnd(30);
		singlyLinkedListFundamentalImplementation.insertAtEnd(40);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.insertAtBeginning(0);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.insertAtIndex(3, 25);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.deleteAtBeginning();
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.deleteAtEnd();
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.deleteAtIndex(2);
		singlyLinkedListFundamentalImplementation.display();
		singlyLinkedListFundamentalImplementation.reverseLinkedList();
		singlyLinkedListFundamentalImplementation.display();
	}
}
