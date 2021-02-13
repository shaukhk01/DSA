import java.util.Stack;
class MyTree {

	int data;
	MyTree left;
	MyTree right;

	Stack<MyTree> stack = new Stack<MyTree>();
	Stack<MyTree> pstack= new Stack<MyTree>();

	public MyTree(int data){
		this.data = data;
	}

	public MyTree getLeft(){

		return left;
	}

	public void setLeft(MyTree left){

		this.left = left;
	}

	public MyTree getRight(){

		return right;
	}

	public void setRight(MyTree right){

		this.right = right;
	}


	public void insert(int value) {

		if(value <=data){

			if(left ==null){
				left = new MyTree(value);
			}
			else{
				 left.insert(value);
			}
		}
		else {
			if(right == null){
				right = new MyTree(value);
			}
			else{
				 right.insert(value);
			}
		}
	}

	public void preOrder(MyTree node){

		MyTree t = node;
		while(t !=null || !stack.isEmpty()){

			if(t  !=null){
				System.out.print(t.data+",");
				stack.push(t);
				t = t.left;
			}
			else{
				t = stack.pop();
				t = t.right;
			}
		}
	}

	public void inOrder(MyTree node){

		MyTree t = node;
		while(t !=null || !stack.isEmpty()){

			if(t !=null){
				stack.push(t);
				t = t.left;
			}
			else{
				t = stack.pop();
				System.out.print(t.data+" ");
				t = t.right;
			}
		}
	}

	public void postOrder(MyTree node){

		MyTree t = node;
		stack.push(t);

		while(!stack.isEmpty()){

			MyTree tmp = stack.pop();
			pstack.push(tmp);

			if(tmp.left !=null){
				stack.push(tmp.left);
			}
			if(tmp.right !=null){
				stack.push(tmp.right);
			}
		}
	}

		


	public static void main(String[]args){

		MyTree t = new MyTree(10);

		t.insert(5);
		t.insert(15);
		t.insert(8);

		t.preOrder(t);
		System.out.println();
		t.inOrder(t);
		System.out.println();
		t.postOrder(t);
		System.out.println();

		while(!t.pstack.isEmpty()){

			System.out.print(t.pstack.pop().data+" ");
		}
		System.out.println();

	}

}
