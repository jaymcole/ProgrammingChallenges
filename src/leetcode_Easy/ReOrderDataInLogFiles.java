package leetcode_Easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 You have an array of logs.  Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier.  Then, either:

Each word after the identifier will consist only of lowercase letters, or;
Each word after the identifier will consist only of digits.
We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.

Return the final order of the logs.

 

Example 1:

Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 

Constraints:

0 <= logs.length <= 100
3 <= logs[i].length <= 100
logs[i] is guaranteed to have an identifier, and a word after the identifier.
 */


public class ReOrderDataInLogFiles {
	public String[] reorderLogFiles(String[] logs) {
		LinkedList<String> letterLogs = new LinkedList<String>();
		LinkedList<String> numberLogs = new LinkedList<String>();
		
		// Iterate over all logs
		// Check the second element for digits/letters
		// If letters, add log to letterLogs in correct position (insertLetterLog will handle that).
		// Else, add to number logs
		for (String log : logs) {
			if (isLetterLog(log)) {
				letterLogs.add(log);
			} else {
				numberLogs.add(log);
			}
		}
		
		Collections.sort(letterLogs,
                new Comparator<String>()
                {
                    public int compare(String s1, String s2)
                    {
                    	int result = s1.substring(s1.split(" ")[0].length()).compareTo(s2.substring(s2.split(" ")[0].length()));
                        if (result == 0)
	                        return s1.compareTo(s2);
                        return result;
                    }        
                });
		
		
		int index = 0;
		while (!letterLogs.isEmpty()) {
			logs[index] = letterLogs.removeFirst();
			index++;
		}
		
		while (!numberLogs.isEmpty()) {
			logs[index] = numberLogs.removeFirst();
			index++;
		}
		
		
		return logs;
    }
	
	private boolean isLetterLog(String log) {
		return Character.isLetter(log.split(" ")[1].charAt(0));
	}
	
}
