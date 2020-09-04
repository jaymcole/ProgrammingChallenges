package microsoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.

Example 1:

Input: 123
Output: "One Hundred Twenty Three"
Example 2:

Input: 12345
Output: "Twelve Thousand Three Hundred Forty Five"
Example 3:

Input: 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
Example 4:

Input: 1234567891
Output: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"
 */
public class Integer_To_English_Words {
	
	private String[] beyond = new String[] {"", " Thousand", " Million", " Billion", " Trillion", " Quadrillion"};
	private String[] tens = new String[] {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private String[] teens = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
	private String[] ones = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine"};
	
	
	public String numberToWords(int num) {
        return null;
    }
	
	
	/*
	private boolean addModifier = false;
	public String numberToWords(int num) {
		String number = "" + num;
        String wordNumber = "";
        int beyondCount = 0;
        
        if (num == 0)
        	return ones[num];
        
        for (int i = Math.max(0, number.length()-3); i >= -3; i-=3) {
        	addModifier = false;
        	String temp = "";
        	
        	if (i+3 > 0) {
        		temp = hundredPlace(number.substring(Math.max(0,i), Math.min(number.length(),i+3)));
        		
        		if (addModifier)
        			temp += beyond[beyondCount] ;
        		temp += " " +wordNumber;
        		
        	}
        	wordNumber = temp + wordNumber;
        	beyondCount++;
        } 
		return wordNumber.trim();
    }
	
	private String hundredPlace(String s) {
		if (s.length() < 3)
			return tensPlace(s);
		int number = Integer.parseInt(s.charAt(0) + "");
		String numberWord = "";
		if (number > 0) {
			numberWord = ones[number] + "";
			addModifier = true;
		}
		return numberWord +" Hundred "+ tensPlace(s.substring(1,s.length()));
	}
	
	private String tensPlace(String s) {
		if (s.length() <2) {
			return onesPlace(s);
		}
		int number = Integer.parseInt(s);
		if (number > 9 && number < 20)
			return teens[number-10];
		
		number = Integer.parseInt(s.charAt(s.length()-1)+"");
		String tensPlace = tens[Integer.parseInt(s.substring(0, 1))];
		if (number > 0) {
			tensPlace += " " + onesPlace(number +"");
			addModifier = true;
		}
		
		return tensPlace ;
	}
	
	private String onesPlace(String s)
	{
		if (s.length() == 0)
			return "";
		if (s.length() > 1)
			s = s.substring(0, 1);
		
		int value = Integer.parseInt(s);
		if (value > 0) {
			addModifier = true;
			return ones[value];
		} else
			return "";
	}
	*/
	
	@Test 
	public void test_ones () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("Zero", driver.numberToWords(0));
		assertEquals("One", driver.numberToWords(1));
		assertEquals("Two", driver.numberToWords(2));
		assertEquals("Three", driver.numberToWords(3));
		assertEquals("Four", driver.numberToWords(4));
		assertEquals("Five", driver.numberToWords(5));
		assertEquals("Six", driver.numberToWords(6));
	}
	
	@Test 
	public void test_teens () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("Eleven", driver.numberToWords(11));
		assertEquals("Twelve", driver.numberToWords(12));
		assertEquals("Thirteen", driver.numberToWords(13));
		assertEquals("Fourteen", driver.numberToWords(14));
		assertEquals("Fifteen", driver.numberToWords(15));
		assertEquals("Sixteen", driver.numberToWords(16));
	}
	
	@Test 
	public void test_0 () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("Fifty", driver.numberToWords(50));
		assertEquals("Ninety", driver.numberToWords(90));
		assertEquals("Twenty Two", driver.numberToWords(22));
		assertEquals("Thirty Four", driver.numberToWords(34));
		assertEquals("Fourty Nine", driver.numberToWords(49));
		assertEquals("Fifty Eight", driver.numberToWords(58));
		assertEquals("Sixty Seven", driver.numberToWords(67));
		
	}
	
	@Test 
	public void test_hundreds () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("One Hundred Twenty Three", driver.numberToWords(123));
	}
	
	@Test 
	public void test_thousands () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("Five Thousand One Hundred Twenty Three", driver.numberToWords(5123));
	}
	
	@Test 
	public void test_tens_of_thousands () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("Fifteen Thousand One Hundred Twenty Three", driver.numberToWords(15123));
	}
	
	@Test 
	public void test_hundred_thousands () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("One Hundred Fifty Thousand One Hundred Twenty Three", driver.numberToWords(150123));
	}
	
	@Test 
	public void test_millions () {
		Integer_To_English_Words driver = new Integer_To_English_Words();
		assertEquals("One Million", driver.numberToWords(1000000));
	}
	
}
