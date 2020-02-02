package lists;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import arrays.CountIslands;
import trees.Node;
import utils.Generate;
import utils.Print;
import utils.PrintToString;

public class ReverseLinkedListTest {
	
	private boolean TestSolution(int[] expected, Node actual) {
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
			index++;
			actual = actual.right;
		}
		return index == expected.length;
	}
	
	private boolean compareValue(Node node, int[] answer, int index) {
		if (node == null) {
			return false;
		}
		
		if (index >= answer.length) {
			return false;
		}
		
		
		return node.value == answer[index];
	}
	
	private void printNode(Node head) {
		
		while (head != null) {
			head = head.right;
		}
		
	}
	
public static void printTree(Node node) {
		HashMap<Node, Integer> nodeMap = new HashMap<Node, Integer>();
		
		
		Node start = node;
		if (node == null) {
			return;
		}
		
		node = node.right;
		while(node != null && node != start) {
			
			if (nodeMap.containsKey(node)) {
				return;
			}
			nodeMap.put(node, 0);
			node = node.right;
			
		}
	}


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
	
	private int[] LinkedList_2 = new int[] {1};
	private int[] LinkedList_2_answer = new int[] {1};
	
	private int[] LinkedList_3 = new int[] {1,2};
	private int[] LinkedList_3_answer = new int[] {2,1};
	
	private int[] LinkedList_4 = new int[] {};
	private int[] LinkedList_4_answer = new int[] {};
	
	private int[] LinkedList_5 = new int[] {8,2,3,23,7,5,54,23,84,12,34};
	private int[] LinkedList_5_answer = new int[] {34,12,84,23,54,5,7,23,3,2,8};
	
	
	
	
	
	private boolean Tester_Recursive(String testName, int[] expected, Node testTree, boolean logTest) {
		Node actual = ReverseLinkedList.Reverse_recursive(testTree);
		Print.PrintToConsole = logTest;
		Print.PrintString("Test "+testName+" \n" );
		Print.PrintString("Expected: " + PrintToString.IntArrayToString(expected) + "\n");
		Print.PrintString("  Actual: " + PrintToString.NodeListToString(actual) + "\n\n");
		Print.PrintToConsole = false;

		return TestSolution(expected, actual);
	}
	
	private boolean Tester_Iterative(String testName, int[] expected, Node testTree, boolean logTest) {
		Node actual = ReverseLinkedList.Reverse_Iterative(testTree);
		
		Print.PrintToConsole = logTest;
		Print.PrintString("Test "+testName+" \n" );
		Print.PrintString("Expected: " + PrintToString.IntArrayToString(expected) + "\n");
		Print.PrintString("  Actual: " + PrintToString.NodeListToString(actual) + "\n\n");
		Print.PrintToConsole = false;

		return TestSolution(expected, actual);
	}
	
	@Test
	void LinkedList_rec_1() {
		assertTrue(Tester_Recursive("LinkedList_rec_1", LinkedList_1_answer, LinkedList_1(), false));
	}
	
	@Test
	void LinkedList_it_1() {
		assertTrue(Tester_Iterative("LinkedList_it_1", LinkedList_1_answer, LinkedList_1(), false));
	}
	
	@Test
	void LinkedList_rec_2() {
		assertTrue(Tester_Recursive("LinkedList_rec_2", LinkedList_2_answer, Generate.GenerateLinkedList(LinkedList_2), false));
	}
	
	@Test
	void LinkedList_it_2() {
		assertTrue(Tester_Iterative("LinkedList_rec_2", LinkedList_2_answer, Generate.GenerateLinkedList(LinkedList_2), false));
	}
	
	@Test
	void LinkedList_rec_3() {
		assertTrue(Tester_Recursive("LinkedList_rec_3", LinkedList_3_answer, Generate.GenerateLinkedList(LinkedList_3), true));
	}
	
	@Test
	void LinkedList_it_3() {
		assertTrue(Tester_Iterative("LinkedList_rec_3", LinkedList_3_answer, Generate.GenerateLinkedList(LinkedList_3), true));
	}
	
	@Test
	void LinkedList_rec_4() {
		assertTrue(Tester_Recursive("LinkedList_rec_4", LinkedList_4_answer, Generate.GenerateLinkedList(LinkedList_4), false));
	}
	
	@Test
	void LinkedList_it_4() {
		assertTrue(Tester_Iterative("LinkedList_rec_4", LinkedList_4_answer, Generate.GenerateLinkedList(LinkedList_4), false));
	}
	
	@Test
	void LinkedList_rec_5() {
		assertTrue(Tester_Recursive("LinkedList_rec_5", LinkedList_5_answer, Generate.GenerateLinkedList(LinkedList_5), false));
	}
	
	@Test
	void LinkedList_it_5() {
		assertTrue(Tester_Iterative("LinkedList_rec_5", LinkedList_5_answer, Generate.GenerateLinkedList(LinkedList_5), false));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
