public class BinaryTreeNode {

	private int data;
	public BinaryTreeNode left,right;

	public BinaryTreeNode(int data) {
		this.data = data;
		this.left = left;
		this.right=right;
	}

	public int getData(){
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryTreeNode getLeft(){

		return left;
	}

	public void setLeft(BinaryTreeNode left){

		this.left = left;
	}

	public BinaryTreeNode getRight(){

		return right;
	}

	public void setRight(BinaryTreeNode right){

		this.right = right;
	}


	public void insert(int value) {

		if(value < getData()){
			if(getLeft() == null){
				setLeft(new BinaryTreeNode(value));
			}
			else {
				getLeft().insert(value);
			}
		}else {
				if(getRight() == null){
					setRight(new BinaryTreeNode(value));
				}
				else {
					getLeft().insert(value);
				}
			}
		}
	public static void print(BinaryTreeNode node){

		if(node !=null){
			System.out.println(node.data);
			print(node.left);
			print(node.right);
		}
	}

	public static void main(String[]args) {


		BinaryTreeNode b = new BinaryTreeNode(10);
		b.insert(5);
		b.insert(8);
		b.insert(15);

		print(b);
	}

}






