package leetcode_Easy;

import java.util.LinkedList;

import supportingClasses.IntRef;
import supportingClasses.RottingOrangeCoord;

public class RottingOranges {
	public static int EMPTY = 0;
    public static int FRESH = 1;
    public static int ROTTEN = 2;
    
    public static int orangesRotting(int[][] grid) {
        
        int minutesElapsed = -1;
        IntRef remainingFresh = new IntRef();        
        
        LinkedList<RottingOrangeCoord> nextRotten = new LinkedList<RottingOrangeCoord>();
        LinkedList<RottingOrangeCoord> rotten = new LinkedList<RottingOrangeCoord>();
        for (int y = 0 ; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++ ) {
                if (grid[y][x] == ROTTEN)
                    rotten.add(new RottingOrangeCoord(x, y));
                if (grid[y][x] == FRESH)
                	remainingFresh.val++;
            }
        }
        
        while(!rotten.isEmpty()) {
        	minutesElapsed++;
	        while (!rotten.isEmpty()) {	        
	        	RottingOrangeCoord next = rotten.removeFirst();
	            processCoord(new RottingOrangeCoord(next.x-1, next.y), remainingFresh, grid, nextRotten);
	            processCoord(new RottingOrangeCoord(next.x, next.y-1), remainingFresh, grid, nextRotten);
	            processCoord(new RottingOrangeCoord(next.x+1, next.y), remainingFresh, grid, nextRotten);
	            processCoord(new RottingOrangeCoord(next.x, next.y+1), remainingFresh, grid, nextRotten);
	        }
	        rotten.addAll(nextRotten);
	        nextRotten.clear();
        }
        
        if (remainingFresh.val > 0)
        	return -1;
        return Math.max(0, minutesElapsed);
    }
    
    private static void processCoord(RottingOrangeCoord coord, IntRef remainingFresh, int[][] grid, LinkedList<RottingOrangeCoord> rotten) {
    	if (!inBounds(coord, grid))
    		return;
    	if (grid[coord.y][coord.x] == FRESH) {
    		grid[coord.y][coord.x] = ROTTEN;
    		rotten.add(coord);
    		remainingFresh.val--;
    	}
    }
    
    private static boolean inBounds(RottingOrangeCoord coord, int[][] grid) {
        return (coord.y >= 0 && coord.y < grid.length) && (coord.x >= 0 && coord.x < grid[coord.y].length);
    }
}
