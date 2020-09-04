package leetcode;

import java.util.HashMap;

/*
 In a country popular for train travel, you have planned some train traveling one year in advance.  The days of the year that you will travel is given as an array days.  Each day is an integer from 1 to 365.

Train tickets are sold in 3 different ways:

a 1-day pass is sold for costs[0] dollars;
a 7-day pass is sold for costs[1] dollars;
a 30-day pass is sold for costs[2] dollars.
The passes allow that many days of consecutive travel.  For example, if we get a 7-day pass on day 2, then we can travel for 7 days: day 2, 3, 4, 5, 6, 7, and 8.

Return the minimum number of dollars you need to travel every day in the given list of days.

Example 1:

Input: days = [1,4,6,7,8,20], costs = [2,7,15]
Output: 11
Explanation: 
For example, here is one way to buy passes that lets you travel your travel plan:
On day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.
On day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, ..., 9.
On day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.
In total you spent $11 and covered all the days of your travel.
Example 2:

Input: days = [1,2,3,4,5,6,7,8,9,10,30,31], costs = [2,7,15]
Output: 17
Explanation: 
For example, here is one way to buy passes that lets you travel your travel plan:
On day 1, you bought a 30-day pass for costs[2] = $15 which covered days 1, 2, ..., 30.
On day 31, you bought a 1-day pass for costs[0] = $2 which covered day 31.
In total you spent $17 and covered all the days of your travel.
 

Note:

1 <= days.length <= 365
1 <= days[i] <= 365
days is in strictly increasing order.
costs.length == 3
1 <= costs[i] <= 1000
 */


// WAAAAY too slow
public class MinimumCostForTickets {
	private static int minCostSoFar = Integer.MAX_VALUE;
	
	public static int mincostTickets(int[] days, int[] costs) {
		System.out.println("----------------------------------");
		minCostSoFar = Integer.MAX_VALUE;
		getCost(days, costs, 0, 30, costs[2], 0);
		getCost(days, costs, 0, 7, costs[1], 0);
		getCost(days, costs, 0, 1, costs[0], 0);
		return minCostSoFar;
    }
	
	public static void getCost(int[] days, int[] costs, int dayIndex, int ticketSpan, int ticketCost, int costSoFar) {
		if (dayIndex >= days.length) {
			if (costSoFar < minCostSoFar)
				minCostSoFar = costSoFar;
			return;
		}
		
		if (costSoFar >= minCostSoFar)
			return;
		
		int startDate = days[dayIndex];
		while (dayIndex < days.length-1 && days[dayIndex+1]-startDate < ticketSpan) {
			dayIndex++;
		}
		
		dayIndex++;
		getCost(days, costs, dayIndex, 1, costs[0], costSoFar + ticketCost);
		getCost(days, costs, dayIndex, 7, costs[1], costSoFar + ticketCost);
		getCost(days, costs, dayIndex, 30, costs[2], costSoFar + ticketCost);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	public static int mincostTickets(int[] days, int[] costs) {
		System.out.println("\n\n");
		int minCost = Integer.MAX_VALUE;
		int tempMinCost = minCost;
		minCost = getCost(days, costs, 0, 1, costs[0]);
		tempMinCost = getCost(days, costs, 0, 7, costs[1]);
		if (tempMinCost < minCost)
			minCost = tempMinCost;
		
		tempMinCost = getCost(days, costs, 0, 30, costs[2]);
		if (tempMinCost < minCost)
			minCost = tempMinCost;

		return minCost;
    }
	
	public static int getCost(int[] days, int[] costs, int dayIndex, int ticketSpan, int ticketCost) {
		if (dayIndex >= days.length)
			return 0;		
		
		int startDate = days[dayIndex];
		int endDate = days[dayIndex];
		while (dayIndex < days.length-1 && days[dayIndex+1]-startDate < ticketSpan) {
			endDate = days[dayIndex];
			dayIndex++;
			System.out.println(days[dayIndex]);
		}
		
		dayIndex++;
		
		int minCost = Integer.MAX_VALUE;
		int tempMinCost = minCost;
		minCost = getCost(days, costs, dayIndex, 1, costs[0]);
		tempMinCost = getCost(days, costs, dayIndex, 7, costs[1]);
		if (tempMinCost < minCost)
			minCost = tempMinCost;
		
		tempMinCost = getCost(days, costs, dayIndex, 30, costs[2]);
		if (tempMinCost < minCost)
			minCost = tempMinCost;

		System.out.println("Days: " + dayIndex);
		System.out.println("Cost: " + (minCost + ticketCost));
		System.out.println();
		return ticketCost + minCost;
	}
	 */
}
