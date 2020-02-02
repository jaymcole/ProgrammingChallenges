package arrays;

public class CountIslands {

	private static final int LAND = 1;
	private static final int WATER = 0;
	
	public static int Count(int[][] grid) {
		System.out.println("\n\n\n");

		int islands = 0;
		
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == LAND) {
					DFS(grid, row, col);
					islands++;
//					System.out.println("Row: " + row);
//					System.out.println("Col: " + col);
//					System.out.println("Value: " + grid[row][col]);
//					System.out.println("islands: " + islands);
				}
				
			}
		} 
		return islands;
	}
	
	
	private static void DFS(int[][] grid, int row, int col) {
		if (row < 0 || row >= grid.length)
			return;
		if (col < 0 || col >= grid[row].length)
			return;
		if (grid[row][col] == WATER)
			return;
		
		grid[row][col] = WATER;
		
		DFS(grid, row+1, col);
		DFS(grid, row-1, col);
		DFS(grid, row, col+1);
		DFS(grid, row, col-1);	
	}
}
