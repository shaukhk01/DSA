class Link {
	
	static class Node {

		int data;
		Node prev;
		Node next;

		public Node(int data){

			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static Node head;
	public static Node tail;

	public static void insert(int data) {

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			head.prev = null;
			tail = head;
			tail.prev = null;
			tail.next = null;
		}
		else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public static void reverse(){

		Node p = head;
		Node tmp = head;

		while(p !=null){
			 tmp = p.next;
			 p.next = p.prev;
			 p.prev = tmp;
			 p=p.prev;//here p point to tmp [which is t = p.next];

			 /**
			  * we can't use p.next !=null && p !=null
			  * becuse of p becomes null then how p.next !=null condition check
			  *and also. 
			  *&& optr if first condition false then not check second
			  *that'w wahy p !=null[when its become true 
			 * ! optr make it false then p.next !=null will not check
			 */

			 if( p!=null && p.next !=null)
				 head = p.next;
		}
	}


	public static void print(){

		Node current = head;
		while(current !=null /*&& current.data !=50*/){
			System.out.println(current.data+",");
			current = current.next;
		}
		/*
		//checking previous element are accessable or not
		System.out.println(current.data);
		while(current !=null){
			System.out.print(current.data+",");
			current = current.prev;
		}
		*/
	}

}

class Main extends Link {

	public static void main(String[]args) {

		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insert(60);
		reverse();

		print();
	}
}

