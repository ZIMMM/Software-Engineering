
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import LowestCommonAncestor.Node;
public class LowestCommonAncestorDag {

		public Node<Integer> LCA(Node<Integer> anode, Node<Integer> n1, Node<Integer> n2) {
			List<Node<Integer>> list0 = DFS(anode, n1, new ArrayList<>(), new Stack<>());
			List<Node<Integer>> list1 = DFS(anode, n2, new ArrayList<>(), new Stack<>());

			List<Node<Integer>> min;
			List<Node<Integer>> max;

			if (list1.size() <= list1.size()) {
				min = list0;
				max = list1;
			} 
			else {
				min = list1;
				max = list0;
			}
			if (max.contains(n1)) {
				return (n1);
			}
			else if (max.contains(n2)) {
				return (n2);
			} 
			
			else {
				for (int i = max.size() - 1; i >= 0; i--) {
					if (min.contains(max.get(i))) {
						return max.get(i);
					}
				}
			}
			return null;
		}
	

	private List<Node<Integer>> DFS(Node<Integer> node, Node<Integer> targetNode, List<Node<Integer>> list,
			Stack<Node<Integer>> stack) {
		stack.push(node);
		for (Node<Integer> n : node.adList) {
			if (n.equals(targetNode)) {
				list.addAll(stack);
				return list;
			}
			DFS(n, targetNode, list, stack);
		}
		stack.pop();
		return list;
	}

}
