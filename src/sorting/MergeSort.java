package sorting;

public class MergeSort{

	public static int[] Sort(int[] arr, int l, int r) {
		
		if (l >= r)
			return arr;
		
		int m = (l+r)/2;
		
		Sort(arr, l, m);
		Sort(arr, m+1, r);
		Merge(arr, l, m, r);
		return arr;
	}
	
	private static void Merge(int[] arr, int l, int m, int r) {
		
//		System.out.print("Merging: ");
//		printArr(arr, l, m);
//		System.out.print("and ");
//		printArr(arr, m+1, r);
//		System.out.println("");
		
		int[] leftArr = fillArr(arr, l, m);
		int[] rightArr = fillArr(arr, m+1, r);
		int[] newArr = new int[(r-l)+1]; 
		
		int leftPointer = 0;
		int rightPointer = 0;
		int index = 0;
		
		while (rightPointer < rightArr.length && leftPointer < leftArr.length) {
			if (leftArr[leftPointer] < rightArr[rightPointer]) {
				insert(newArr, index, leftArr[leftPointer]);
				leftPointer++;
			} else {
				insert(newArr, index, rightArr[rightPointer]);
				rightPointer++;
			}
			index++;
		}
		
		for (int i = index; i < newArr.length; i++) {
			if (leftPointer < leftArr.length) {
				insert(newArr, i, leftArr[leftPointer]);
				leftPointer++;
			} else {
				insert(newArr, i, rightArr[rightPointer]);
				rightPointer++;
			}
		}
		
		for (int i = 0; i < newArr.length; i++) {
			arr[i+l] = newArr[i];
		}
	}
	
	public static void insert(int[] arr, int index, int value) {
		arr[index] = value;
	}
	
	public static void swap(int[] arr, int index1, int[] arr2, int index2 ) {
		int temp = arr[index1];
		arr[index1] = arr2[index2];
		arr2[index2] = temp;
	}
	
	public static void printArr(int[] arr, int l, int r) {
		for(int i = l ; i <= r; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private static int[] fillArr(int[] arr, int start, int end) {
		int[] newArr = new int[end-start+1]; 
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i+start];
		}
		return newArr;
	}
}
