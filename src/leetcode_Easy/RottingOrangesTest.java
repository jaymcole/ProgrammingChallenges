package leetcode_Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import utils.Print;
import utils.PrintToString;

public class RottingOrangesTest {

	private static int orangeMap_1_answer = 0;
	private static int[][] orangeMap_1 = new int[][] {
		{0,0,0,0},
		{0,0,0,0},
		{0,0,0,0}};
		
	private static int orangeMap_2_answer = 5;
	private static int[][] orangeMap_2 = new int[][] {
		{2,1,0,0},
		{0,1,0,0},
		{0,1,1,1}};
		
	private static int orangeMap_3_answer = 1;
	private static int[][] orangeMap_3 = new int[][] {
		{2,1,0,0},
		{0,0,0,0},
		{0,0,0,0}};
		
	private static int orangeMap_4_answer = -1;
	private static int[][] orangeMap_4 = new int[][] {
		{2,1,0,0},
		{0,0,0,0},
		{0,0,0,1}};
		
	private static int orangeMap_5_answer = 4;
	private static int[][] orangeMap_5 = new int[][] {
		{2,1,1},
		{1,1,0},
		{0,1,1}};	
	
	private void PrintTest(String testName, int[][] testArray, int expected, int actual, boolean logTest) {
		Print.PrintToConsole = logTest;
		Print.PrintString("Test "+testName+" \n" );
//		Print.PrintString("    Give: " + PrintToString.IntArrayToString(testArray) +" \n" );
		Print.PrintString("Expected: " + expected +" \n" );
		Print.PrintString("  Actual: " + actual +" \n" );
		Print.PrintString(" \n" );

		Print.PrintToConsole = false;
	}
	
	private void Tester(String testName, int[][] testArray, int expected, boolean logTest) {
		int actual = RottingOranges.orangesRotting(testArray);
		PrintTest(testName, testArray, expected, actual, logTest);
		assertEquals(expected, actual);
	}
	
	@Test
	void test_1() {
		Tester("test_1", orangeMap_1, orangeMap_1_answer, false);
	}
	
	@Test
	void test_2() {
		Tester("test_2", orangeMap_2, orangeMap_2_answer, false);
	}
	
	@Test
	void test_3() {
		Tester("test_3", orangeMap_3, orangeMap_3_answer, false);
	}
	
	@Test
	void test_4() {
		Tester("test_4", orangeMap_4, orangeMap_4_answer, false);
	}
	
	@Test
	void test_5() {
		Tester("test_5", orangeMap_5, orangeMap_5_answer, true);
	}
}
