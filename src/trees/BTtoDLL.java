package trees;

public class BTtoDLL {

	public static Node ConvertToDoublyLinkedList(Node root) {
		
		
		root = Convert2(root);
		BTtoDLLTest.printTree(root);
		BTtoDLLTest.printTreeReverse(root);
		return root;
	}
	
	private static Node Convert(Node root) {
		if (root == null)
			return null;

		Node left = Convert(root.left);
		Node right = Convert(root.right);
		
		join(left, root);
		
		if (left != null)
			root = left;
		
		return root;
	}
	
	private static void join(Node left, Node right) {
		if (left == null || right == null)
			return;
		Node end = left;

		while(end.right != null && end.right != left) {
			end = end.right;
		}
		
		end.right = right;
	}
	
	
	
	
	private static Node Convert2(Node root) {
		if (root == null)
			return null;

		Node left = processLeaf(Convert2(root.left));
		Node right = processLeaf(Convert2(root.right));
		
		Node newRoot = new Node(root.value);
		newRoot.left = newRoot;
		newRoot.right = newRoot;
		
		join2(left, newRoot);
		join2(newRoot, right);
		BTtoDLLTest.printTree(newRoot);
		BTtoDLLTest.printTreeReverse(newRoot);
		
		if (left != null)
			newRoot = left;
		System.out.println();
		return newRoot;
	}
	
	private static Node processLeaf(Node leaf) {
		return leaf;
	}
	
	private static void join2(Node left, Node right) {
		if (left == null || right == null)
			return;
		
		Node leftEnd = left.left;
		Node rightEnd = right.left;

		leftEnd.right = right;
		left.left = rightEnd;

		rightEnd.right = left;
		right.left = leftEnd;
		
		System.out.println("");
	}
}





























































//private static void Convert(Node root, Node head) {
//	if (root == null)
//		return;
//	
//	
//	Node left = null;
//	Convert(root.left, head);
//	
//	
//	if (left == null) {
//		head = root;
//	}
//	else {
//		root.left = left;
//		left.right = root;
//	}
//	left = root;
//	Convert(root.right, head);
//}