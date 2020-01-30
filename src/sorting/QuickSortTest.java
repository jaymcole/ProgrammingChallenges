package sorting;
import org.junit.jupiter.api.Test;
class QuickSortTest {
	@Test
	void test0() {
		TestUtils.runTest(new int[]{}, QuickSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, QuickSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, QuickSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, QuickSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, QuickSort.Sort(new int[]{},0,-1));
	}

	@Test
	void test1() {
		TestUtils.runTest(new int[]{29}, QuickSort.Sort(new int[]{29},0,0));
		TestUtils.runTest(new int[]{27}, QuickSort.Sort(new int[]{27},0,0));
		TestUtils.runTest(new int[]{91}, QuickSort.Sort(new int[]{91},0,0));
		TestUtils.runTest(new int[]{82}, QuickSort.Sort(new int[]{82},0,0));
		TestUtils.runTest(new int[]{79}, QuickSort.Sort(new int[]{79},0,0));
	}

	@Test
	void test2() {
		TestUtils.runTest(new int[]{70,70}, QuickSort.Sort(new int[]{70,70},0,1));
		TestUtils.runTest(new int[]{1,51}, QuickSort.Sort(new int[]{51,1},0,1));
		TestUtils.runTest(new int[]{45,50}, QuickSort.Sort(new int[]{50,45},0,1));
		TestUtils.runTest(new int[]{48,51}, QuickSort.Sort(new int[]{51,48},0,1));
		TestUtils.runTest(new int[]{88,95}, QuickSort.Sort(new int[]{95,88},0,1));
	}

	@Test
	void test3() {
		TestUtils.runTest(new int[]{42,68,80}, QuickSort.Sort(new int[]{80,68,42},0,2));
		TestUtils.runTest(new int[]{8,40,88}, QuickSort.Sort(new int[]{8,40,88},0,2));
		TestUtils.runTest(new int[]{40,54,77}, QuickSort.Sort(new int[]{77,54,40},0,2));
		TestUtils.runTest(new int[]{22,59,73}, QuickSort.Sort(new int[]{22,59,73},0,2));
		TestUtils.runTest(new int[]{24,26,30}, QuickSort.Sort(new int[]{30,24,26},0,2));
	}

	@Test
	void test4() {
		TestUtils.runTest(new int[]{51,73,97,99}, QuickSort.Sort(new int[]{99,97,73,51},0,3));
		TestUtils.runTest(new int[]{31,38,69,85}, QuickSort.Sort(new int[]{69,31,38,85},0,3));
		TestUtils.runTest(new int[]{7,7,95,96}, QuickSort.Sort(new int[]{7,7,96,95},0,3));
		TestUtils.runTest(new int[]{12,31,38,40}, QuickSort.Sort(new int[]{31,40,38,12},0,3));
		TestUtils.runTest(new int[]{11,13,36,70}, QuickSort.Sort(new int[]{70,11,36,13},0,3));
	}

	@Test
	void test5() {
		TestUtils.runTest(new int[]{25,25,57,68,74}, QuickSort.Sort(new int[]{25,25,68,74,57},0,4));
		TestUtils.runTest(new int[]{25,54,65,74,93}, QuickSort.Sort(new int[]{25,74,65,54,93},0,4));
		TestUtils.runTest(new int[]{23,51,72,76,99}, QuickSort.Sort(new int[]{76,72,51,23,99},0,4));
		TestUtils.runTest(new int[]{1,14,22,64,66}, QuickSort.Sort(new int[]{14,66,1,64,22},0,4));
		TestUtils.runTest(new int[]{14,27,31,32,67}, QuickSort.Sort(new int[]{32,14,31,67,27},0,4));
	}

	@Test
	void test6() {
		TestUtils.runTest(new int[]{13,32,38,40,77,79}, QuickSort.Sort(new int[]{79,13,32,40,77,38},0,5));
		TestUtils.runTest(new int[]{22,22,24,36,37,93}, QuickSort.Sort(new int[]{24,22,36,93,22,37},0,5));
		TestUtils.runTest(new int[]{10,43,53,60,92,97}, QuickSort.Sort(new int[]{43,97,60,92,53,10},0,5));
		TestUtils.runTest(new int[]{0,27,57,65,72,86}, QuickSort.Sort(new int[]{86,72,0,57,27,65},0,5));
		TestUtils.runTest(new int[]{11,27,44,85,87,90}, QuickSort.Sort(new int[]{11,85,87,27,44,90},0,5));
	}

	@Test
	void test7() {
		TestUtils.runTest(new int[]{15,16,19,20,74,77,81}, QuickSort.Sort(new int[]{15,19,20,16,77,74,81},0,6));
		TestUtils.runTest(new int[]{4,17,53,57,63,76,99}, QuickSort.Sort(new int[]{53,76,63,99,4,57,17},0,6));
		TestUtils.runTest(new int[]{0,1,2,31,35,56,57}, QuickSort.Sort(new int[]{2,57,1,31,56,35,0},0,6));
		TestUtils.runTest(new int[]{10,10,33,59,70,82,90}, QuickSort.Sort(new int[]{59,90,33,10,82,10,70},0,6));
		TestUtils.runTest(new int[]{14,17,21,53,57,82,95}, QuickSort.Sort(new int[]{53,57,17,21,82,95,14},0,6));
	}

	@Test
	void test8() {
		TestUtils.runTest(new int[]{33,44,48,63,68,76,79,97}, QuickSort.Sort(new int[]{79,33,63,76,48,44,97,68},0,7));
		TestUtils.runTest(new int[]{18,43,62,63,68,72,72,87}, QuickSort.Sort(new int[]{72,63,18,87,68,72,43,62},0,7));
		TestUtils.runTest(new int[]{6,8,11,16,45,57,58,94}, QuickSort.Sort(new int[]{94,58,8,11,57,16,45,6},0,7));
		TestUtils.runTest(new int[]{8,12,26,50,53,53,75,76}, QuickSort.Sort(new int[]{75,76,50,53,8,12,53,26},0,7));
		TestUtils.runTest(new int[]{3,7,46,75,75,77,92,93}, QuickSort.Sort(new int[]{75,46,93,75,77,92,7,3},0,7));
	}

	@Test
	void test9() {
		TestUtils.runTest(new int[]{9,16,28,36,63,68,72,78,97}, QuickSort.Sort(new int[]{78,36,68,28,16,63,97,9,72},0,8));
		TestUtils.runTest(new int[]{4,11,14,32,32,42,50,80,99}, QuickSort.Sort(new int[]{4,50,14,80,32,11,42,99,32},0,8));
		TestUtils.runTest(new int[]{5,18,42,48,52,77,87,90,91}, QuickSort.Sort(new int[]{90,5,87,42,91,52,48,77,18},0,8));
		TestUtils.runTest(new int[]{13,21,47,50,51,63,68,69,98}, QuickSort.Sort(new int[]{47,51,21,69,13,98,68,50,63},0,8));
		TestUtils.runTest(new int[]{15,27,48,48,48,55,58,79,81}, QuickSort.Sort(new int[]{79,48,48,55,48,81,15,27,58},0,8));
	}

	@Test
	void test10() {
		TestUtils.runTest(new int[]{27,30,32,64,70,76,84,85,99,99}, QuickSort.Sort(new int[]{70,99,99,27,84,85,64,30,32,76},0,9));
		TestUtils.runTest(new int[]{34,45,59,62,62,62,63,69,74,88}, QuickSort.Sort(new int[]{63,69,74,62,34,45,62,88,62,59},0,9));
		TestUtils.runTest(new int[]{23,23,24,47,53,58,60,76,87,95}, QuickSort.Sort(new int[]{87,58,95,76,23,60,24,23,47,53},0,9));
		TestUtils.runTest(new int[]{1,6,9,21,26,26,47,50,78,91}, QuickSort.Sort(new int[]{91,26,47,1,9,26,78,6,50,21},0,9));
		TestUtils.runTest(new int[]{29,40,64,70,80,83,87,92,95,97}, QuickSort.Sort(new int[]{92,40,64,83,29,95,70,97,80,87},0,9));
	}

	@Test
	void test11() {
		TestUtils.runTest(new int[]{24,25,30,35,62,68,72,86,93,94,94}, QuickSort.Sort(new int[]{86,93,24,30,68,62,35,94,94,25,72},0,10));
		TestUtils.runTest(new int[]{5,32,34,39,52,67,70,75,84,88,93}, QuickSort.Sort(new int[]{5,84,34,39,93,67,88,52,70,75,32},0,10));
		TestUtils.runTest(new int[]{4,18,18,22,23,34,35,36,62,77,84}, QuickSort.Sort(new int[]{4,84,23,77,18,35,18,22,62,34,36},0,10));
		TestUtils.runTest(new int[]{14,17,25,31,42,59,60,61,67,76,79}, QuickSort.Sort(new int[]{17,25,31,14,67,76,60,59,61,42,79},0,10));
		TestUtils.runTest(new int[]{1,3,36,52,70,76,80,83,83,88,97}, QuickSort.Sort(new int[]{52,97,76,36,70,83,88,1,83,3,80},0,10));
	}

	@Test
	void test12() {
		TestUtils.runTest(new int[]{0,15,29,54,58,60,76,76,89,92,93,95}, QuickSort.Sort(new int[]{95,15,76,29,0,54,76,60,93,89,58,92},0,11));
		TestUtils.runTest(new int[]{7,10,10,13,27,27,33,35,37,43,61,84}, QuickSort.Sort(new int[]{84,13,10,35,61,27,7,43,10,33,27,37},0,11));
		TestUtils.runTest(new int[]{5,7,14,34,36,49,62,62,76,78,79,93}, QuickSort.Sort(new int[]{49,62,36,76,62,78,34,7,5,93,79,14},0,11));
		TestUtils.runTest(new int[]{14,39,42,49,51,52,53,66,71,75,87,99}, QuickSort.Sort(new int[]{99,71,42,87,49,52,53,75,51,14,66,39},0,11));
		TestUtils.runTest(new int[]{0,8,21,32,34,48,51,65,66,86,90,96}, QuickSort.Sort(new int[]{86,48,0,8,96,21,32,51,65,90,34,66},0,11));
	}

	@Test
	void test13() {
		TestUtils.runTest(new int[]{6,10,15,28,35,41,55,57,61,83,89,91,99}, QuickSort.Sort(new int[]{91,57,6,89,35,61,15,28,55,83,10,99,41},0,12));
		TestUtils.runTest(new int[]{6,8,8,14,17,19,27,35,37,45,55,78,96}, QuickSort.Sort(new int[]{14,6,96,78,27,17,8,45,19,8,37,55,35},0,12));
		TestUtils.runTest(new int[]{14,23,24,29,30,43,56,67,83,84,90,95,99}, QuickSort.Sort(new int[]{23,56,14,67,99,84,90,95,29,43,24,30,83},0,12));
		TestUtils.runTest(new int[]{3,5,8,19,26,38,48,63,70,75,78,96,97}, QuickSort.Sort(new int[]{97,63,96,75,26,5,3,48,8,78,70,38,19},0,12));
		TestUtils.runTest(new int[]{6,18,23,24,38,39,43,60,65,65,67,83,90}, QuickSort.Sort(new int[]{65,67,6,90,60,23,18,43,38,65,39,83,24},0,12));
	}

	@Test
	void test14() {
		TestUtils.runTest(new int[]{19,20,24,27,37,40,40,46,60,68,70,77,81,98}, QuickSort.Sort(new int[]{40,68,60,40,37,24,19,46,77,81,70,98,27,20},0,13));
		TestUtils.runTest(new int[]{10,11,15,17,20,34,35,36,50,81,82,86,98,99}, QuickSort.Sort(new int[]{99,15,98,81,11,10,86,82,35,50,34,36,17,20},0,13));
		TestUtils.runTest(new int[]{0,0,15,17,27,37,41,48,69,80,82,83,88,99}, QuickSort.Sort(new int[]{99,27,15,69,0,48,80,83,82,17,0,37,41,88},0,13));
		TestUtils.runTest(new int[]{5,5,6,20,21,26,27,61,63,71,81,88,89,90}, QuickSort.Sort(new int[]{71,26,89,61,81,21,27,90,5,20,5,6,88,63},0,13));
		TestUtils.runTest(new int[]{6,11,17,32,41,43,58,61,79,82,84,88,94,96}, QuickSort.Sort(new int[]{6,41,61,17,82,94,84,88,43,79,96,58,32,11},0,13));
	}

	@Test
	void test15() {
		TestUtils.runTest(new int[]{7,17,22,29,36,47,48,56,64,67,68,70,84,89,95}, QuickSort.Sort(new int[]{70,64,47,84,48,95,29,7,22,67,89,17,68,36,56},0,14));
		TestUtils.runTest(new int[]{7,14,14,35,36,37,48,53,63,73,78,81,93,94,97}, QuickSort.Sort(new int[]{7,53,93,81,73,36,35,94,97,14,78,37,14,63,48},0,14));
		TestUtils.runTest(new int[]{1,21,34,37,38,44,45,50,56,58,65,65,74,96,97}, QuickSort.Sort(new int[]{44,38,34,50,96,21,65,65,37,56,58,74,45,1,97},0,14));
		TestUtils.runTest(new int[]{7,10,24,25,28,35,40,45,46,59,60,81,86,90,97}, QuickSort.Sort(new int[]{25,46,35,45,81,90,40,97,28,10,24,60,59,7,86},0,14));
		TestUtils.runTest(new int[]{9,13,25,31,33,35,44,48,61,66,67,78,89,89,94}, QuickSort.Sort(new int[]{78,61,9,89,48,25,89,35,67,94,31,33,44,66,13},0,14));
	}

	@Test
	void test16() {
		TestUtils.runTest(new int[]{5,26,32,39,39,54,68,74,75,79,80,80,84,87,99,99}, QuickSort.Sort(new int[]{80,39,99,84,74,26,75,5,39,68,80,87,54,32,99,79},0,15));
		TestUtils.runTest(new int[]{15,16,20,33,41,49,55,55,60,63,66,69,80,84,96,98}, QuickSort.Sort(new int[]{49,20,69,60,96,84,55,55,98,41,16,80,33,66,15,63},0,15));
		TestUtils.runTest(new int[]{10,18,26,32,38,44,45,46,47,49,58,69,72,75,87,99}, QuickSort.Sort(new int[]{45,26,87,69,75,10,58,18,32,38,49,72,99,44,46,47},0,15));
		TestUtils.runTest(new int[]{3,5,17,22,22,28,30,35,41,46,49,59,71,77,81,96}, QuickSort.Sort(new int[]{41,22,77,49,28,30,81,17,59,3,71,35,5,46,96,22},0,15));
		TestUtils.runTest(new int[]{2,14,15,16,16,23,28,37,42,46,63,68,69,79,79,96}, QuickSort.Sort(new int[]{16,15,96,79,79,42,68,37,16,46,69,63,28,2,23,14},0,15));
	}

	@Test
	void test17() {
		TestUtils.runTest(new int[]{9,12,19,20,24,28,38,46,47,54,54,55,69,93,93,94,96}, QuickSort.Sort(new int[]{24,47,28,96,69,54,19,38,12,46,9,93,20,94,55,54,93},0,16));
		TestUtils.runTest(new int[]{1,15,21,26,33,40,43,49,52,59,64,66,75,79,87,91,95}, QuickSort.Sort(new int[]{21,26,15,66,95,75,59,91,1,43,33,49,52,87,64,40,79},0,16));
		TestUtils.runTest(new int[]{1,16,22,30,31,34,38,54,56,58,64,68,74,76,84,96,99}, QuickSort.Sort(new int[]{38,96,22,31,68,16,54,74,56,30,76,84,58,99,1,64,34},0,16));
		TestUtils.runTest(new int[]{4,10,13,21,25,35,38,43,52,56,58,60,62,66,67,73,76}, QuickSort.Sort(new int[]{52,58,35,4,10,13,38,56,21,25,67,66,73,60,43,76,62},0,16));
		TestUtils.runTest(new int[]{0,1,3,18,22,34,35,52,53,54,54,61,74,75,81,81,81}, QuickSort.Sort(new int[]{52,75,54,35,61,1,3,53,81,81,54,74,18,81,34,0,22},0,16));
	}

	@Test
	void test18() {
		TestUtils.runTest(new int[]{9,14,17,18,21,33,52,54,54,58,59,66,69,74,88,95,95,99}, QuickSort.Sort(new int[]{59,54,52,54,14,66,33,9,99,88,18,95,74,21,69,58,17,95},0,17));
		TestUtils.runTest(new int[]{0,0,3,5,8,9,20,21,25,37,42,44,51,52,59,79,81,98}, QuickSort.Sort(new int[]{25,21,81,42,3,0,9,98,37,5,52,0,8,44,51,79,20,59},0,17));
		TestUtils.runTest(new int[]{0,3,23,43,45,46,49,50,50,56,64,73,74,75,77,79,83,89}, QuickSort.Sort(new int[]{75,83,46,56,73,89,45,3,77,49,74,64,0,79,43,23,50,50},0,17));
		TestUtils.runTest(new int[]{12,23,28,28,32,44,47,51,54,55,61,62,72,78,78,84,86,88}, QuickSort.Sort(new int[]{44,88,32,12,86,62,84,28,51,72,55,61,78,78,28,23,47,54},0,17));
		TestUtils.runTest(new int[]{4,7,14,27,37,42,44,49,49,52,56,69,70,71,91,94,95,98}, QuickSort.Sort(new int[]{27,44,4,91,71,69,49,52,37,56,94,49,95,98,7,70,14,42},0,17));
	}

	@Test
	void test19() {
		TestUtils.runTest(new int[]{16,20,24,26,29,38,53,70,71,73,73,78,84,90,93,94,96,98,98}, QuickSort.Sort(new int[]{96,29,53,20,78,71,70,73,90,24,26,16,98,93,73,98,94,38,84},0,18));
		TestUtils.runTest(new int[]{0,2,18,20,33,38,41,44,53,53,65,67,78,79,83,83,85,86,98}, QuickSort.Sort(new int[]{83,98,67,20,85,33,44,0,18,41,2,79,53,86,78,83,38,65,53},0,18));
		TestUtils.runTest(new int[]{8,11,22,22,27,37,47,48,48,50,52,57,60,71,75,77,77,89,94}, QuickSort.Sort(new int[]{22,75,77,50,71,48,52,27,37,47,11,94,89,77,8,60,22,57,48},0,18));
		TestUtils.runTest(new int[]{2,3,3,13,13,18,41,42,55,55,62,66,69,84,87,89,90,94,98}, QuickSort.Sort(new int[]{13,66,98,2,3,87,89,55,90,3,41,84,69,42,18,13,94,55,62},0,18));
		TestUtils.runTest(new int[]{6,6,6,11,19,19,27,27,33,39,40,49,56,62,65,69,77,96,97}, QuickSort.Sort(new int[]{56,96,6,39,19,6,69,11,19,97,33,65,27,6,40,27,49,62,77},0,18));
	}

	@Test
	void test20() {
		TestUtils.runTest(new int[]{2,12,16,19,26,27,29,34,39,41,45,48,58,69,71,80,81,85,89,90}, QuickSort.Sort(new int[]{89,12,71,81,34,58,19,69,80,48,90,85,2,16,41,39,29,27,26,45},0,19));
		TestUtils.runTest(new int[]{0,2,14,23,33,35,35,39,61,66,71,72,74,80,82,87,89,90,91,91}, QuickSort.Sort(new int[]{23,61,66,90,0,74,89,35,72,87,82,71,39,2,14,91,35,91,33,80},0,19));
		TestUtils.runTest(new int[]{0,13,21,22,29,30,36,37,52,52,58,62,64,68,73,82,87,88,89,95}, QuickSort.Sort(new int[]{87,37,64,13,29,89,73,62,22,21,82,68,95,88,0,52,52,30,36,58},0,19));
		TestUtils.runTest(new int[]{8,12,14,21,26,29,30,41,44,48,51,54,60,60,70,81,86,88,91,92}, QuickSort.Sort(new int[]{54,8,51,91,29,70,48,60,30,41,60,88,44,92,86,12,14,26,81,21},0,19));
		TestUtils.runTest(new int[]{7,7,15,25,26,29,31,42,47,48,50,53,55,61,74,77,79,81,86,97}, QuickSort.Sort(new int[]{50,7,97,42,74,81,86,61,79,53,77,25,55,31,26,47,48,7,15,29},0,19));
	}

	@Test
	void test21() {
		TestUtils.runTest(new int[]{1,1,13,21,24,25,29,37,51,54,78,80,87,88,88,90,91,92,94,94,99}, QuickSort.Sort(new int[]{91,54,94,87,51,25,94,29,21,24,92,90,37,88,13,88,1,99,1,80,78},0,20));
		TestUtils.runTest(new int[]{1,3,19,24,33,33,39,39,40,49,52,54,55,58,63,65,73,84,93,94,99}, QuickSort.Sort(new int[]{73,94,33,33,49,63,65,19,93,1,24,52,55,39,58,39,84,54,40,99,3},0,20));
		TestUtils.runTest(new int[]{4,17,19,21,27,29,32,36,41,41,43,51,56,58,61,64,66,70,75,77,93}, QuickSort.Sort(new int[]{43,19,27,64,61,93,58,75,77,56,41,29,41,17,51,66,21,70,32,36,4},0,20));
		TestUtils.runTest(new int[]{5,7,11,15,16,18,22,33,34,39,43,45,57,57,71,73,74,82,83,89,95}, QuickSort.Sort(new int[]{73,43,39,18,5,89,34,16,74,71,83,22,45,7,15,33,82,11,57,57,95},0,20));
		TestUtils.runTest(new int[]{10,23,30,37,37,37,40,41,55,60,66,67,77,77,78,81,84,84,86,86,92}, QuickSort.Sort(new int[]{40,41,60,30,86,37,77,86,77,84,81,67,55,23,84,92,10,37,66,78,37},0,20));
	}

	@Test
	void test22() {
		TestUtils.runTest(new int[]{3,7,9,17,18,24,27,30,48,57,61,61,63,71,76,79,81,84,96,97,97,98}, QuickSort.Sort(new int[]{27,96,48,18,57,17,30,84,76,61,71,63,61,9,79,24,3,98,81,7,97,97},0,21));
		TestUtils.runTest(new int[]{3,4,10,11,15,17,17,25,35,39,41,49,50,57,60,65,69,71,71,73,80,87}, QuickSort.Sort(new int[]{10,57,3,4,71,15,87,71,73,17,39,49,60,80,35,69,17,11,41,50,65,25},0,21));
		TestUtils.runTest(new int[]{3,10,12,12,17,19,22,26,30,47,51,55,58,58,59,67,67,78,91,92,97,99}, QuickSort.Sort(new int[]{78,47,12,59,91,17,19,58,92,51,22,67,58,3,10,99,67,26,30,12,97,55},0,21));
		TestUtils.runTest(new int[]{2,5,12,17,31,36,38,40,54,54,54,59,60,61,67,70,79,81,90,92,93,94}, QuickSort.Sort(new int[]{17,5,67,93,92,38,36,60,54,31,70,81,54,79,94,90,12,54,40,2,61,59},0,21));
		TestUtils.runTest(new int[]{1,2,7,9,16,22,26,29,29,29,35,40,45,45,48,48,52,56,63,65,67,86}, QuickSort.Sort(new int[]{29,45,56,16,29,45,2,1,67,63,26,52,7,29,86,40,48,22,48,9,35,65},0,21));
	}

	@Test
	void test23() {
		TestUtils.runTest(new int[]{1,5,11,14,16,22,24,31,32,32,50,52,55,60,60,67,76,77,85,92,92,95,97}, QuickSort.Sort(new int[]{24,22,60,92,55,14,92,32,16,85,32,1,11,52,5,31,76,60,97,67,77,95,50},0,22));
		TestUtils.runTest(new int[]{1,4,5,10,10,11,11,22,26,28,45,50,60,66,75,77,77,89,90,91,91,94,95}, QuickSort.Sort(new int[]{26,28,89,50,1,4,94,60,10,75,22,77,91,66,95,10,91,45,11,90,11,77,5},0,22));
		TestUtils.runTest(new int[]{14,16,16,22,24,27,33,38,43,45,46,52,56,65,69,71,74,76,76,77,78,84,88}, QuickSort.Sort(new int[]{24,71,16,69,77,43,45,88,76,38,33,46,22,84,74,52,65,56,14,78,16,76,27},0,22));
		TestUtils.runTest(new int[]{2,6,7,8,8,19,24,24,26,33,33,37,39,41,43,46,56,57,58,63,64,89,91}, QuickSort.Sort(new int[]{33,26,37,43,91,64,8,24,63,56,7,39,89,41,58,57,8,33,6,2,46,19,24},0,22));
		TestUtils.runTest(new int[]{1,2,7,11,29,38,39,42,46,54,60,62,64,73,73,73,74,76,80,80,82,83,87}, QuickSort.Sort(new int[]{29,73,46,87,73,82,62,42,64,76,38,73,7,60,54,39,74,80,83,2,80,11,1},0,22));
	}

	@Test
	void test24() {
		TestUtils.runTest(new int[]{13,19,19,22,30,30,31,35,36,37,42,47,61,62,63,70,75,78,82,83,84,97,98,98}, QuickSort.Sort(new int[]{13,62,70,30,98,97,61,22,84,35,78,31,82,37,83,98,42,19,19,63,47,36,30,75},0,23));
		TestUtils.runTest(new int[]{1,1,3,6,8,10,13,21,34,36,36,36,39,43,48,56,71,85,87,88,89,93,98,99}, QuickSort.Sort(new int[]{85,56,6,36,8,88,3,87,43,89,36,13,98,21,48,99,1,71,34,1,39,10,36,93},0,23));
		TestUtils.runTest(new int[]{3,14,19,30,38,41,44,46,56,58,61,62,64,70,72,76,80,81,82,86,89,90,93,99}, QuickSort.Sort(new int[]{56,93,72,14,82,46,90,76,30,38,58,99,81,62,70,89,61,64,44,80,3,19,86,41},0,23));
		TestUtils.runTest(new int[]{4,7,12,22,26,30,32,34,36,39,41,43,45,51,60,69,70,75,81,85,90,91,91,96}, QuickSort.Sort(new int[]{34,32,39,90,41,26,45,91,51,7,69,22,4,30,91,36,85,60,12,96,81,70,43,75},0,23));
		TestUtils.runTest(new int[]{1,2,19,28,36,36,48,49,51,52,54,58,59,71,72,72,75,76,80,81,83,94,95,99}, QuickSort.Sort(new int[]{2,72,83,54,59,58,95,1,36,72,19,52,48,75,51,28,76,71,94,99,36,80,49,81},0,23));
	}

}
