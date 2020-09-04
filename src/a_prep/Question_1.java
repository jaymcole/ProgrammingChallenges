package a_prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Question_1 {

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public ArrayList<String> popularNFeatures(int numFeatures, 
	                                         int topFeatures, 
                                             List<String> possibleFeatures, 
											 int numFeatureRequests, 
											 List<String> featureRequests)
    {
        
        
        if (featureRequests == null || featureRequests.size() == 0)
            return new ArrayList<String>();
        if (possibleFeatures == null || possibleFeatures.size() == 0)
            return new ArrayList<String>();
        
        TreeMap<String, Integer> featureRequestsCount = new TreeMap<String, Integer>();
        
        // Will be used to keep track of words used in a request to ensure feature requests are not being counted twice.
        HashMap<String, Integer> requestWords;
        
        // Add all possible features to a HashMap;
        for (String feature : possibleFeatures) {
            featureRequestsCount.put(feature.toLowerCase(), 0);
        }
        
        
        // Look for possible features in a request string and increment feature request count upon finding a match.
        for (String request : featureRequests) {
            requestWords = new HashMap<String, Integer>();
            for (String feature : request.split(" ")) {
                
                
                feature = feature.toLowerCase();
                if (featureRequestsCount.containsKey(feature) && !requestWords.containsKey(feature)) {
                       featureRequestsCount.put(feature, featureRequestsCount.get(feature)+1);
                }
                
                requestWords.put(feature, 0);
            }
        }
        
        
        // Sort TreeMap of possible features
        Set<Entry<String, Integer>> mappings = featureRequestsCount.entrySet();
        
        Comparator<Entry<String, Integer>> featureComparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
                if (entry1.getValue() < entry2.getValue())
                    return 1;
                if (entry1.getValue() > entry2.getValue())
                    return -1;
                return 0;
            }
        };
        
        List<Entry<String, Integer>> sortedFeatureList = new ArrayList<Entry<String, Integer>>(featureRequestsCount.entrySet());
        Collections.sort(sortedFeatureList, featureComparator);
  
        
        ArrayList<String> finalFeatureList = new ArrayList<String>();
        int highestRequestedCount = sortedFeatureList.get(0).getValue();
        int listStartIndex = 0;
        for (int i = 0 ; i < sortedFeatureList.size(); i++) {
            if (sortedFeatureList.get(i).getValue() == highestRequestedCount) {
                finalFeatureList.add(sortedFeatureList.get(i).getKey());
            } else {
                listStartIndex = i;
                break;
            }
        }
        
        Comparator<String> alphabeticalComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        Collections.sort(finalFeatureList, alphabeticalComparator);
        
        
        for (int i = listStartIndex; i < Math.min(sortedFeatureList.size(), topFeatures); i++) {
            finalFeatureList.add(sortedFeatureList.get(i).getKey());
        }

        return finalFeatureList;
 
    }
}