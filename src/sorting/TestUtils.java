package sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

public class TestUtils {
	
	public static void main(String[] args) {
		
		String nameOfSortMethod = "MergeSort.Sort";
		String className = "MergeSortTest";
		
		nameOfSortMethod = "QuickSort.Sort";
		className = "QuickSortTest";
		
		nameOfSortMethod = "BubbleSort.Sort";
		className = "BubbleSortTest";
		
		Random random = new Random();
		int sizeStart =0;
		int sizeEnd = 25;
		int sizeOfGroups = 5;
		int maxValueSize = 100;
		
		
		System.out.println("package sorting;");
		System.out.println("import org.junit.jupiter.api.Test;");
		System.out.println("class "+className+" {");
		
		
		for (int i = sizeStart; i < sizeEnd; i++) {
			
			System.out.println("\t@Test");
			System.out.println("\tvoid test" + i + "() {");
			for (int j = 0; j < sizeOfGroups; j++) {
				System.out.print("\t\t");
				GenerateTest(i, maxValueSize, nameOfSortMethod,random);
			}
			System.out.println("\t}\n");
		}
		System.out.println("}");
	}
	
	public static void GenerateTest(int size, int maxValueSize, String nameOfSortMethod, Random random) {
		int[] testArray = new int[size];
		int[] sortedArray = new int[size];
		int value = 0;
		for (int i = 0; i < testArray.length; i++) {
			value = random.nextInt(maxValueSize);
			testArray[i] = value;
			sortedArray[i] = value;
		}
		Arrays.sort(sortedArray);
		System.out.println("TestUtils.runTest(new int[]"+ArrayToString(sortedArray)+", "+nameOfSortMethod+"(new int[]"+ArrayToString(testArray)+",0,"+(testArray.length-1)+"));");

	}
	
	public static String ArrayToString(int[] arr) {
		StringBuilder s = new StringBuilder("{");
		for(int i = 0 ; i < arr.length; i++) {
			s.append(arr[i]);
			if (i < arr.length-1) 
				s.append(",");
		}
		s.append("}");
		return s.toString();
	}
	
	public static void runTest(int[] test, int[] answer) {
		System.out.print("Actual: ");
		printArr(answer);
		System.out.print("\nAnswer: ");
		printArr(test);
		System.out.println("\n");
		assertArrayEquals(answer, test);
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
