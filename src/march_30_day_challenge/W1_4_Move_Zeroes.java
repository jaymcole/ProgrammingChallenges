package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

public class W1_4_Move_Zeroes {

	public void moveZeroes(int[] nums) {
		int start, end;
		for (start = 0; start < nums.length; start++) {
			if (nums[start] == 0)
				break;
		}
		end = start + 1;

		for (end = start + 1; end < nums.length; end++) {
			if (nums[end] != 0) {
				swap(nums, start, end);
				start++;
			}
		}
	}

	private void swap(int[] nums, int p1, int p2) {
		int temp = nums[p1];
		nums[p1] = nums[p2];
		nums[p2] = temp;
	}

	@Test
	public void test_0() {
		int[] actual = new int[] { 0, 1, 0, 3, 12 };
		int[] expected = new int[] { 1, 3, 12, 0, 0 };
		moveZeroes(actual);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_1() {
		int[] actual = new int[] { 1, 2 };
		int[] expected = new int[] { 1, 2 };
		moveZeroes(actual);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_2() {
		int[] actual = new int[] { 0, 2 };
		int[] expected = new int[] { 2, 0 };
		moveZeroes(actual);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_3() {
		int[] actual = new int[] { 0, 0, 0, 0, 0, 0, 1 };
		int[] expected = new int[] { 1, 0, 0, 0, 0, 0, 0 };
		moveZeroes(actual);

		assertArrayEquals(expected, actual);
	}

	// Alternative Approach (same speed as my solution)
	public void moveZeroes2(int[] nums) {
		int nonzeroNumIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonzeroNumIndex] = nums[i];
				nonzeroNumIndex++;
			}
		}

		for (int i = nonzeroNumIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

}
