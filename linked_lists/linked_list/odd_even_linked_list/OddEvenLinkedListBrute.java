package odd_even_linked_list;

import java.util.ArrayList;

public class OddEvenLinkedListBrute {
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

	public ListNode oddEvenList(ListNode head) {
		int count = 0;
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ListNode temp = head;
		while (temp != null) {
			count++;
			if (count % 2 == 0) {
				even.add(temp.val);
			} else {
				odd.add(temp.val);
			}
			temp = temp.next;
		}
		temp = head;
		int index = 0;
		odd.addAll(even);
		while (temp != null) {
			temp.val = odd.get(index);
			temp = temp.next;
			index++;
		}
		return head;
	}
}
