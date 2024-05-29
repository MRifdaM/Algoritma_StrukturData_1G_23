package P12;

public class BinaryTreeMain23 {
    public static void main(String[] args) {
        BinaryTree23 bt = new BinaryTree23();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversel : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversel : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversel : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find node : " + bt.find(5));
        System.out.println("Delete node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println();
    }
}
