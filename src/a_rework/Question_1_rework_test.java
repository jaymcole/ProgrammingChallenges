package a_rework;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Question_1_rework_test {

	
	
	
	
	@Test
	public void Sort_Test_1 () {
		Question_1_rework driver = new Question_1_rework();
		
		ArrayList<String> input = new ArrayList<String>();
		input.add("a");
		input.add("b");
		
		HashMap<String, Integer> featuresMap = new HashMap<String, Integer>();
		featuresMap.put("b", 0);
		featuresMap.put("a", 0);
		
		String[] expected = new String[] {
			"a",
			"b",
		};
		driver.SortFeatures(input, featuresMap, 0);
		String[] actual = input.toArray(new String[input.size()]);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void Sort_Test_2 () {
		Question_1_rework driver = new Question_1_rework();
		
		ArrayList<String> input = new ArrayList<String>();
		input.add("aa");
		input.add("a");
		input.add("aaaa");
		input.add("aaa");
		
		HashMap<String, Integer> featuresMap = new HashMap<String, Integer>();
		featuresMap.put("aaaa", 0);
		featuresMap.put("aa", 0);
		featuresMap.put("a", 0);
		featuresMap.put("aaa", 0);
		
		String[] expected = new String[] {
			"a",
			"aa",
			"aaa",
			"aaaa"
		};
		driver.SortFeatures(input, featuresMap, 0);
		String[] actual = input.toArray(new String[input.size()]);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void Sort_Test_3 () {
		Question_1_rework driver = new Question_1_rework();
		
		ArrayList<String> input = new ArrayList<String>();
		input.add("aa");
		input.add("a");
		input.add("aaaa");
		input.add("aaa");
		input.add("b");
		input.add("bb");
		input.add("bbb");
		input.add("bbbb");
		
		HashMap<String, Integer> featuresMap = new HashMap<String, Integer>();
		featuresMap.put("aaaa", 0);
		featuresMap.put("aa", 0);
		featuresMap.put("aaa", 0);
		featuresMap.put("bbbb", 0);
		featuresMap.put("bb", 0);
		featuresMap.put("a", 1);
		featuresMap.put("b", 1);
		featuresMap.put("bbb", 0);
		String[] expected = new String[] {
			"a",
			"b",
			"aa",
			"aaa",
			"aaaa",
			"bb",
			"bbb",
			"bbbb"			
		};
		driver.SortFeatures(input, featuresMap, 1);
		String[] actual = input.toArray(new String[input.size()]);
		
		for (String s : actual) {
			System.out.println(s);
		}
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void Core_Test_1 () {
		Question_1_rework driver = new Question_1_rework();
		
		ArrayList<String> featureRequests = new ArrayList<String>();
		featureRequests.add("I wish my kindle had even more storage!");
		featureRequests.add("I wish my battery life on my Kindle lasted 2 years");
		featureRequests.add("I read in the bath and would enjoy a waterproof Kindle.");
		featureRequests.add("I want to take my Kindle into the shower. Waterproof please waterproof!");
		featureRequests.add("It would be neat if my Kindle would hover on my desk when not in use.");
		featureRequests.add("How cool would it be if my Kindle charged in the via solar power?");
		
		List<String> possibleFeatures = new LinkedList<String>();
		possibleFeatures.add("storage");
		possibleFeatures.add("battery");
		possibleFeatures.add("hover");
		possibleFeatures.add("alexa");
		possibleFeatures.add("waterproof");
		possibleFeatures.add("solar");
	
		String[] expected = new String[] {
				"waterproof",
				"battery",
//				"storage",
//				"hover",
//				"alexa",
//				"solar",		
			};
		
		int numFeatures = possibleFeatures.size();
		int numFeatureRequests = featureRequests.size();
		int topFeatures = 2;
		
		
		ArrayList<String> actual = driver.popularNFeatures(numFeatures, topFeatures, possibleFeatures, numFeatureRequests, featureRequests);
						
		for (String s : actual) {
			System.out.println(s);
		}
		
		assertArrayEquals(expected, actual.toArray(new String[actual.size()]));
	}
	
	@Test
	public void Core_Test_2 () {
		Question_1_rework driver = new Question_1_rework();
		
		ArrayList<String> featureRequests = new ArrayList<String>();
		featureRequests.add("I wish my kindle had even more storage!");
		featureRequests.add("I wish my battery life on my Kindle lasted 2 years");
		featureRequests.add("I read in the bath and would enjoy a waterproof Kindle.");
		featureRequests.add("I want to take my Kindle into the shower. Waterproof please waterproof!");
		featureRequests.add("It would be neat if my Kindle would hover on my desk when not in use.");
		featureRequests.add("How cool would it be if my Kindle charged in the via solar power?");
		featureRequests.add("How cool Solar");
		featureRequests.add("How cool solar");

		List<String> possibleFeatures = new LinkedList<String>();
		possibleFeatures.add("storage");
		possibleFeatures.add("battery");
		possibleFeatures.add("hover");
		possibleFeatures.add("alexa");
		possibleFeatures.add("waterproof");
		possibleFeatures.add("solar");
	
		String[] expected = new String[] {
				"solar",		
				"waterproof",
				"battery",
//				"storage",
//				"hover",
//				"alexa",
			};
		
		int numFeatures = possibleFeatures.size();
		int numFeatureRequests = featureRequests.size();
		int topFeatures = 3;
		
		
		ArrayList<String> actual = driver.popularNFeatures(numFeatures, topFeatures, possibleFeatures, numFeatureRequests, featureRequests);
						
		for (String s : actual) {
			System.out.println(s);
		}
		
		assertArrayEquals(expected, actual.toArray(new String[actual.size()]));
	}
}
