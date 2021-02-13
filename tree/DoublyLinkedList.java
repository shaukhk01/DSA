package Tree;

class Node {
	
	int data;
	Node left;
	Node right;
}

class List {

	private static Node getNode(int data){

		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right= null;

		return node;
	}

	public static Node insert(Node root,int data) {

		Queue q = new Queue();
		if(root == null){

		 Node currentAddress = getNode(data);
		 q.queue(currentAddress);
		 return currentAddress;
		}
			
		return root;

		/*
		while(root.right !=null) {

			root = root.right;
		}

		 Node a = getNode(data);
		 a.left = root;
		 root.right = a;
		 return head;
		 */
	}

	public static void print(Node root) {

		Node current = root;
		while(current !=null && current.data!=40){
			System.out.println(current.data);
			current = current.right;
		}
		/*
		System.out.println(current.left.data);
		System.out.println(current.left.left.data);
		System.out.println(current.left.left.left.data);
		*/
	}
}

public class DoublyLinkedList extends List{

	public static void main(String[]args) {

		Node root = null;

		/*
		root = insert(root,10);
		root = insert(root,20);
		root = insert(root,30);
		root = insert(root,40);

		print(root);

		*/
		root = insert(root,10);
	}
}
