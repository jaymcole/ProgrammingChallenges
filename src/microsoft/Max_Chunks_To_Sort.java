package microsoft;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import utils.PrintToString;
//https://leetcode.com/discuss/interview-question/524146/
public class Max_Chunks_To_Sort {

	// My solution does not work.
	// Problems like this are shit because the best solution I've found so far includes sorting the given array.
	public int CountSlices(int[] array) {
		int maxOfLastSlice = 0;
		int sliceCount = 0;
		maxOfLastSlice = array[0];
		int prevValue = maxOfLastSlice;
		for (int i = 0; i < array.length - 1; i++) {
			if (prevValue < array[i] ) {
				maxOfLastSlice = prevValue; 
				sliceCount++;
			}
			prevValue = array[i];
		}

		return sliceCount;
	}
	
	public int CountSlices2(int[] nums) {
		int sliceCount = 0, copySum = 0, oriSum = 0;
		int[] copy = Arrays.copyOf(nums, nums.length);
		Arrays.sort(copy);
		for(int i=0;i<nums.length;i++) {
			copySum += copy[i];
			oriSum += nums[i];
			if(copySum == oriSum)
				sliceCount++;
		}
		System.out.println(PrintToString.IntArrayToString(nums));
		System.out.println(PrintToString.IntArrayToString(copy));
		System.out.println();
		return sliceCount;
	}

	/*
	 * 
	 * for (int i = 0; i < array.length-1; i++) { if (array[i+1] > maxOfLastSlice) {
	 * // start of new slice maxOfLastSlice = array[i+1]; sliceCount++; } }
	 */

	@Test
	public void given_0() {
		assertEquals(3, CountSlices2(new int[] { 2, 4, 1, 6, 5, 9, 7 }));
	}
	
	@Test
	public void given_1() {
		assertEquals(1, CountSlices2(new int[] { 4, 3, 2, 6, 1 }));
	}
	
	@Test
	public void given_2() {
		assertEquals(3, CountSlices2(new int[] { 2, 1, 6, 4, 3, 7 }));
	}
	
	
}
