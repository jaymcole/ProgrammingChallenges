package arrays;

import java.util.HashMap;

public class TwoSum {
	
	/***
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * 
	 * Unsorted input array
	 * 
	 * Brute force approach. 
	 * 	Iterate through nums.
	 *		Store the first possible option.
	 *	(Nested) Iterate through nums again, starting one position after the parent for loop's current position.
	 *		Store second possible option.
	 *
	 *	Check if current set adds up to target.
	 *	if it does, return current set.
	 *	else, continue looping.
	 *
	 * 
	 * @param nums - An array containing a combo that equals target
	 * @param target - The number our combonation needs to sum to.
	 * @return an array with the indices for two numbers in num that sum to target
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		
		for (int i = 0 ; i < nums.length; i++) {
			answer[0] = i;
			for (int j = i+1; j < nums.length; j++) {
				answer[1] = j;
				
				if (nums[i] + nums[j] == target)
					return answer;
			}
		}
		return answer;
    }
	
	
	/**
	 * O(n) approach.
	 * Iterate through the list only once.
	 * 	Store each element in a hashtable (value, index).
	 * 	Check if hashtable contains solution pair.
	 * 
	 * @param nums - An array containing a combo that equals target
	 * @param target - The number our combonation needs to sum to.
	 * @return an array with the indices for two numbers in num that sum to target
	 */
	public static int[] twoSum_nTime(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int solutionPair;
		for (int i = 0 ; i < nums.length; i++) {
			solutionPair = target - nums[i];
			
			if (map.containsKey(solutionPair)) {
				return new int[] {map.get(solutionPair), i};
			}
			map.put(nums[i], i);	
			
		}
		return null;
	}
	
}
