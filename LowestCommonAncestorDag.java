

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LowestCommonAncestorDag {
	
	 Node<Integer> root;
	    Set<Node<Integer>> allNodes;
	    
	

	public class Node<T> {
		T data;
		Set<Node<T>> adList;

		public Node(T data) {
			this.data = data;
			this.adList = new HashSet<>();
		}

		public void addEdge(Node<T> node) {
			adList.add(node);
		}
	
			
	

	}
	
	 private List<Node<Integer>> depthFirstSearch(Node<Integer> node, Node<Integer> targetNode, List<Node<Integer>> list, Stack<Node<Integer>> stack) 
	    {
	        stack.push(node);
	        for (Node<Integer> n : node.adList) 
	        {
	            if (n.equals(targetNode)) 
	            {
	                list.addAll(stack);
	                return list;
	            }
	            depthFirstSearch(n, targetNode, list, stack);
	        }
	        stack.pop();
	        return list;
	    }
	
	
}
