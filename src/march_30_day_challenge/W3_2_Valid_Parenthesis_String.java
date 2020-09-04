package march_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class W3_2_Valid_Parenthesis_String {

	
	/**
	 * DONE NOT WORK - fails at least one test case.
	 * Rules unclear on what's an acceptable string.
	 */
	
	public boolean checkValidString(String s) {
		if (s == null)
			return true;
		
		int count = 0;
		int asteriskCount = 0;
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				count++;
			} else if (arr[i] == ')') {
				count--;
			} else if (arr[i] == '*'){
				asteriskCount++;
			}
			
			if (count < 0) {
				if (asteriskCount == 0) {
					return false;	
				} else {
					count++;
					asteriskCount--;
				}
			}			
		}
		return count <= asteriskCount;
    }
	
	@Test
	public void Test_Given_True_01 () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("");
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_True_02 () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("(*)");
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_True_03 () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("(*))");
		assertEquals(true, actual);
	}

	@Test
	public void Test_Given_True_04 () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*)");
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_Empty_String () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("");
		assertEquals(true, actual);
	}
	
	

	@Test
	public void Test_Too_Many_Open_With_Asterisks () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("((*()");
		assertEquals(false, actual);
	}

	@Test
	public void Test_Too_Many_Closed_With_Asterisks () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("()*))");
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_All_Opening_Brackets () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("(((((");
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_All_Closing_Brackets () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString(")))))");
		assertEquals(false, actual);
	}
	
	@Test
	public void Test_Too_Many_Open () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("(()");
		assertEquals(false, actual);
	}

	@Test
	public void Test_Too_Many_Closed () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("())");
		assertEquals(false, actual);
	}
	
	
	@Test
	public void Test_Asterisks_For_All_Closing () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("((((****");
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Asterisks_For_All_Opening () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("****))))");
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Too_Many_Asterisks_For_Openings () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("*********))))");
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Too_Many_Asterisks_For_Closings () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString("********))))");
		assertEquals(true, actual);
	}
	
	@Test
	public void Test_Given_Null_String () {
		W3_2_Valid_Parenthesis_String test = new W3_2_Valid_Parenthesis_String();
		boolean actual = test.checkValidString(null);
		assertEquals(true, actual);
	}
	
}
