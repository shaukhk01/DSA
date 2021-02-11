class Node {

	int data;
	Node prev;
	Node next;
}
class List{
	
	private static Node getNode(int data){

		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;

		return node;
	}

	public static Node insert(Node root,int data) {

		if(root == null)return getNode(data);

		Node head = root;
		Node t = root;

		//handling first node.
		if(t.data >=data){
			Node newNode = getNode(data);
			newNode.next = t;
			t.prev = newNode;
			t = newNode;

			return t;
		}

		Node p =root; 

		while(p.next !=null){

			if(p.next.data >=data){
			
				Node temp = getNode(data);
				temp.next = p.next;
				if(p.next !=null){
				p.next.prev = temp;
				}
				temp.prev = p;
				p.next = temp;
			//	break;
				return root;
			}
			p = p.next;
		}

		/*
		if(p.next == null){
			Node a = getNode(data);
			a.prev = p;
			p.next = a;
			a.next = null;
			p = a;
		}*/


		if(head.data < data){

			while(head.next !=null){
				head = head.next;
		}	}

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
//		System.out.println(current.prev.prev.data);
	}

	public static void main(String[]args){

		Node root = null;
		root = insert(root,10);
		root = insert(root,5);
		root = insert(root,3);
		root = insert(root,8);
		root = insert(root,2);
		root = insert(root,7);
		root = insert(root,0);
		root = insert(root,4);
		root = insert(root,9);
		root = insert(root,1);
		root = insert(root,1);
		root = insert(root,12);
		root = insert(root,11);
		

		/*
		
		root = insert(root,1);
		root = insert(root,2);
		root = insert(root,3);
		root = insert(root,4);

		*/
		
		

		print(root);
	}
}


				

