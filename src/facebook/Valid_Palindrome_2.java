package facebook;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Valid_Palindrome_2 {

	public boolean validPalindrome(String s) {
		return validPalindrome(s, 0, s.length()-1, true);
    }
	
	private boolean validPalindrome(String s, int left, int right, boolean canStillDelete) {
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				if (!canStillDelete)
					return false;
				return validPalindrome(s, left+1, right, false) || validPalindrome(s, left, right-1, false);
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	@Test
	public void test_given_01 () {
		Valid_Palindrome_2 tester = new Valid_Palindrome_2();
		assertTrue(tester.validPalindrome("aba"));
	}
	
	@Test
	public void test_given_02 () {
		Valid_Palindrome_2 tester = new Valid_Palindrome_2();
		assertTrue(tester.validPalindrome("abcca"));
	}
	
	@Test
	public void test_01 () {
		Valid_Palindrome_2 tester = new Valid_Palindrome_2();
		assertTrue(tester.validPalindrome("abba"));
	}
	
	@Test
	public void test_02 () {
		Valid_Palindrome_2 tester = new Valid_Palindrome_2();
		assertTrue(tester.validPalindrome("abbbbcba"));
	}
	
	@Test
	public void test_03 () {
		Valid_Palindrome_2 tester = new Valid_Palindrome_2();
		assertTrue(tester.validPalindrome(""));
	}
	
	@Test
	public void test_04 () {
		Valid_Palindrome_2 tester = new Valid_Palindrome_2();
		assertTrue(tester.validPalindrome("a"));
	}
	
	@Test
	public void test_05 () {
		Valid_Palindrome_2 tester = new Valid_Palindrome_2();
		assertFalse(tester.validPalindrome("abc"));
	}
	
}
