package linked_list_fundamental_implementation;

public class CircularLinkedListFundamentalImplementation<K> {
	private Node head = null;

	class Node {
		private K data;
		private Node next;

		public Node(K data) {
			this.data = data;
			this.next = null;
		}
	}

	private void insertAtBeginning(K data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			head.next = node;
		} else if (head.next == head) {
			node.next = head;
			head.next = node;
			head = node;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			node.next = head;
			temp.next = node;
			head = node;
		}

	}

	private void insertAtEnd(K data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			head.next = node;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	private void insertAtIndex(int index, K data) {
		if (index < 0 || index > getSize()) {
			throw new RuntimeException("Invalid Index");
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

	private void deleteAtBeginning() {
		if (head.next == head) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = head.next;
			head = temp.next;
		}
	}

	private void deleteAtEnd() {
		if (head.next == head) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next.next != head) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	private void deleteAtIndex(int index) {
		if (index < 0 || index > getSize()) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		if (index == 0) {
			deleteAtBeginning();
		} else if (index == getSize() - 1) {
			deleteAtEnd();
		} else {
			Node temp = head;
			for (int count = 0; count < index - 1; count++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	private void display() {
		Node temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}

	private int getSize() {
		Node temp = head;
		int count = 0;
		do {
			count++;
			temp = temp.next;
		} while (temp != head);
		return count;
	}

	public static void main(String[] args) {
		CircularLinkedListFundamentalImplementation<Integer> circularLinkedListFundamentalImplementation = new CircularLinkedListFundamentalImplementation<Integer>();
		circularLinkedListFundamentalImplementation.insertAtBeginning(30);
		circularLinkedListFundamentalImplementation.insertAtBeginning(20);
		circularLinkedListFundamentalImplementation.insertAtBeginning(10);
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.insertAtEnd(40);
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.insertAtIndex(2, 25);
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.deleteAtBeginning();
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.deleteAtEnd();
		circularLinkedListFundamentalImplementation.display();
		circularLinkedListFundamentalImplementation.deleteAtIndex(2);
		circularLinkedListFundamentalImplementation.display();
	}
}
