package graphs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/*
There are n servers numbered from 0 to n-1 connected by undirected server-to-server connections forming a network where connections[i] = [a, b] represents a connection between servers a and b. Any server can reach any other server directly or indirectly through the network.

A critical connection is a connection that, if removed, will make some server unable to reach some other server.

Return all critical connections in the network in any order.

 

Example 1:



Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
Explanation: [[3,1]] is also accepted.
 

Constraints:

1 <= n <= 10^5
n-1 <= connections.length <= 10^5
connections[i][0] != connections[i][1]
There are no repeated connections.
 */

public class Tarjan {
	
	public class SCC {
		public LinkedList<Node> nodes;
		public LinkedList<Edge> departingEdges;
		
		public SCC () {
			nodes = new LinkedList<Node>();
			departingEdges = new LinkedList<Edge>();
		}
		
		public boolean contains(Node node) {
			return nodes.contains(node);
		}
		
		@Override
		public String toString() {
			String s = "-";
			
			for (Edge edge : departingEdges) {
				s += edge.toString() + " ";
			}

			return s;
			
		}
	}
	
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
			return "(" + ID + ", " + minLinkValue + ", " + visited + ")";
		}
		
	}
	
	public class Edge {
		public Node next;
		public int id1, id2;
		
		public Edge(Node next, int id1, int id2) {
			this.next = next;
			this.id1 = id1;
			this.id2 = id2;
		}
		
		@Override
		public String toString() {
			return "(" + id1 + ", " + id2 + ")";
		}
	}	
	
	private LinkedList<SCC> groups;
	private HashMap<Integer, SCC> sccMap;
	private Node[] knownNodes;
	private Stack<Node> stack;
	private int id = 0;
	
	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        System.out.println("Start0");

		sccMap = new HashMap<Integer, SCC>();
        stack = new Stack<Node>();
        groups = new LinkedList<SCC>();
        initNodes(n, connections);

        for (int i = 0; i < knownNodes.length; i++) {

        	if (!knownNodes[i].visited) {
        		search(knownNodes[i]);
				System.out.println("Search: " + "->" + knownNodes[i].ID);

        	}
        }
        System.out.println("Start1");

        for (List<Integer> connection : connections) {
        	Node node = knownNodes[connection.get(0)];
        	Node next = knownNodes[connection.get(1)];
        	SCC scc;
        	if (!sccMap.containsKey(node.minLinkValue)) {
        		scc = new SCC();
        		sccMap.put(node.minLinkValue, scc);
        		groups.add(scc);
        	} else {
        		scc = sccMap.get(node.minLinkValue);
        	}
        	
        
        	if (node.minLinkValue != next.minLinkValue) {
        		Edge edge = new Edge(next, connection.get(0), connection.get(1));
        		scc.departingEdges.add(edge);
        	}
        }
        System.out.println("Start2");

        
        List<List<Integer>> criticalConnections = new LinkedList<List<Integer>>();
        for(SCC scc : groups) {
        	if (scc.departingEdges.size() == 2) {
        		LinkedList<Integer> crit = new LinkedList<Integer>();
        		Edge edge = scc.departingEdges.get(0);
        		if (edge != null) {
        			crit.add(edge.id1);
        			crit.add(edge.id2);
        		}
        		criticalConnections.add(crit);
        	}
        }
        
        System.out.println("Start3");

        
        for (int i = 0 ; i < knownNodes.length; i++) {
        	System.out.println("[" + i + "]" + knownNodes[i].toString());
        	System.out.print("\t");
        	for (Edge edge : knownNodes[i].edges) {
        		System.out.print(edge.id2 + " ");
        	}
        	System.out.println();
        }
        
        
        return criticalConnections;
    }
	
	
	private Node search(Node node) {
		System.out.println("Stack: " + stack.toString());
		if (node == null)
			return null;
		
		node.visited = true;
		node.ID = id;
		node.minLinkValue = id;
		id++;
		stack.push(node);
		
		Iterator<Edge> it = node.edges.iterator();
		while (it.hasNext()) {

			Edge edge = it.next();
			Node nextNode = edge.next;
				
			if (!nextNode.visited) {
				search(nextNode);
			}
			
			if (stack.contains(nextNode) && nextNode.minLinkValue < node.minLinkValue)
				node.minLinkValue = nextNode.minLinkValue;
		}
		
//		while (stack.peek().minLinkValue)
		if (node.ID == node.minLinkValue) {
			// pop and add stack items above this one to a new scc group
			while (stack.peek().ID != stack.peek().minLinkValue) {
				
				Node stackNode = stack.pop();
				stackNode.minLinkValue = node.minLinkValue;
			}
			stack.pop();
			
		}
		return node;
	}

	private void initNodes(int n, List<List<Integer>> connections) {

		knownNodes = new Node[n];
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
		}
	}


}



