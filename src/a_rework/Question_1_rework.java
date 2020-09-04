package a_rework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_1_rework {
	public ArrayList<String> popularNFeatures(int numFeatures, 
			int topFeatures, 
			List<String> possibleFeatures, 
			int numFeatureRequests, 
			List<String> featureRequests
			){
		
			topFeatures = Math.min(topFeatures, possibleFeatures.size());
		
			ArrayList<String> mostPopularNFeatures = new ArrayList<String>();
			HashMap<String, Integer> featureRequestCount = new HashMap<String, Integer>();
			Set<String> wordsInRequestSet;
			int highestRequestCount = 0;
			int tempCount;
			
			// Store all features in a HashMap to quickly find and tally feature requests.
			for (String feature : possibleFeatures) {
				feature = feature.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
				if (!featureRequestCount.containsKey(feature))
					featureRequestCount.put(feature, 0);
			}
			
			// Iterate over each request
			for (String request : featureRequests) {
				wordsInRequestSet = new HashSet<String> ();
				
				//Iterate over each word in every request
				for (String word : request.toLowerCase().split(" ")) {
					word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
					if (featureRequestCount.containsKey(word) && !wordsInRequestSet.contains(word)) {
						tempCount = featureRequestCount.get(word) + 1;
						featureRequestCount.put(word, tempCount);
						if (tempCount > highestRequestCount)
							highestRequestCount = tempCount;
						wordsInRequestSet.add(word);
					}
				}
			}
			
			SortFeatures(possibleFeatures, featureRequestCount, highestRequestCount);
	        
	        for (int i = 0; i < Math.min(topFeatures, possibleFeatures.size()); i++) {
	        	mostPopularNFeatures.add(possibleFeatures.remove(0));
	        }
	        
			return mostPopularNFeatures;
	}
	
	public void SortFeatures(List<String> collectionToSort, HashMap<String, Integer> featureRequestCount, int highestRequestCount) {
		Comparator<String> featureComparator = new Comparator<String>() {
            @Override
            public int compare(String feature1, String feature2) {
            	String key1 = feature1.toLowerCase();
            	String key2 = feature2.toLowerCase();
            	
            	if (featureRequestCount.get(key1) > featureRequestCount.get(key2)) {
            		return -1;
            	} else if (featureRequestCount.get(key1) < featureRequestCount.get(key2)) {
            		return 1;
            	}
            	return feature1.compareToIgnoreCase(feature2);
            }
        };
        Collections.sort(collectionToSort, featureComparator);
	}
	
}
