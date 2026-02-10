package copy_list_with_random_pointer;

public class CopyListWithRandomPointerBetter {
	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	public Node copyRandomList(Node head) {
		Node temp = head;
		while (temp != null) {
			Node node = new Node(temp.val);
			node.next = temp.next;
			temp.next = node;
			temp = temp.next.next;
		}
		temp = head;
		while (temp != null) {
			Node node = temp.next;
			if (temp.random != null) {
				node.random = temp.random.next;
			} else {
				node.random = null;
			}
			temp = temp.next.next;
		}
		Node dummyNode = new Node(-1);
		Node result = dummyNode;
		temp = head;
		while (temp != null) {
			result.next = temp.next;
			temp.next = temp.next.next;
			result = result.next;
			temp = temp.next;
		}
		return dummyNode.next;
	}
}
