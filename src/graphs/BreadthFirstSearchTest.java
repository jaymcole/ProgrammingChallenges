package graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BreadthFirstSearchTest {

	private void runTest(int start, int end, int ExpectedAnswer) {
		Node[] nodes = GraphUtils.GetGraph1();
		Node startNode  = nodes[start];
		Node endNode = nodes[end];
		startNode.value = 0;
		int answer = BreadthFirstSearch.Search(startNode, endNode);
		GraphUtils.printGraph(nodes);		
		assertEquals(ExpectedAnswer, answer);
		System.out.println();
	}
	
	@Test
	void test_0to1() {
		int start = 0;
		int end = 1;
		int ExpectedAnswer = 2;
		runTest(start, end, ExpectedAnswer);
	}
	
	@Test
	void test_0to2() {
		int start = 0;
		int end = 2;
		int ExpectedAnswer = 3;
		runTest(start, end, ExpectedAnswer);
	}
	
	@Test
	void test_0to15() {
		int start = 0;
		int end = 15;
		int ExpectedAnswer = 13;
		runTest(start, end, ExpectedAnswer);
	}
	
	@Test
	void test_10to14() {
		int start = 10;
		int end = 14;
		int ExpectedAnswer = 10;
		runTest(start, end, ExpectedAnswer);
	}
}
