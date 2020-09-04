package facebook;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;


public class Remove_Invalid_Parentheses {
	
	public List<String> removeInvalidParentheses(String s) {	
		String input = sanitizeInput(s);
		int left = 0, right = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				left++;
			} else if (input.charAt(i) == ')') {
				if (left > 0)
					left--;
				else
					right++;			
			}
		}
		
		System.out.println("Remove " + left + " left and " + right + " right.");
		System.out.println("Original: " + input);
		HashSet<String> seen = new HashSet<String>();
		LinkedList<String> permutations = new LinkedList<String>();

		removePars(permutations, seen, input, 0, left, right);
		
        return permutations;
    }
	
	private String sanitizeInput(String s) {
		
		if (s == null || s.length() <= 0)
			return "";
		
		StringBuilder input = new StringBuilder(s);
		
		int index = 0;
		char c;
		while (index < input.length()) {
			c = input.charAt(index);
			if (c == '(') {
				break;
			} else if (c == ')') {
				input.deleteCharAt(index);
			} else {
				index++;
			}
			
		}
		for (int i = input.length()-1; i >= 0 ; i--) {
			c = input.charAt(i);
			if (c == ')') {
				break;
			} else if (c == '(') {
				input.deleteCharAt(i);
			}
		}
		
		return input.toString();
	}
	
	private void removePars(LinkedList<String> permutations, HashSet<String> seen, String s, int index, int removeLeft, int removeRight) {
		
		if ((removeLeft <= 0 && removeRight <= 0)) {
			int open = 0;
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(') {
					open++;
				} else if (c == ')'){
					open--;
				}
				if (open < 0)
					return;
			}
			if (open != 0)
				return;
			permutations.add(s);
			return;
		}
		
		char c;
		String nextPermutation = s;
		for(int i = index; i < s.length(); i++) {
			c = s.charAt(i);
			nextPermutation = s.substring(0, i) + s.substring(i+1);
			if (c == '(' && removeLeft > 0) {
				if (!seen.contains(nextPermutation)) {
					seen.add(nextPermutation);
					removePars(permutations, seen, nextPermutation, i, removeLeft-1, removeRight);
				}
			} else if (c == ')' && removeRight > 0){
				if (!seen.contains(nextPermutation)) {
					seen.add(nextPermutation);
					removePars(permutations, seen, nextPermutation, i, removeLeft, removeRight-1);
				}
			}

		}
	}
		
	//------------------------------------------------------------------------------------------------
	//----------------------------------------TESTS---------------------------------------------------
	//------------------------------------------------------------------------------------------------
	
	
	private boolean test (String[] expected, HashSet<String> actual) {
		System.out.print("Expected: ");
		for (String s : expected) {
			System.out.print(s + ", ");
		}
		System.out.print("\nActual: ");
		
		for (String s : actual) {
			System.out.print(s + ", ");
		}
		System.out.println("\n");
		
		if (expected.length != actual.size())
			return false;
		for (String s : expected) {
			if (!actual.contains(s)) 
				return false;
			actual.remove(s);
		}
		return true;
	}
	
	private  HashSet<String> fillHashSet(Collection<String> input) {
		HashSet<String> set = new HashSet<String>();
		set.addAll(input);
		return set;
	}
	
	private  HashSet<String> fillHashSet(String[] input) {
		HashSet<String> set = new HashSet<String>();
		for (String s : input) {
			set.add(s);
		}
		return set;
	}
	
	@Test
	public void test_removeInvalidParentheses_given_01 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals(true, tester.test(new String[] {"()()()", "(())()"}, fillHashSet(tester.removeInvalidParentheses("()())()")) ));
	}
	
	@Test
	public void test_removeInvalidParentheses_given_02 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals(true, tester.test(new String[] {"(a)()()", "(a())()"}, fillHashSet(tester.removeInvalidParentheses("(a)())()")) ));
	}
	
	@Test
	public void test_removeInvalidParentheses_given_03 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals(true, tester.test(new String[] {""}, fillHashSet(tester.removeInvalidParentheses(")(")) ));
	}
	
//	@Test
//	public void test_removeInvalidParentheses_01 () {
//		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
//		assertEquals(true, tester.test(new String[] {}, fillHashSet(tester.removeInvalidParentheses("")) ));
//	}
	
	
	
	//-------------------------
	
	@Test
	public void test_test_01 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals(true, tester.test(new String[] {"item1","item2"}, fillHashSet(new String[] {"item2","item1"}) ));
	}
	
	@Test
	public void test_test_02 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals(true, tester.test(new String[] {}, fillHashSet(new String[] {}) ));
	}
	
	@Test
	public void test_test_03 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertFalse(tester.test(new String[] {"item1"}, fillHashSet(new String[] {"item1","item2"}) ));
	}
	@Test
	public void test_test_04 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals(true, tester.test(new String[] {"item1"}, fillHashSet(new String[] {"item1"}) ));
	}
	@Test
	public void test_test_05 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals(true, tester.test(new String[] {"item3","item6","item1","item2","item4","item5"}, fillHashSet(new String[] {"item5","item6","item4","item2","item1","item3"}) ));
	}
	
	
	
	
	
	
	
	
	@Test
	public void test_sanitize_01 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("", tester.sanitizeInput(""));
		
	}
	
	@Test
	public void test_sanitize_02 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("", tester.sanitizeInput(null));
		
	}
	
	@Test
	public void test_sanitize_03 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("", tester.sanitizeInput("((((("));
		
	}
	
	@Test
	public void test_sanitize_04 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("", tester.sanitizeInput(")))))"));
		
	}
	
	@Test
	public void test_sanitize_05 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("", tester.sanitizeInput(")))))((((("));
		
	}
	
	@Test
	public void test_sanitize_06 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("()", tester.sanitizeInput("))()(("));
	}
	
	@Test
	public void test_sanitize_07 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("aa()", tester.sanitizeInput("a)a)()(("));
	}
	
	@Test
	public void test_sanitize_08 () {
		Remove_Invalid_Parentheses tester = new Remove_Invalid_Parentheses();
		assertEquals("(((())))", tester.sanitizeInput("(((())))"));
	}
	
	
}
