package misc;

public class RomanNumerals {

public static int ConvertValidToInteger (String s) {
		
		int totalValue = 0;
		int currentValue = 0;
		int nextValue = 0;
		
		
		for(int i = 0 ; i < s.length()-1; i++) {
			currentValue = NumeralValue(s.charAt(i));
			nextValue = NumeralValue(s.charAt(i+1));
			
			if (currentValue >= nextValue) {
				totalValue += currentValue;
			} else {
				totalValue -= currentValue;
			}
		}
		
		return totalValue += NumeralValue(s.charAt(s.length()-1));
	}
	
	public static int ConvertRomanNumeralToInteger(String s) {
		return 0;
	}
	
	public static boolean ValidRomanNumeral(String s) {
		
		if (s == null || s.length() <= 0)
			return false;
		
		char currentChar = ' ';
		char prevChar = '.';
		int consecutiveCharCount = 0;
		
		
		for (int i = 0; i < s.length(); i++) {
			currentChar = s.charAt(i);
			if (!ValidCharacter(currentChar))
				return false;
			
			if (currentChar == prevChar) {
				consecutiveCharCount++;
			} else {
				consecutiveCharCount = 1;
			}
			
			if (consecutiveCharCount >= 3)
				return false;
			
			
			prevChar = currentChar;
		}
		
		return true;
	}
	
	
	private static boolean ValidCharacter(char character) {
		return NumeralValue(character) > 0;
	}
	
	private static int NumeralValue(char number) {
		number = Character.toUpperCase(number);
		
		if (number == 'I')
			return 1;
		if (number == 'V')
			return 5;
		if (number == 'X')
			return 10;
		if (number == 'L')
			return 50;
		if (number == 'C')
			return 100;
		if (number == 'D')
			return 500;
		if (number == 'M')
			return 1000;
		return -1;
	}
	
}
