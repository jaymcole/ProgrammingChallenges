package misc;

public class test {
	
	public String longestPalindrome(String s) {
    	if (s == null || s.length() <= 0)
      	return new String();
    
    
    	String longest = "";
      String temp = "";
      
      for(int i = 0; i < s.length(); i++) {
      	temp = longest(s, i);
        if (temp.length() > longest.length())
        	longest = temp;
      }
      return longest;
     
    }
  
 		private String longest(String s, int index) {
    	int left = index, right = index;
      if (inBounds(s, right+1) && s.charAt(left) == s.charAt(right+1))
      	right++;
      if (inBounds(s, left-1) && s.charAt(right) == s.charAt(left-1))
      	left--;
      
      while(inBounds(s, right+1) && inBounds(s, left-1) && s.charAt(right+1) == s.charAt(left-1)) {        
        right++;
        left--;
      }
      return s.substring(left, right);
    } 
  
  	private boolean inBounds(String s, int index) {
      return index < s.length() && index >= 0;
    }
	
	
	
//	Input:
//		10
//	   / \
//	  5   15
//	     / \
//	    6   20
//
//	Output: false
//	Explanation: The root node's value is 5 but its right child's value is 4.
//
//	[10,5,15,null,null,6,20]
//
//
//	public boolean valid (TreeNode root) {
//	  	if (root == null)
//	  		return true;
//		return valid2(root.val, root, root.val);
//	}
//
//	public boolean valid2(int min, TreeNode root, int max) {
//		if (root == null)
//			return true;
//	  
//	  
//	  
//	  	if (root.left != null && root.left.val >= min)
//	  		return false;
//	  	if (root.right != null && root.right.val =< max) 
//	  		return false;
//	  
//	  	return valid2(min, root.left, root.val) && valid2(root.val, root.right, max);
//	}
//
//	https://leetcode.com/explore/interview/card/microsoft/31/trees-and-graphs/152/
//
//	class Solution {
//	    public boolean isValidBST(TreeNode root) {
//	        return isValidBST(root, null, null);
//	    }
//	    
//	    private boolean isValidBST(TreeNode n, Integer upperLimit, Integer lowerLimit){
//	        if(n == null){
//	            return true;
//	        }
//	        boolean isCurrentNodeValid = (upperLimit != null ? n.val < upperLimit : true) && 
//	           (lowerLimit != null ? n.val > lowerLimit : true);
//	        return isCurrentNodeValid
//	                && isValidBST(n.left, new Integer(n.val), lowerLimit)
//	                && isValidBST(n.right, upperLimit, new Integer(n.val));
//	    }
//	}
}
