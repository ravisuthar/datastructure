package dinesh.varyani.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeTest {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        this.root = this.insert(this.root, data);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (null == root) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        else  {
            root.right = insert(root.right, value); //root.left is imp
        }
        return root;
    }


    public void levelOrderTraversal(TreeNode root) {
        if (null == root) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            System.out.print(poll.data + " "); //1, 2, 3
            if (null != poll.left) queue.offer(poll.left);
            if (null != poll.right) queue.offer(poll.right);
        }
    }

    public static void main(String[] args) {

        BinarySearchTreeTest tree = new BinarySearchTreeTest();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);


        tree.levelOrderTraversal(tree.root);
    }
}
