package march_30_day_challenge;

import java.util.HashSet;
import java.util.Set;

/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */

public class W1_2_Happy_Numbers {

	private static final int[] exponentials = new int[] { 0, 1, 4, 9, 16, 25, 36, 49, 64, 81 };

	private static final int offset = (int) '0';

	private static final boolean[] endPoints = new boolean[] {
			// 0 1 2 3 4 5 6 7 8 9
			false, true, false, false, false, false, false, true, false, false };

	public boolean isHappy(int n) {
		if (n < 10 && n >= 0)
			return endPoints[n];

		String number = n + "";

		int nextNumber = 0;
		for (int i = 0; i < number.length(); i++) {
			nextNumber += exponentials[(int) (number.charAt(i)) - offset];
		}
		return isHappy(nextNumber);
	}

	public static void main(String[] args) {
		W1_2_Happy_Numbers happy = new W1_2_Happy_Numbers();
		long mine, theirs;
		long time = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			happy.isHappy(i);
		}
		mine = System.currentTimeMillis() - time;
		
		
		time = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			happy.isHappy2(i);
		}
		theirs = System.currentTimeMillis() - time;

		System.out.println("   My solution: " + mine);
		System.out.println("Their Solution: " + theirs);
	}

	// #1 Fastest answer
	public boolean isHappy1(int n) {
		int rem = 0;
		int sumsq = 0;
		while (n != 0) {
			rem = n % 10;
			sumsq += rem * rem;
			n = n / 10;
		}
		if (sumsq == 1)
			return true;
		else if (sumsq > 1 && sumsq < 5)
			return false;
		else
			return isHappy(sumsq);

	}

	// #2 Fastest Answer
	public boolean isHappy2(int n) {

		Set<Integer> sumset = new HashSet<Integer>();
		while (n > 1 && !sumset.contains(n)) {
			sumset.add(n);
			n = seen(n);
		}

		return n == 1;
	}

	private int seen(int n) {
		int rem = 0;
		int sumsq = 0;
		while (n != 0) {
			rem = n % 10;
			sumsq += rem * rem;
			n = n / 10;
		}
		return sumsq;
	}

}
