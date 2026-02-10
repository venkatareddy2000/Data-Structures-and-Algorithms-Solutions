package flattening_a_linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class FlatteningALinkedList {
	class ListNode {
		int val;
		ListNode next;
		ListNode child;

		ListNode() {
			val = 0;
			next = null;
			child = null;
		}

		ListNode(int data1) {
			val = data1;
			next = null;
			child = null;
		}

		ListNode(int data1, ListNode next1, ListNode child1) {
			val = data1;
			next = next1;
			child = child1;
		}
	}

	public ListNode flattentLinkedList(ListNode head) {
		ListNode temp1 = head;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while (temp1 != null) {
			ListNode temp2 = temp1;
			while (temp2 != null) {
				arrayList.add(temp2.val);
				temp2 = temp2.child;
			}
			temp1 = temp1.next;
		}
		Collections.sort(arrayList);
		return convertToLinkedList(arrayList);
	}

	public ListNode convertToLinkedList(ArrayList<Integer> arrayList) {
		ListNode head = new ListNode(arrayList.get(0));
		ListNode temp = head;
		for (int index = 1; index < arrayList.size(); index++) {
			ListNode newNode = new ListNode(arrayList.get(index));
			temp.child = newNode;
			temp = temp.child;
		}
		return head;
	}
}
