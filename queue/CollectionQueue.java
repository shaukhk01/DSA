import java.util.Queue;
import java.util.LinkedList;

class QueueDemo {

	public static void main(String[]args) {

		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		Queue<LinkedList> q = new LinkedList<LinkedList>();
		q.offer(l);
		System.out.println(q);
	}
}
