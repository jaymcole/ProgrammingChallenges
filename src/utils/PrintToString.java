package utils;

import trees.Node;

public class PrintToString {
	
	public static String NodeListToString(Node head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(" " + head.value);
			head = head.right;
		}
		return sb.toString().trim();
	}
	
	public static String IntArrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < array.length; i++) {
			sb.append(" " + array[i]);
		}
		return sb.toString().trim();
	}
	
}
