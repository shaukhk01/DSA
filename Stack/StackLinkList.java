
class List {

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

   public static void push(int item) {

	   Node newNode = new Node(item);

	   if(head == null){
		   head = newNode;
		   //tail = head;
	   }
	   else {
		   newNode.next = head;
		   head = newNode;
	   }
   }


   public static int pop(){

	   try{
	   int pop = head.data;
	   head = head.next;
	   return pop;
	   }
	   catch(NullPointerException e){
		   System.out.print("Stack is null:");
	   }
	   return -32767;
   }

   public static int peek(){

	   if(!isEmpty()){

		   return head.data;
	   }
	   else{
		System.out.print("Stack is null:");
		return -32767;
	   }
   }

   public static boolean isEmpty(){

	   return(head == null ? true : false);
   }

}

public class StackLinkList extends List {

	public static void main(String[]args) {

/*		push(10);
		push(20);
		push(40);
		push(50);
		push(30);
		*/
		push(100);
		System.out.println(pop());
		System.out.println(peek());
	}
}




