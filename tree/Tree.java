public class Tree {

	Tree left,right;
	int data;

	public Tree(int data){
		this.data = data;
	}

	public void insert(int value) {

		if(value<=data){

			if(left == null)
				left = new Tree(value);
			else
				left.insert(value);
		}
		else {
			if(right == null)
				right = new Tree(value);
			else
				right.insert(value);
		}
	}

	public void preOrder(Tree node){

		if(node !=null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void main(String[]args) {

		Tree t = new Tree(10);
		t.insert(5);
		t.insert(15);
		t.insert(8);
		t.preOrder(t);
	}
}


class Node {

	private int data;
	private Node left;
	private Node right;

	public Node createNode(int data){

		Node a = new Node();
		a.data = data;
		a.left = null;
		a.right = null;

		return a;
	}

	public void preOrder(Node node) {

		if(node !=null){
			System.out.print(node.data+",");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void main(String[]args){

		Node t = new Node();
		Node root = t.createNode(10);
		root.left = t.createNode(5);
		root.right = t.createNode(15);
		root.left.right = t.createNode(8);

		t.preOrder(root);
	}

}



