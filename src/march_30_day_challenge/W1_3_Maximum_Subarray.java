package march_30_day_challenge;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class W1_3_Maximum_Subarray {
	public int maxSubArray(int[] nums) {
		if (nums == null)
			return 0;
		
        int max = Integer.MIN_VALUE;
        int runningCurrent =  Integer.MIN_VALUE;
        boolean foundPositive = false;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] >= 0)
        		foundPositive = true;
        	
        	if (foundPositive) {
        		runningCurrent = Math.max(0, runningCurrent);
        		runningCurrent += nums[i];
        	} else {
        		runningCurrent = Math.max(runningCurrent, nums[i]);
        	}
        	
        	max = Math.max(max, runningCurrent);
        }
		return max;
    }
	
	public static void main(String[] args) {
		W1_3_Maximum_Subarray driver = new W1_3_Maximum_Subarray();
		int answer = driver.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		System.out.println(answer);
	}
	
	@Test
	public void test_0 () {
		W1_3_Maximum_Subarray driver = new W1_3_Maximum_Subarray();
		assertEquals(6, driver.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		assertEquals(5, driver.maxSubArray(new int[] { 5,-4,1,-2,4,-10,-10,2,3 }));
	}
	
	
	@Test
	public void test_3() {
		W1_3_Maximum_Subarray driver = new W1_3_Maximum_Subarray();
		assertEquals(-1, driver.maxSubArray(new int[] {-1,-1,-1}));
		assertEquals(1, driver.maxSubArray(new int[] { -2, 1 }));
		assertEquals(-1, driver.maxSubArray(new int[] { -2, -1 }));
	}

	
	
	
	
	
	// Fastest solution
	public int maxSubArray2(int[] nums) {
        int left = 0;
        int right = 1;
        int max = nums[left];
        int sum = nums[left];
        
        if(nums.length == 1)
            return nums[0];
        
        while(right < nums.length && left < nums.length){
            if((sum + nums[right]) < nums[right]) {
                left = right;
                sum = nums[right];
                if(nums[right] > max){
                    max = nums[right];
                }
            }else{
                sum += nums[right];
                if(sum > max){
                    max = sum;
                }
            }
            right ++;
        }
        
            return max;

    }
	
	// Same time as mine
	// Improvements:
	//	1. Uses no additional space.
	//	2. Avoid extra boolean buy assigning maxSum to start value.
	//	3. Overall much better/cleaner
	public int maxSubArray3(int[] nums) {
        int maxSum = nums[0];
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i-1] > 0) {
    			nums[i] += nums[i-1];
    		}
    		maxSum = Math.max(maxSum, nums[i]);
    	}
    	return maxSum;
    }
}
