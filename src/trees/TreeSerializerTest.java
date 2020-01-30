package trees;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.Serializable;
import java.util.HashMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TreeSerializerTest {

	private static int[] tree1Answer = new int[]{0,1,3,5,-1,-1,6,-1,-1, 4, 7,-1,-1,8,-1,-1,2,-1,-1};
	private static Node tree1 = new Node(0,
			new Node(1, 
					new Node(3,
							new Node(5, null, null),
							new Node(6, null, null)
							),
					new Node(4,
							new Node(7, null, null),
							new Node(8, null, null)
							)
					),
			new Node(2, null, null)
		);
	
	private static int[] tree2Answer = new int[]{20, 8, 10, 5, -1, -1, -1, -1, -1};
	private static Node tree2= new Node(20,
			new Node(8,
					new Node(10, 
							new Node(5, null,null),
							null),
					null),
			null
		);
	
	private static int[] tree3Answer = new int[] {1,2,-1,-1,3,-1,-1};
	private static Node tree3 = new Node(1,
			new Node(2, null,null),
			new Node(3, null,null)
		);
	
	private boolean testTrees(Node t1, Node t2) {
		if (t1 == null && t2 == null)
			return true;
		else if (t1 == null && t2 == null)
			return false;
		if (t1.value != t2.value)
			return false;
		
		return testTrees(t1.right, t2.right) && testTrees(t1.left, t2.left);
		
	}
	
	
	private void DeserializeTest(String testTitle, int[] serializedTree, Node tree) {
		System.out.println(testTitle);
		Node newTree = TreeSerializer.Deserialize(serializedTree);
		System.out.print("  Actual: ");
		printArray(TreeSerializer.Serialize(newTree));
		System.out.print("Expected: ");
		printArray(serializedTree);
		assertEquals(true, testTrees(tree, newTree));
	}
	
	private void SerializeTest(String testTitle, int[] serializedTree, Node tree) {
		System.out.println(testTitle);
		int[] values = TreeSerializer.Serialize(tree);
		System.out.print("  Actual: ");
		printArray(values);
		System.out.print("Expected: ");
		printArray(serializedTree);
		assertArrayEquals(serializedTree, values);

		
		
	}
	
	
	public int LengthOfLongestSubstring2(String s) {
     	HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
        int longest = 0;
        int current = 0;
        
        for(int i = 0; i < s.length(); i++) {
			current = 0;
            characterMap = new HashMap<Character, Integer>();
            
            for(int j = i; j < s.length(); j++) {
            	char c = s.charAt(j);
            	if (characterMap.containsKey(c)) {
                	if (current > longest)
                    	longest = current;
                    break;
                } 
                
                characterMap.put(c, 0);
                current++;
            }
        }
        return longest;
    }
	
	@Test
	void TestSerializeTree1() {
		SerializeTest("TestSerializeTree1", tree1Answer, tree1);
	}
	
	@Test
	void TestDeserializeTree1 () {
		DeserializeTest("TestDeserializeTree1", tree1Answer, tree1);
	}
	
	@Test
	void TestSerializeTree2 () {
		SerializeTest("TestSerializeTree2", tree2Answer, tree2);
	}
	
	@Test
	void TestDeserializeTree2 () {
		
		DeserializeTest("TestDeserializeTree2", tree2Answer, tree2);
	}
	
	@Test
	void TestSerializeTree3 () {
		SerializeTest("TestSerializeTree3", tree3Answer, tree3);
	}
	
	@Test
	void TestDeserializeTree3 () {
		DeserializeTest("TestDeserializeTree3", tree3Answer, tree3);
	}
	
	
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	void printTree(Node node) {
		if (node == null)
			System.out.print("-1 ");
		else {
			System.out.print(node.value + " ");
			printTree(node.left);
			printTree(node.right);
		}
	}
	
	
}
