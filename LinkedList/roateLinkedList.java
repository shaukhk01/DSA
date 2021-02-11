package rotation;
class Node {

	int data;
	Node next;
}
class SinglyLinkedList {

	private static Node getNode(int data){

		Node node = new Node();
		node.data = data;
		node.next = null;

		return node;
	}

	public static Node insert(Node root,int data) {

		if(root == null)return getNode(data);

		else {
			root.next = insert(root.next,data);
		}

		return root;
	}

	public static void print(Node root) {

		Node current = root;
		while(current !=null){
			System.out.print(current.data+",");
			current = current.next;
		}
	}
}

class Rotation {

	public static Node clockRotation(Node root,int k) {

		int sizeOfNode = getSizeOfNode(root);

		Node tmp = root;

		int i = 1;
		while(i < sizeOfNode -k) {

			tmp = tmp.next;
			i++;
		}
		Node temp = tmp.next;
		Node head = temp;
		tmp.next = null;

		while(temp.next !=null) {

			temp = temp.next;
		}

		temp.next = root;
		return head;
	}

	static private int size = 0;	
	private static int getSizeOfNode(Node root) {

		if(root == null)return 0;

		size++;
		getSizeOfNode(root.next);
		return size;

	}
}


class AntiRotation{

	public static Node antiClock(Node root,int k) {


		if(k ==1){
			Node tmp = root;
		        root = root.next;
			tmp.next = null;
			Node temp = root;

			while(temp.next !=null){
				temp = temp.next;
			}
			temp.next = tmp;
			return root;
		}

		int i = 1;	
		
		Node head1 = root;
		Node first = head1;
		while( i < k){

			head1 = head1.next;
			i++;
		}
		Node head2 = head1.next;
		Node temp = head2;
		head1.next = null;
		while(temp.next !=null){

			temp = temp.next;
		}
		temp.next = first;

		return head2 ;
	}
}



class Main extends Rotation {

	public static void main(String[]args) {

		Node root  = null;
		SinglyLinkedList list = new SinglyLinkedList();

		root  = list.insert(root,10);
		root  = list.insert(root,20);
		root  = list.insert(root,30);
		root  = list.insert(root,40);
		root  = list.insert(root,50);

		list.print(root);

		System.out.println();
		//Node rotate = clockRotation(root,3);

		//list.print(rotate);
		System.out.println();

		AntiRotation anti = new AntiRotation();

		root =  anti.antiClock(root,4);

		 list.print(root);
		 System.out.println();

	}
}

