package copy_list_with_random_pointer;

import java.util.HashMap;

public class CopyListWithRandomPointerBrute {
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
		HashMap<Node, Node> hashMap = new HashMap<Node, Node>();
		Node temp = head;
		while (temp != null) {
			Node node = new Node(temp.val);
			hashMap.put(temp, node);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			Node copyNode = hashMap.get(temp);
			copyNode.next = hashMap.get(temp.next);
			copyNode.random = hashMap.get(temp.random);
			temp = temp.next;
		}
		return hashMap.get(head);
	}
}
