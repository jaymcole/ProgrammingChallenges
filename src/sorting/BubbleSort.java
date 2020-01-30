package sorting;

public class BubbleSort {
	public static int[] Sort(int[] arr, int dummy1, int dummy2) {
		boolean allSorted = false;
		while (!allSorted) {
			allSorted = true;
			for (int i = 0; i < arr.length-1; i++) {
				
				if (arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
					allSorted = false;
				}
			}	
		}
		return arr;
	}
	
	private static void swap(int[] arr, int p1, int p2) {
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
	}
}
