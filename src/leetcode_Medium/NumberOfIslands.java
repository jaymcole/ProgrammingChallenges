package leetcode_Medium;

public class NumberOfIslands {

	public static final char WATER 	= '0';
	public static final char LAND 	= '1';
	
	
	/**
	 * 
	 * @param grid - 2D array of WATER/LAND characters
	 * @return the number of islands in grid.
	 * 
	 * island: A contiguous group of LAND values in grid
	 */
	public int numIslands(char[][] grid) {
		// Iterate over entire grid.
		// Skip water tiles.
		// Upon hitting LAND
		//	 1. Increment island count
		//	 2. Start DFS to destroy island (could alternatively have a second grid to mark visited islands)
		int islandCount = 0;
		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
				if (grid[y][x] == LAND) {
					islandCount++;
					destroyIslandDFS(grid, x, y);
				}
			}
		}
		return islandCount;
	}
	
	/**
	 * Converts coordinate (x,y) to WATER and all LAND tiles adjacent to (x,y) on grid.
	 * Returns without making any changes if initial (x,y) coordinate is WATER.
	 * @param grid
	 * @param x
	 * @param y
	 */
	private void destroyIslandDFS(char[][] grid, int x, int y) {
		if (inBounds(grid, x, y) && grid[y][x] == LAND) {
			grid[y][x] = WATER;
			destroyIslandDFS(grid, x-1, y);
			destroyIslandDFS(grid, x+1, y);
			destroyIslandDFS(grid, x, y-1);
			destroyIslandDFS(grid, x, y+1);
		}
	}
	
	/**
	 * 
	 * @param grid - the 2D array 
	 * @param x - x coordinate
	 * @param y - y coordinate
	 * @return true is coordinate (x,y) is within grid bounds
	 */
	private boolean inBounds(char[][] grid, int x, int y) {
		if (y < 0 || y >= grid.length)
			return false;
		if (x < 0 || x >= grid[y].length) 
			return false;
		return true;
	}
	
}
