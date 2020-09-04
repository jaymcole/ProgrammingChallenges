package leetcode_Hard;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import graphs.Tarjan;

public class CriticalConnectionsInANetworkTest {
	private void Tester(String testName, int n, List<List<Integer>> connections, List<List<Integer>> expected, boolean logTest) {
		CriticalConnectionsInANetwork test = new CriticalConnectionsInANetwork();

		List<List<Integer>> actual = test.criticalConnections(n, connections);
		assertTrue(test(actual, expected));
	}
	
	private boolean test(List<List<Integer>> connections, List<List<Integer>> expected) {
		HashMap<String, Integer> answerMap = new HashMap<String, Integer>();
		for (List<Integer> list : expected) {
			answerMap.put(list.get(0) + "," + list.get(1), 0);
			answerMap.put(list.get(1) + "," + list.get(0), 0);
		}
		System.out.println("\n\n");
		for (List<Integer> list : connections) {
			String answer = list.get(0) + "," + list.get(1);
			System.out.println(answer);
			if (!answerMap.containsKey(answer))
				return false;
		}
		return true;
	}
	
	private List<List<Integer>> getList(int[][] connections) {
		List<List<Integer>> returnData = new LinkedList<List<Integer>>();

		for (int i = 0 ; i < connections.length; i++) {
			LinkedList<Integer> something = new LinkedList<Integer>();
			for (int j = 0; j < connections[i].length; j++) {
				something.add(connections[i][j]);
			}
			returnData.add(something);
		}
		return returnData;
	}
	
//	@Test
//	void test_mincostTickets_1() {
//		Tester("test_mincostTickets_1", 4, getList(new int[][] {{0,1},{1,2},{2,0},{1,3}}), getList(new int[][]{{1,3}}), false);
//	}
//	
//	@Test
//	void test_mincostTickets_2() {
//		Tester("test_mincostTickets_2", 6, getList(new int[][] {{0,1},{1,2},{2,0},{1,3},{3,4},{4,5},{5,3}}), getList(new int[][]{{1,3}}), false);
//	}
	
	@Test
	void test_mincostTickets_3() {
		Tester("test_mincostTickets_3", 11, getList(new int[][] {{2,3},{2,4},{3,4},{2,5},{6,5},{0,1},{1,7},{1,2},{7,8},{8,1},{8,0}}), getList(new int[][]{{1,3}}), false);
	}
	
	
	
}
