package Tree;

class Node {

	int data;
	Node next;
}

class List {

	private static Node getNode(int data){

		Node node = new Node();

		node.data = data;
		node.next = null;

		return node;
	}

	public static Node queue(Node root,int data){

		if(root == null)return getNode(data);
		else{
			root.next = queue(root.next,data);
		}

		return root;
	}

	public static Node dQueue(Node root){

		try{
		int data = root.data;
		Node tmp = root.next;
		root = tmp;
		System.out.println(data);
		}
		catch(NullPointerException e){
			System.out.println("queue is empty");
		}
		return root;
	}

	public static void print(Node root){

		Node current = root;
		while(current !=null){
			System.out.println(current.data);
			current = current.next;
		}
	}

}

public class Queue extends List{

	public static void main(String[]args) {

		Node root = null;

		/*
		root = queue(root,10);
		root = queue(root,20);
		root = queue(root,30);
		root = queue(root,40);
		root = queue(root,50);

	//	print(root);
		 root = dQueue(root);
		 root = dQueue(root);
		 root = dQueue(root);
		 root = dQueue(root);
		 root = dQueue(root);
		 root = dQueue(root);

		 */

	}

}
