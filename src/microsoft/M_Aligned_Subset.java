package microsoft;

public class M_Aligned_Subset {
	public static void main(String[] args) {
        int[] array = {-3, -2, 1, 0, 8, 7, 1};
        int a = getLargestSubset(array, 3);
        System.out.println(a);
    }
    
    private static int getLargestMAlignedSubset(int[] array, int M) {
        int result = 0;
        if (array == null || array.length == 0) return 0;
        
        int length = array.length;
        // aggregate numbers by the reminder
        int[] subsetSizeArray = new int[M];
        for (int num : array) {
            // get reminders, and convert non-positive reminders to non-negative
            int index = num < 0 ? (num % M + M) % M : num % M;
            System.out.println("Index: " + index + ", num: " + num);
            result = Math.max(++subsetSizeArray[index], result);
        }
        return result;
    }



    // MY interpretation of the above solution
    private static int getLargestSubset(int[] array, int M) {
    	
    	if (array == null || array.length <= 0)
    		return 0;
    	
    	int largestCount = 0;
    	int[] subsetCount = new int[array.length];
    	int index = 0;
    	for (int number : array) {
    		if (number < 0) {
    			index = (number%M+M) % M;
    		} else {
    			index = number % M;
    		}
    		
    		subsetCount[index]++;
    		largestCount = Math.max(subsetCount[index], largestCount);
    		
    	}
    	
    	
    	
    	return largestCount;
    }
}
