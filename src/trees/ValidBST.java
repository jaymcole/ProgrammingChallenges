package trees;

public class ValidBST {

	/**
	 * Check if a Binary Search Tree (BST) is valid.
	 * 	- All left nodes must be smaller than all parent nodes.
	 *	- All right nodes must be larger than all parent nodes.
	 */
	
	public static boolean IsValidBST(Node node) {
		return Valid(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	
	private static boolean Valid(Node node, int min, int max) {
		
		if (node == null)
			return true;
		if (node.value < min || node.value > max)
			return false;
		
		return Valid(node.left, min, node.value) && Valid(node.right, node.value, max);
	}
	
}
