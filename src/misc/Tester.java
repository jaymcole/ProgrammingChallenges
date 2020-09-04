package misc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import supportingClasses.Pair;

public class Tester {

	// list of website and pages
	//pair<user, page>
	
	
	public String[] getMostPopular(List<Pair<String,String>> userPages) {
		
				//User, Pager
		HashMap<String, LinkedList<String>> pages = new HashMap<String, LinkedList<String>>();
		
		for(Pair<String, String> pagePair : userPages) {
			if (pages.containsKey(pagePair.value1)) {

				LinkedList<String> pageList = new LinkedList<String>();
				pageList.add(pagePair.value2);
				pages.put(pagePair.value1, pageList);
			} else {
				pages.get(pagePair.value1).add(pagePair.value2);
			}
		}

		String largest = null;
		HashMap<String, Integer> pagePairs = new HashMap<String, Integer>();
		for (String key : pages.keySet()) {
			LinkedList<String> pageList = pages.get(key);
			for(int i = 0; i < pageList.size()-1; i++) {
				String pair = pagePairs.get(i) + "," + pagePairs.get(i+1);

				int temp = 1;
				if (pagePairs.containsKey(pair)) {
					temp = pagePairs.get(pair)+1;
					if (temp > pagePairs.get(largest))
						largest = pair;
					pagePairs.put(pair, temp);
				} else {
					
					
					pagePairs.put(pair, temp);
					if (largest == null)
						largest = pair;
				}
				
			}
			
			
		}
		if(largest == null)
			return null;
		return largest.split(",");
	}
	
	
	

	
	/*
	user1: p1 p2 p3 p4 
	user2: p2 p3 p5
	user3: p3 p5
	*/
	
	
}



















//public Pair<Integer, Integer> getPair(List<Integer> ints, int target) {
//	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//	
//	for (int i = 0; i < ints.size(); i++) {
//		
//		if (map.containsKey(ints.get(i))) {
//			return new Pair<Integer, Integer>(map.get(i), i);
//		} else {
//			map.put(target-ints.get(i), i);
//		}
//	}
//	return null;
//}
