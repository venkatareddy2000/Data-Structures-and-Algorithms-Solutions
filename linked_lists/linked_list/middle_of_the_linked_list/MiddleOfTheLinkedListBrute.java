package middle_of_the_linked_list;

public class MiddleOfTheLinkedListBrute {
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

	public ListNode middleNode(ListNode head) {
		int count = 0;
		ListNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int mid = count / 2;
		temp = head;
		for (int index = 0; index < mid; index++) {
			temp = temp.next;
		}
		return temp;
	}
}
