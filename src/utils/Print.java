package utils;

public class Print {
	
	public static boolean PrintToConsole = true;
	
	public static void PrintString(String s) {
		if (PrintToConsole) {
			System.out.print(s);
		}
	}
}
