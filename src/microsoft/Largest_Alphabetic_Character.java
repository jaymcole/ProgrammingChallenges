package microsoft;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class Largest_Alphabetic_Character {
/*
Given a string S, find the largest alphabetic character, whose both uppercase and lowercase appear in S. The uppercase character should be returned. For example, for S = "admeDCAB", return "D". If there is no such character, return "NO".
 */
	
	
	public String largest (String s) {
		if (s == null)
			return "NO";
		
		char largestChar = (char)0;
		HashMap<Character, Character> seen = new HashMap<Character, Character>();
		for (char c : s.toCharArray()) {
			if (seen.containsKey(c)) {
				largestChar = (char)Math.max((int)largestChar, Character.toUpperCase(c));
			} else {
				if (Character.isUpperCase(c)) {
					seen.put(Character.toLowerCase(c), c);
				} else {
					seen.put(Character.toUpperCase(c), c);					
				}
			}
		}
		if (largestChar != (char)0)
			return largestChar + "";	
		return "NO";
	}
	
	
	
	@Test 
	public void give_0 () {
		assertEquals("D", largest("admeDCAB"));
	}
	
	@Test 
	public void test_0 () {
		assertEquals("NO", largest(null));
		assertEquals("NO", largest("a"));
		assertEquals("NO", largest(""));
		assertEquals("NO", largest("abcdEFG"));
	}
	
	@Test 
	public void test_1 () {
		assertEquals("B", largest("abAB"));
		assertEquals("S", largest("abasdasdkjhadasdASGGHdsadAB"));
		assertEquals("A", largest("abA"));
	}
	
	
}
