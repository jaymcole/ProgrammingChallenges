package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import supportingClasses.Triple;
import utils.Print;
import utils.PrintToString;

public class MinimumCostForTicketsTest {

	
	
	
	private void PrintTest(String testName, int[] testArray, int expected, int actual, boolean logTest) {
		Print.PrintToConsole = logTest;
		Print.PrintString("Test "+testName+" \n" );
		Print.PrintString("    Give: " + PrintToString.IntArrayToString(testArray) +" \n" );
		Print.PrintString("Expected: " + expected +" \n" );
		Print.PrintString("  Actual: " + actual +" \n" );
		Print.PrintString(" \n" );

		Print.PrintToConsole = false;
	}
	
	private void Tester(String testName, int[] days, int[] costs, int expected, boolean logTest) {
		int actual = MinimumCostForTickets.mincostTickets(days, costs);
//		PrintTest(testName, testArray, expected, actual, logTest);
		assertEquals(expected, actual);
	}
	
	
	@Test
	void test_mincostTickets_1() {
		Tester("test_mincostTickets_1", new int[] {1}, new int[] {1, 6, 28}, 1, false);
	}
	
	@Test
	void test_mincostTickets_2() {
		Tester("test_mincostTickets_2", new int[] {1,2,3,4,5,6,7,8}, new int[] {1, 6, 30}, 7, false);
	}
	
	@Test
	void test_mincostTickets_3() {
		Tester("test_mincostTickets_3", new int[] {1,2,3,4,5,6,7,8,9,10,30,31}, new int[] {2,7,15}, 17,false);
	}
	
	
	
//	@Test
//	void test_mincostTickets_4() {
//		Tester("test_mincostTickets_4", new int[] {}, new int[] {3, 15, 64}, 79,false);
//	}
//	
//	
//	@Test
//	void test_mincostTickets_given_1() {
//		Tester("test_mincostTickets_given_1", new int[] {1,4,6,7,8,20}, new int[] {2,7,15}, 11,false);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	void test_sortCostsByValue_1() {
//		Tester("test_sortCostsByValue_1", new int[] {1, 7, 30}, new int[] {1, 7, 30}, false);
//	}
//	
//	@Test
//	void test_sortCostsByValue_2() {
//		Tester("test_sortCostsByValue_2", new int[] {30, 7, 1}, new int[] {30, 7, 1}, false);
//	}
//	
//	@Test
//	void test_sortCostsByValue_3() {
//		Tester("test_sortCostsByValue_3", new int[] {5, 5, 5}, new int[] {30, 7, 1}, false);
//	}
	
}
