package misc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

import supportingClasses.Pair;

public class NQueens {


	
	public boolean PlaceNQueens(int n) {
		if (n < 0)
			return false;
		if (n == 0)
			return true;
		
		LinkedList<Pair<Integer, Integer>> queens = new LinkedList<Pair<Integer, Integer>>();
		
		
		boolean solutionFound = backtrack(queens, n, n, 0); 
		if (solutionFound)
			printSolution(queens, n);
		return solutionFound;
	}
	
	private void printSolution(LinkedList<Pair<Integer, Integer>> queens, int n) {
		char[][] board = new char[n][n];

		for (Pair<Integer, Integer> q : queens) {
			board[q.value1][q.value2] = 'X';
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 'X') {
					System.out.print("X");					
				} else {
					System.out.print("o");
				}
			}
			System.out.println();
		}
		System.out.println();

		
	}
	
	public boolean backtrack(LinkedList<Pair<Integer, Integer>> placedQueens, int boardSize, int numberOfQueensToPlace, int index) {
		
		if (numberOfQueensToPlace == 0)
			return true;
		
		for (int i = index; i < boardSize*boardSize; i++) {
			Pair<Integer, Integer> coord = ConvertIndexToCoordinate(boardSize, i);
			if (CanPlace(placedQueens, coord)) {
				placedQueens.addFirst(coord);
				if (backtrack(placedQueens, boardSize, numberOfQueensToPlace-1, shiftColumn(boardSize, i)))
					return true;
				placedQueens.removeFirst();
			}
		}
		return false;
	}
	
	private int shiftColumn(int n, int index) {
		return (index-(index%n))+n;
	}
	
	private Pair<Integer, Integer> ConvertIndexToCoordinate(int boardSize, int index) {
		return new Pair<Integer, Integer>(index/boardSize, index%boardSize);
	}
	
	private boolean CanPlace(LinkedList<Pair<Integer, Integer>> placedQueens, Pair<Integer, Integer> queen) {
		
		for (Pair<Integer, Integer> pq : placedQueens) {
			if (pq.value2 == queen.value2 || pq.value1 == queen.value1)
				return false;
			
			float rise = (pq.value2 - queen.value2);
			float run = (pq.value1 - queen.value1);
			float slope = 0.0f;
			if (run == 0)
				slope = rise;
			else if (rise == 0)
				slope = run;
			else
				slope =  rise/run ;
			slope = Math.abs(slope);

//			System.out.println(slope);
			if ( slope == 0.0 || slope == 1.0)
				return false;
		}
				
		
		return true;	
	}
	
	
	private void test(int n, boolean expected) {
		long startTime = System.currentTimeMillis();
		
		System.out.println("Starting n="+n);
		
		boolean actual = PlaceNQueens(n);
		
		System.out.println("Completed in " + (System.currentTimeMillis()-startTime)/60 + " seconds.");
		
		
		if (expected)
			assertTrue(actual);
		else
			assertFalse(actual);

		
		
	}
	
	@Test
	public void test_Place_N_Queens_1() {
		test(1, true);
		test(2, false);
		test(3, false);
		test(4, true);
		test(5, true);
		test(6, true);
		test(7, true);
		test(8, true);
		test(9, true);
		test(10, true);
		test(11, true);
		test(12, true);
		test(13, true);
		test(14, true);
		test(15, true);
		test(16, true);
		test(17, true);
		test(18, true);
		test(19, true);
		test(20, true);
		test(21, true);
//		assertTrue(PlaceNQueens(1));
//		assertFalse(PlaceNQueens(2));
//		assertFalse(PlaceNQueens(3));
//		assertTrue(PlaceNQueens(4));
//		assertTrue(PlaceNQueens(5));
//		assertTrue(PlaceNQueens(6));
//		assertTrue(PlaceNQueens(7));
//		assertTrue(PlaceNQueens(8));
//		assertTrue(PlaceNQueens(9));
//		assertTrue(PlaceNQueens(10));
//		assertTrue(PlaceNQueens(11));
//		assertTrue(PlaceNQueens(12));
//		assertTrue(PlaceNQueens(13));
//		assertTrue(PlaceNQueens(14));
//		assertTrue(PlaceNQueens(15));
//		assertTrue(PlaceNQueens(16));
//		assertTrue(PlaceNQueens(17));
//		assertTrue(PlaceNQueens(18));
//		assertTrue(PlaceNQueens(19));
//		assertTrue(PlaceNQueens(20));
//		assertTrue(PlaceNQueens(21));
	}
	
	private boolean equal(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
		return p1.value1 == p2.value1 && p1.value2 == p2.value2;
	}
	
	@Test
	public void test_ConvertIndexToCoordinate_0() {
		assertTrue(equal(new Pair<Integer, Integer>(0,4), ConvertIndexToCoordinate(5, 4)));
		assertTrue(equal(new Pair<Integer, Integer>(3,0), ConvertIndexToCoordinate(5, 15)));		
	}
	
	
	@Test
	public void test_CanPlace_false() {
		LinkedList<Pair<Integer, Integer>> placedQueens = new LinkedList<Pair<Integer, Integer>>();
		
		placedQueens.add(new Pair<Integer, Integer>(1,1));
		
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(0,0)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(0,1)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(0,2)));
		
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(1,0)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(1,1)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(1,2)));
		
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(2,0)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(2,1)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(2,2)));
		
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(-1,-1)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(-1,3)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(3,3)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(3,-1)));

		
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(-1,1)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(5,1)));
		assertFalse(CanPlace(placedQueens, new Pair<Integer, Integer>(1,99)));
	}
	
	@Test
	public void test_CanPlace_true() {
		LinkedList<Pair<Integer, Integer>> placedQueens = new LinkedList<Pair<Integer, Integer>>();
		
		placedQueens.add(new Pair<Integer, Integer>(1,1));
		
		assertTrue(CanPlace(placedQueens, new Pair<Integer, Integer>(3,2)));
		assertTrue(CanPlace(placedQueens, new Pair<Integer, Integer>(2,3)));

		assertTrue(CanPlace(placedQueens, new Pair<Integer, Integer>(-1,2)));
		assertTrue(CanPlace(placedQueens, new Pair<Integer, Integer>(2,-1)));
		
	}
}
