package microsoft;

import java.util.Arrays;
import java.util.HashMap;

public class Tester {

	public int solution(String S) {
        int lettersToDelete = 0;
        // iterate over S counting the occurrences of each character
        
        int[] charArray = new int[26];
        for(char c : S.toCharArray()) {
            charArray[(int)c-(int)'a']++;
        }
        
        
        Arrays.sort(charArray);
        int letterToDelete = 0;

        for (int i = charArray.length-2; i>=0; i--) {
            if (charArray[i] == charArray[i+1]) {
                reduce(charArray, i, charArray[i]);
            } 
        }
  
        return letterToDelete;
    }
    
    private int reduce(int[] array, int startIndex, int valueToReduce) {
        int deletes = 0;
        for(int i = startIndex; i >= 0; i--) {
           if (array[i] == valueToReduce) {
                deletes++;
                array[i]--;
           } else {
               return deletes;
           }
        }
		return deletes;
    }
	
}


/*
public int solution(String S) {
int lettersToDelete = 0;
// iterate over S counting the occurrences of each character

int[] charArray = new int[26];
for(char c : S.toCharArray()) {
    charArray[(int)c-(int)'a']++;
}


Arrays.sort(charArray);
int letterToDelete = 0;
for (int i = 1; i < charArray.length; i++) {
    //System.out.println(charArray[i]);
    if (charArray[i] == 0)
        break;
    if (charArray[i] == charArray[i-1]) {
        letterToDelete += reduce(charArray, i, charArray[i]);
    } 
}

return letterToDelete;
}

private int reduce(int[] array, int startIndex, int valueToReduce) {
int deletes = 0;
for(int i = startIndex; i < array.length; i++) {
   if (array[i] == valueToReduce) {
        deletes++;
        array[i]--;
   } else {
       return deletes;
   }
}
return deletes;
}
*/









/*
//you can also use imports, for example:
//import java.util.*;
import java.util.HashMap;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public String solution(String S) {
 
 if (S == null || S.length() <= 0)
     return "NO"; 
 
 char largestCharFound = (char)0;
 HashMap<Character, Character> seenCharacters = new HashMap<Character, Character>();
 
 // Iterate over all characters in String s.
 for(char c : S.toCharArray()) {
     // Add each character to the hashmap with the value as the found character and the key as the pairing character (key for lowercase a == A). 
     if (seenCharacters.containsKey(c)) {
         // upon finding a pair, let the largestCharFound to the uppercase version of the last seen char (if it's bigger than whatever is stored in largestCharFound).
         largestCharFound = (char)Math.max(Character.toUpperCase(c), (int)largestCharFound);
     } else {
         
         // Add c to hashmap (figure out if key needs to be upper or lower case)
         if (Character.isUpperCase(c)) { // Key needs to be lowercase
             seenCharacters.put(Character.toLowerCase(c), c);
         } else { // Key needs to be uuppercase
             seenCharacters.put(Character.toUpperCase(c), c);
         }
     }
 }
 
 
 // if largestChar still (or in thise case, does not still) equals (char)0, then there is no solution and we return "NO"
 if (largestCharFound != (char)0)
     return largestCharFound + ""; //Convert to String
 return "NO";


 }
}*/