class Node {

	int data;
	Node next;
	Node prev;
}
class List {

	private static Node getNode(int data){

		Node node = new Node();
		node.next = null;
		node.prev = null;
		node.data = data;

		return node;
	}

	public static Node insert(Node root,int data){ 

		if(root == null)return getNode(data);

		Node head = root;

		while(root.next !=null){

			root = root.next;
		}

		Node a = getNode(data);
		a.prev = root;
		root.next = a;

		return head;
	}
	public static void print(Node root){

		Node current = root;
		while(current !=null){
			System.out.println(current.data+",");
			current = current.next;
		}
	}

	public static Node atFirst(Node root,int data){

		Node node = getNode(data);
		node.next = root;
		root.prev = node;
		root = node;

		return root;

	}

	public static Node atIndex(Node root,int data,int pos) {

		Node p=root ;

		for(int index = 0; index < pos-1; index++){
			p = p.next;
		}
		Node t = getNode(data);
		t.next = p.next;
		t.prev = p;
		if(p.next !=null){
			p.next.prev = t;
		}
		p.next = t;

		return root;
	}
}


class Main  extends List{
	public static void main(String[]args){

		Node root = null;
		root = insert(root,25);
		root = insert(root,34);
		root = insert(root,33);
		root = insert(root,38);


	root = atFirst(root,20);
	root = atFirst(root,15);

		root = atIndex(root,30,3);
		root = atIndex(root,40,7);
		print(root);
	}
}
