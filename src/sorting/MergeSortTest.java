package sorting;
import org.junit.jupiter.api.Test;
class MergeSortTest {
	@Test
	void test0() {
		TestUtils.runTest(new int[]{}, MergeSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, MergeSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, MergeSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, MergeSort.Sort(new int[]{},0,-1));
		TestUtils.runTest(new int[]{}, MergeSort.Sort(new int[]{},0,-1));
	}

	@Test
	void test1() {
		TestUtils.runTest(new int[]{93}, MergeSort.Sort(new int[]{93},0,0));
		TestUtils.runTest(new int[]{1}, MergeSort.Sort(new int[]{1},0,0));
		TestUtils.runTest(new int[]{17}, MergeSort.Sort(new int[]{17},0,0));
		TestUtils.runTest(new int[]{17}, MergeSort.Sort(new int[]{17},0,0));
		TestUtils.runTest(new int[]{45}, MergeSort.Sort(new int[]{45},0,0));
	}

	@Test
	void test2() {
		TestUtils.runTest(new int[]{1,41}, MergeSort.Sort(new int[]{1,41},0,1));
		TestUtils.runTest(new int[]{49,75}, MergeSort.Sort(new int[]{75,49},0,1));
		TestUtils.runTest(new int[]{34,72}, MergeSort.Sort(new int[]{34,72},0,1));
		TestUtils.runTest(new int[]{61,83}, MergeSort.Sort(new int[]{83,61},0,1));
		TestUtils.runTest(new int[]{4,42}, MergeSort.Sort(new int[]{4,42},0,1));
	}

	@Test
	void test3() {
		TestUtils.runTest(new int[]{28,54,78}, MergeSort.Sort(new int[]{54,78,28},0,2));
		TestUtils.runTest(new int[]{3,36,96}, MergeSort.Sort(new int[]{3,96,36},0,2));
		TestUtils.runTest(new int[]{38,44,45}, MergeSort.Sort(new int[]{44,45,38},0,2));
		TestUtils.runTest(new int[]{13,34,63}, MergeSort.Sort(new int[]{63,34,13},0,2));
		TestUtils.runTest(new int[]{29,30,68}, MergeSort.Sort(new int[]{68,30,29},0,2));
		
	}

	@Test
	void test4() {
		TestUtils.runTest(new int[]{13,25,54,89}, MergeSort.Sort(new int[]{54,89,13,25},0,3));
		TestUtils.runTest(new int[]{7,8,35,67}, MergeSort.Sort(new int[]{67,8,35,7},0,3));
		TestUtils.runTest(new int[]{2,46,62,97}, MergeSort.Sort(new int[]{2,97,46,62},0,3));
		TestUtils.runTest(new int[]{1,12,30,63}, MergeSort.Sort(new int[]{30,1,63,12},0,3));
		TestUtils.runTest(new int[]{7,19,25,99}, MergeSort.Sort(new int[]{99,19,7,25},0,3));
	}

	@Test
	void test5() {
		TestUtils.runTest(new int[]{3,21,33,63,73}, MergeSort.Sort(new int[]{63,3,73,21,33},0,4));
		TestUtils.runTest(new int[]{9,41,60,77,95}, MergeSort.Sort(new int[]{41,95,77,9,60},0,4));
		TestUtils.runTest(new int[]{21,26,65,88,95}, MergeSort.Sort(new int[]{95,88,26,65,21},0,4));
		TestUtils.runTest(new int[]{12,46,72,81,92}, MergeSort.Sort(new int[]{12,92,72,46,81},0,4));
		TestUtils.runTest(new int[]{1,13,17,47,89}, MergeSort.Sort(new int[]{47,1,17,13,89},0,4));
	}

	@Test
	void test6() {
		TestUtils.runTest(new int[]{31,35,47,60,64,72}, MergeSort.Sort(new int[]{64,72,35,60,31,47},0,5));
		TestUtils.runTest(new int[]{13,36,59,72,84,85}, MergeSort.Sort(new int[]{13,36,85,84,72,59},0,5));
		TestUtils.runTest(new int[]{11,20,26,37,64,91}, MergeSort.Sort(new int[]{20,26,37,64,11,91},0,5));
		TestUtils.runTest(new int[]{14,19,28,90,90,98}, MergeSort.Sort(new int[]{19,90,98,90,28,14},0,5));
		TestUtils.runTest(new int[]{0,40,42,83,87,88}, MergeSort.Sort(new int[]{0,83,87,88,40,42},0,5));
	}

	@Test
	void test7() {
		TestUtils.runTest(new int[]{6,18,54,65,75,76,79}, MergeSort.Sort(new int[]{79,65,76,6,18,75,54},0,6));
		TestUtils.runTest(new int[]{22,31,38,39,52,83,84}, MergeSort.Sort(new int[]{22,38,39,52,83,31,84},0,6));
		TestUtils.runTest(new int[]{61,64,66,69,72,84,85}, MergeSort.Sort(new int[]{84,61,85,66,69,64,72},0,6));
		TestUtils.runTest(new int[]{11,20,21,31,32,50,97}, MergeSort.Sort(new int[]{21,97,11,50,31,32,20},0,6));
		TestUtils.runTest(new int[]{12,34,34,45,54,75,77}, MergeSort.Sort(new int[]{34,77,54,12,75,34,45},0,6));
	}

	@Test
	void test8() {
		TestUtils.runTest(new int[]{50,67,75,87,90,91,94,99}, MergeSort.Sort(new int[]{50,87,75,90,67,99,91,94},0,7));
		TestUtils.runTest(new int[]{3,19,35,56,74,76,83,83}, MergeSort.Sort(new int[]{56,83,35,76,83,19,3,74},0,7));
		TestUtils.runTest(new int[]{21,24,28,45,50,66,71,97}, MergeSort.Sort(new int[]{45,97,71,66,21,50,28,24},0,7));
		TestUtils.runTest(new int[]{5,19,71,80,87,90,91,91}, MergeSort.Sort(new int[]{19,5,87,90,71,91,80,91},0,7));
		TestUtils.runTest(new int[]{14,15,15,46,52,61,77,89}, MergeSort.Sort(new int[]{52,14,61,89,15,15,46,77},0,7));
	}

	@Test
	void test9() {
		TestUtils.runTest(new int[]{2,6,22,38,49,69,78,80,82}, MergeSort.Sort(new int[]{80,82,69,6,49,78,38,22,2},0,8));
		TestUtils.runTest(new int[]{1,8,28,30,30,32,49,60,69}, MergeSort.Sort(new int[]{30,69,49,8,28,1,60,30,32},0,8));
		TestUtils.runTest(new int[]{17,45,45,57,57,60,66,86,98}, MergeSort.Sort(new int[]{57,45,45,98,86,66,17,57,60},0,8));
		TestUtils.runTest(new int[]{8,17,20,28,36,63,70,87,87}, MergeSort.Sort(new int[]{36,17,8,70,63,28,87,20,87},0,8));
		TestUtils.runTest(new int[]{2,29,30,34,60,83,86,89,90}, MergeSort.Sort(new int[]{86,89,60,30,83,90,2,29,34},0,8));
	}

	@Test
	void test10() {
		TestUtils.runTest(new int[]{1,9,14,23,33,44,52,59,67,83}, MergeSort.Sort(new int[]{52,33,1,14,44,67,59,83,23,9},0,9));
		TestUtils.runTest(new int[]{14,23,28,34,39,48,57,59,75,96}, MergeSort.Sort(new int[]{75,23,59,48,34,57,96,28,39,14},0,9));
		TestUtils.runTest(new int[]{6,7,17,22,39,41,75,86,90,94}, MergeSort.Sort(new int[]{7,86,90,39,94,17,41,75,6,22},0,9));
		TestUtils.runTest(new int[]{10,14,19,20,22,31,53,61,74,74}, MergeSort.Sort(new int[]{74,74,14,10,53,20,61,22,19,31},0,9));
		TestUtils.runTest(new int[]{4,5,17,17,44,60,63,64,73,87}, MergeSort.Sort(new int[]{87,17,73,4,17,5,44,60,64,63},0,9));
	}

	@Test
	void test11() {
		TestUtils.runTest(new int[]{0,37,48,53,56,62,75,77,88,91,97}, MergeSort.Sort(new int[]{37,48,97,75,53,56,91,77,62,0,88},0,10));
		TestUtils.runTest(new int[]{2,54,58,58,65,70,74,81,82,89,93}, MergeSort.Sort(new int[]{65,58,74,89,2,82,70,54,81,58,93},0,10));
		TestUtils.runTest(new int[]{7,8,38,42,45,46,66,74,75,77,84}, MergeSort.Sort(new int[]{7,46,84,42,45,75,74,38,8,77,66},0,10));
		TestUtils.runTest(new int[]{9,15,16,20,21,37,40,65,73,80,95}, MergeSort.Sort(new int[]{16,73,37,9,40,65,80,15,21,95,20},0,10));
		TestUtils.runTest(new int[]{10,44,47,50,61,63,64,70,83,95,96}, MergeSort.Sort(new int[]{47,10,95,70,63,50,83,96,44,64,61},0,10));
	}

	@Test
	void test12() {
		TestUtils.runTest(new int[]{20,22,23,35,44,52,72,75,75,82,88,96}, MergeSort.Sort(new int[]{75,72,22,23,75,35,82,96,20,52,88,44},0,11));
		TestUtils.runTest(new int[]{11,21,24,38,50,58,62,66,79,84,88,97}, MergeSort.Sort(new int[]{38,21,79,24,97,84,50,88,58,62,11,66},0,11));
		TestUtils.runTest(new int[]{4,10,29,48,67,67,69,69,77,82,84,94}, MergeSort.Sort(new int[]{69,4,67,48,67,84,77,10,82,29,69,94},0,11));
		TestUtils.runTest(new int[]{1,5,25,34,44,44,75,88,89,90,96,98}, MergeSort.Sort(new int[]{44,96,1,88,5,25,75,34,89,90,98,44},0,11));
		TestUtils.runTest(new int[]{3,5,11,17,21,21,27,40,69,75,94,96}, MergeSort.Sort(new int[]{17,11,3,21,75,94,21,40,69,5,96,27},0,11));
	}

	@Test
	void test13() {
		TestUtils.runTest(new int[]{13,26,42,47,49,54,55,63,67,68,83,85,92}, MergeSort.Sort(new int[]{63,67,55,54,85,83,13,26,47,49,42,92,68},0,12));
		TestUtils.runTest(new int[]{4,4,8,16,22,33,46,48,49,60,61,84,85}, MergeSort.Sort(new int[]{4,84,85,22,48,33,49,60,61,16,46,4,8},0,12));
		TestUtils.runTest(new int[]{4,7,8,15,19,27,31,56,60,63,65,69,83}, MergeSort.Sort(new int[]{31,83,56,63,15,65,7,4,19,69,8,27,60},0,12));
		TestUtils.runTest(new int[]{2,7,12,18,27,27,32,62,65,69,69,73,82}, MergeSort.Sort(new int[]{27,18,65,62,32,73,69,69,12,82,2,27,7},0,12));
		TestUtils.runTest(new int[]{14,15,18,19,20,23,40,53,55,60,93,96,96}, MergeSort.Sort(new int[]{14,23,93,18,60,96,53,40,55,96,15,20,19},0,12));
	}

	@Test
	void test14() {
		TestUtils.runTest(new int[]{6,21,29,35,36,37,39,48,53,55,63,88,89,93}, MergeSort.Sort(new int[]{36,29,39,53,88,93,6,55,37,89,35,63,48,21},0,13));
		TestUtils.runTest(new int[]{0,9,9,12,23,53,64,69,70,74,78,86,91,93}, MergeSort.Sort(new int[]{12,0,53,9,74,78,64,86,93,23,9,69,91,70},0,13));
		TestUtils.runTest(new int[]{3,11,14,31,35,46,51,56,58,59,74,89,91,94}, MergeSort.Sort(new int[]{58,35,91,56,11,3,31,46,94,59,51,14,89,74},0,13));
		TestUtils.runTest(new int[]{0,1,6,21,25,34,35,39,43,60,61,63,71,96}, MergeSort.Sort(new int[]{39,35,25,63,43,60,1,34,21,6,0,96,71,61},0,13));
		TestUtils.runTest(new int[]{0,4,5,7,13,17,36,40,41,47,48,64,80,81}, MergeSort.Sort(new int[]{4,48,0,80,36,13,7,17,41,40,47,5,81,64},0,13));
	}

	@Test
	void test15() {
		TestUtils.runTest(new int[]{12,14,16,18,20,33,37,41,45,55,56,58,77,93,98}, MergeSort.Sort(new int[]{93,41,20,37,18,77,16,33,12,14,45,58,98,56,55},0,14));
		TestUtils.runTest(new int[]{3,13,18,19,21,27,37,54,55,70,72,76,82,87,97}, MergeSort.Sort(new int[]{97,18,27,13,72,87,55,82,76,3,70,37,54,21,19},0,14));
		TestUtils.runTest(new int[]{7,7,18,20,22,27,33,48,49,59,70,78,79,90,99}, MergeSort.Sort(new int[]{33,79,48,18,99,59,90,49,78,22,20,7,70,27,7},0,14));
		TestUtils.runTest(new int[]{4,5,7,12,28,29,39,48,48,48,54,57,67,73,91}, MergeSort.Sort(new int[]{12,29,54,91,48,67,5,48,73,28,48,7,39,4,57},0,14));
		TestUtils.runTest(new int[]{2,2,3,7,11,14,14,21,23,34,59,60,74,80,89}, MergeSort.Sort(new int[]{59,11,14,3,89,80,2,7,21,23,74,34,14,2,60},0,14));
	}

	@Test
	void test16() {
		TestUtils.runTest(new int[]{0,8,11,11,17,17,18,18,35,36,66,81,86,91,94,96}, MergeSort.Sort(new int[]{94,18,36,66,91,0,96,11,18,35,11,86,17,8,17,81},0,15));
		TestUtils.runTest(new int[]{6,8,15,22,39,44,48,50,59,59,63,64,68,71,77,94}, MergeSort.Sort(new int[]{94,59,48,44,22,39,59,64,15,68,50,71,77,63,8,6},0,15));
		TestUtils.runTest(new int[]{11,12,14,20,31,37,41,44,45,46,47,64,77,79,96,99}, MergeSort.Sort(new int[]{14,41,46,31,64,20,99,12,44,47,96,77,11,45,79,37},0,15));
		TestUtils.runTest(new int[]{18,19,20,26,32,33,35,41,56,57,58,60,71,71,87,94}, MergeSort.Sort(new int[]{33,18,41,20,87,58,56,94,32,35,71,60,71,26,19,57},0,15));
		TestUtils.runTest(new int[]{8,18,21,27,45,48,51,52,52,63,66,72,73,74,82,91}, MergeSort.Sort(new int[]{52,45,48,27,82,72,18,8,91,74,66,51,21,63,73,52},0,15));
	}

	@Test
	void test17() {
		TestUtils.runTest(new int[]{6,8,22,30,31,41,45,47,55,58,64,65,84,92,94,95,97}, MergeSort.Sort(new int[]{65,92,55,97,94,95,6,84,8,58,22,30,64,47,45,41,31},0,16));
		TestUtils.runTest(new int[]{18,23,29,31,40,42,47,49,49,57,57,64,73,80,87,90,90}, MergeSort.Sort(new int[]{90,64,73,87,31,40,57,57,42,47,90,49,49,80,18,23,29},0,16));
		TestUtils.runTest(new int[]{1,2,13,21,30,33,34,36,37,63,63,74,78,81,88,95,95}, MergeSort.Sort(new int[]{30,63,2,78,13,21,63,81,95,34,88,95,1,37,33,36,74},0,16));
		TestUtils.runTest(new int[]{2,18,21,33,37,46,49,59,62,66,74,80,80,81,85,91,95}, MergeSort.Sort(new int[]{95,80,33,74,59,21,85,80,81,2,91,18,66,62,49,37,46},0,16));
		TestUtils.runTest(new int[]{0,1,6,8,19,22,34,34,73,73,80,85,87,92,93,93,98}, MergeSort.Sort(new int[]{93,73,6,22,8,92,1,73,19,85,0,34,34,87,80,93,98},0,16));
	}

	@Test
	void test18() {
		TestUtils.runTest(new int[]{1,2,4,6,11,19,38,45,46,56,58,58,69,92,93,94,94,96}, MergeSort.Sort(new int[]{19,6,11,1,45,93,96,92,2,94,69,38,4,94,58,58,46,56},0,17));
		TestUtils.runTest(new int[]{4,6,14,17,21,25,32,33,43,43,53,56,57,64,75,77,82,94}, MergeSort.Sort(new int[]{6,56,94,21,33,17,82,4,64,75,43,32,77,43,25,14,57,53},0,17));
		TestUtils.runTest(new int[]{11,17,29,30,31,39,44,59,65,66,66,87,89,90,90,93,95,99}, MergeSort.Sort(new int[]{11,90,39,59,30,89,66,17,90,95,44,93,65,99,87,66,29,31},0,17));
		TestUtils.runTest(new int[]{0,9,21,34,34,36,42,43,49,54,67,67,68,69,69,79,84,89}, MergeSort.Sort(new int[]{68,34,89,67,34,84,0,67,69,21,9,49,69,54,43,42,79,36},0,17));
		TestUtils.runTest(new int[]{24,24,37,38,45,46,46,54,55,58,62,65,69,73,75,87,93,95}, MergeSort.Sort(new int[]{65,45,58,24,87,73,46,62,69,75,54,55,24,95,37,46,38,93},0,17));
	}

	@Test
	void test19() {
		TestUtils.runTest(new int[]{5,9,16,20,25,26,32,34,45,52,57,66,70,74,74,74,75,94,97}, MergeSort.Sort(new int[]{45,32,9,57,75,74,26,16,94,52,5,74,70,25,66,20,97,74,34},0,18));
		TestUtils.runTest(new int[]{15,37,40,41,41,42,53,56,62,66,68,69,72,72,80,82,82,90,94}, MergeSort.Sort(new int[]{72,90,69,94,53,82,62,66,37,72,41,82,80,40,15,68,42,41,56},0,18));
		TestUtils.runTest(new int[]{2,10,13,13,19,37,48,50,58,62,62,70,73,73,73,75,81,83,91}, MergeSort.Sort(new int[]{81,70,73,2,73,62,62,91,50,13,10,48,13,83,75,58,37,19,73},0,18));
		TestUtils.runTest(new int[]{9,14,25,43,52,52,54,58,60,75,75,82,88,89,93,94,96,96,99}, MergeSort.Sort(new int[]{52,96,96,58,99,60,54,93,14,43,9,82,89,52,75,25,88,75,94},0,18));
		TestUtils.runTest(new int[]{7,13,16,22,28,41,45,45,46,49,49,58,59,60,68,69,92,94,97}, MergeSort.Sort(new int[]{22,58,59,13,46,41,94,16,45,49,45,92,68,60,7,97,49,28,69},0,18));
	}

	@Test
	void test20() {
		TestUtils.runTest(new int[]{2,2,7,9,11,12,13,27,30,38,39,44,46,50,56,58,61,63,70,82}, MergeSort.Sort(new int[]{2,38,9,56,27,46,39,58,11,44,63,2,61,70,50,12,30,13,7,82},0,19));
		TestUtils.runTest(new int[]{13,15,21,24,35,39,40,40,44,53,53,56,56,57,76,78,79,81,83,91}, MergeSort.Sort(new int[]{21,56,78,83,53,15,91,81,44,35,24,40,13,79,39,53,40,57,56,76},0,19));
		TestUtils.runTest(new int[]{3,4,13,15,18,20,23,26,29,43,50,58,77,83,83,84,86,86,92,95}, MergeSort.Sort(new int[]{3,15,83,92,77,26,23,58,95,50,86,18,43,20,13,86,4,29,84,83},0,19));
		TestUtils.runTest(new int[]{1,4,6,10,12,20,20,25,30,41,44,46,50,55,68,69,76,81,97,99}, MergeSort.Sort(new int[]{1,50,4,81,25,41,20,55,20,12,30,97,6,69,99,76,44,46,10,68},0,19));
		TestUtils.runTest(new int[]{0,8,22,24,30,35,37,50,54,56,62,70,72,75,76,78,86,88,89,93}, MergeSort.Sort(new int[]{72,22,75,76,93,70,62,86,0,78,56,37,35,88,50,89,24,8,54,30},0,19));
	}

	@Test
	void test21() {
		TestUtils.runTest(new int[]{1,8,10,17,17,19,21,41,45,53,67,68,72,72,74,77,81,82,88,91,99}, MergeSort.Sort(new int[]{19,41,72,10,88,68,8,81,67,99,21,91,82,1,17,53,77,17,74,72,45},0,20));
		TestUtils.runTest(new int[]{6,12,21,22,23,42,44,45,48,51,55,60,61,69,78,84,86,87,95,95,97}, MergeSort.Sort(new int[]{60,51,55,95,48,95,87,42,44,86,78,84,22,69,6,97,45,61,12,21,23},0,20));
		TestUtils.runTest(new int[]{0,0,0,9,15,20,24,37,44,49,56,57,57,59,60,61,75,94,95,97,98}, MergeSort.Sort(new int[]{9,98,44,94,97,49,57,0,75,15,20,37,56,0,61,95,0,24,57,60,59},0,20));
		TestUtils.runTest(new int[]{15,19,24,31,33,37,39,42,49,50,52,59,59,60,62,65,70,78,79,82,96}, MergeSort.Sort(new int[]{19,24,70,79,37,62,39,59,49,52,60,31,65,42,82,59,15,78,33,50,96},0,20));
		TestUtils.runTest(new int[]{8,13,15,26,26,35,39,43,45,59,59,62,70,72,75,77,77,78,81,81,97}, MergeSort.Sort(new int[]{72,26,59,62,13,43,75,39,15,97,78,77,35,77,81,8,70,59,81,45,26},0,20));
	}

	@Test
	void test22() {
		TestUtils.runTest(new int[]{3,12,13,13,18,18,19,19,29,33,37,39,45,54,56,58,77,81,82,85,92,94}, MergeSort.Sort(new int[]{81,29,33,92,45,18,85,12,19,3,94,37,54,77,56,39,18,13,13,19,82,58},0,21));
		TestUtils.runTest(new int[]{2,12,14,18,19,23,25,27,27,30,40,42,46,61,61,84,87,89,91,93,98,99}, MergeSort.Sort(new int[]{23,89,99,27,18,93,61,84,42,40,46,12,25,91,2,98,30,14,87,19,61,27},0,21));
		TestUtils.runTest(new int[]{2,6,9,10,17,22,40,41,43,48,49,54,55,57,64,80,81,84,84,85,89,95}, MergeSort.Sort(new int[]{54,10,89,2,22,43,64,17,80,81,55,9,49,48,84,84,41,95,85,6,40,57},0,21));
		TestUtils.runTest(new int[]{4,14,17,18,22,28,30,30,39,43,43,49,49,50,50,63,75,81,83,95,98,99}, MergeSort.Sort(new int[]{50,14,30,81,17,18,83,4,22,39,30,49,98,95,49,99,75,50,63,43,43,28},0,21));
		TestUtils.runTest(new int[]{1,6,14,19,19,22,37,40,44,45,49,53,60,64,65,70,70,75,79,86,90,91}, MergeSort.Sort(new int[]{45,6,65,22,14,75,1,91,49,86,79,90,53,44,64,70,37,19,60,40,70,19},0,21));
	}

	@Test
	void test23() {
		TestUtils.runTest(new int[]{0,1,18,21,21,27,27,28,28,30,31,42,52,56,57,66,69,69,76,89,97,98,99}, MergeSort.Sort(new int[]{0,66,42,27,99,89,98,69,21,30,1,52,69,31,28,56,28,21,27,57,76,97,18},0,22));
		TestUtils.runTest(new int[]{11,13,13,15,19,19,26,29,33,35,42,45,63,65,71,76,81,86,90,90,92,96,97}, MergeSort.Sort(new int[]{45,97,15,96,65,76,26,13,71,29,19,81,33,63,42,90,90,19,11,92,86,13,35},0,22));
		TestUtils.runTest(new int[]{1,5,11,27,28,33,34,34,38,39,40,42,43,48,53,72,73,74,74,76,77,96,97}, MergeSort.Sort(new int[]{33,77,1,38,72,48,34,5,74,40,97,76,43,28,73,42,27,53,74,34,11,39,96},0,22));
		TestUtils.runTest(new int[]{0,7,8,13,18,19,30,30,39,42,43,47,50,53,55,63,64,68,70,87,88,89,97}, MergeSort.Sort(new int[]{50,39,63,70,43,30,64,8,55,87,30,7,47,18,13,0,53,97,68,88,19,89,42},0,22));
		TestUtils.runTest(new int[]{0,3,4,6,10,19,38,39,39,45,47,50,51,52,53,59,70,74,78,80,80,87,92}, MergeSort.Sort(new int[]{87,39,50,51,47,74,10,19,92,0,53,4,38,45,3,70,59,78,6,52,80,39,80},0,22));
	}

	@Test
	void test24() {
		TestUtils.runTest(new int[]{0,3,8,10,11,12,14,24,26,30,31,37,39,47,47,51,54,64,71,71,74,79,81,88}, MergeSort.Sort(new int[]{31,51,30,74,54,47,14,11,81,71,37,8,79,64,12,0,47,26,24,39,88,71,10,3},0,23));
		TestUtils.runTest(new int[]{12,13,14,14,16,24,25,28,30,31,32,39,58,58,60,65,67,74,76,76,77,80,81,81}, MergeSort.Sort(new int[]{16,81,76,60,31,14,12,67,77,14,30,74,25,24,58,58,39,32,80,81,13,65,76,28},0,23));
		TestUtils.runTest(new int[]{3,7,7,10,23,26,31,33,33,35,38,38,42,43,45,45,63,68,70,70,74,74,76,93}, MergeSort.Sort(new int[]{74,31,74,33,43,45,38,7,70,26,42,3,10,38,68,33,45,93,23,76,70,35,63,7},0,23));
		TestUtils.runTest(new int[]{5,7,11,16,17,25,26,27,31,33,35,49,60,64,66,66,68,77,83,85,86,91,93,94}, MergeSort.Sort(new int[]{86,35,93,83,66,66,33,49,11,26,27,17,94,60,77,25,64,91,31,7,5,85,16,68},0,23));
		TestUtils.runTest(new int[]{2,12,14,20,25,30,33,35,41,52,53,56,60,62,62,66,69,71,74,76,79,81,84,97}, MergeSort.Sort(new int[]{30,41,25,2,81,62,52,12,56,35,71,76,53,74,33,66,60,20,14,69,97,84,62,79},0,23));
	}

}
