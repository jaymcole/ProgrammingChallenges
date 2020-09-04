package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class W5_2_Check_If_A_String_Is_A_Valid_Sequence {
//https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/532/week-5/3315/
	/*
	 * Given a binary tree where each path going from the root to any leaf form a valid sequence, check if a given string is a valid sequence in such binary tree. 
	 * We get the given string from the concatenation of an array of integers arr and the concatenation of all values of the nodes along a path results in a sequence in the given binary tree.
	 */
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	
	public boolean isValidSequence(TreeNode root, int[] arr) {
		System.out.println("-------------------");

		return isValidSequence(root, arr, 0);
	}
	
	private boolean isValidSequence(TreeNode root, int[] arr, int index) {
		
		if (root == null) 
			return false;
		if (root.val != arr[index]) 
			return false;

		if (index >= arr.length-1)
			return IsLeaf(root);

		return isValidSequence(root.left, arr, index+1) || isValidSequence(root.right, arr, index+1);
	}

	private boolean IsLeaf(TreeNode root) {
		if (root == null) {
			return false;
		}
		return root.left == null && root.right == null;
	}
	
	
	@Test
	public void Test_Given_01 () {
		W5_2_Check_If_A_String_Is_A_Valid_Sequence test = new W5_2_Check_If_A_String_Is_A_Valid_Sequence();
		TreeNode root = new TreeNode(0,
				new TreeNode(1,
						new TreeNode(0, 
								new TreeNode(1), 
								null),
						new TreeNode(1,
								new TreeNode(0),
								new TreeNode(0))
						),
				new TreeNode(0, new TreeNode(0), null)
				);
		
		
		boolean actual = test.isValidSequence(root, new int[] {0,1,0,1});
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_02 () {
		W5_2_Check_If_A_String_Is_A_Valid_Sequence test = new W5_2_Check_If_A_String_Is_A_Valid_Sequence();
		TreeNode root = new TreeNode(0,
							new TreeNode(1,
									new TreeNode(0, 
											new TreeNode(1), 
											null),
									new TreeNode(1,
											new TreeNode(0),
											new TreeNode(0)
											)
									),
							new TreeNode(0, new TreeNode(0), null)
							);
		
//		PrintTree(root);
		boolean actual = test.isValidSequence(root, new int[] {0,0,1});
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_Given_03 () {
		W5_2_Check_If_A_String_Is_A_Valid_Sequence test = new W5_2_Check_If_A_String_Is_A_Valid_Sequence();
		TreeNode root = new TreeNode(0,
				new TreeNode(1,
						new TreeNode(0, 
								new TreeNode(1), 
								null),
						new TreeNode(1,
								new TreeNode(0),
								new TreeNode(0))
						),
				new TreeNode(0, new TreeNode(0), null)
				);
		
		
		boolean actual = test.isValidSequence(root, new int[] {0,1,1});
		assertEquals(false, actual);
	}
	
	public void PrintTree(TreeNode root) {
		if (root == null)
			return;
		
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		list.add(root);
		list.add(new TreeNode(-1));
		
		while(!list.isEmpty()) {
			TreeNode node = list.removeFirst();
			if (node == null)
				System.out.print(" N" );
			else if (node.val == -1) {
				System.out.println();
				if (list.isEmpty())
					return;
				list.addLast(new TreeNode(-1));
			} else {
				System.out.print(" " + node.val);
				list.add(node.left);
				list.add(node.right);
			}
		}
		
		
	}
	
}
