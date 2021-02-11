
class Node {

	int data;
	Node next;
}

class ListList {

	private static Node getNode(int data){

		Node node = new Node();
		node.data = data;
		node.next = null;

		return node;
	}

	public static Node insert(Node root,int data) {

		if(root == null)return getNode(data);

		else{

			root.next = insert(root.next,data);
		}

		return root;
	}

	public static void printNode(Node root){

		Node current = root;
		while(current !=null){
			System.out.println(current.data+',');
			current = current.next;
		}
	}

	public static void main(String[]args){

		Node root = null;

		root = insert(root,10);
		printNode(root);
	}
}


