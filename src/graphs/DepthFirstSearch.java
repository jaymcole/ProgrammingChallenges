package graphs;

public class DepthFirstSearch {
	public static int Search(NodeGraph start, NodeGraph end) {
		if (start == end) {
			return start.value;
		}

		int minCost = -1;
		for(Edge edge : start.getEdges()) {
			NodeGraph nextNode = edge.getNode();
			int travelCost = edge.getCost() + start.value;
			
			if (travelCost < nextNode.value || nextNode.value == -1) {
				nextNode.value = travelCost;
				int cost = Search(nextNode, end);
				if (cost < minCost && cost >= 0 || minCost == -1)
					minCost = cost;
			} 			
		}
		return minCost;
	}
}
