

class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {         //Node creation for binary tree
    this.data = data;
    left = null;
    right = null;
  }
  
  public void setLeft(Node left) {
	  this.left = left;
  }
  
  public void setRight(Node right) {
	  this.right = right;
  }
  
  public Node getLeft() {
	  return left;
  }
  
  public Node getRight() {
	  return right;
  }
  
  public int getData() {
	  return data;
  }
}

class BinaryT {       // simple binary tree code from last year
	
	private Node root;
	
	public BinaryT() {
		root=null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int data) {
		root = insert(root, data);
	}
	
	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		}
		else {
			if (data<=node.getData()) {
				node.left = insert(node.left, data);
			}
			else {
				node.right = insert(node.right, data);
			}
		}
		
		return node;
	}

	public Node FindLCA(Node a, Node b) {    //calls function for finding lowest common ancestor
		return FindLCA(root, a, b);
	}
	
	
	private Node FindLCA(Node root, Node a, Node b) {
		if (root == null || root.getData() == a.getData() || root.getData() == b.getData()) {  // recursive function to find the lowest common ancestor
			return root;                                                                       // found online 
		}
		Node left = FindLCA(root.getLeft(), a, b);
		Node right = FindLCA(root.getRight(), a, b);
		
		if (left == null && right == null) {
			return null;
		}
		else if (left == null) {
			return right;
		}
		else {
			return root;
		}
	}


   
}
