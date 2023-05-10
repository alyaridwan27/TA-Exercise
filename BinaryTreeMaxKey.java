class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }
}

class BinaryTreeNode {
    private int key;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}

public class BinaryTreeMaxKey {
    public static int findMaxKey(BinaryTree tree) {
        if (tree == null || tree.getRoot() == null) {
            return -1; // tree is empty
        }
        return findMaxKeyHelper(tree.getRoot());
    }

    private static int findMaxKeyHelper(BinaryTreeNode node) {
        int maxKey = node.getKey();
        if (node.getLeft() != null) {
            maxKey = Math.max(maxKey, findMaxKeyHelper(node.getLeft()));
        }
        if (node.getRight() != null) {
            maxKey = Math.max(maxKey, findMaxKeyHelper(node.getRight()));
        }
        return maxKey;
    }

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);

        BinaryTree tree = new BinaryTree(node1);
        int maxKey = findMaxKey(tree);
        System.out.println("Max key: " + maxKey);
    }
}
