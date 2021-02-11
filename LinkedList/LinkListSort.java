class Node {

	int data;
	Node next;
}

class List {

	private static Node getNode(int data) {

	Node node = new Node();
	node.data = data;
	node.next = null;

	return node;
	}

	public static Node insert(Node root,int data) {

	if(root == null)return getNode(data);

		Node tmp = root;
	while(tmp.next !=null) {
		tmp = tmp.next;
             }
		tmp.next = getNode(data);

		return root;
	}

	public static void print(Node root){

		while(root !=null){
			System.out.println(root.data+",");
			root = root.next;
		}
	}
}

interface Interf {

	public abstract Node  mergeSort(Node root);
	public abstract Node middle(Node node);
	public abstract Node merge(Node a,Node b);
}

class Main extends List implements Interf {

	public Node mergeSort(Node root) {


		if(root == null || root.next ==null)return root;

		Node middle = middle(root);
		Node secondMiddle = middle.next;
		middle.next = null;

		return (merge(mergeSort(root),mergeSort(secondMiddle)));

	}

	public Node   middle(Node node){

		if(node == null)return null;
		Node slow = node;
		Node fast = node.next;


		while(fast !=null && fast.next !=null ) {
			
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public   Node merge(Node a, Node b){

		Node temp = new Node();
		Node finalList = temp;
		while(a !=null && b !=null){

			if(a.data < b.data){

				temp.next = a;
				a = a.next;
			}
			else{
				temp.next = b;
				 b = b.next;
			}

			temp = temp.next;

		}

		temp.next = (a==null) ? b : a;
		return finalList.next;
		}
}

class Execute extends Main {

	public static void main(String[]args) {

		Node root = null;

		int counter = 9;
	/*for(int index = 1; index<=2;index++){
	root = insert(root,--counter);
	root = insert(root,--counter);
	root = insert(root,--counter);
	root = insert(root,--counter);
	root = insert(root,--counter);
	}*/

	root = insert(root,5);
	root = insert(root,2);
	root = insert(root,1);
	root = insert(root,6);

	Main main = new Main();
	root = main.mergeSort(root);
	print(root);

	}

}
