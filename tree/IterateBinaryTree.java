class BinaryTree {

	public int data;
	public BinaryTree left;
	public BinaryTree right;


	public BinaryTree createTree(int data){

		BinaryTree node = new BinaryTree();
		node.data = data;
		node.left = null;
		node.right= null;

		return node;
	}

	public static void main(String[]args){

		Tree root = new Tree();
		root.createBinaryTree(10);
		root.left.createBinaryTree(5);
	}
}
