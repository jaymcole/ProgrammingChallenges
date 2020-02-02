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
	
	public static Node Reverse_Iterative(Node head) {
		
		if (head == null)
			return head;
		if (head.right == null)
			return head;
		if (head.right.right == null) {
			Node temp = head.right;
			temp.right = head;
			head.right = null;
			return temp;
		}	
		
		Node originalStart = head;
		Node prev = null;
		Node next = head;
		
		while ( next.right != null) {
			prev = head;
			head = next;
			next = next.right;
			head.right = prev;	
		}
		originalStart.right = null;
		next.right = head;
		return next;
	}
}
