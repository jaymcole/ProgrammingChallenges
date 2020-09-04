package javaLibraries;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JavaLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<String, Integer>();
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		addItem(linkedMap, hashMap, "key1", 0);
		addItem(linkedMap, hashMap, "key2", 0);
		addItem(linkedMap, hashMap, "key3", 0);
		addItem(linkedMap, hashMap, "key4", 0);
		addItem(linkedMap, hashMap, "key5", 0);
		addItem(linkedMap, hashMap, "key6", 0);
		addItem(linkedMap, hashMap, "key7", 0);
		addItem(linkedMap, hashMap, "key8", 0);
		addItem(linkedMap, hashMap, "key9", 0);
		
		
		printMap("linked", linkedMap);
		printMap("hash",hashMap);
		

	}
	
	private static void addItem (LinkedHashMap<String, Integer> linkedMap, HashMap<String, Integer> hashMap, String key, int value) {
		linkedMap.put(key, value);
		hashMap.put(key, value);
	}
	
	private static void printMap(String name, Map<String, Integer> map) {
		System.out.print(name + "\t");
		for (Entry<String, Integer> entry : map.entrySet()) { 
			System.out.print("(" + entry.getKey() + ", " + entry.getValue() + ")\t");
		}
		System.out.println();
	}
	
}
