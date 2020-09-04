package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import utils.Print;
import utils.PrintToString;

public class TrappingRainWaterTest {

	
	private static int heightMap_1_answer = 0;
	private static int[] heightMap_1 = new int[] {1,1,1,1,1,1};
	
	private static int heightMap_2_answer = 4;
	private static int[] heightMap_2 = new int[] {2,1,1,1,1,2};
	
	private static int heightMap_3_answer = 8;
	private static int[] heightMap_3 = new int[] {3,1,1,1,1,3};
	
	private static int heightMap_4_answer = 6;
	private static int[] heightMap_4 = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
	
	
	private static int heightMap_5_answer = 15;
	private static int[] heightMap_5 = new int[] {2,9,3,6,4,8,7,1,5};
	
	private static int heightMap_6_answer = 2;
	private static int[] heightMap_6 = new int[] {2,0,2};
	
	
	private void PrintTest(String testName, int[] testArray, int expected, int actual, boolean logTest) {
		Print.PrintToConsole = logTest;
		Print.PrintString("Test "+testName+" \n" );
		Print.PrintString("    Give: " + PrintToString.IntArrayToString(testArray) +" \n" );
		Print.PrintString("Expected: " + expected +" \n" );
		Print.PrintString("  Actual: " + actual +" \n" );
		Print.PrintString(" \n" );

		Print.PrintToConsole = false;
	}
	
	private void Tester(String testName, int[] testArray, int expected, boolean logTest) {
		int actual = TrappingRainWater.trap(testArray);
		PrintTest(testName, testArray, expected, actual, logTest);
		assertEquals(expected, actual);
	}
	
	@Test
	void test_1() {
		Tester("test_1", heightMap_1, heightMap_1_answer, false);
	}
	
	@Test
	void test_2() {
		Tester("test_2", heightMap_2, heightMap_2_answer, false);
	}
	@Test
	void test_3() {
		Tester("test_3", heightMap_3, heightMap_3_answer, false);
	}
	@Test
	void test_4() {
		Tester("test_4", heightMap_4, heightMap_4_answer, false);
	}
	@Test
	void test_5() {
		Tester("test_5", heightMap_5, heightMap_5_answer, true);
	}
	
	@Test
	void test_6() {
		Print.PrintToConsole = true;
		Tester("test_6", heightMap_6, heightMap_6_answer, true);
		Print.PrintToConsole = false;

	}
	
}
