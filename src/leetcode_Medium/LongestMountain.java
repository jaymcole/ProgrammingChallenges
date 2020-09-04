package leetcode_Medium;

public class LongestMountain {
	
	public static int Calculate(int[] A) {
	      int longestMountain = 0;
	      int currentLength = 0;
	      int leftLength = 0, rightLength = 0;
	      for (int i = 0; i < A.length-1; i++) {
	        
	        if (A[i] == A[i+1]) { // FLAT PLANE
	          leftLength = 0;
	          rightLength = 0;
	          currentLength = 0;
	        } else if (A[i] < A[i+1]) { // GOING UP
	        		if (rightLength > 0 ) { // IF HAVE BEEN DOWN
	            	leftLength = 0;
	              rightLength = 0;
	              currentLength = 0;
	            }
						  leftLength++;
	        } else if (A[i] > A[i+1] && leftLength > 0) { // GOING DOWN
	            rightLength++;  
	        }
	        
	        currentLength = Math.max(currentLength, leftLength + rightLength + 1); // +1 FOR PEAK
	        if (currentLength >= 3 && currentLength > longestMountain)
	        	longestMountain = currentLength;
	      }     
				return longestMountain;
	    }
}
