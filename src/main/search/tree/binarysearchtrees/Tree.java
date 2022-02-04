package main.search.tree.binarysearchtrees;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    // returns replacement node
    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            // in this case,value is equal to node currently focussing on
            // if left child does not exist but right child does, it will replace current root node
            // case 1 and 2: node to delete has 0 or 1 children
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            // right child does not exist
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
        }

        // reaching here means that it is not the node that we want to delete
        return subtreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void traverInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
}
