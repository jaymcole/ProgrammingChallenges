package lists;

import trees.Node;

public class ReverseLinkedList {
	public static Node Reverse_recursive(Node head) {
		if (head == null)
			return head;
		if (head.right == null)
			return head;

		Node newHead = Reverse_recursive(head.right);
		head.right.right = head;
		head.right = null;
		
		return newHead;
	}
}
