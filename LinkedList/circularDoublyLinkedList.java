class Node {

	int data;
	Node next;
	Node prev;
}
class List {


	private  static Node getNode(int data){

		Node node = new Node();

		node.data = data;
		node.next = null;
		node.prev = null;

		return node;
	}

	public static Node insert(Node root,int data) {

		if(root == null){

		root = 	getNode(data);
		root.prev = root;
		root.next = root;

		return root;
		}

		Node head = root;


		while(head.next !=root){

			head = head.next;
		}
		Node  a = getNode(data);
		a.prev = head;
		head.next = a;
		a.next = root;
		root.prev = a;

		return root;
	}

	public static void print(Node root) {

		Node current = root;

		do {
			System.out.println(current.data+",");
			current = current.next;
		}while(current !=root);

		/*
		while(current !=null) {
			System.out.println(current.data+",");
			current = current.next;
		
		*/
	}

	public static Node atFirst(Node root,int data){

		Node newNode = getNode(data);
		Node head = root;

		Node last = head.prev;
		newNode.next = head;
		head.prev = newNode;
		newNode.prev = last;
		last.next = newNode;
		root = newNode;

		return root;
	}
}

class Main extends List{

	public static void main(String[]args) {

		Node root = null;
		root = insert(root,10);
		root = insert(root,20);
		root = insert(root,30);
		root = insert(root,40);
		root = insert(root,50);

		root = atFirst(root,5);
		print(root);

		System.out.println("current data:"+root.data);
		System.out.println("current previsou: "+root.prev.data);
		System.out.println("current next:"+root.next.data);
	}
}







	
