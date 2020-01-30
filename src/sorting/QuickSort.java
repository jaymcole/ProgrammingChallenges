package sorting;

public class QuickSort {
	public static int[] Sort(int[] arr, int low, int high) {
		if (low >= high)
			return arr;
		
		int pivot = partition(arr, low, high);
		Sort(arr, low, pivot - 1);
		Sort(arr, pivot+1, high);
		return arr;
		
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = high;
		
		for (int i = low; i < high; i++) {
			if (arr[i] > arr[pivot]) {
				swap(arr, i, pivot);
			}
		}
		return pivot;
	}
	
	private static void swap(int[] arr, int p1, int p2) {
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
	}
}
