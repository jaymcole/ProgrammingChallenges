package leetcode_Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CriticalConnectionsInANetwork2 {

	// keeps track of visited nodes
	private boolean[] visited;
	
	// Unique ID give upon visiting
	private int[] id;
	
	// Initially, all nodes start in their own group. 
	// Nodes will be grouped as the graph is traversed.
	// Difference in groupValue between nodes indicates bridges/critical connections.
	private int[] groupValue;
	
	// Unique ID, incremented as new nodes are explored.
	private int globalID = 0;
	
	// Edges/connections between nodes
	private ArrayList<LinkedList<Integer>> connections;
	
	/**
	 * Find the bridges of a graph constructed from n and connections.
	 * 
	 * @param n - The number of nodes in the graph.
	 * @param connections - A list of connections describing a graph.
	 * @return List<List<Integer>> describing the bridges/critical connections of a graph created from connections.
	 */
	public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		
		// Final list of critical connections to be returned.
		LinkedList<List<Integer>> criticalConnections = new LinkedList<List<Integer>>();

		init(n, connections);

		for (int i = 0; i < n; i++) {	
        	if(!visited[i])
        		findCriticalConnections(i, -1, criticalConnections);
        }
        
		return criticalConnections;
	}
	
	/**
	 * Initializes/zeroes required arrays/lists.
	 * 
	 * @param nodeCount - number of nodes in the graph
	 * @param cons - list of directed connections between nodes
	 * Connections are duplicated and reversed to create an undirected graph.
	 */
	private void init(int nodeCount, List<List<Integer>> cons) {
		visited = new boolean[nodeCount];
		id = new int[nodeCount];
		groupValue = new int[nodeCount];
		
		// Fills connections with empty lists.
		connections = new ArrayList<LinkedList<Integer>>();
		for (int i = 0; i < nodeCount; i++) {
			connections.add(new LinkedList<Integer>());
		}
		
		// Generates undirected graph edges.
		for(List<Integer> connection : cons) {
			connections.get(connection.get(0)).add(connection.get(1));
			connections.get(connection.get(1)).add(connection.get(0));
		}
		
	}
	
	/**
	 * Explores a graph starting at current.
	 * Uses DFS to explore.
	 * @param current - The node to start exploring at.
	 * @param parent - The previous node in the DFS search (if applicable). Providing <0 integer means there was no previous node.
	 * @param criticalConnections - A list to populate with the bridges/critical connections in a graph. 
	 */
	private void findCriticalConnections(int current, int parent, LinkedList<List<Integer>> criticalConnections ) {
		// discover node
		visited[current] = true;
		id[current] = globalID;
		groupValue[current] = globalID;
		globalID++;
		
		// Iterate over node edges
		for (int next : connections.get(current)) {
			// Do explore backwards
			if (next != parent) {
				// Reaching a visited node without traveling backwards means we've found a cycle.
				// Update the current lowLinkValue if the next (visited) node has been visited and has a lower ID.
				if (visited[next]) {
					groupValue[current] = Math.min(groupValue[current], id[next]);
				} else {
					// Continue DFS for unvisited nodes
					findCriticalConnections(next, current, criticalConnections);
					groupValue[current] = Math.min(groupValue[current], groupValue[next]);
					
					// if current ID is less than lowLinkValue of next, then DFS returned before finding a cycle meaning we have a bridge/critical connection.
					if (id[current] < groupValue[next]) {
						criticalConnections.add(getConnection(current, next));
					}
				}
			}
		}
	}

	/**
	 * Convenience method for creating a 'connection'
	 * @param p1 - The start node of a connection
	 * @param p2 - The end node of a connection
	 * @return - A list of two nodes.
	 */
	private List<Integer> getConnection(int p1, int p2) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(p1);
		list.add(p2);
		return list;
	}
}


































/*
private void explore(int at, int previousNode, LinkedList<List<Integer>> criticalConnections) {
		visited[at] = true;
		id[at] = globalID;
		lowLinkValue[at] = globalID;
		globalID++;
		
		for (int to : connections.get(at)) {
			// Changing graph from undirected to directed.
			if (to != previousNode) {

				if (!visited[to]) {
					explore(to, at, criticalConnections);
					lowLinkValue[at] = Math.min(lowLinkValue[at], lowLinkValue[to]);
					
					if (id[at] < lowLinkValue[to]) {
						criticalConnections.add(getConnection(at, to));
					}
				}else {
					lowLinkValue[at] = Math.min(lowLinkValue[at], id[to]);
				}
			}
		}
	}
*/

