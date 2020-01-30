package graphs;

public class GraphUtils {
	public static void AddEdges(Node n1, int cost, Node n2) {
		n1.AddEdge(new Edge(n2, cost));
		n2.AddEdge(new Edge(n1, cost));
	}
	
	public static Node[] GetGraph1() {
		Node[] nodes = new Node[] {
				new Node(-1), // 0
				new Node(-1), // 1
				new Node(-1), // 2
				new Node(-1), // 3
				new Node(-1), // 4
				new Node(-1), // 5
				new Node(-1), // 6
				new Node(-1), // 7
				new Node(-1), // 8
				new Node(-1), // 9
				new Node(-1), // 10
				new Node(-1), // 11
				new Node(-1), // 12
				new Node(-1), // 13
				new Node(-1), // 14
				new Node(-1), // 15
		};
		
		
		AddEdges(nodes[0], 2, nodes[1]);
		AddEdges(nodes[0], 3, nodes[2]);		
		AddEdges(nodes[0], 5, nodes[14]);
		AddEdges(nodes[1], 4, nodes[4]);
		AddEdges(nodes[1], 3, nodes[10]);	
		AddEdges(nodes[2], 4, nodes[3]);
		AddEdges(nodes[2], 5, nodes[6]);	
		AddEdges(nodes[2], 3, nodes[7]);	
		AddEdges(nodes[3], 3, nodes[4]);
		AddEdges(nodes[3], 7, nodes[5]);
		AddEdges(nodes[3], 2, nodes[7]);
		AddEdges(nodes[4], 4, nodes[9]);	
		AddEdges(nodes[4], 1, nodes[11]);
		AddEdges(nodes[5], 1, nodes[7]);	
		AddEdges(nodes[6], 1, nodes[7]);
		AddEdges(nodes[7], 4, nodes[8]);
		AddEdges(nodes[8], 2, nodes[9]);
		AddEdges(nodes[9], 3, nodes[15]);
		AddEdges(nodes[10], 1, nodes[11]);
		AddEdges(nodes[10], 1, nodes[13]);
		AddEdges(nodes[11], 1, nodes[12]);
		
		for (int i = 0 ; i < nodes.length; i++) {
			nodes[i].name = "" + i;
//			System.out.println("#" + nodes[i].name + " has " + nodes[i].getEdges().size() + " edges.");
		}

		return nodes;
	}
	
	public static void printGraph(Node[] nodes) {
		for(int i = 0; i < nodes.length; i++) {
			System.out.println("Node #" + i + ": " + nodes[i].value);
		}
	}
}
