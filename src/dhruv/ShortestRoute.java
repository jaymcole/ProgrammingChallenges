package dhruv;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class ShortestRoute {

	public String[] getPath(Map<String, String[]> graph, String startNode, String endNode) {

		LinkedList<String> list = new LinkedList<String>();
		bfs(graph, startNode, endNode, list);
		
		String[] f = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			f[i] = list.get(i);
		}
		
		
		return f;
	}

	private boolean allDone = false;

	public void bfs(Map<String, String[]> graph, String startNode, String endNode,
			LinkedList<String> finalList) {

		HashMap<String, String> path = new HashMap<String, String>();
		Stack<String> queue = new Stack<String>();
		queue.push(startNode);

		while (!queue.isEmpty()) {
			String next = queue.pop();
				
			if (next.compareTo(endNode) == 0)
				break;
			
			for (String nodeToAdd : graph.get(next)) {
				if(!path.containsKey(nodeToAdd)) {
					path.put(nodeToAdd, next);
					queue.add(nodeToAdd);
				}
			}

		}
		
		
		if (path.containsKey(endNode)) {
			String nextNode = endNode;
			while (nextNode != null) {
				finalList.add(nextNode);
				nextNode = path.get(nextNode);
				
			}
			
		}
		
	}

	
	
		


    @Test
    public void twoHopPath2Test() {
        final String[] expected = {"d", "a", "c"};
        final String[] actual = getPath(getNetwork(), "d", "c");
        assertNotNull(actual);
        assertArrayEquals(expected, actual);
        
    }

    @Test
    public void oneHopPath1Test() {
        final String[] expected = {"a", "c"};
        final String[] actual = getPath(getNetwork(), "a", "c");
        assertNotNull(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneHopPath2Test() {
        final String[] expected = {"f", "g"};
        final String[] actual = getPath(getNetwork(), "f", "g");
        assertNotNull(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneHopPath3Test() {
        final String[] expected = {"g", "f"};
        final String[] actual = getPath(getNetwork(), "g", "f");
        assertNotNull(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void zeroHopPath() {
        final String[] expected = {"a"};
        final String[] actual = getPath(getNetwork(), "a", "a");
        assertNotNull(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void noPathTest() {
        final String[] actual = getPath(getNetwork(), "a", "f");
        assertNull(actual);
    }

    @Test(expected = Exception.class)
    public void startNodeNotPresentTest() {
        getPath(getNetwork(), "h", "a");
    }

    @Test(expected = Exception.class)
    public void endNodeNotPresentTest() {
        getPath(getNetwork(), "a", "h");
    }

    private static Map<String, String[]> getNetwork() {
        return new HashMap<String, String[]>() { {
            put("a", new String[] {"b", "c", "d"});
            put("b", new String[] {"a", "d"});
            put("c", new String[] {"a", "e"});
            put("d", new String[] {"a", "b"});
            put("e", new String[] {"c"});
            put("f", new String[] {"g"});
            put("g", new String[] {"f"});
        }};
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ShortestRoute.class);
        for (org.junit.runner.notification.Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
	
	
}
