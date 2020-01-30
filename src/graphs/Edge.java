package graphs;

public class Edge {
	
	private Node node;
	private int cost;
	
	public Edge(Node n, int cost) {
		node = n;
		this.cost = cost;
	}
	
	public Node getNode() {
		return node;
	}
	
	public int getCost() {
		return cost;
	}
}
