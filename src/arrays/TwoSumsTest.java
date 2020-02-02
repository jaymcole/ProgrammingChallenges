package arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import utils.Print;
import utils.PrintToString;

public class TwoSumsTest {

	
	
	private static int[] answer_1 = new int[] {1,4};
	private static int[]  array_1 = new int[] {67,62,55,24,19};
	private static int target_1 = 81;
	
	private static int[] answer_2 = new int[] {0,1};
	private static int[]  array_2 = new int[] {1,2,3,4}; 
	private static int target_2 = 3;
	
	private static int[] answer_3 = new int[] {2, 3};
	private static int[]  array_3 = new int[] {55,2,7,4}; 
	private static int target_3 = 11;
	
	
	private void PrintTest(String testName, int[] expected, int target, int[] testArray, int[] actual, boolean logTest) {
		Print.PrintToConsole = logTest;
		Print.PrintString("Test "+testName+" \n" );
		Print.PrintString("   Given: " + PrintToString.IntArrayToString(testArray) + "\n");
		Print.PrintString("  Target: " + target + "\n");
		Print.PrintString("Expected: " + PrintToString.IntArrayToString(expected) + "\n");
		Print.PrintString("  Actual: " + PrintToString.IntArrayToString(actual) + "\n\n");
		Print.PrintString("     Sum: " + (testArray[actual[0]] + testArray[actual[1]]) + "\n");
		Print.PrintToConsole = false;
	}
	
	private void Tester_twoSum(String testName, int[] expected, int target, int[] testArray, boolean logTest) {		
		int[] actual = TwoSum.twoSum(testArray, target);
		PrintTest(testName, expected, target, testArray, actual, logTest);
		assertArrayEquals(expected, actual);
	}
	
	private void Tester_twoSum_nTime(String testName, int[] expected, int target, int[] testArray, boolean logTest) {		
		int[] actual = TwoSum.twoSum_nTime(testArray, target);
		PrintTest(testName, expected, target, testArray, actual, logTest);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void test_1_twoSum() {
		Tester_twoSum("test_1_twoSum", answer_1, target_1, array_1, false);
	}
	
	@Test
	void test_2_twoSum() {
		Tester_twoSum("test_2_twoSum", answer_2, target_2, array_2, false);
	}
	
	@Test
	void test_3_twoSum() {
		Tester_twoSum("test_3_twoSum", answer_3, target_3, array_3, false);
	}
	
	@Test
	void test_1_twoSum_nTime() {
		Tester_twoSum_nTime("test_1_twoSum_nTime", answer_1, target_1, array_1, true);
	}
	
	@Test
	void test_2_twoSum_nTime() {
		Tester_twoSum_nTime("test_2_twoSum_nTime", answer_2, target_2, array_2, true);
	}
	
	@Test
	void test_3_twoSum_nTime() {
		Tester_twoSum_nTime("test_3_twoSum_nTime", answer_3, target_3, array_3, true);
	}
	
}
