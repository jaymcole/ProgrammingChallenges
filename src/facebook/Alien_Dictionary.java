package facebook;

import java.util.HashSet;
import java.util.LinkedList;

public class Alien_Dictionary {
	
	public String alienOrder(String[] words) {
		
		LinkedList<Character> alphabet = new LinkedList<Character>();
		HashSet<Character> seen = new HashSet<Character>();	 
	 
		int groupStart = 0;
		char startChar;
		char lastGroupChar;
		for (int i = 0; i < words.length-1; i++) {
//			if ()
		}

	
	 
		return alphabet.toString();
    }
	
	private void processGroup(LinkedList<Character> alphabet, HashSet<Character> seen, String[] words, int groupStart, int groupEnd) {
		int index = 1;
		char lastChar = words[groupStart].charAt(0);
		while (true) {
			for (int i = groupStart; i <= groupEnd; i++) {
				
			}
		}
		
		
	}

	private void addChar(LinkedList<Character> alphabet, HashSet<Character> seen, char c, char after) {
		if (seen.contains(after)) {
			alphabet.add(alphabet.indexOf(after)+1, c);
		} else {
			alphabet.addFirst(c);
		}
	}
	
	
	
	
//	LinkedList<Character> alphabet = new LinkedList<Character>();
//	 
//	 LinkedList<LinkedList<String>> sets = new LinkedList<LinkedList<String>>();
//	 LinkedList<String> temp = new LinkedList<String>();
//	 char lastChar = (char)(-100);
//	 for (String s : words) {
//		 char nextChar = s.charAt(0);
//		 
//		 if (lastChar != nextChar) {
//			 if (temp.size() > 0)
//				 sets.addLast(temp);
//			 temp = new LinkedList<String>();
//		 }
//		 
//		 
//		 
//	 }
}
