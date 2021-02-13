import java.util.Stack;
class Node {

	private int data;
	private Node left;
	private Node right;

	public Node(int data){
		this.data = data;
	}

	public int getData(){

		return data;
	}

	public Node getLeft(){

		return left;
	}
	public void setLeft(Node left){

		this.left = left;
	}

	public Node getRight(){

		this.right = right;

		return right;
	}

	public void setRight(Node right){

		this.right = right;

	}

	public void insert(int value) {

		if(value <= getData()){

			if(left == null){

				setLeft(new Node(value));
			}
			else{
				left.insert(value);
			}
		}
		else{
			if(right == null)
				setRight(new Node(value));
			else
				right.insert(value);
		}
	}

	public void preOrder(Node node) {

		if(node !=null){
			System.out.print(node.data+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	public void inOrder(Node node){

		if(node !=null){
			inOrder(node.left);
			System.out.print(node.data+" ");
			inOrder(node.right);
		}
	}
}

class BuildTree  {

	private int data;
	private int preOrderIndex = 0;
	public BuildTree left;
	public BuildTree right;
	Stack<BuildTree> s = new Stack<BuildTree>();

	public BuildTree createNode(int data){

		BuildTree node = new BuildTree();
		node.data = data;
		node.left =null;
		node.right=null;

		return node; 
	}
	public void preOrder(BuildTree node) {

		BuildTree t = node;

		while(t!=null || !s.isEmpty()){
			
			if(t!=null){

				s.push(t);
				System.out.print(t.data+" ");
				t = t.left;
			}
			else{
				t = s.pop();
				t = t.right;
			}
		}
	}
	public void inOrder(BuildTree node) {

		BuildTree t = node;
		while(t!=null || !s.isEmpty()){

			if(t!=null){
				s.push(t);
				t = t.left;
			}
			else{
				t = s.pop();
				System.out.print(t.data+" ");
				t = t.right;
			}
		}
	}

	public BuildTree buildTreePreOrderInorder(int[]pre,int[] in,int start,int end) {

		if(start > end)return null;

		BuildTree node = createNode(pre[preOrderIndex++]);

		int inOrderIndex = getInOrderIndex(node.data,in,end);

		node.left = buildTreePreOrderInorder(pre,in,start,inOrderIndex-1);
		node.right = buildTreePreOrderInorder(pre,in,inOrderIndex+1,end);

		return node;
	}

	public int getInOrderIndex(int value,int[] in,int end) {

		for(int index = 0; index <=end; index++){

			if(value == in[index])
				return index;
		}
			return -1;
	}
	public int count(BuildTree node){

		if(node !=null){

			int x = count(node.left);
			int y = count(node.right);
			
			return x + y+1;
		}
		return 0;
	}

	public int leafZero(BuildTree node){


		if(node !=null){

			int a = leafZero(node.left);
			int b = leafZero(node.right);

			if(node.left == null && node.right == null){

				return a+b+1;
			}

			return a + b;
		}
		return 0;

	}

}

class Main {

	public static void main(String[]args) {

		Node node = new Node(8);

		//node.insert(5);
		//node.insert(8);
		//node.insert(15);
		node.insert(3);
		node.insert(12);
		node.insert(5);

	//	node.preOrder(node);
		System.out.println();
	//	node.inOrder(node);
		System.out.println();


		BuildTree t = new BuildTree();

		BuildTree root = t.createNode(10);
		root.left = t.createNode(5);
		root.left.right = t.createNode(8);
		root.right = t.createNode(15);

		t.preOrder(root);
		System.out.println();
		t.inOrder(root);

	int[] preOrder = {10,5,8,15};
	int[] inorder   = {5,8,10,15};

	int start = 0;
	int end   = inorder.length-1;

	BuildTree tree = t.buildTreePreOrderInorder(preOrder,inorder, start,end);
		System.out.println();

		t.preOrder(tree);
		System.out.println();
		t.inOrder(tree);
		
		System.out.println();
		System.out.println(t.count(tree));
		System.out.println(t.leafZero(tree));

	}


}
