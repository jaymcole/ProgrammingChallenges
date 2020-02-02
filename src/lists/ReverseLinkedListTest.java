package lists;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import arrays.CountIslands;
import trees.Node;

public class ReverseLinkedListTest {

	
	
	private int[] LinkedList_1_answer = new int[] {
			5,4,3,2,1
	};
	private Node LinkedList_1() {
		Node head = new Node(1);
		head.right = new Node(2);
		head.right.right = new Node(3);
		head.right.right.right = new Node(4);
		head.right.right.right.right = new Node(5);
		return head;
	}
	
	
	private boolean TestSolution(int[] expected, Node actual) {
		System.out.println("Start test");
		int index = 1;
		if (actual == null)
			return expected.length <= 0;
		Node start = actual;
		
		if (!compareValue(actual, expected, 0))
			return false;
		actual = actual.right;

		while(actual != null && actual != start) {			
			if (!compareValue(actual, expected, index)) {
				return false;
			}
			System.out.println("Compared " + actual.value + " to " + expected[index]);
			index++;
			actual = actual.right;
		}
		return index == expected.length;
	}
	
	private boolean compareValue(Node node, int[] answer, int index) {
		if (node == null) {
//			System.out.println("Node was null");
			return false;
		}
		
		if (index >= answer.length) {
//			System.out.println("Index out of bounds");
			return false;
		}
		
		
		return node.value == answer[index];
	}
	
	private void printNode(Node head) {
		
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.right;
		}
		System.out.println();
		
	}
	
public static void printTree(Node node) {
		HashMap<Node, Integer> nodeMap = new HashMap<Node, Integer>();
		
		
		Node start = node;
		if (node == null) {
			System.out.println("Tree was null");
			return;
		}
		System.out.print(start.value + " ");
		
		node = node.right;
		while(node != null && node != start) {
			
			if (nodeMap.containsKey(node)) {
				System.out.println("List Contains a loop!");
				System.out.println(node.value +" points to " + node.right.value);
				return;
			}
			nodeMap.put(node, 0);
			System.out.print(node.value + " ");
			node = node.right;
			
		}
		System.out.println();
	}
	
	@Test
	void island_one() {
		printTree(ReverseLinkedList.Reverse_recursive(LinkedList_1()));
		assertTrue(TestSolution(LinkedList_1_answer, ReverseLinkedList.Reverse_recursive(LinkedList_1())));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
