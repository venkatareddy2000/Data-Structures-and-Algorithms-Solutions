package reverse_nodes_in_k_group;

public class ReverseNodesInKGroup {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode temp = head;
		ListNode previous = null;
		while (temp != null) {
			ListNode kthNode = getKthNode(temp, k);
			if (kthNode == null) {
				if (previous != null) {
					previous.next = temp;
					break;
				}
			}
			ListNode next = kthNode.next;
			kthNode.next = null;
			reverseList(temp);
			if (temp == head) {
				head = kthNode;
			} else {
				previous.next = kthNode;
			}
			previous = temp;
			temp = next;
		}
		return head;
	}

	public ListNode getKthNode(ListNode temp, int k) {
		k = k - 1;
		while (temp != null && k > 0) {
			temp = temp.next;
			k--;
		}
		return temp;
	}

	public ListNode reverseList(ListNode head) {
		ListNode previous = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
	}
}
