
package utils;

import trees.Node;

public class Generate {

	public static Node GenerateLinkedList(int[] array) {
		Node head = null;
		Node temp = null;
		for (int i = array.length-1; i >= 0; i--) {
			temp = new Node(array[i]);
			temp.right = head;
			head = temp;
		}
		return head;
	}
	
}
