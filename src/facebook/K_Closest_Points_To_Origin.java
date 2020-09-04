package facebook;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class K_Closest_Points_To_Origin {

	public int[][] kClosest(int[][] points, int K) {

		int N = Math.min(points.length, K);
		
		double[] distances = new double[points.length];
		HashMap<int[], Double> distanceMap = new HashMap<int[], Double>();
		for (int i = 0; i < points.length; i++ ) {
			distances[i] = (points[i][0]*points[i][0] + points[i][1]*points[i][1]);
			distanceMap.put(points[i], distances[i]);
		}
		
		Arrays.sort(distances);
		
		double maxDistance = distances[N-1];
		int[][] ans = new int[N][];
		int index = 0;
		for (int i = 0; i < points.length; i++) {
			
			if (distanceMap.get(points[i]) <= maxDistance) {
				ans[index] = points[i];
				index++;
			}
			if (index == N)
				return ans;
		}
		
			
		return ans;
    }
	
//	public int[][] kClosest(int[][] points, int K) {
//    
//		K = Math.min(K, points.length);
//		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		double[] distances = new double[points.length];	
//		boolean itemAdded = false;
//		for (int i = 0; i < points.length; i++) {
//			itemAdded = false;
//			distances[i] = distance(points[i][0], points[i][1]);			
//			for(int j = 0; j < list.size(); j++) {
//				if (distances[i] < distances[list.get(j)]) {
//					list.add(j, i);
//					itemAdded = true;
//					break;
//				}
//			}
//			
//			if (!itemAdded && (list.isEmpty() || list.size() < K)) {
//				list.addLast(i);
//			} 
//			
//			if (list.size() > K) {
//				list.removeLast();
//			}
//		}
//		
//		int[][] kClosestPoints = new int[K][];
//		for (int i = 0 ; i < K; i++) {
//			kClosestPoints[i] = points[list.removeFirst()];
//		}
//		
//		return kClosestPoints;
//    }
	
//	private double distance(int x, int y) {
//		return Math.sqrt((x*x) + (y*y));
//	}
	
	private void printArray(int[][] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				System.out.print("[" + arr[i][0] + "," + arr[i][1]+"]");
		}
		System.out.print("]\n");
	}
	
	@Test
	public void test_given_00 () {
		K_Closest_Points_To_Origin tester = new K_Closest_Points_To_Origin();
		int[][] actual = tester.kClosest(new int[][] {{1,3},{-2,2}}, 1);
		
		printArray(actual);
		assertTrue(true);
	}
	
	@Test
	public void test_given_01 () {
		K_Closest_Points_To_Origin tester = new K_Closest_Points_To_Origin();
		int[][] actual = tester.kClosest(new int[][] {{3,3},{5,-1},{-2,4}}, 2);
		
		printArray(actual);
		assertTrue(true);
	}
		
	
}
