package utils;

public class Print {
	
	public static boolean PrintToConsole = false;
	
	public static void PrintString(String s) {
		if (PrintToConsole) {
			System.out.print(s);
			System.out.flush();
		}
	}
	
	

}
