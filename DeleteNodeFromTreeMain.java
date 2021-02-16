package Tree.Delete.Node;
public  class DeleteNodeFromTreeMain {

    public static void main(String[]args){

    Node root = new Node(8);
    root.insert(3);
    root.insert(10);
    root.insert(1);
    root.insert(6);
    root.insert(4);
    root.insert(7);
    root.insert(14);
    root.insert(13);
    root.traverse(root);
    System.out.println();
    root.delete(root,3);
    root.traverse(root);
    System.out.println();

    }
}
