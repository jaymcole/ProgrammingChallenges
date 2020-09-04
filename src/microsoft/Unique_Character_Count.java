package microsoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*; 

public class Unique_Character_Count {

	
	
	
	public int minNumber (String s) {
		
		HashMap<Character, Integer> map = new  HashMap<Character, Integer>();
		LinkedList<Character> chars = new LinkedList<Character>();
		LinkedList<Character> chars2 = new LinkedList<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
				chars.add(c);
				chars2.add(c);
			}
		}
		
		Collections.sort(chars, new Comparator<Character>() {
			@Override
			public int compare(Character c1, Character c2) {
				int v1 = map.get(c1), v2 = map.get(c2);
				if (v1 > v2)
					return -1;
				if (v1 == v2)
					return 0;
				return 1;
			}
		});
		
		int deletions = 0;
		int prevHeight = map.get(chars.getFirst())+1;
		int difference = 0;
		char currentChar;
		int charValue;
		while (!chars.isEmpty()) {
			
			currentChar = chars.removeFirst();
			charValue = map.get(currentChar);
			if (prevHeight <= 0) {
				deletions+= charValue;
			} else if (charValue >= prevHeight) {
				difference = charValue - (prevHeight-1);
				deletions += difference;
				prevHeight = charValue - difference;
			} else {
				prevHeight = charValue;
			}
		}

		return deletions;
	}
	
	
	@Test
	public void Test_Given_1 () {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("aaaabbbb");
		assertEquals(1, actual);
	}
	
	@Test
	public void Test_Given_2() {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("ccaaffddecee");
		assertEquals(6, actual);
	}
	
	@Test
	public void Test_Given_3 () {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("eeee");
		assertEquals(0, actual);
	}
	
	@Test
	public void Test_Given_4 () {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("example");
		assertEquals(4, actual);
	}	
	
	@Test
	public void Test0 () {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("aaaabbbb");
		assertEquals(1, actual);
	}
	
	@Test
	public void Test1 () {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("abbcccdddd");
		assertEquals(0, actual);
	}
	
	@Test
	public void Test2 () {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("ddddcccbba");
		assertEquals(0, actual);
	}
	
	@Test
	public void Test3 () {
		Unique_Character_Count test = new Unique_Character_Count();
		int actual = test.minNumber("aaaabbbbccccdddd");
		assertEquals(6, actual);
	}
	
}
