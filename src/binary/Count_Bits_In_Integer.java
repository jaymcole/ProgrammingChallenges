package binary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Count_Bits_In_Integer {

	public int integerToBits(int number) {
		
		int bits = 0;
//		System.out.println("Starting at: " + number);
//		while (number >= 1) {
//			bits ++;
////			System.out.println(Integer.toBinaryString(number));
//			System.out.println(Integer.toBinaryString(number & (number-1)) + " = " + Integer.toBinaryString(number) + " & " + Integer.toBinaryString(number-1));
//			number &= (number-1);
//		}
//		System.out.println();
		
		while (number > 0) {
	        bits += number&1L;
	        number>>=1L;
	    }
		
		return bits;
	}
	
	
	@Test
	public void test_01 () {
		Count_Bits_In_Integer tester = new Count_Bits_In_Integer();
		int actual = tester.integerToBits(1);
		assertEquals(1, actual);
	}
	
	@Test
	public void test_02 () {
		Count_Bits_In_Integer tester = new Count_Bits_In_Integer();
		int actual = tester.integerToBits(2);
		assertEquals(1, actual);
	}
	
	@Test
	public void test_03 () {
		Count_Bits_In_Integer tester = new Count_Bits_In_Integer();
		int actual = tester.integerToBits(3);
		assertEquals(2, actual);
	}
	
	@Test
	public void test_04 () {
		Count_Bits_In_Integer tester = new Count_Bits_In_Integer();
		int actual = tester.integerToBits(4);
		assertEquals(1, actual);
	}
	
	
	@Test
	public void test_6432 () {
		Count_Bits_In_Integer tester = new Count_Bits_In_Integer();
		int actual = tester.integerToBits(6432);
		assertEquals(4, actual);
	}
	
	
	
	
	
}
