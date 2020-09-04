package leetcode;

import utils.Print;
import utils.PrintToString;

public class TrappingRainWater {

	/**
	 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
	 * @param height
	 * @return
	 * 
	 * 
	 * Brute force approach.
	 * 	- Loop through height to find the tallest peak
	 * 	- create a new 2D array (height.length x tallest peak)
	 * 	- Loop through each row 
	 * 		- Start a pointer at each side and move both inward until they meet.
	 * 		- If both pointers hit a block, start incrementing water for non-block tiles
	 */
	public static int trap(int[] height) {
        
		int highestPeak = 0;
		for (int i = 0 ; i < height.length; i++)
		{
			if (height[i] > highestPeak)
				highestPeak = height[i];
		}
		
		int water = 0;
		for (int curHeight = 0; curHeight <= highestPeak; curHeight++) {
			int left = 0, right = height.length-1;
			boolean leftHit = false, rightHit = false;
			
			while (left < right) {				
				if (height[left] >= curHeight) {
					leftHit = true;
				} else if (leftHit && rightHit) {
					water++;
				}
				
				if (height[right] >= curHeight) {
					rightHit = true;

				} else if (leftHit && rightHit) {
					water++;
				}
				
				if (!leftHit && !rightHit) {
					right--;
					left++;
				} 
				else if (leftHit) 
					right--;
				else if (rightHit)
					left++;
			}
			
		}
		return water;
    }
	
	
	public static int trap2(int[] height) {
		int water = 0;
		
		return water;
    }
}
