import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
class Tree {

	private int data;
	private Tree left;
	private Tree right;

	public Tree(int data) {
		this.data = data;
	}
	/*public Tree getNode(int newNode){

		Tree node = new Tree();
		node.data = newNode;

		return node;
	}*/

	public Tree insertNodeOnTree(Tree root,int value) {

		Queue<Tree> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){

			Tree tmp = q.poll();

			if(tmp !=null){

				if(tmp.getLeft() !=null){

					q.offer(tmp.getLeft());
				}
				else{
					//tmp.setLeft(getNode(value));
					tmp.setLeft(new Tree(value));
					return root;
				}
			}
				else{
					//tmp.setRight(getNode(value));
					tmp.setRight(new Tree(value));

					return root;
				}
			}

		return root;
	}


	public int findMaxNodeInTree(Tree root) {

		if(root == null)
			return Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;

		Queue<Tree> q = new LinkedList<Tree>();
		q.offer(root);//offer() offer collection of element

		while(!q.isEmpty()){

			Tree tmp = q.poll();

			if(tmp.getData() >=max){

				max = tmp.getData();
			}
			if(tmp !=null){

				if(tmp.getLeft() !=null)
				q.offer(tmp.getLeft());

				if(tmp.getRight() !=null)
					q.offer(tmp.getRight());
			}
			}
		return max;
		}
	public int getData(){

		return data;
	}

	public Tree getLeft(){

		return left;
	}
	public void setLeft(Tree left){

		this.left = left;
	}

	public Tree getRight(){
		
		return right;
	}

	public void setRight(Tree right){

		this.right = right;
	}

	public void insert(int value) {

		if(value <= getData()) {

			if(getLeft() == null){

				setLeft(new Tree(value));
			}
			else{
				left.insert(value);
			}
		}
		else{
			if(getRight() == null){

				setRight(new Tree(value));
			}
			else{
				right.insert(value);
			}
		}
	}

	public void traverse(Tree node){


		/* Tree t = node;
		 Stack<Tree> s = new Stack<Tree>();

		 while(t !=null || !s.isEmpty()){

			 if(t !=null){
				 s.push(t);
				 t = t.left;
			 }
			 else{
				 t = s.pop();
				 System.out.print(t.data+" ");
				 t = t.right;
			 }
		 }*/

		if(node !=null){
		traverse(node.left);
		System.out.print(node.data+" ");
		traverse(node.right);
		}
	}
}

public class TreeOperation {

	public static void main(String[]args) {

		Tree t = new Tree(10);
		t.insert(5);
		t.insert(8);
		t.insert(15);
		t.traverse(t);
		System.out.println();
		System.out.println(t.findMaxNodeInTree(t));

		 t = t.insertNodeOnTree(t,13);
		 t = t.insertNodeOnTree(t,17);
		 t = t.insertNodeOnTree(t,2);
		System.out.println();
		
		t.traverse(t);
		System.out.println();
	}
}


