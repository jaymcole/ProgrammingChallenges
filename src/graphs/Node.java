package graphs;

import java.util.LinkedList;

public class Node {
	public String name = "Missing";
	public int value;
	private LinkedList<Edge> edges;
	
	public Node (int value) {
		edges = new LinkedList<Edge>();
		this.value = value;
	}
	
	public LinkedList<Edge> getEdges() {
		return edges;
	}
	
	public void AddEdge(Node n, int cost) {
		AddEdge(new Edge(n, cost));
	}
	
	public void AddEdge(Edge e) {
		edges.add(e);
	}
}
