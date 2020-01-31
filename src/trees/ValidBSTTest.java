package trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidBSTTest {

	private static boolean graph1Answer = false;
	private static Node getGraph1() {
		Node node = new Node(10);
		node.left = new Node(5);
//		node.left.left = new Node();
//		node.left.right = new Node();
		
		node.right = new Node(15);
		node.right.left = new Node(6);
		node.right.right = new Node(20);
		
		return node;
	}
	
	private static boolean graph2Answer = false;
	private static Node getGraph2() {
		Node node = new Node(50);
		node.left = new Node(16);
		node.left.left = new Node(9);
		node.left.right = new Node(47);
		node.left.right.right = new Node(49);
		
		node.right = new Node(73);
		node.right.right = new Node(94);
		node.right.right.right = new Node(75);
		
		return node;
	}
	
	private static boolean graph2BAnswer = true;
	private static Node getGraph2B() {
		Node node = new Node(50);
		node.left = new Node(16);
		node.left.left = new Node(9);
		node.left.right = new Node(47);
		
		node.right = new Node(73);
		node.right.right = new Node(94);
		node.right.right.right = new Node(99);
		
		return node;
	}
	
	private static boolean graph3Answer = true;
	private static Node getGraph3() {
		return null;
	}
	
	private static boolean graph3BAnswer = true;
	private static Node getGraph3B() {
		Node node = new Node();
		return node;
	}
	
	
	@Test
	void Test_graph1() {
		assertEquals(graph1Answer, ValidBST.IsValidBST(getGraph1()));
	}
	
	@Test
	void Test_graph2() {
		assertEquals(graph2Answer, ValidBST.IsValidBST(getGraph2()));
	}
	
	@Test
	void Test_graph2B() {
		assertEquals(graph2BAnswer, ValidBST.IsValidBST(getGraph2B()));
	}
	
	@Test
	void Test_graph3() {
		assertEquals(graph3Answer, ValidBST.IsValidBST(getGraph3()));
	}
	
	@Test
	void Test_graph3B() {
		assertEquals(graph3BAnswer, ValidBST.IsValidBST(getGraph3B()));
	}
	
	
}
