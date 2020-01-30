package graphs;

import java.util.LinkedList;

public class BreadthFirstSearch {
	
	public static int Search(Node start, Node end) {
		
		LinkedList<Node> nodes = new LinkedList<Node>();
		processNode(nodes, start);
		
		
		int minCost = -1;
		while (!nodes.isEmpty()) {
			Node node = nodes.getFirst();
			processNode(nodes, node);
			if (node == end && (minCost == -1 || minCost < end.value))
				minCost = end.value;
			nodes.removeFirst();
		}
		return minCost;
	}
	
	private static void processNode(LinkedList<Node> nodes, Node start) {
		for (Edge edge : start.getEdges()) {	
			Node nextNode = edge.getNode();
			int travelCost = edge.getCost() + start.value;
			if (travelCost < nextNode.value || nextNode.value == -1) {
				nodes.add(nextNode);
				nextNode.value = travelCost;
			} 	
		}
	}
}
