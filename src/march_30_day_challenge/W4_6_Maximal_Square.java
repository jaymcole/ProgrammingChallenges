package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class W4_6_Maximal_Square {

	public int maximalSquare(char[][] matrix) {
		int[][] grid = new int[matrix.length][];
		int max = 0;
		
		// If either the top or left neighbor are 0, then the value is just itself.
		// Otherwise, take the min of the top, left, topleft and add 1 
		
		for (int row = 0; row < matrix.length; row++) {
			grid[row] = new int[matrix[row].length];
			for(int col = 0; col < matrix[row].length; col++) {
	
				int nextValue = 0;
				if (matrix[row][col] == '1') {
					
					int tl = GetValue(grid, row-1, col-1);
					int top = GetValue(grid, row-1, col);
					int left = GetValue(grid, row, col-1);
					
					if (top == 0 || left == 0) {
						nextValue = 1;
					} else {
						nextValue = Math.min(tl, Math.min(left, top)) +1;
					}
											
					if (nextValue > max)
						max = nextValue;
					grid[row][col] = nextValue;
					
				}
				System.out.print(nextValue + " ");
			}
			System.out.println();
		}
		System.out.println();		
		return max * max;
    }
	
	
	
	private int GetValue(int[][] grid, int row, int col) {
		if (row < 0 || row >= grid.length)
			return 0;
		if (col < 0 || col >= grid[row].length)
			return 0;
		return grid[row][col];
	}
	
	/**
	 * Cleaner solution (not mine)
	 */
	public int maximalSquare2(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxsqlen = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        return maxsqlen * maxsqlen;
    }
	
	
	@Test
	public void Test_Given_1 () {
		W4_6_Maximal_Square test = new W4_6_Maximal_Square();
		int actual = test.maximalSquare(new char[][] {
			{'1','0','1','0','0'},
			{'1','0','1','1','1'},
			{'1','1','1','1','1'},
			{'1','0','0','1','0'}
		});
		assertEquals(4, actual);
	}
	
	@Test
	public void Test_Given_2 () {
		W4_6_Maximal_Square test = new W4_6_Maximal_Square();
		int actual = test.maximalSquare(new char[][] {
			{'1'}
		});
		assertEquals(1, actual);
	}
	
	@Test
	public void Test_0 () {
		W4_6_Maximal_Square test = new W4_6_Maximal_Square();
		int actual = test.maximalSquare(new char[][] {
			{'1','1','1','0','0'},
			{'1','1','1','1','1'},
			{'1','1','1','1','1'},
			{'1','0','0','1','0'}
		});
		assertEquals(9, actual);
	}
	
	@Test
	public void Test_1 () {
		W4_6_Maximal_Square test = new W4_6_Maximal_Square();
		int actual = test.maximalSquare(new char[][] {
			{'1','1','1','1','0'},
			{'1','1','1','1','1'},
			{'1','1','1','1','1'},
			{'1','1','1','1','0'}
		});
		assertEquals(16, actual);
	}
	
	@Test
	public void Test_2 () {
		W4_6_Maximal_Square test = new W4_6_Maximal_Square();
		int actual = test.maximalSquare(new char[][] {
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','1','1','0','0','0','0','0','0','0','0','0','0'},
			{'0','1','1','1','0','1','1','1','1','0','0','0','0'},
			{'0','1','1','1','1','1','1','1','1','0','0','0','0'},
			{'0','1','1','0','0','1','0','0','1','0','0','0','0'},
			{'0','0','0','0','0','1','0','0','1','0','1','1','0'},
			{'0','0','0','0','0','1','0','0','1','1','1','1','0'},
			{'0','0','0','0','0','1','1','1','1','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'}
		});
		assertEquals(4, actual);
	}
	
	@Test
	public void Test_3 () {
		W4_6_Maximal_Square test = new W4_6_Maximal_Square();
		int actual = test.maximalSquare(new char[][] {
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','1','1','1'},
			{'0','0','0','0','0','0','0','0','0','0','1','0','1'},
			{'0','0','0','0','0','0','0','0','0','0','1','1','1'}
		});
		assertEquals(1, actual);
	}
	
	@Test
	public void Test_4 () {
		W4_6_Maximal_Square test = new W4_6_Maximal_Square();
		int actual = test.maximalSquare(new char[][] {
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'},
			{'0','0','0','0','0','0','0','0','0','0','0','0','0'}
		});
		assertEquals(0, actual);
	}
	
	
}
