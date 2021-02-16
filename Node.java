package Tree.Delete.Node;
import java.util.Stack;
public  class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data){
        this.data = data;
    }
    public int getData(){
        return data;
        }

    public Node getLeft(){
        return this.left;
    }
    public void setLeft(Node left){
        this.left = left;
    }

    public Node getRight(){
        return this.right;
    }
    public void setRight(Node right){
        this.right = right;
    }

    public void insert(int value){

        if(value<=getData()){
            if(getLeft() ==null){

                setLeft(new Node(value));
            }
            else
                left.insert(value);
        }
        else{
            if(getRight() == null){
                setRight(new Node(value));
            }
            else
                right.insert(value);
        }
    }

    public void traverse(Node root){

        Stack<Node> s = new Stack<>();
        Node tmp = root;

        while(tmp !=null || !s.isEmpty()){
                
                if(tmp !=null){
                    s.push(tmp);
                    tmp = tmp.getLeft();
                }
                else{
                    tmp = s.pop();
                    System.out.print(tmp.data+" ");
                    tmp = tmp.getRight();
                }
        }
    }

    public Node delete(Node node,int value) {

        //Node tmp = node;
        if(node == null){
            return null;
        }
        if(value < node.data){

            node.left = delete(node.left,value);
        }
        else if(value > node.data){
            node.right = delete(node.right,value);
        }
        else{
            if(node.left == null || node.right == null){

                Node tmp = node.left !=null ? node.left : node.right;
                if(tmp == null){
                    return null;
                }else{
                    return tmp;
                }
            }
            else{

                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right,successor.data);
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node root){

        if(root == null)
            return null;

        Node tmp = root.right;
        while(tmp.left !=null){

            tmp = tmp.left;
        }
        return tmp;
    }
}
