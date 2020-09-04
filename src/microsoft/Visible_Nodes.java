package microsoft;

import java.util.LinkedList;

import org.junit.Test;

import trees.Node;

public class Visible_Nodes {

	public int CountVisibleNodes(Node root) {
		return FindVisibleNodes(root).size();
	}
	
	public LinkedList<Integer> FindVisibleNodes(Node root) {
		
		LinkedList<Integer> visibleNodes = new LinkedList<Integer>();
		if (root != null)
			findVisible(root, visibleNodes, root.value-1);		
		return visibleNodes;
		
	}
	
	private void findVisible(Node root, LinkedList<Integer> visibleNodes, int pathMax) {
		if (root == null)
			return;
		
		if (root.value > pathMax ) {
			pathMax = root.value;
			visibleNodes.add(pathMax);
		}
		
		findVisible(root.left, visibleNodes, pathMax);
		findVisible(root.right, visibleNodes, pathMax);
	}
	
	
	
	
	
	
	private void print(LinkedList<Integer> visibleNodes) {
		for (int i : visibleNodes) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
	@Test
	public void test_0 () {
		
		Node root = new Node(5,
				new Node(3,
						new Node(20),
						new Node(21)
						),
				new Node(10,
						new Node(1),
						null
						)
				);
		print(FindVisibleNodes(root));
	}
	
	@Test
	public void test_1 () {
		
		Node root = new Node(-10,
				new Node(-15,
						new Node(-1),
						null),
				null
				);
		print(FindVisibleNodes(root));
	}
	
	@Test
	public void test_2 () {
		
		Node root = null;
		print(FindVisibleNodes(root));
	}
	
}
