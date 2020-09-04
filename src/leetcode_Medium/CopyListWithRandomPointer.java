package leetcode_Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class CopyListWithRandomPointer {
	/*
	 A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

	Return a deep copy of the list.

	The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

	val: an integer representing Node.val
	random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.
	 

	Example 1:


	Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
	Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
	Example 2:


	Input: head = [[1,1],[2,1]]
	Output: [[1,1],[2,1]]
	Example 3:



	Input: head = [[3,null],[3,0],[3,null]]
	Output: [[3,null],[3,0],[3,null]]
	Example 4:

	Input: head = []
	Output: []
	Explanation: Given linked list is empty (null pointer), so return null.
	 

	Constraints:

	-10000 <= Node.val <= 10000
	Node.random is null or pointing to a node in the linked list.
	Number of Nodes will not exceed 1000.
	 */
		
		
	// Definition for a Node.
	public class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	    
	    @Override
	    public String toString() {
	    	String ran = "NULL";
	    	if (random != null)
	    		ran = random.val + "";
	    	return "["+ val + " ->" + ran + "]";
	    }
	}
	
	
	

//------------------------------------------------------------------------------------------------------------------------  
// 	Second Attempt  
//	"Faster than 100% of submissions"
//------------------------------------------------------------------------------------------------------------------------  	
	
	/**
	 * Deep copies head
	 * @param head - The head node to be copied.
	 * @return - head of copy.
	 */
	public Node copyRandomList(Node head) {
		if (head == null)
			return null;
		
		// HashMap to store cloned nodes keyed to original nodes.
		HashMap<Node, Node> map = new HashMap<Node, Node>();
		
		// Steps:
		// 1. Create clone of node.
		// 2. Store clone in map keyed to original node.
		// 3. Use map to assign cloned nodes random pointers to their correct node.
		
		copyToMap(head, new Node(head.val), map);
		rectifyPointers(head, map);
		return map.get(head);
	}
	
	/**
	 * Creates a copy of head and stores both head and clone in map.
	 * @param head - original node
	 * @param clone - cloned/copied node
	 * @param map - Stores head as key and clone as value.
	 */
	private void copyToMap(Node head, Node clone, HashMap<Node, Node> map) {
		if (clone == null)
			clone = new Node(head.val);
		map.put(head, clone);
		
		if (head.next != null) {
			Node nextClone = new Node (head.next.val);
			clone.next = nextClone;
			
			copyToMap(head.next, nextClone, map);
		}
	}
	
	/**
	 * Traverse list settings the random pointer of the cloned list.
	 * @param head - head of list to traverse
	 * @param map - Map containing original Node as key and clone Node as value
	 */
	private void rectifyPointers(Node head, HashMap<Node, Node> map) {
		if (head == null)
			return;
		
		if (head.random == null) 
			map.get(head).random = null;
		else
			map.get(head).random = map.get(head.random);
		rectifyPointers(head.next, map);
	}
	  
//------------------------------------------------------------------------------------------------------------------------  
// 	First Attempt  
// 	"v slow"
//------------------------------------------------------------------------------------------------------------------------  	
	
	public Node copyRandomList2(Node head) {
		HashMap<Node, Integer> map = new HashMap<Node, Integer>();
		HashMap<Node, Node> missing = new HashMap<Node, Node>();
		ArrayList<Node> newList = new ArrayList<Node>();
		copy(head, null, 0, map, missing, newList);
		
		for (Node nodeWithMissingRandomPointer : missing.keySet()) {
			nodeWithMissingRandomPointer.random = newList.get(map.get(missing.get(nodeWithMissingRandomPointer)));
		}
		
		if (newList.size() <= 0)
            return null;
        return newList.get(0);
    }
	
	private void copy(Node head, Node copy, int index, HashMap<Node, Integer> map, HashMap<Node, Node> missing, ArrayList<Node> newList) {
		if (head == null)
			return;
		map.put(head, index);
		if (copy == null)
			copy = new Node(head.val);
		newList.add(copy);
		
		if (map.containsKey(head.random)) {
			copy.random = newList.get(map.get(head.random));
		} else {
			if (head.random != null)
				missing.put(copy, head.random);
		}
		
		if (head.next != null) {
			Node nextCopy = new Node(head.next.val);
			copy(head.next, nextCopy, index+1, map, missing, newList);
			copy.next = nextCopy;
		}
		
	}
}
