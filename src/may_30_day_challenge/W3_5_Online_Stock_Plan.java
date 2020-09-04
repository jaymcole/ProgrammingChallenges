package may_30_day_challenge;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

public class W3_5_Online_Stock_Plan {
	
	public class StockSpanner {
		private Stack<Integer> prices;
		private Stack<Integer> spans;
		
		public StockSpanner() {
	        prices = new Stack<Integer>();
	        spans = new Stack<Integer>();
	        
	    }
	    
	    public int next(int price) {
	    	int span = 1;
	    	
	    	while (!prices.isEmpty()) {
	    		
	    		if (prices.peek() <= price) {
	    			prices.pop();
	    			span += spans.pop();
	    			
	    		} else {
	    			break;
	    		}
	    		
	    	}
	    	
	    	prices.push(price);
	    	spans.push(span);
	    	
	    	return span;
	    }
	    
	    @Override
	    public String toString() {
	    	return prices.toString() + "\n" + spans.toString();
	    }
	}
	
	
	
	public void TestMethod(StringBuilder sb, StockSpanner tester, int[] nextValues) {
		
		for(int i = 0; i < nextValues.length; i++) {			
			int next = tester.next(nextValues[i]);
			System.out.println("S.next("+ nextValues[i]+") is called and returned " + next );
			
			sb.append("," + next);
		}
	}
	
	@Test
	public void Test_Given_01 () {
		StockSpanner tester = new StockSpanner();
		StringBuilder actual = new StringBuilder("[null");
		TestMethod(actual, tester, new int[] {100, 80, 60, 70, 60, 75, 85});
		actual.append("]");
		String expected = "[null,1,1,1,2,1,4,6]";
		System.out.println("Expected: "+expected);
		System.out.println("  Actual: " + actual.toString());
		System.out.println(tester.toString());
		assertEquals(expected, actual.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
