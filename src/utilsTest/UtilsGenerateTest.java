package utilsTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import utils.Generate;
import utils.PrintToString;


public class UtilsGenerateTest {
	
	private static int[] arr1 = new int[] {};
	private static int[] arr2 = new int[] {1};
	private static int[] arr3 = new int[] {1,2};
	private static int[] arr4 = new int[] {1,2,3,4};
	private static int[] arr5 = new int[] {1,2,3,4,5,6,7,8,9};
	
	@Test
	void GenerateNodeLinkedList_arr1() {
		int[] arr = arr1;
		assertEquals(
				PrintToString.IntArrayToString(arr), 
				PrintToString.NodeListToString(Generate.GenerateLinkedList(arr))
		);
	}
	
	@Test
	void GenerateNodeLinkedList_arr2() {
		int[] arr = arr2;
		assertEquals(
				PrintToString.IntArrayToString(arr), 
				PrintToString.NodeListToString(Generate.GenerateLinkedList(arr))
		);
	}
	
	@Test
	void GenerateNodeLinkedList_arr3() {
		int[] arr = arr3;
		assertEquals(
				PrintToString.IntArrayToString(arr), 
				PrintToString.NodeListToString(Generate.GenerateLinkedList(arr))
		);
	}
	
	@Test
	void GenerateNodeLinkedList_arr4() {
		int[] arr = arr4;
		assertEquals(
				PrintToString.IntArrayToString(arr), 
				PrintToString.NodeListToString(Generate.GenerateLinkedList(arr))
		);
	}
	
	@Test
	void GenerateNodeLinkedList_arr5() {
		int[] arr = arr5;
		assertEquals(
				PrintToString.IntArrayToString(arr), 
				PrintToString.NodeListToString(Generate.GenerateLinkedList(arr))
		);
	}
	
}
