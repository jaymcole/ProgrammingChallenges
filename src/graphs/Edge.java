package graphs;

public class Edge {
	
	private NodeGraph node;
	private int cost;
	
	public Edge(NodeGraph n, int cost) {
		node = n;
		this.cost = cost;
	}
	
	public NodeGraph getNode() {
		return node;
	}
	
	public int getCost() {
		return cost;
	}
}
