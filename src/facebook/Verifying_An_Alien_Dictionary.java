package facebook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

public class Verifying_An_Alien_Dictionary {

	
	public boolean isAlienSorted(String[] words, String order) {
		HashMap<Character, Integer> charPosition = new HashMap<Character, Integer>();
		
		for (int i = 0; i < order.length(); i++) {
			charPosition.put(order.charAt(i), i);
		}
		
		int valueOfWord1 = 0;
		int valueOfWord2 = 0;
		
		for (int i = 0; i < words.length-1; i++) {
			
			String w1 = words[i];
			String w2 = words[i+1];
			
			for (int j = 0; j < w1.length(); j++) {
				if (j >= w2.length())
					return false;
				
				valueOfWord1 = charPosition.get(w1.charAt(j));
				valueOfWord2 = charPosition.get(w2.charAt(j));	
				
				if (valueOfWord1 > valueOfWord2) {
					return false;
				} else if (valueOfWord1 < valueOfWord2) {
					break;
				}
			}
		}
		return true;
		
    }
	
	@Test
	public void test_given_01() {
		Verifying_An_Alien_Dictionary tester = new Verifying_An_Alien_Dictionary();
		boolean actual = tester.isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_given_02() {
		Verifying_An_Alien_Dictionary tester = new Verifying_An_Alien_Dictionary();
		boolean actual = tester.isAlienSorted(new String[]{"word","world", "row"}, "worldabcefghijkmnpqstuvxyz");
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_given_03() {
		Verifying_An_Alien_Dictionary tester = new Verifying_An_Alien_Dictionary();
		boolean actual = tester.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz");
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_01() {
		Verifying_An_Alien_Dictionary tester = new Verifying_An_Alien_Dictionary();
		boolean actual = tester.isAlienSorted(new String[]{"apple",""}, "abcdefghijklmnopqrstuvwxyz");
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	
	
}
