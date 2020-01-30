package trees;

import java.util.Iterator;
import java.util.LinkedList;

public class TreeSerializer {
	public static int[] Serialize(Node head) {
		
		LinkedList<Node> nodes = new LinkedList<Node>();
		SerializeHead(head, nodes);
//		trimList(nodes);
		int[] values = new int[nodes.size()];
		
		Iterator<Node> it = nodes.iterator();
		int index = 0;
		Node node;
		while (it.hasNext()) {
			node = it.next();
			
			if (node == null) {
				values[index] = -1;
			} else {
				values[index] = node.value;
			}
			index++;
		}

		return values;
	}
	
	private static void trimList(LinkedList<Node> nodes) {
		while(nodes.getLast() == null) {
			nodes.removeLast();
		}
	}
	
	private static int index;
	private static void SerializeHead(Node head, LinkedList<Node> nodes) {
		nodes.add(head);
		if (head == null) {
			return;
		}
		SerializeHead(head.left, nodes);
		SerializeHead(head.right, nodes);
	}
	
	public static Node Deserialize(int[] values) {
		Node head = new Node(-1, null, null);
		index = 0;
		return DeserializeHead(values, head);
	}
	
	private static Node DeserializeHead(int[] values, Node head) {
		if (values.length <= index || values[index] == -1)
			return null;
		head.value = values[index];
		index++;
		head.left = DeserializeHead(values,  new Node(-1, null, null));
		index++;
		head.right = DeserializeHead(values, new Node(-1, null, null));
		return head;
	}

}
