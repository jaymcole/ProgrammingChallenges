package trees;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class BTtoDLLTest {
	private static int[] tree1Answer = new int[]{5,3,6,1,7,4,8,0,2};
	private static Node tree1 = new Node(0,
			new Node(1, 
					new Node(3,
							new Node(5, null, null),
							new Node(6, null, null)
							),
					new Node(4,
							new Node(7, null, null),
							new Node(8, null, null)
							)
					),
			new Node(2, null, null)
		);
	
	
	private static int[] tree_left_only_answer = new int[] {5,4,3,2,1};
	private static Node tree_left_only() {
		Node node = new Node(1);
		node.left = new Node(2);
		node.left.left = new Node(3);
		node.left.left.left = new Node(4);
		node.left.left.left.left = new Node(5);
		return node;
	}
	
	private static int[] tree_right_only_answer = new int[] {1,2,3,4,5};
	private static Node tree_right_only() {
		Node node = new Node(1);
		node.right = new Node(2);
		node.right.right = new Node(3);
		node.right.right.right = new Node(4);
		node.right.right.right.right = new Node(5);
		return node;
	}
	
	
	
	
	
	
	
	
	
	
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
//			System.out.println("Compared " + actual.value + " to " + expected[index]);
			index++;
			actual = actual.right;
		}
		return index == expected.length;
	}
	
	private boolean compareValue(Node node, int[] answer, int index) {
		if (node == null) {
			System.out.println("Node was null");
			return false;
		}
		
		if (index >= answer.length) {
			System.out.println("Index out of bounds");
			return false;
		}
		
		
		return node.value == answer[index];
	}
	
	public static void printTest (int[] expected, Node actual) {
		
		System.out.print("Expected: ");
		for (int i = 0 ; i < expected.length; i++) {
			System.out.print(expected[i] + " ");
		}
		
		System.out.print("\n  Actual: ");
		printTree(actual);
		
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
	
		public static void printTreeReverse(Node node) {
		
		HashMap<Node, Integer> nodeMap = new HashMap<Node, Integer>();
		
		
		Node start = node;
		if (node == null) {
			System.out.println("Tree was null");
			return;
		}
		System.out.print(start.value + " ");
		
		node = node.left;
		while(node != null && node != start) {
			
			if (nodeMap.containsKey(node)) {
				System.out.println("List Contains a loop!");
				System.out.println(node.value +" points to " + node.left.value);
				return;
			}
			nodeMap.put(node, 0);
			System.out.print(node.value + " ");
			node = node.left;
			
		}
		System.out.println();
	}
	
	@Test
	void Test() {
		System.out.println("Start Test");
		Node node = BTtoDLL.ConvertToDoublyLinkedList(new Node(1, new Node(2), new Node(3)));
		printTest(new int[] {2,1,3}, node);
		assertTrue(TestSolution(new int[] {2,1,3}, node));
	}
	
	@Test
	void Test_tree1() {
		System.out.println("Start Test_tree1");
		Node node = BTtoDLL.ConvertToDoublyLinkedList(tree1);
		printTest(tree1Answer, node);
		assertTrue(TestSolution(tree1Answer, node));
	}
	
	@Test
	void Test_left() {
		System.out.println("Start Test_left");
		Node node = BTtoDLL.ConvertToDoublyLinkedList(tree_left_only());
		printTest(tree_left_only_answer, node);
		assertTrue(TestSolution(tree_left_only_answer, node));
	}
	
	@Test
	void Test_right() {
		System.out.println("Start Test_right");
		Node node = BTtoDLL.ConvertToDoublyLinkedList(tree_right_only());
		printTest(tree_right_only_answer, node);
		assertTrue(TestSolution(tree_right_only_answer, node));
	}
}
