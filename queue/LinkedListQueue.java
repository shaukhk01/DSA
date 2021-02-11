public class LinkedListQueue {

	static class Node  {

		int data;
		Node next;

		private Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	private static Node front;
	private static Node rear;

	public void queue(int item) {

		Node node = new Node(item);
		node.next = null;

		if(front == null){
			front = node;
			rear  = front;
		}
		else{
			rear.next = node;
			rear = node;
			rear.next = null;
		}
	}

	public int dqueue(){

		if(front == null)return -1;
		else{
			Node t = front;
			int data = t.data;
			t = front.next;
			front =t;
			return data;
		}
	}

	public static void main(String[]args) {

		LinkedListQueue q = new LinkedListQueue();
		q.queue(44);
		q.queue(88);
		q.queue(45);
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		q.queue(11);
		q.queue(23);
		q.queue(14);
		System.out.println(q.dqueue());
	}
}




