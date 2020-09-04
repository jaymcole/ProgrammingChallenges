package may_30_day_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class W3_4_Permutation_In_String {
	
	
	
	public boolean checkInclusion(String s1, String s2) {
		int s1Index = 0;
		
        for (int i = 0; i < s2.length(); i++) {
        	if (s2.length() - i < s1.length())
        		return false;
        	System.out.println(s2.charAt(i) + " vs "+ s1.charAt(s1Index));
    	
    		if (s2.charAt(i) != s1.charAt(s1Index)) {
    			s1Index = 0;
    		} else if (s1Index == s1.length()-1) {
    			return true;
    		} else {
    			s1Index++;    			
    		}
        }
		
		return false;
    }
	
	
	
	@Test
	public void Test_Given_01 () {
		W3_4_Permutation_In_String tester = new W3_4_Permutation_In_String();
		boolean actual = tester.checkInclusion("ab", "eidbaoo");
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void Test_Given_02 () {
		W3_4_Permutation_In_String tester = new W3_4_Permutation_In_String();
		boolean actual = tester.checkInclusion("ab", "eidboaoo");
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void Test_01 () {
		W3_4_Permutation_In_String tester = new W3_4_Permutation_In_String();
		boolean actual = tester.checkInclusion("bba", "bbbbb");
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
