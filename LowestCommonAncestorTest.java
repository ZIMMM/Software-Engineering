
import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class LowestCommonAncestorTest {
	
	@Test
	public void testAcyclical()
	{
		LowestCommonAncestorDag<Integer> DAG = new LowestCommonAncestorDag<Integer>();
		Node<Integer> n1 = DAG.createNode(9);
		Node<Integer> n2 = DAG.createNode(22);
		Node<Integer> n3 = DAG.createNode(17);
		Node<Integer> n4 = DAG.createNode(3);
		DAG.root = n1;
		DAG.root.addEdge(n2);
		DAG.root.addEdge(n3);
		n2.addEdge(n4);
		n3.addEdge(n4);
		assertNull(DAG.LCA(n4, n2));
	
	}
	
	
	
	
	

	
	
	
	
	
	
	@Test
	 //test for finding LCA in a tree with only one branch
	public void LCAin1LeftBranchTree() {
		BinaryT BinaryT = new BinaryT();
		BinaryT.insert(1);
		BinaryT.insert(0);
		Node a = new Node(1);
		Node b = new Node(0);
		assertEquals(1, BinaryT.FindLCA(a, b).getData());
	}
	
	@Test
	public void testLowestCommonAncestor(){

		BinaryT BinaryT = new BinaryT();
		
		BinaryT.insert(4);
		BinaryT.insert(3);
		BinaryT.insert(2);
		BinaryT.insert(1);
		BinaryT.insert(5);
		BinaryT.insert(0);
		
		
		Node a = new Node(0);
		Node b = new Node(1);       //one right branch tree
		
		assertEquals(4, BinaryT.FindLCA(a, b).getData());
		
		 a = new Node(3);
		 b = new Node(1);
		
		assertEquals(4, BinaryT.FindLCA(a, b).getData());   //different heights
		
		 a = new Node(2);
		 b = new Node(3);
		
		assertEquals(4, BinaryT.FindLCA(a, b).getData());   // same height in tree
		
		


	}
	
	
	@Test
	public void LCAAllRightBranches() {
		BinaryT BinaryT = new BinaryT();              // all right branches
		BinaryT.insert(0);
		BinaryT.insert(1);
		BinaryT.insert(2);
		Node a = new Node(1);
		Node b = new Node(2);
		assertEquals(1, BinaryT.FindLCA(a, b).getData());
	}

	@Test
	public void NodeGetDataTest() {
		Node node = new Node(0);                       //  null
		assertEquals(0, node.getData());
	}
	
	@Test
	public void NodeSetLeftGetLeftTest() {
		Node node = new Node(0);
		Node left = new Node(1);                  // get left node 
		node.setLeft(left);
		assertSame(left, node.getLeft());
	}
	
	@Test
	public void NodeSetRightGetRightTest() {                  //get right node
		Node node = new Node(0);
		Node right = new Node(1);
		node.setRight(right);
		assertSame(right, node.getRight());
	}

	@Test
	public void BinaryTreeIsEmpty() {
		BinaryT BinaryT = new BinaryT();
		assertTrue(BinaryT.isEmpty());          // check to see if the test is empty
		BinaryT.insert(0);
		assertFalse(BinaryT.isEmpty());
	}
	
	@Test

	public void FindLCAWhenRootNode() {                //lowest common branch when root
		BinaryT BinaryT = new BinaryT();
		BinaryT.insert(1);
		BinaryT.insert(0);
		BinaryT.insert(2);
		Node a = new Node(1);
		Node b = new Node(2);
		assertEquals(1, BinaryT.FindLCA(a, b).getData());
	}
	@Test
	public void LCAIn1NodeTreeErrorTest() {
		BinaryT BinaryT = new BinaryT();                    // error if its a one node tree as function requires at least 2
		BinaryT.insert(0);
		Node a = new Node(1);
		Node b = new Node(2);
		assertEquals(null, BinaryT.FindLCA(a, b));
}
	}