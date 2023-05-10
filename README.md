# Take Away Exercise
A function that returns the maximum value of all the keys in a binary tree.
Here is the function that solves the problem:
```
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
```
Here, the findMaxKey function takes a BinaryTree object as input and returns the maximum value of all the keys in the tree. If the tree is empty (i.e., null or has no root node), the function returns -1 as specified in the problem statement.

The findMaxKeyHelper function is a recursive function that takes a BinaryTreeNode object as input and returns the maximum value of all the keys in the subtree rooted at that node. It starts by initializing the maxKey variable to the key of the current node. Then, it recursively calls itself on the left and right child nodes (if they exist) and updates maxKey if the maximum key found in either subtree is greater than the current maxKey.

Finally, the findMaxKeyHelper function returns the maxKey value for the entire tree.

```
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
```
The findMaxKey function is defined as before, but now we also have a main method that constructs a sample binary tree and calls findMaxKey to compute the maximum key value. The output of running the program will be "Max key: 5" because the maximum key in the sample tree is 5.
