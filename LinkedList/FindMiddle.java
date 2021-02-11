
class LinkedList{

	static class Node {

		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static Node head;
	public static Node tail;

	public static void insertNode(int data){

		Node newNode = new Node(data);
		newNode.next = null;

		if(head == null){
			head = newNode;
			tail = head;
		}
		else{

			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}

	public static void print(Node head){

		Node current = head;
		while(current !=null){

			System.out.println(current.data+",");
			current = current.next;
		}
	}
}

interface Interf  {

	public  abstract int middleItem();
}

class FindMiddle extends LinkedList implements Interf {

	public   int middleItem(){

		Node slow = head;
		Node fast = head.next;
		Node current = head;

		while(fast !=null){

			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}
}

class Main extends LinkedList {

	public static void main(String[]args){

	FindMiddle f = new FindMiddle();
	/*
		insertNode(100);
		insertNode(200);
		insertNode(300);
		insertNode(400);
		insertNode(500);

	*/
		insertNode(12);
		insertNode(99);
		insertNode(37);
		insertNode(7);
		insertNode(45);
		
		print(head);
		System.out.println();
	System.out.println("Middle: "+f.middleItem());


	}
}
