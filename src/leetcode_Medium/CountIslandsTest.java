package leetcode_Medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountIslandsTest {
	public static final int no_island_answer = 0;
	public static int[][] no_islands = new int[][] {
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0}
	};
	
	public static final int one_answer = 1;
	public static int[][] one_islands = new int[][] {
		{1,1,1,1,1,1,1,1},
		{1,1,1,1,1,1,1,1},
		{1,1,1,1,1,1,1,1},
		{1,1,1,1,1,1,1,1},
		{1,1,1,1,1,1,1,1},
		{1,1,1,1,1,1,1,1}
	};

	public static final int island_1_answer = 1;
	public static int[][] island_1 = new int[][] {
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,1,1,0,0,0,0},
		{0,0,1,1,1,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0}
	};
	
	public static final int island_2_answer = 2;
	public static int[][] island_2 = new int[][] {
		{0,0,0,0,0,0,0,0},
		{0,0,1,1,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,1,1,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0}
	};
	
	public static final int island_3_answer = 3;
	public static int[][] island_3 = new int[][] {
		{1,1,0,0,0,0,0,0},
		{1,1,0,0,0,0,0,0},
		{0,0,1,0,0,1,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0}
	};
	
	public static final int island_4_answer = 4;
	public static int[][] island_4 = new int[][] {
		{0,0,0,1,1,0,0,1},
		{0,0,0,0,0,0,0,1},
		{0,0,0,0,1,1,0,1},
		{0,0,1,1,0,0,0,1},
		{0,0,0,0,0,0,0,1},
		{0,0,1,1,1,1,1,1}
	};
	
	public static final int island_5_answer = 5;
	public static int[][] island_5 = new int[][] {
		{1,0,0,0,0,0,0,0},
		{0,0,0,1,0,0,0,0},
		{0,0,0,0,0,0,1,0},
		{0,0,0,0,0,1,0,0},
		{0,0,1,0,0,0,0,0},
		{0,0,0,0,0,0,0,0}
	};
	
	public static final int island_6_answer = 6;
	public static int[][] island_6 = new int[][] {
		{0,1,0,0,0,0,0,1},
		{0,0,1,1,0,0,1,0},
		{0,1,0,1,0,0,1,0},
		{0,0,0,1,1,1,1,0},
		{1,1,1,0,0,0,0,1},
		{1,1,0,0,0,0,0,0}
	};
	
	public static final int island_long_answer = 4;
	public static int[][] island_long = new int[][] {
		{0,1,0,0,0,0,0,1},
		{0,0,1,1,1,0,1,0},
	};
	
	public static final int island_tall_answer = 4;
	public static int[][] island_tall = new int[][] {
		{0,1,0,0},
		{0,0,1,1},
		{0,1,0,1},
		{0,0,0,1},
		{1,1,1,0},
		{1,1,0,0}
	};
	
	public static final int island_irregular_answer = 6;
	public static int[][] island_irregular = new int[][] {
		{0,1,0,0},
		{0,0,1,1,0,1,1},
		{0,1,0,1,0,0,1},
		{0,0,0,1},
		{1,1,1,0,0},
		{1,1,0,0,0,0,1}
	};
	
	@Test
	void island_none() {
		assertEquals(no_island_answer, CountIslands.Count(no_islands));
	}
	
	@Test
	void island_one() {
		assertEquals(one_answer, CountIslands.Count(one_islands));
	}
	
	@Test
	void island_1() {
		assertEquals(island_1_answer, CountIslands.Count(island_1));
	}
	
	@Test
	void island_2() {
		assertEquals(island_2_answer, CountIslands.Count(island_2));
	}
	
	@Test
	void island_3() {
		assertEquals(island_3_answer, CountIslands.Count(island_3));
	}
	
	@Test
	void island_4() {
		assertEquals(island_4_answer, CountIslands.Count(island_4));
	}
	
	@Test
	void island_5() {
		assertEquals(island_5_answer, CountIslands.Count(island_5));
	}
	
	@Test
	void island_6() {
		assertEquals(island_6_answer, CountIslands.Count(island_6));
	}
	
	@Test
	void island_long() {
		assertEquals(island_long_answer, CountIslands.Count(island_long));
	}
	
	@Test
	void island_tall() {
		assertEquals(island_tall_answer, CountIslands.Count(island_tall));
	}
	
	@Test
	void island_irregular() {
		assertEquals(island_irregular_answer, CountIslands.Count(island_irregular));
	}
}
