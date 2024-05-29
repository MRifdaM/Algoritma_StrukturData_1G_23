package P12;

public class BinaryTree23 {
    Node23 root;
    int size;

    public BinaryTree23(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(int input){
        if(isEmpty()){
            root = new Node23(input);
        } else {
            Node23 current = root;
            while(true){
                if(input < current.data){
                    if(current.left == null){
                        current.left = new Node23(input);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if(input > current.data) {
                    if(current.right == null){
                        current.right = new Node23(input);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    System.out.println("Data sudah ada");
                    break;
                }
            }
        }
    }

    public boolean find(int input){
        boolean result = false;
        Node23 current = root;
        while(current != null){
            if(current.data == input){
                result = true;
                break;
            } else if(input < current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node23 node){
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node23 node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node23 node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    public Node23 getSuccessor(Node23 del){
        Node23 successor = del.right;
        Node23 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        } 
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data){
        if(isEmpty()){
            System.out.println("Tree masih kosong");
            return;
        } 
        Node23 current = root;
        Node23 parrent = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data==data){
                break;
            } else if(data < current.data){
                parrent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data){
                parrent = current;
                current = current.right;
            }
        }

        if(current == null){
            System.out.println("Couldn't find data");
        } else {
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                } else if(isLeftChild){
                    parrent.left = null;
                } else {
                    parrent.right = null;
                }
            } else if(current.left ==null){
                if(isLeftChild){
                    parrent.left = current.right;
                } else {
                    parrent.right = current.right;
                }
            } else if(current.right == null){
                if(isLeftChild){
                    parrent.left = current.left;
                } else {
                    parrent.right = current.left;
                }
            } else {
                Node23 successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                } else {
                    if(isLeftChild){
                        parrent.left = successor;
                    } else {
                        parrent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }

    }
}
