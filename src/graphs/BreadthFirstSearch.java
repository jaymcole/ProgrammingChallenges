package graphs;

import java.util.LinkedList;

public class BreadthFirstSearch {
	
	public static int Search(NodeGraph start, NodeGraph end) {
		
		LinkedList<NodeGraph> nodes = new LinkedList<NodeGraph>();
		processNode(nodes, start);
		
		
		int minCost = -1;
		while (!nodes.isEmpty()) {
			NodeGraph node = nodes.getFirst();
			processNode(nodes, node);
			if (node == end && (minCost == -1 || minCost < end.value))
				minCost = end.value;
			nodes.removeFirst();
		}
		return minCost;
	}
	
	private static void processNode(LinkedList<NodeGraph> nodes, NodeGraph start) {
		for (Edge edge : start.getEdges()) {	
			NodeGraph nextNode = edge.getNode();
			int travelCost = edge.getCost() + start.value;
			if (travelCost < nextNode.value || nextNode.value == -1) {
				nodes.add(nextNode);
				nextNode.value = travelCost;
			} 	
		}
	}
}
