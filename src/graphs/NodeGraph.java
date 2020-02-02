package graphs;

import java.util.LinkedList;

public class NodeGraph {
	public String name = "Missing";
	public int value;
	private LinkedList<Edge> edges;
	
	public NodeGraph (int value) {
		edges = new LinkedList<Edge>();
		this.value = value;
	}
	
	public LinkedList<Edge> getEdges() {
		return edges;
	}
	
	public void AddEdge(NodeGraph n, int cost) {
		AddEdge(new Edge(n, cost));
	}
	
	public void AddEdge(Edge e) {
		edges.add(e);
	}
}
