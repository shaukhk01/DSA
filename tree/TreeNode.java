public class TreeNode {

	public int data;
	public TreeNode left,right;

	public TreeNode(int data){
		this.data = data;
	}
	public void insert(int value){

		if(value <=data){
			if(left == null)
				left = new TreeNode(value);
			else
				left.insert(value);
		}
		else{
			if(right == null)
				right = new TreeNode(value);
			else
				right.insert(value);
		}
	}

	public void preOrder(TreeNode node) {

		if(node !=null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void main(String[]args) {

		TreeNode t = new TreeNode(10);
		t.insert(5);
		t.insert(15);
		t.insert(8);

		t.preOrder(t);
	}
}

