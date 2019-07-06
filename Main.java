
class Node {
    int mVal;
    Node left;
    Node right;

    Node(int val) {
        mVal = val;
    }

    public void insert(int val) {
        if (this == null) {
            this.mVal = val;
        } else {
            if (val < this.mVal) {
                if (this.left == null) {
                    this.left = new Node(val);
                } else {
                    this.left.insert(val);
                }
            } else if (val > this.mVal) {
                if (this.right == null) {
                    this.right = new Node(val);
                } else {
                    this.right.insert(val);
                }
            }
        }
    }
}

class BST {
    public Node root;

    BST(int val) {
        Node rootNode = new Node(val);
        root = rootNode;
    }

}

public class Main {

    public static void main(String[] args) {
        BST bst = new BST(10);

        bst.root.insert(15);
        bst.root.insert(3);
        bst.root.insert(7);
        bst.root.insert(5);
        bst.root.insert(18);
        bst.root.insert(17);
        bst.root.insert(14);
    }


}


