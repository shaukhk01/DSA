
class Stack{

     public class Node{

        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static Node first= null;
    private static Node last = null;

    public void push(int value){

        Node node = new Node(value);

        if(first == null){
            node.next = null;//because of this is first node and in stack this node will be last so last.next = null should be other wise always point to last node never terminate.
            first = node;
        }
        else{
            node.next = first;
            first = node;
        }
    }

    public int pop(){

        int tmp = first.data;
        Node second = first.next;
        first.next = null;
        first = second;
        return tmp;
    }
}





