public class CircularQueue {

	private int[] queue;
	private int rear;
	private int front;
	private int queueSize;

	private CircularQueue(int queueSize){

		this.rear  = 0;
		this.front = 0;
		this.queueSize = queueSize;
		queue = new int[queueSize];
	}

	public void queue(int item){

		if((rear+1)%queue.length == front)
			System.out.println("queue is full");
		else{
			rear = (rear+1)%queue.length;
			queue[rear] = item;
		}
	}

	public int dqueue(){

		int x = 0;
		if((rear+1)%queue.length == front)
			System.out.println("queue is empty");
		else{
			front = (front+1)%queue.length;
			x = queue[front];
			queue[front] = -1;
		}
		return x;
	}

	public static void main(String[]args){

		CircularQueue q = new CircularQueue(6);
		q.queue(77); 
		q.queue(87); 
		q.queue(45); 

		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		q.queue(90);
		q.queue(95);
		q.queue(98);
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());

	}

}

