package march_30_day_challenge;

import java.util.Arrays;
import java.util.HashMap;

/**
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/

public class W1_1_Single_Number {

	public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> discovered = new HashMap<Integer, Integer>();
        int uniqueNumber = 0;
        for (Integer i : nums) {
        	if (discovered.containsKey(i)) {
        		uniqueNumber -= i;
        	} else {
        		discovered.put(i, 0);
        		uniqueNumber += i;
        	}
        }

        return uniqueNumber;
        
    }
	
	
	// Faster solutions (not mine)
	public int singleNumber1(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
	    
	    int n = nums.length;
	    int ans = 0;
	    for(int i=0; i<n; i++) {
	        ans ^= nums[i];
	        System.out.println(ans);
	    }
	    
	    return ans;
    }
	
	public int singleNumber2(int[] nums) {
		int b = 0;
		for (int i = 0; i < nums.length; i++) {
			b = ~b & nums[i] | b & ~nums[i];
		}
		return b;
	}
	
	public int singleNumber3(int[] nums) {
        return Arrays.stream(nums).reduce(0, (acc, x) -> acc ^ x);
    }
	
	
}
