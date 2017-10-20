import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTest {
	
	@Test
	public void NodeGetDataTest() {
		Node node = new Node(0);
		assertEquals(0, node.getData());
	}
	
	@Test
	public void NodeSetLeftGetLeftTest() {
		Node node = new Node(0);
		Node left = new Node(1);
		node.setLeft(left);
		assertSame(left, node.getLeft());
	}
	
	@Test
	public void NodeSetRightGetRightTest() {
		Node node = new Node(0);
		Node right = new Node(1);
		node.setRight(right);
		assertSame(right, node.getRight());
	}

	@Test
	public void BinaryTreeIsEmptyTestAndInsertTest() {
		BinaryT BinaryT = new BinaryT();
		assertTrue(BinaryT.isEmpty());
		BinaryT.insert(0);
		assertFalse(BinaryT.isEmpty());
	}
	
	

}