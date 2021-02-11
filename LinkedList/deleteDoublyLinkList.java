class LinkList {

	static class Node{

		int data;
		Node next;
		Node prev;

		public Node(int data){

			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

public static Node head = null;
public static Node tail = null;

	public static void insert(int data){

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			tail = head;
			tail.prev = null;
			tail.next = null;
		}
		else{
			newNode.prev = tail;
			tail.next = newNode; 
			tail = newNode;
			tail.next = null;
		}
	}

	public static int removeFirst(Node root){

		Node p = root;
		int pop = p.data;

		root = root.next;
		root.prev = null;
		head = root;
		return pop;
	}


	public static int atIndex(int pos){


		Node p = head;
		for(int index = 0; index < pos-1; index++){

			p = p.next;

		}

		p.prev.next = p.next;

		if(p.next !=null){

			p.next.prev = p.prev;
		}
		int pop = p.data;

		return pop;
	}

	public static void removeLast(){

	}


	public static void print(){

		Node current = head;
		while(current !=null && current.data !=71){
			System.out.println(current.data+",");
			current = current.next;
		}
		System.out.println(current.data);

		
		System.out.println();
		System.out.println();
		while(current !=null){

		System.out.println(current.data);
		current = current.prev;
		}
	}

	public static void main(String[]args) {

		insert(5);
		insert(11);
		insert(22);
		insert(33);
		insert(44);
		insert(55);
		insert(60);
		insert(71);

		System.out.println();
//		System.out.println(" pop:"+removeFirst(head));
		print();
		System.out.println("At Spacified Index");
//		System.out.println("             pop "+atIndex(5));
		System.out.println("             pop "+atIndex(8));
		print();
	}
	
}


