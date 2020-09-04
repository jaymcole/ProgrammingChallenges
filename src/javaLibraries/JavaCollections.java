package javaLibraries;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class JavaCollections {

	
	private Comparator<String> featureComparator = new Comparator<String>() {
        @Override
        public int compare(String feature1, String feature2) {
        	String key1 = feature1.toLowerCase();
        	String key2 = feature2.toLowerCase();
        	return key1.compareTo(key2);
        }
    };
	
	
    public Comparator<String> featureComparator(HashMap<String, Integer> featureRequestCount, int highestRequestCount) {
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
        
        return featureComparator;
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
