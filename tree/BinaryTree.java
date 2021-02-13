import java.util.LinkedList;
import java.util.Queue;
class List {

	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data){
			this.data = data;
			this.left = null;
			this.right= null;
		}
	}

public static Node root;

	public static void insertNode(int data) {

		Node newNode = new Node(data);

		if(root == null)root = newNode;

		else {
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);

			while(true) {

				Node node = queue.remove();

				if(node.left !=null && node.right !=null){

					queue.add(node.left);
					queue.add(node.right);
				}
				else {

					if(node.left == null){
						node.left = newNode;
						queue.add(node.left);
					}
					else {
						node.right = newNode;
						queue.add(node.right);
					}
					break;
				}
			}
		}
	}
	  public void inorderTraversal(Node node) {  
	          
	          //Check whether tree is empty  
	          if(root == null){  
	              System.out.println("Tree is empty");  
	              return;  
	          }  
	          else {  
	                
	              if(node.left!= null)  
	              System.out.print(node.data + " ");  
	                  inorderTraversal(node.left);  
	              if(node.right!= null)  
	                  inorderTraversal(node.right);  
              }       

          }  
}


public class BinaryTree extends List{

	public static void main(String[]args) {
		 List bt = new BinaryTree();  
	        //Add nodes to the binary tree  
	          
	        bt.insertNode(2);  
	        //1 will become root node of the tree  
	        System.out.println("Binary tree after insertion");  
	        //Binary after inserting nodes  
	        //bt.inorderTraversal(bt.root);  
	          
	        bt.insertNode(7);  
	        bt.insertNode(2);  
		bt.insertNode(5);
		bt.insertNode(2);
		bt.insertNode(6);
		bt.insertNode(5);
		bt.insertNode(11);
		bt.insertNode(9);
		bt.insertNode(4);
		/*
	        //2 will become left child and 3 will become right child of root node 1  
	        System.out.println("\nBinary tree after insertion");  
	        //Binary after inserting nodes  
	        bt.inorderTraversal(bt.root);  
	          
	        bt.insertNode(9);  
	        bt.insertNode(3);  
	        //4 will become left child and 5 will become right child of node 2  
	        System.out.println("\nBinary tree after insertion");  
	        //Binary after inserting nodes  
	        bt.inorderTraversal(bt.root);  
	          
	        bt.insertNode(4);  
	        bt.insertNode(2);  
	        //6 will become left child and 7 will become right child of node 3  
	        System.out.println("\nBinary tree after insertion");  
	        //Binary after inserting nodes  
	        bt.inorderTraversal(bt.root);  
		*/
	          
	        bt.inorderTraversal(bt.root);  
	      }  
	}

