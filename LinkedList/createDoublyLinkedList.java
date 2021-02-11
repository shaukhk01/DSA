class Node {

	int data;
	Node next;
	Node prev;
}
class List {

	private static Node getNode(int data){

		Node node = new Node();
		node.data = data;
		node.next = null;
	        node.prev = null;

		return node;
	}

	public static Node add(Node root,int data){

		if(root == null){
			return getNode(data);
		}

		Node head = root;
		while(head.next !=null){

			head = head.next;
		}

		Node a = getNode(data);
		a.prev = head;
		head.next = a;

		return root;
	}

	public static void print(Node root){

		Node current = root;
		while(current !=null){ 
			System.out.println(current.data+",");
			current = current.next;
		}

		//System.out.println(current.prev.prev.data);
	}

	public static Node reverse(Node root){

		Node head = root;
		while(head.next !=null){
			head = head.next;
		}

		root = head;
		return root;
	}
}

class Main extends List {

	public static void main(String[]args){

		Node root = null;
		root = add(root,33);
		root = add(root,77);
		root = add(root,88);
		root = add(root,99);

		root = reverse(root);

		print(root);
	}
}

