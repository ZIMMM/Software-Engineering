import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class LowestCommonAncestorTest {

	

	@Test
	//////test for just two nodes
	public void testTwoNodeDAG()
	{
		LowestCommonAncestorDag<Integer> DAG = new LowestCommonAncestorDag<Integer>();	
		DAG.anode = DAG.createNode(5);
		Node<Integer> n = DAG.createNode(3);
		DAG.anode.addEdge(n);
		assertEquals(DAG.LCA(DAG.anode, n), DAG.anode);
	}
	
		
	
		// examples of graphs i coded from the internet 
	//all to test various LCA of DAG's
		
		@Test
		public void TestCases()
		{
		
			LowestCommonAncestorDag<Integer> a = new LowestCommonAncestorDag<Integer>();	
			a.anode = new Node<Integer>(3);
			Node<Integer> n1 = a.createNode(5);
			Node<Integer> n2 = a.createNode(10);
			Node<Integer> n3 = a.createNode(13);
			Node<Integer> n4 = a.createNode(4);
			Node<Integer> n5 = a.createNode(9);
			Node<Integer> n6 = a.createNode(19);
			Node<Integer> n7 = a.createNode(14);
			a.anode.addEdge(n1);
			a.anode.addEdge(n2);
			n1.addEdge(n3);
			n1.addEdge(n7);
			n2.addEdge(n4);
			n2.addEdge(n5);
			n2.addEdge(n6);
			assertEquals(a.LCA(n4, n5), n2);
			assertEquals(a.LCA(n1, n3), n1);			
			assertEquals(a.LCA(n1, n7), n1);
			
			
			
		
			LowestCommonAncestorDag<Integer> b = new LowestCommonAncestorDag<Integer>();	
			b.anode = b.createNode(1);
			Node<Integer> node1 = b.createNode(2);
			Node<Integer> node2 = b.createNode(3);
			Node<Integer> node3 = b.createNode(4);
			Node<Integer> node4 = b.createNode(5);
			Node<Integer> node5 = b.createNode(6);

			b.anode.addEdge(node1);
			node1.addEdge(node2);
			node1.addEdge(node3);
			node3.addEdge(node4);
			node3.addEdge(node5);
			assertEquals(b.LCA(node2, node5), node1);
			assertEquals(b.LCA(node3, node4), node3);			
			assertEquals(b.LCA(node4, node5), node3);
			
			
			
			
			LowestCommonAncestorDag<Integer> c = new LowestCommonAncestorDag<Integer>();	
			c.anode = new Node<Integer>(8);
			Node<Integer> nod0 = c.createNode(69);
			Node<Integer> nod1 = c.createNode(65);
			Node<Integer> nod2 = c.createNode(6);
			Node<Integer> nod3 = c.createNode(251);
			Node<Integer> nod4 = c.createNode(63);
			Node<Integer> nod5 = c.createNode(143);
			Node<Integer> nod6 = c.createNode(2);
			c.anode.addEdge(nod0);
			c.anode.addEdge(nod4);
			nod0.addEdge(nod1);
			nod1.addEdge(nod2);
			nod1.addEdge(nod5);
			nod2.addEdge(nod3);
			nod5.addEdge(nod6);
			
			assertEquals(c.LCA(nod3, nod6),nod1);
			assertEquals(c.LCA(nod4, nod2),c.anode);
			
			
		}
		

}