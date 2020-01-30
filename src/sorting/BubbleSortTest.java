package sorting;
import org.junit.jupiter.api.Test;
class BubbleSortTest {
	@Test
	void test0() {
		TestUtils.runTest(new int[]{}, BubbleSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, BubbleSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, BubbleSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, BubbleSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, BubbleSort.Sort(new int[]{},0,-1));
	}

	@Test
	void test1() {
		TestUtils.runTest(new int[]{38}, BubbleSort.Sort(new int[]{38},0,0));
		TestUtils.runTest(new int[]{59}, BubbleSort.Sort(new int[]{59},0,0));
		TestUtils.runTest(new int[]{37}, BubbleSort.Sort(new int[]{37},0,0));
		TestUtils.runTest(new int[]{29}, BubbleSort.Sort(new int[]{29},0,0));
		TestUtils.runTest(new int[]{32}, BubbleSort.Sort(new int[]{32},0,0));
	}

	@Test
	void test2() {
		TestUtils.runTest(new int[]{76,92}, BubbleSort.Sort(new int[]{92,76},0,1));
		TestUtils.runTest(new int[]{81,96}, BubbleSort.Sort(new int[]{81,96},0,1));
		TestUtils.runTest(new int[]{34,91}, BubbleSort.Sort(new int[]{34,91},0,1));
		TestUtils.runTest(new int[]{5,71}, BubbleSort.Sort(new int[]{71,5},0,1));
		TestUtils.runTest(new int[]{23,96}, BubbleSort.Sort(new int[]{96,23},0,1));
	}

	@Test
	void test3() {
		TestUtils.runTest(new int[]{26,40,58}, BubbleSort.Sort(new int[]{40,58,26},0,2));
		TestUtils.runTest(new int[]{31,32,45}, BubbleSort.Sort(new int[]{31,45,32},0,2));
		TestUtils.runTest(new int[]{20,20,87}, BubbleSort.Sort(new int[]{87,20,20},0,2));
		TestUtils.runTest(new int[]{10,16,96}, BubbleSort.Sort(new int[]{16,96,10},0,2));
		TestUtils.runTest(new int[]{19,23,63}, BubbleSort.Sort(new int[]{63,23,19},0,2));
	}

	@Test
	void test4() {
		TestUtils.runTest(new int[]{30,60,77,92}, BubbleSort.Sort(new int[]{77,92,30,60},0,3));
		TestUtils.runTest(new int[]{44,84,93,96}, BubbleSort.Sort(new int[]{93,96,84,44},0,3));
		TestUtils.runTest(new int[]{35,43,45,76}, BubbleSort.Sort(new int[]{76,45,43,35},0,3));
		TestUtils.runTest(new int[]{38,66,72,86}, BubbleSort.Sort(new int[]{66,38,86,72},0,3));
		TestUtils.runTest(new int[]{13,29,51,66}, BubbleSort.Sort(new int[]{51,29,66,13},0,3));
	}

	@Test
	void test5() {
		TestUtils.runTest(new int[]{5,23,60,87,93}, BubbleSort.Sort(new int[]{87,5,93,60,23},0,4));
		TestUtils.runTest(new int[]{14,20,25,46,54}, BubbleSort.Sort(new int[]{25,20,14,46,54},0,4));
		TestUtils.runTest(new int[]{33,43,67,70,77}, BubbleSort.Sort(new int[]{77,70,43,33,67},0,4));
		TestUtils.runTest(new int[]{37,49,74,81,90}, BubbleSort.Sort(new int[]{49,81,37,90,74},0,4));
		TestUtils.runTest(new int[]{0,39,65,80,94}, BubbleSort.Sort(new int[]{94,0,80,65,39},0,4));
	}

	@Test
	void test6() {
		TestUtils.runTest(new int[]{10,18,61,71,84,97}, BubbleSort.Sort(new int[]{84,71,18,61,10,97},0,5));
		TestUtils.runTest(new int[]{4,37,39,72,93,93}, BubbleSort.Sort(new int[]{4,37,39,93,72,93},0,5));
		TestUtils.runTest(new int[]{0,4,8,36,77,97}, BubbleSort.Sort(new int[]{8,0,77,97,4,36},0,5));
		TestUtils.runTest(new int[]{16,18,52,57,58,78}, BubbleSort.Sort(new int[]{52,18,16,58,57,78},0,5));
		TestUtils.runTest(new int[]{16,38,47,56,66,78}, BubbleSort.Sort(new int[]{78,38,56,66,47,16},0,5));
	}

	@Test
	void test7() {
		TestUtils.runTest(new int[]{14,19,48,62,68,90,97}, BubbleSort.Sort(new int[]{19,90,68,62,14,97,48},0,6));
		TestUtils.runTest(new int[]{11,14,29,33,34,54,76}, BubbleSort.Sort(new int[]{76,29,14,33,54,11,34},0,6));
		TestUtils.runTest(new int[]{39,42,59,60,76,80,97}, BubbleSort.Sort(new int[]{60,76,42,97,59,80,39},0,6));
		TestUtils.runTest(new int[]{17,18,24,66,68,77,99}, BubbleSort.Sort(new int[]{77,66,18,99,24,17,68},0,6));
		TestUtils.runTest(new int[]{4,26,37,50,58,62,70}, BubbleSort.Sort(new int[]{37,62,58,26,4,70,50},0,6));
	}

	@Test
	void test8() {
		TestUtils.runTest(new int[]{41,47,62,67,73,88,88,95}, BubbleSort.Sort(new int[]{88,41,88,47,95,67,73,62},0,7));
		TestUtils.runTest(new int[]{9,11,14,31,37,56,86,89}, BubbleSort.Sort(new int[]{86,9,11,14,37,56,31,89},0,7));
		TestUtils.runTest(new int[]{14,35,53,53,56,56,77,94}, BubbleSort.Sort(new int[]{77,35,56,94,56,53,14,53},0,7));
		TestUtils.runTest(new int[]{4,7,41,61,64,84,91,94}, BubbleSort.Sort(new int[]{64,7,84,4,91,61,41,94},0,7));
		TestUtils.runTest(new int[]{18,21,25,53,54,65,68,79}, BubbleSort.Sort(new int[]{53,79,65,18,21,25,68,54},0,7));
	}

	@Test
	void test9() {
		TestUtils.runTest(new int[]{0,3,5,11,50,51,55,85,91}, BubbleSort.Sort(new int[]{3,91,51,5,55,85,50,0,11},0,8));
		TestUtils.runTest(new int[]{6,6,7,15,46,49,51,58,61}, BubbleSort.Sort(new int[]{7,15,61,51,49,58,6,46,6},0,8));
		TestUtils.runTest(new int[]{16,23,26,38,49,74,81,93,96}, BubbleSort.Sort(new int[]{16,74,38,23,93,49,81,26,96},0,8));
		TestUtils.runTest(new int[]{10,11,12,17,21,21,39,50,75}, BubbleSort.Sort(new int[]{10,11,12,21,17,75,21,50,39},0,8));
		TestUtils.runTest(new int[]{12,35,40,45,57,59,63,67,79}, BubbleSort.Sort(new int[]{57,40,45,67,35,59,63,79,12},0,8));
	}

	@Test
	void test10() {
		TestUtils.runTest(new int[]{15,25,32,46,72,76,78,86,91,96}, BubbleSort.Sort(new int[]{25,46,72,86,78,96,15,76,32,91},0,9));
		TestUtils.runTest(new int[]{2,8,8,16,29,36,39,65,73,77}, BubbleSort.Sort(new int[]{29,8,16,77,2,8,65,73,39,36},0,9));
		TestUtils.runTest(new int[]{15,16,39,40,41,62,65,73,75,76}, BubbleSort.Sort(new int[]{65,41,73,76,16,15,62,75,40,39},0,9));
		TestUtils.runTest(new int[]{15,16,20,22,27,29,72,76,82,95}, BubbleSort.Sort(new int[]{15,22,27,95,76,29,20,82,16,72},0,9));
		TestUtils.runTest(new int[]{8,13,20,37,38,52,65,66,71,72}, BubbleSort.Sort(new int[]{37,38,52,71,65,13,72,8,66,20},0,9));
	}

	@Test
	void test11() {
		TestUtils.runTest(new int[]{9,10,25,28,34,40,45,67,67,79,85}, BubbleSort.Sort(new int[]{28,9,45,67,34,67,79,85,10,40,25},0,10));
		TestUtils.runTest(new int[]{5,16,26,27,41,61,63,64,86,88,96}, BubbleSort.Sort(new int[]{27,86,26,16,64,96,41,88,61,5,63},0,10));
		TestUtils.runTest(new int[]{6,8,17,20,40,55,65,69,88,95,97}, BubbleSort.Sort(new int[]{6,20,17,40,95,55,97,8,88,65,69},0,10));
		TestUtils.runTest(new int[]{14,19,24,25,27,43,46,49,65,68,84}, BubbleSort.Sort(new int[]{49,65,24,84,14,19,43,25,46,27,68},0,10));
		TestUtils.runTest(new int[]{3,3,24,28,35,41,44,45,66,77,88}, BubbleSort.Sort(new int[]{28,44,88,35,66,3,24,45,41,77,3},0,10));
	}

	@Test
	void test12() {
		TestUtils.runTest(new int[]{3,8,25,48,48,63,65,68,71,73,82,92}, BubbleSort.Sort(new int[]{71,68,92,25,63,48,8,3,73,65,82,48},0,11));
		TestUtils.runTest(new int[]{5,5,8,14,25,45,72,75,76,83,95,98}, BubbleSort.Sort(new int[]{5,72,75,14,25,45,98,8,5,76,83,95},0,11));
		TestUtils.runTest(new int[]{7,17,25,34,44,44,51,58,68,69,95,99}, BubbleSort.Sort(new int[]{58,17,51,7,99,34,69,95,68,25,44,44},0,11));
		TestUtils.runTest(new int[]{0,14,19,37,43,52,63,67,75,81,82,82}, BubbleSort.Sort(new int[]{82,67,63,75,81,52,43,14,0,37,19,82},0,11));
		TestUtils.runTest(new int[]{4,5,29,30,35,38,43,70,70,71,81,86}, BubbleSort.Sort(new int[]{38,29,70,43,30,35,71,5,70,4,81,86},0,11));
	}

	@Test
	void test13() {
		TestUtils.runTest(new int[]{7,14,26,26,33,37,39,58,72,79,83,86,99}, BubbleSort.Sort(new int[]{14,33,83,72,99,37,58,26,7,39,86,79,26},0,12));
		TestUtils.runTest(new int[]{1,9,23,23,27,40,42,60,60,65,82,88,99}, BubbleSort.Sort(new int[]{42,27,88,23,40,9,60,23,1,99,82,60,65},0,12));
		TestUtils.runTest(new int[]{12,25,32,33,45,46,47,47,58,71,78,82,93}, BubbleSort.Sort(new int[]{93,45,47,46,78,47,82,25,32,33,12,58,71},0,12));
		TestUtils.runTest(new int[]{5,11,30,32,36,39,45,53,69,82,87,91,99}, BubbleSort.Sort(new int[]{87,82,91,45,53,11,99,32,5,30,69,39,36},0,12));
		TestUtils.runTest(new int[]{1,5,9,44,44,45,54,64,67,85,88,89,97}, BubbleSort.Sort(new int[]{44,85,54,1,9,45,97,89,88,64,44,5,67},0,12));
	}

	@Test
	void test14() {
		TestUtils.runTest(new int[]{5,6,15,20,22,46,48,57,58,76,79,84,91,96}, BubbleSort.Sort(new int[]{20,76,57,22,46,96,58,15,84,6,48,91,79,5},0,13));
		TestUtils.runTest(new int[]{8,16,31,46,47,53,55,58,59,61,73,77,78,92}, BubbleSort.Sort(new int[]{58,47,92,61,78,77,53,73,16,55,8,46,31,59},0,13));
		TestUtils.runTest(new int[]{14,15,15,15,21,21,22,27,34,36,60,68,79,94}, BubbleSort.Sort(new int[]{15,60,21,22,15,94,21,14,68,27,15,79,34,36},0,13));
		TestUtils.runTest(new int[]{19,25,32,32,46,48,54,60,61,82,86,90,90,91}, BubbleSort.Sort(new int[]{91,61,19,90,46,32,48,60,86,82,25,54,32,90},0,13));
		TestUtils.runTest(new int[]{3,4,8,8,45,45,50,51,57,62,82,95,98,98}, BubbleSort.Sort(new int[]{98,57,45,82,4,95,3,50,45,51,62,8,8,98},0,13));
	}

	@Test
	void test15() {
		TestUtils.runTest(new int[]{1,6,10,23,25,27,31,33,37,50,51,60,80,85,97}, BubbleSort.Sort(new int[]{23,85,37,97,51,6,25,31,33,60,1,27,80,10,50},0,14));
		TestUtils.runTest(new int[]{8,15,17,33,38,42,46,54,60,66,71,83,89,93,99}, BubbleSort.Sort(new int[]{15,89,8,66,17,33,46,42,83,93,71,99,54,38,60},0,14));
		TestUtils.runTest(new int[]{0,19,23,28,29,31,45,48,54,60,61,71,85,90,93}, BubbleSort.Sort(new int[]{54,19,45,93,60,29,85,90,71,28,48,0,61,31,23},0,14));
		TestUtils.runTest(new int[]{1,4,5,11,13,18,21,25,34,42,51,54,81,94,98}, BubbleSort.Sort(new int[]{54,51,94,18,11,21,98,25,42,5,81,13,34,1,4},0,14));
		TestUtils.runTest(new int[]{6,11,26,29,40,43,51,57,69,74,76,76,78,84,89}, BubbleSort.Sort(new int[]{26,69,51,76,89,43,84,57,11,76,40,29,74,78,6},0,14));
	}

	@Test
	void test16() {
		TestUtils.runTest(new int[]{6,10,10,15,20,24,25,35,53,58,66,77,82,87,88,98}, BubbleSort.Sort(new int[]{24,77,82,88,25,87,6,66,98,35,20,53,10,15,10,58},0,15));
		TestUtils.runTest(new int[]{2,8,14,16,18,19,21,28,28,37,37,64,68,72,76,85}, BubbleSort.Sort(new int[]{28,18,37,85,19,8,68,76,21,14,37,28,2,72,64,16},0,15));
		TestUtils.runTest(new int[]{0,2,3,10,11,18,24,30,40,61,62,77,79,85,88,98}, BubbleSort.Sort(new int[]{61,24,62,77,10,40,2,11,18,0,98,30,88,85,3,79},0,15));
		TestUtils.runTest(new int[]{6,16,22,27,35,53,57,62,70,70,70,70,77,79,90,92}, BubbleSort.Sort(new int[]{27,70,70,70,90,6,79,53,16,62,22,92,35,57,70,77},0,15));
		TestUtils.runTest(new int[]{2,2,6,8,16,17,24,37,53,54,58,61,61,62,72,89}, BubbleSort.Sort(new int[]{62,54,17,58,8,2,89,2,37,72,61,16,61,6,53,24},0,15));
	}

	@Test
	void test17() {
		TestUtils.runTest(new int[]{1,15,31,34,37,40,40,49,52,56,58,66,79,82,82,84,92}, BubbleSort.Sort(new int[]{40,82,92,84,52,1,49,79,82,15,37,58,40,66,34,31,56},0,16));
		TestUtils.runTest(new int[]{9,17,27,29,32,45,48,49,53,55,63,63,66,72,78,79,84}, BubbleSort.Sort(new int[]{45,84,79,66,49,9,27,53,55,17,48,63,63,29,32,72,78},0,16));
		TestUtils.runTest(new int[]{5,6,6,20,20,23,29,35,39,49,57,78,84,87,89,96,97}, BubbleSort.Sort(new int[]{57,89,20,23,84,49,96,97,78,20,29,5,6,35,87,6,39},0,16));
		TestUtils.runTest(new int[]{0,14,20,20,21,34,37,45,46,53,55,68,70,82,84,86,91}, BubbleSort.Sort(new int[]{45,34,68,86,55,82,0,21,53,20,14,70,84,46,37,91,20},0,16));
		TestUtils.runTest(new int[]{4,10,11,24,26,37,42,49,61,63,68,70,75,82,84,92,93}, BubbleSort.Sort(new int[]{24,84,82,68,42,4,75,61,10,49,93,92,70,37,26,63,11},0,16));
	}

	@Test
	void test18() {
		TestUtils.runTest(new int[]{2,13,32,38,42,43,43,54,54,59,63,68,69,75,79,79,81,92}, BubbleSort.Sort(new int[]{75,54,38,81,69,79,54,43,59,32,92,63,13,68,42,79,43,2},0,17));
		TestUtils.runTest(new int[]{0,11,15,26,30,31,31,40,52,52,53,59,63,65,69,70,83,99}, BubbleSort.Sort(new int[]{52,59,31,30,52,15,83,11,99,70,26,65,0,69,63,31,40,53},0,17));
		TestUtils.runTest(new int[]{3,8,20,24,25,28,33,37,53,54,65,68,72,73,75,89,92,98}, BubbleSort.Sort(new int[]{33,53,37,3,65,20,75,98,92,54,25,89,8,73,24,68,28,72},0,17));
		TestUtils.runTest(new int[]{2,3,4,9,12,25,25,28,35,44,59,62,63,66,67,75,78,84}, BubbleSort.Sort(new int[]{28,12,25,9,63,2,25,59,66,67,75,84,44,3,35,4,78,62},0,17));
		TestUtils.runTest(new int[]{9,25,25,26,29,46,48,52,55,57,58,63,63,64,81,84,84,90}, BubbleSort.Sort(new int[]{48,84,58,84,63,25,55,9,64,90,57,52,81,29,46,25,63,26},0,17));
	}

	@Test
	void test19() {
		TestUtils.runTest(new int[]{1,9,13,18,19,21,21,27,35,35,35,44,51,63,74,75,82,86,97}, BubbleSort.Sort(new int[]{82,75,18,21,21,51,35,74,35,63,13,44,35,27,1,86,9,97,19},0,18));
		TestUtils.runTest(new int[]{3,3,9,12,20,27,32,35,44,47,49,49,50,50,72,72,75,94,98}, BubbleSort.Sort(new int[]{75,50,49,98,9,35,32,20,72,3,47,44,50,94,12,49,3,27,72},0,18));
		TestUtils.runTest(new int[]{2,3,6,12,16,21,28,29,44,45,46,51,52,56,61,66,76,83,95}, BubbleSort.Sort(new int[]{28,3,44,16,29,52,21,45,83,46,95,76,2,66,56,12,51,6,61},0,18));
		TestUtils.runTest(new int[]{2,5,7,7,9,21,24,37,38,48,54,59,61,72,73,80,86,96,99}, BubbleSort.Sort(new int[]{7,99,59,72,24,48,38,7,86,61,9,37,54,73,5,96,2,80,21},0,18));
		TestUtils.runTest(new int[]{2,2,5,8,11,12,17,18,25,34,44,45,50,58,63,76,89,98,99}, BubbleSort.Sort(new int[]{25,2,58,50,45,89,5,99,12,98,2,34,8,18,63,44,11,17,76},0,18));
	}

	@Test
	void test20() {
		TestUtils.runTest(new int[]{0,0,7,10,31,37,39,41,46,46,47,47,50,51,52,60,67,85,92,94}, BubbleSort.Sort(new int[]{37,31,60,52,94,0,85,47,7,39,10,46,67,50,41,51,92,47,46,0},0,19));
		TestUtils.runTest(new int[]{0,3,4,32,35,35,46,47,57,66,72,75,75,79,79,80,84,86,87,93}, BubbleSort.Sort(new int[]{66,87,79,3,35,84,32,72,80,46,86,47,75,79,35,4,0,75,93,57},0,19));
		TestUtils.runTest(new int[]{4,10,11,20,20,29,31,35,35,35,36,36,41,52,58,58,74,84,86,99}, BubbleSort.Sort(new int[]{10,41,52,31,58,20,86,29,36,36,84,35,11,35,99,35,4,20,58,74},0,19));
		TestUtils.runTest(new int[]{0,3,10,15,21,33,42,43,46,47,54,55,57,58,64,64,73,79,85,93}, BubbleSort.Sort(new int[]{47,0,64,57,64,54,42,15,33,46,58,55,85,73,79,43,10,3,93,21},0,19));
		TestUtils.runTest(new int[]{1,2,5,8,9,10,27,31,33,33,41,47,53,54,76,77,78,82,85,90}, BubbleSort.Sort(new int[]{76,1,33,2,41,77,90,5,54,9,27,85,8,78,33,31,53,82,10,47},0,19));
	}

	@Test
	void test21() {
		TestUtils.runTest(new int[]{0,0,2,7,10,12,14,20,22,25,32,34,43,46,50,54,55,65,66,77,77}, BubbleSort.Sort(new int[]{25,65,0,10,20,7,32,2,54,55,46,14,66,77,77,12,34,50,0,22,43},0,20));
		TestUtils.runTest(new int[]{1,12,28,30,38,46,52,53,53,55,55,56,59,60,63,65,70,71,75,76,89}, BubbleSort.Sort(new int[]{55,12,53,60,46,63,1,89,76,55,65,38,28,59,70,71,53,30,52,75,56},0,20));
		TestUtils.runTest(new int[]{0,12,21,23,25,33,38,47,48,49,64,69,73,73,77,80,93,96,96,97,98}, BubbleSort.Sort(new int[]{96,73,25,77,47,23,0,33,69,73,38,97,49,98,96,21,80,93,48,64,12},0,20));
		TestUtils.runTest(new int[]{1,1,5,14,17,17,29,30,31,33,33,38,39,42,55,75,81,88,89,89,91}, BubbleSort.Sort(new int[]{5,42,31,55,17,75,29,38,1,17,39,33,1,89,81,88,33,91,30,89,14},0,20));
		TestUtils.runTest(new int[]{0,7,11,16,17,21,23,26,27,28,31,45,45,75,76,76,79,89,93,96,97}, BubbleSort.Sort(new int[]{7,28,93,27,21,16,17,45,26,89,97,23,11,75,76,45,31,76,79,0,96},0,20));
	}

	@Test
	void test22() {
		TestUtils.runTest(new int[]{4,14,15,17,18,18,24,31,43,44,56,64,67,69,72,78,82,83,85,87,95,97}, BubbleSort.Sort(new int[]{15,44,14,83,85,67,56,17,97,64,18,87,95,4,78,82,18,43,69,72,24,31},0,21));
		TestUtils.runTest(new int[]{0,7,15,20,26,27,29,31,40,44,54,54,54,55,57,62,62,64,69,73,74,77}, BubbleSort.Sort(new int[]{31,7,27,54,54,55,69,26,15,64,20,73,57,54,0,29,62,44,62,74,40,77},0,21));
		TestUtils.runTest(new int[]{3,4,5,14,21,29,33,34,40,40,44,47,48,53,55,55,61,69,70,86,92,92}, BubbleSort.Sort(new int[]{92,55,29,33,47,92,4,53,48,70,5,14,3,69,55,40,21,86,40,44,34,61},0,21));
		TestUtils.runTest(new int[]{2,2,10,13,17,28,29,32,33,38,42,45,47,53,66,67,69,70,72,92,93,96}, BubbleSort.Sort(new int[]{45,38,67,93,32,17,2,72,29,69,28,42,53,96,47,70,66,13,10,33,92,2},0,21));
		TestUtils.runTest(new int[]{0,0,2,12,17,32,43,44,47,47,50,56,64,68,74,79,80,80,80,85,91,97}, BubbleSort.Sort(new int[]{43,2,80,80,56,12,80,85,97,74,79,0,17,44,91,64,47,32,68,47,50,0},0,21));
	}

	@Test
	void test23() {
		TestUtils.runTest(new int[]{0,1,7,9,21,25,26,27,33,36,38,38,49,55,63,69,80,82,87,88,90,93,95}, BubbleSort.Sort(new int[]{27,25,38,80,36,49,90,0,82,69,7,87,38,33,1,63,55,95,9,21,93,26,88},0,22));
		TestUtils.runTest(new int[]{3,5,11,13,17,18,18,21,21,23,24,25,40,44,48,53,57,77,80,84,91,96,97}, BubbleSort.Sort(new int[]{18,53,13,3,91,57,24,84,18,77,80,17,21,25,44,40,5,21,96,23,97,48,11},0,22));
		TestUtils.runTest(new int[]{5,5,6,13,14,21,22,23,27,36,39,43,43,46,47,47,49,54,60,70,70,74,83}, BubbleSort.Sort(new int[]{13,36,54,70,83,74,46,22,5,14,43,47,5,49,21,39,27,47,60,23,6,43,70},0,22));
		TestUtils.runTest(new int[]{6,7,7,7,8,9,13,20,20,21,24,32,35,39,44,52,52,59,63,69,69,72,99}, BubbleSort.Sort(new int[]{6,39,69,59,7,52,52,7,20,24,99,63,21,13,9,8,44,7,20,32,72,69,35},0,22));
		TestUtils.runTest(new int[]{18,18,22,25,27,28,43,48,54,57,58,60,66,67,68,68,69,70,73,80,89,96,98}, BubbleSort.Sort(new int[]{67,68,18,60,96,80,27,25,66,28,68,22,70,98,48,69,18,58,57,43,54,89,73},0,22));
	}

	@Test
	void test24() {
		TestUtils.runTest(new int[]{2,4,4,5,7,12,12,15,21,22,38,40,49,50,51,63,68,80,82,89,90,95,96,99}, BubbleSort.Sort(new int[]{90,63,38,40,21,50,22,51,99,12,68,7,4,5,12,95,82,49,96,2,4,15,80,89},0,23));
		TestUtils.runTest(new int[]{2,4,7,11,16,18,25,32,36,37,38,50,56,57,74,78,83,85,86,87,89,89,95,97}, BubbleSort.Sort(new int[]{50,89,56,25,36,85,18,2,57,11,74,89,97,4,78,32,38,7,37,83,16,95,87,86},0,23));
		TestUtils.runTest(new int[]{0,0,7,8,18,19,19,19,23,26,27,28,29,30,33,37,39,68,72,74,75,81,82,88}, BubbleSort.Sort(new int[]{72,68,8,26,23,82,30,18,28,81,27,0,7,19,0,88,39,29,19,33,19,37,75,74},0,23));
		TestUtils.runTest(new int[]{5,13,16,19,29,30,34,37,38,40,41,52,55,56,56,64,65,77,79,79,81,88,92,92}, BubbleSort.Sort(new int[]{13,92,77,81,19,41,65,56,38,34,64,56,29,55,52,79,92,37,30,5,16,40,79,88},0,23));
		TestUtils.runTest(new int[]{0,19,25,35,36,46,47,57,60,62,64,66,73,74,74,82,83,83,89,89,89,91,97,98}, BubbleSort.Sort(new int[]{98,25,74,97,83,83,19,47,62,36,60,91,82,89,89,57,64,0,46,35,89,74,66,73},0,23));
	}

}
