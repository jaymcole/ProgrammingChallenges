package misc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

	
	public static final int 	test_i_answer = 1;
	public static final String 	test_i = 		"i";
	
	public static final int 	test_v_answer = 5;
	public static final String 	test_v = 		"v";
	
	public static final int 	test_x_answer = 10;
	public static final String 	test_x = 		"x";
	
	public static final int 	test_l_answer = 50;
	public static final String 	test_l = 		"l";
	
	public static final int 	test_c_answer = 100;
	public static final String 	test_c = 		"c";
	
	public static final int 	test_d_answer = 500;
	public static final String 	test_d = 		"d";
	
	public static final int 	test_m_answer = 1000;
	public static final String 	test_m = 		"m";
	
	@Test
	void test_i() {
		assertEquals(test_i_answer, RomanNumerals.ConvertValidToInteger(test_i));
	}
	
	@Test
	void test_v() {
		assertEquals(test_v_answer, RomanNumerals.ConvertValidToInteger(test_v));
	}
	@Test
	void test_x() {
		assertEquals(test_x_answer, RomanNumerals.ConvertValidToInteger(test_x));
	}
	@Test
	void test_l() {
		assertEquals(test_l_answer, RomanNumerals.ConvertValidToInteger(test_l));
	}
	@Test
	void test_c() {
		assertEquals(test_c_answer, RomanNumerals.ConvertValidToInteger(test_c));
	}
	@Test
	void test_d() {
		assertEquals(test_d_answer, RomanNumerals.ConvertValidToInteger(test_d));
	}
	@Test
	void test_m() {
		assertEquals(test_m_answer, RomanNumerals.ConvertValidToInteger(test_m));
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	public static final int 	test_1_subtraction_answer = 4;
	public static final String 	test_1_subtraction = 		"IV";
	@Test
	void test_1_subtraction() {
		assertEquals(test_1_subtraction_answer, RomanNumerals.ConvertValidToInteger(test_1_subtraction));
	}
	
	
	public static final int 	test_2_subtraction_answer = 9;
	public static final String 	test_2_subtraction = 		"IX";
	@Test
	void test_2_subtraction() {
		assertEquals(test_2_subtraction_answer, RomanNumerals.ConvertValidToInteger(test_2_subtraction));
	}
	
	public static final int 	test_3_subtraction_answer = 40;
	public static final String 	test_3_subtraction = 		"XL";
	@Test
	void test_3_subtraction() {
		assertEquals(test_2_subtraction_answer, RomanNumerals.ConvertValidToInteger(test_2_subtraction));
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	public static final int 	test_1_addition_answer = 6;
	public static final String 	test_1_addition = 		 "VI";
	@Test
	void test_1_addition() {
		assertEquals(test_1_addition_answer, RomanNumerals.ConvertValidToInteger(test_1_addition));
	}
	
	public static final int 	test_2_addition_answer = 11;
	public static final String 	test_2_addition = 		 "IX";
	@Test
	void test_2_addition() {
		assertEquals(test_2_subtraction_answer, RomanNumerals.ConvertValidToInteger(test_2_subtraction));
	}
	
	public static final int 	test_3_addition_answer = 80;
	public static final String 	test_3_addition = 		 "LXXX";
	@Test
	void test_3_addition() {
		assertEquals(test_3_addition_answer, RomanNumerals.ConvertValidToInteger(test_3_addition));
	}
	
	//-------------------------------------------------------------------------------------------------------------------------

	public static final int 	test_1_answer = 1984;
	public static final String 	test_1 = 		"MCMLXXXIV";
	@Test
	void test_1() {
		assertEquals(test_1_answer, RomanNumerals.ConvertValidToInteger(test_1));
	}
	
	public static final int 	test_2_answer = 3;
	public static final String 	test_2 = 		"IIV";
	@Test
	void test_2() {
		assertEquals(test_2_answer, RomanNumerals.ConvertValidToInteger(test_2));
	}
	
	
	//-------------------------------------------------------------------------------------------------------------------------
	//--------------------------------------Valid Roman Numeral Tests----------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------

	public static final String test_valid_1 = "";
	public static final boolean test_valid_1_answer = false;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
