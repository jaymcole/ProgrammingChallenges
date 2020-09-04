package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class W1_5_Best_Time_To_Buy_And_Sell_Stocks_II {

	public int maxProfit2(int[] prices) {
		if (prices.length <= 0)
			return 0;
		
		
		
        int current = 0;
		for (int i = 0; i < prices.length-1; i++) {
	
			int buyOn = advanceIndexPriceDown(prices, i);
			int sellOn = advanceIndexPriceUp(prices, buyOn);
			i = sellOn;
			
			if (prices[buyOn] < prices[sellOn]) {
				current = buy(prices[buyOn], current);
				current = sell(prices[sellOn], current);				
			}
		}
		return current;
    }
	
	private int advanceIndexPriceDown(int[] prices, int start) {		
		for (int i = start+1; i < prices.length; i++) {
			if (prices[i] > prices[i-1])
				return i-1;
		}
		return prices.length-1;
	}
	
	private int advanceIndexPriceUp(int[] prices, int start) {
		for (int i = start+1; i < prices.length; i++) {
			if (prices[i] < prices[i-1])
				return i-1;
		}
		return prices.length-1;
	}
	
	private int sell(int price, int current) {
		return current + price;
	}
	
	private int buy(int price, int current) {
		return current - price;
	}
	

	/**
	 * MUCH better solution (not mine)
	 */
	public int maxProfit(int[] prices) {
        int result = 0;
        for(int i=0; i<prices.length-1; i++)
        {
            if(prices[i] <prices[i+1])
            {
                result += prices[i+1] - prices[i];
            }
        }
        return result;
    }
	
	
	
	
	
	@Test
	public void test_given_1 () {
		assertEquals(7, maxProfit(new int[] {7,1,5,3,6,4}));
	}
	@Test
	public void test_given_2 () {
		assertEquals(4, maxProfit(new int[] {1,2,3,4,5}));

	}
	@Test
	public void test_given_3 () {
		assertEquals(0, maxProfit(new int[] {7,6,4,3,1}));
	}
	
	@Test
	public void test_0 () {
		assertEquals(0, maxProfit(new int[] {}));
		assertEquals(0, maxProfit(new int[] {0}));
		assertEquals(1, maxProfit(new int[] {4,5}));
		assertEquals(2, maxProfit(new int[] {4,5,6}));
		assertEquals(2, maxProfit(new int[] {4,5,5,6,6}));
		assertEquals(8, maxProfit(new int[] {1,3,2,4,3,5,4,6}));
	}
	
}
