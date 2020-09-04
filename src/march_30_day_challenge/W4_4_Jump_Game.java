package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class W4_4_Jump_Game {
	
	/**
	 * Beats 98.64% of java submissions
	 */
	
	public boolean canJump(int[] nums) {
		boolean ZeroFound = false;
		int minRequired = 1;
		for (int i = nums.length-2; i >= 0; i--) {
			
			if (nums[i] == 0) {
				if (!ZeroFound)
					minRequired = 1;
				ZeroFound = true;
			}
			
			if (ZeroFound) {
				if (nums[i] >= minRequired) {
					ZeroFound = false;
				} else {
					minRequired++;
				}
			}
			
		}
		return !ZeroFound;
    }
	
	@Test
	public void Test_Given_True() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {2,3,1,1,4});
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_False() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {3,2,1,0,4});
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_Given_False_2() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {2,0,0});
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_Empty_Array() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {});
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_No_Zeroes() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {1,2,3,4,5,6,7,8,9});
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_Lots_Of_Zeroes() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {0,0,0,0,0,0,0,0});
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_Given_Lots_Of_Zeroes_2() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {1,0,0,0,0,0,0,0});
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_Given_Lots_Of_Zeroes_3() {
		W4_4_Jump_Game jump = new W4_4_Jump_Game();
		boolean actual = jump.canJump(new int[] {8,0,0,0,0,0,0,0});
		assertEquals(true, actual);
	}
	
	
	
	
	/**
	 * Alternative solution (not mine)
	 * 
	 * Definitely a lot cleaner
	 */
	
	public boolean canJump2(int[] nums) {
        int targetIndex = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--) {
            if(targetIndex - i <= nums[i]) {
                targetIndex = i;
            }
        }
        
        return targetIndex == 0;
        
        
//         if(nums.length == 1) return true;
        
//         int targetIndex = nums.length-1;
//         boolean found = false;
        
//         Set<Integer> visited = new HashSet<>();
//         Stack<Pair<Integer, Integer>> s = new Stack<>(); // pair of index, distance
//         s.push(new Pair(0, 0));
        
//         while(!s.empty() && !found) {
//             Pair p = s.pop();
//             visited.add((int)p.getKey());
//             int index = (int)p.getKey();
//             int distance = (int)p.getValue();
//             if(index == targetIndex) {
//                 found = true;
//                 break;
//             }
//             for(int i = 1; i <= nums[index]; i++) {
//                 if(index+i <= targetIndex && !visited.contains(index+i)) {
        // should have simply used below if condition for optimal sol.
//                     if(nums[index + i] !=0 && nums[index + i] == targetIndex - index - i) {
//                         found = true;
//                         break;
//                     }
//                     s.push(new Pair(index + i, i));
//                 }
//             }
//         }
        
//         return found;
    }
	
}
