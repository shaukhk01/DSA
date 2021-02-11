public class Queue {

	private int queueSize;
	private int front;
	private int rear;
	private int[] queue;

	private Queue(int queueSize){

		this.queueSize = queueSize;
		this.rear = -1;
		this.front= -1;
		queue = new int[this.queueSize];

	}

	public void queue(int item){

		try{
		queue[++rear] = item;
		}
		catch(ArrayIndexOutOfBoundsException e){

			System.out.println("queue is full");
			System.exit(0);
		}
	}

	public String dqueue(){

		

		try{
		int element =  queue[++front];
		queue[front] = 0;
		return element+" ";
		}
		catch(ArrayIndexOutOfBoundsException e){
			rear = front = -1;
			System.out.println("queue is empty");
			//System.exit(0);
		}
		return " ";
	}

	


	public static void main(String[]args) {

		Queue q = new Queue(4);
		q.queue(11);
		q.queue(23);
		q.queue(33);
		q.queue(39);
		//q.queue(84);

		//System.out.println(q.dqueue());
		//System.out.println(q.dqueue());
		//q.queue(100);
		
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		//again start insertihng from one
		q.queue(1000);
		q.queue(5000);
		q.queue(7000);
		q.queue(9000);
		q.queue(10000);//queue is full
		//System.out.println(q.dqueue());
		//System.out.println(q.dqueue());
		
		//System.out.println(q.queue.length);

		for(int i=0;i<q.queue.length;i++)
			System.out.println(q.queue[i]);
	}
}


