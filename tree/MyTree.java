import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.ArrayList;
class Node {

	int data;
	Node left;
	Node right;
	int height;


				//binary search if traversing inorder then result will be sorted.
	public ArrayList<Integer> sort(Node root) {

		ArrayList<Integer> list = new ArrayList<>();
		Stack<Node> s = new Stack<>();
		Node tmp = root;
		while(tmp !=null || !s.isEmpty()){

			if(tmp !=null){
				s.push(tmp);
				tmp = tmp.left;
			}
			else{
				tmp = s.pop();
				list.add(tmp.data);
				tmp = tmp.right;
			}
		}

		return list;
	}
			
	public boolean search(Node root,int key){

		Node tmp = root;
		while(tmp !=null) {

			if(tmp.data == key){
				return true;
			}
			else if(key < tmp.data){
				tmp =tmp.left;
			}
			else{
				tmp = tmp.right;
			}
		}
		return false;
	}

	public void topView(Node root) {

		TreeMap<Integer,Integer> m = new TreeMap<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while(!q.isEmpty()){

			Node tmp = q.remove();
			int hd = tmp.height;

			if(m.get(hd) == null){
				m.put(hd,tmp.data);
			}
			if(tmp.left !=null){
				tmp.left.height = hd-1;
				q.add(tmp.left);
			}
			if(tmp.right !=null){
				tmp.right.height = hd+1;
				q.add(tmp.right);
			}
		}
		System.out.println(m.values());
	}
	public int minimumDepthHeight(Node root){

		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int height = 1;

		while(true){
			int size = q.size();
			while(size > 0){

				Node tmp = q.poll();
				if(tmp.left !=null){
					q.offer(tmp.left);
				}
				if(tmp.right !=null){
					q.offer(tmp.right);
				}

				if(tmp.left ==null && tmp.right == null)
					return height;
				size--;
			}
			height = height + 1;
		}

		//here again return statement not required because of while(true)always so it unreachable if declare.

	}

	public int maximumDepthHeight(Node root) {

		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int height = 0;
		while(true) {

			int size = q.size();

			if(size == 0)
				break;

			while(size > 0){

				Node tmp = q.poll();

				if(tmp.left !=null)
					q.offer(tmp.left);
				if(tmp.right !=null)
					q.offer(tmp.right);
				size--;
			}
			height = height + 1;
		}
		return height;
	}
}
class List {

	public Node createNode(int value){

		Node node = new Node();
		node.data = value;
		node.left = null;
		node.right = null;

		return node;
	}

	public void levelOrder(Node root){

		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(root);

		while(!s1.isEmpty()){

			Node tmp = s1.pop();
			s2.push(tmp);

			if(tmp.left !=null){
				s1.push(tmp.left);
			}
			if(tmp.right !=null){
				s1.push(tmp.right);
			}
		}

		while(!s2.isEmpty()){

			System.out.print(s2.pop().data+" ");
		}

	}

}

public class MyTree {

	public static void main(String[]args) {

		List node = new List();

		Node root = null;
		root = node.createNode(10);
		root.left = node.createNode(5);
		root.left.right= node.createNode(8);
		root.right = node.createNode(15);
	//	root.left.left = node.createNode(7);
	
		root.topView(root);
		System.out.println(root.search(root,9));
		System.out.println(root.sort(root));

		node.levelOrder(root);
		System.out.println();
		System.out.println("MaximumDepth: "+root.maximumDepthHeight(root));
		System.out.println("MinimumDepth: "+root.minimumDepthHeight(root));
	}
}
