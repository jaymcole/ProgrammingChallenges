package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class W4_5_Longest_Common_Subsequences {

	
	/**
	 * Improvements:
	 * 
	 */
	
	public int LongestCommonSubsequence(String text1, String text2) {
		if (text1 == null || text1.length() == 0 || text2 == null || text2.length() == 0)
			return 0;
		
		char[] rows = text1.toCharArray();
		char[] cols = text2.toCharArray();
		int[][] grid = new int[rows.length][];
		
		System.out.print("   ");
		for (int i = 0; i < cols.length; i++) {
			printChar(cols[i] + "");
		}
		System.out.println();

		
		for (int row = 0; row < rows.length; row++) {
			grid[row] = new int[cols.length];
			printChar(rows[row] + "");
			for (int col = 0; col < cols.length; col++) {				
				if (GetGridValue(grid, row-1, col-1) == GetGridValue(grid, row-1, col) && rows[row] == cols[col]) {
					grid[row][col] = GetGridValue(grid, row-1, col) + 1;
				} else {
					grid[row][col] = Math.max(GetGridValue(grid, row-1, col), GetGridValue(grid, row, col-1));
				}
				printChar(grid[row][col]+"");
			}
			System.out.println();
		}
		System.out.println();
        return grid[rows.length-1][cols.length-1];
    }
	
	private int GetGridValue(int[][] grid, int row, int col) {
		if (row < 0 || row >= grid.length)
			return 0;
		if (col < 0 || col >= grid[row].length)
			return 0;
		return grid[row][col];
	}
	
	private void printChar(String c) {
		System.out.print(String.format("%1$3s", c));
	}
	
	
	
	private void testBoth(String s1, String s2, int expected) {
		tester(s1, s2, expected);
		tester(s2, s1, expected);
	}
	
	private void tester(String s1, String s2, int expected) {
		W4_5_Longest_Common_Subsequences lcs = new W4_5_Longest_Common_Subsequences();
		int actual = lcs.LongestCommonSubsequence(s1, s2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void Test_Sorted_Equal_Length_Strings () {
		testBoth("ab", "ab", 2);
		testBoth("abc", "abc", 3);
	}
	
	@Test
	public void Test_Sorted_Unequal_Length_Strings() {
		testBoth("ab", "abc", 2);
		testBoth("abc", "abcd", 3);
	}
	
	
	@Test
	public void Test_UnSorted_Equal_Length_Strings () {
		testBoth("adc", "abc", 2);
		testBoth("aabbb", "bbbaa", 3);
	}
	
	@Test
	public void Test_UnSorted_Unequal_Length_Strings() {
		testBoth("abcdef", "ace", 3);
	}
	
	@Test
	public void Test_No_Common_Substring() {
		testBoth("efg", "abcd", 0);
	}
	
	@Test
	public void Test_Empty_String() {
		testBoth("abcd", "", 0);
		testBoth("efg", "", 0);
	}
	
	@Test
	public void Test_Null_String() {
		testBoth("abcd", null, 0);
		testBoth(null, "efg", 0);
	}
	
//	@Test
//	public void Test_Generated() {
//		tester("rmvrcwoujc", "lydduisrcb", 0);
//		tester("tauigfmhgn", "ugzvzwmzoz", 0);
//		tester("kghntghskg", "ktrvbjaivv", 0);
//		tester("iudtapizwv", "fssewqmqny", 0);
//		tester("ljixgpmphi", "boenegyxph", 0);
//		tester("boenegyxph", "ljixgpmphi", 0);
//		tester("fssewqmqny", "iudtapizwv", 0);
//		tester("ktrvbjaivv", "kghntghskg", 0);
//		tester("ugzvzwmzoz", "tauigfmhgn", 0);
//		tester("lydduisrcb", "rmvrcwoujc", 0);
//	}
	
	@Test
	public void Test_Found_On_Internet() {
//		testBoth("tutorialhorizon", "dynamictutorialProgramming", 8);
		
		testBoth("ABCDEF", "CDEFAB", 4);
		
		testBoth("Thisisadoll", "Thiswasaball", 8);
		
		testBoth("abcdxyz", "xyzabcd", 4);
		
		testBoth("zxabcdezy", "yzabcdezx", 7);
		
		testBoth("hafcdqbgncrcbihkd", "pmjghexybyrgzczy", 4);
//		tester("tutorialhorizon", "dynamictutorialProgramming", 8);
//		tester("tutorialhorizon", "dynamictutorialProgramming", 8);

		
		
//		hafcdqbgncrcbihkd
//		pmjghexybyrgzczy
//		    1        2
//		    1   2  3 4
	}
	
	
	
}
