package facebook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class Minimum_Remove_To_Make_Valid_Parentheses {

	public String minRemoveToMakeValid(String s) {
        Stack<Integer> leftPars = new Stack<Integer>();
        
        StringBuilder sb = new StringBuilder(s);       
        
        for (int i = 0; i < sb.length(); i++) {
        	char c = sb.charAt(i);
        	if (c == '(') {
        		leftPars.add(i);
        	}else if (c == ')'){
        		if (leftPars.isEmpty()) {
        			sb.deleteCharAt(i);
        			i--;
        		} else {
        			leftPars.pop();
        		}
        	}
        	
        }
        
        while (!leftPars.isEmpty()) {
        	sb.deleteCharAt(leftPars.pop());
        }
        
        return sb.toString();
        
    }
	
	@Test
	public void test_given_01 () {
		Minimum_Remove_To_Make_Valid_Parentheses tester = new Minimum_Remove_To_Make_Valid_Parentheses();
		String actual = tester.minRemoveToMakeValid("lee(t(c)o)de)");
		String expected = "lee(t(c)o)de";
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test_given_02 () {
		Minimum_Remove_To_Make_Valid_Parentheses tester = new Minimum_Remove_To_Make_Valid_Parentheses();
		String actual = tester.minRemoveToMakeValid("a)b(c)d");
		String expected = "ab(c)d";
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test_given_03 () {
		Minimum_Remove_To_Make_Valid_Parentheses tester = new Minimum_Remove_To_Make_Valid_Parentheses();
		String actual = tester.minRemoveToMakeValid("))((");
		String expected = "";
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test_given_04 () {
		Minimum_Remove_To_Make_Valid_Parentheses tester = new Minimum_Remove_To_Make_Valid_Parentheses();
		String actual = tester.minRemoveToMakeValid("(a(b(c)d)");
		String expected = "a(b(c)d)";
		assertEquals(expected, actual);	
	}
	
}
