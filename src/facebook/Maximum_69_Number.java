package facebook;

public class Maximum_69_Number {
	 public int maximum69Number (int num) {
	        String temp = num + "";        
	        temp.replaceFirst("6", "9");
	        return Integer.parseInt(temp);
	    }
}
