package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

public class W4_7_Find_Unqiue_Number {
	
	public W4_7_Find_Unqiue_Number() {}
	
	/**
	 * Too few submissions to get metrics. :( 
	 * https://leetcode.com/submissions/detail/331380518/?from=/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3313/
	 */
	
	private LinkedList<Integer> nums;
	private HashMap<Integer, Integer> count;
	
	public void FirstUnique(int[] nums) {
		
		this.nums = new LinkedList<Integer>();
		count = new HashMap<Integer, Integer>();

		if (nums == null || nums.length == 0)
			return;
		
		for (int i = 0; i < nums.length; i++) {
			add(nums[i]);
		}
    }
    
    public int showFirstUnique() {
    	while (!nums.isEmpty() && count.get(nums.getFirst()) > 0) {
    		count.put(nums.removeFirst(), 0);
    	}

    	if (nums.isEmpty())
    		return -1;
		return nums.getFirst();
		
    }
    
    public void add(int value) {
        if (!count.containsKey(value)) {
        	count.put(value, 0);
        	nums.addLast(value);
        } else {
        	count.put(value, 1);
        }
    }
    
    /**
     * Your FirstUnique object will be instantiated and called as such:
     * FirstUnique obj = new FirstUnique(nums);
     * int param_1 = obj.showFirstUnique();
     * obj.add(value);
     */
    
    
    @Test
    public void Test_Given_01() {
    	W4_7_Find_Unqiue_Number firstUnique = new W4_7_Find_Unqiue_Number();
    	firstUnique.FirstUnique(new int[] {7,7,7,7,7,7});
    	assertEquals(-1, firstUnique.showFirstUnique());
    	firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
    	firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
    	firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
    	firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
    	firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
    	assertEquals(17, firstUnique.showFirstUnique());
    }
    
    @Test
    public void Test_Given_02() {
    	W4_7_Find_Unqiue_Number firstUnique = new W4_7_Find_Unqiue_Number();
    	firstUnique.FirstUnique(new int[] {2,3,5});
    	assertEquals(2, firstUnique.showFirstUnique());
    	firstUnique.add(5);            // the queue is now [2,3,5,5]
    	assertEquals(2, firstUnique.showFirstUnique());
    	firstUnique.add(2);            // the queue is now [2,3,5,5,2]
    	assertEquals(3, firstUnique.showFirstUnique());
    	firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
    	firstUnique.showFirstUnique(); // return -1
    	assertEquals(-1, firstUnique.showFirstUnique());
    }
    
    
}
