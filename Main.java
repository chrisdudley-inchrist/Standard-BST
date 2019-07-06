
class BST {
    public Node root;

    BST(int[] val) {
        root = new Node(val[0]);
        for (int i = 1; i < val.length; i++) {
            this.insert(val[i]);
        }
    }

    public void insertNode(int val) {
        root.insertNode(val);
    }

    public boolean find(int val) {
        if (root == null) {
            return false;
        } else {
            return root.find(val);
        }
    }

    public void preorderTraversal() {
        root.preorderTraversal(root);
    }

    public void inorderTraversal() {
        root.inorderTraversal(root);
    }

    public void postorderTraversal() {
        root.postorderTraversal(root);
    }
}

class Node {
    private int mVal;
    Node left;
    Node right;

    public int getVal() {
        return mVal;
    }

    Node(int val) {
        mVal = val;
    }

    public void insertNode(int val) {

        if (val < this.getVal()) {
            if (this.left == null) {
                this.left = new Node(val);
            } else {
                this.left.insertNode(val);
            }
        } else if (val > this.getVal()) {
            if (this.right == null) {
                this.right = new Node(val);
            } else {
                this.right.insertNode(val);
            }
        }
    }

    public boolean find(int val) {
        boolean found = false;
        if (this == null) {
            return false;
        } else {
            if (val == this.getVal()) {
                return true;
            } else if (val < this.left.getVal() && this.left != null) {
                found = this.left.find(val);
            } else if (val > this.right.getVal() && this.right != null) {
                found = this.right.find(val);
            }
        }
        return found;
    }

    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.getVal() + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        } else {
            return;
        }
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.getVal() + " ");
            inorderTraversal(node.right);
        } else {
            return;
        }
    }

    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.getVal() + " ");
        } else {
            return;
        }
    }
}

public class Main {

    public static void main(String args[]) {

        int[] nodes = new int[]{15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90};
        BST bst = new BST(nodes);
 
        bst.preorderTraversal();
        bst.inorderTraversal();
        bst.postorderTraversal();


    }

}
