package leetcode_Hard;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CriticalConnectionsInANetwork {
	public class Node {
		public LinkedList<Edge> edges;
		public boolean visited;
		public int ID;
		public int minLinkValue;
		
		public Node() {
			edges = new LinkedList<Edge>();
			ID = -1;
			minLinkValue = -1;
			visited = false;
		}
		
		@Override
		public String toString() {
			return "(" + ID + "," + minLinkValue + ")";
		}
		
	}
	
	public class Edge {
		public Node next;
		public int id1, id2;
		LinkedList<Integer> connection;

		
		public Edge(Node next, int id1, int id2) {
			this.next = next;
			this.id1 = id1;
			this.id2 = id2;
			this.connection = new LinkedList<>();
			connection.add(id1);
			connection.add(id2);
		}
		
		@Override
		public String toString() {
			return "(" + id1 + ", " + id2 + ")";
		}
	}
	
	private Node[] initNodes(int n, List<List<Integer>> connections) {

		Node[] knownNodes = new Node[n];
		for (int i = 0 ; i < n; i++) {
			knownNodes[i] = new Node();
		}
		
		Iterator<List<Integer>> it = connections.iterator();
		int start;
		int end;
		List<Integer> tempList;
		while (it.hasNext()) {
			tempList = it.next();
			start = tempList.get(0);
			end = tempList.get(1);		
			
			knownNodes[start].edges.add(new Edge(knownNodes[end], start, end));
			knownNodes[end].edges.add(new Edge(knownNodes[start], end, start));
		}
		return knownNodes;
	}
	
	private int id = 0;
	
	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		LinkedList<List<Integer>> criticalConnections = new LinkedList<List<Integer>>();
		Node[] knownNodes = initNodes(n, connections);
        
        for (Node node : knownNodes) {
        	if(!node.visited)
        		dfs(node, null, criticalConnections);
        }
        
		return criticalConnections;
	}
	

	private void dfs(Node at, Node previousNode, LinkedList<List<Integer>> criticalConnections) {
		at.visited = true;
		at.ID = id;
		at.minLinkValue = id;
		id++;
		
		for (Edge to : at.edges) {
			// Changing graph from undirected to directed.
			if (to.next != previousNode) {

				if (!to.next.visited) {
					dfs(to.next, at, criticalConnections);
					at.minLinkValue = Math.min(at.minLinkValue, to.next.minLinkValue);
					
					if (at.ID < to.next.minLinkValue) {
						criticalConnections.add(to.connection);
					}
				}else {
					at.minLinkValue = Math.min(at.minLinkValue, to.next.ID);
				}
			}
		}
	}
}