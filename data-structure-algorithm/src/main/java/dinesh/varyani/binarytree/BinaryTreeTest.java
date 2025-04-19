package dinesh.varyani.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTest {

    private TreeNode root;

    public TreeNode getRoot() {
        return this.root;
    }

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    /**
     * 1
     * 2   3
     * 4  5 6  7
     */
    public void createBinaryTree() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        this.root = one;

        one.left = two;
        one.right = three;

        two.left = four;
        two.right = five;

        three.left = six;
        three.right = seven;
    }

    /**
     * 1
     * 2   3
     * 4  5 6  7
     */
    //root, left, right
    // 1 2 ,4 ,5 ,3 ,6, 7
    //This is iterative method
    public void preOrderRecursiveMethod(TreeNode root) {
        if (null == root) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderRecursiveMethod(root.left);
        preOrderRecursiveMethod(root.right);
    }

    /**
     * 1
     * 2        3
     * 4  5     6  7
     */
    public void preOrderIterativeMethod(TreeNode root) {
        if (null == root) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            System.out.print(pop.data + " ");
            if (null != pop.right) stack.push(pop.right);
            if (null != pop.left) stack.push(pop.left);
        }
    }


    /**
     * 1
     * 2   3
     * 4  5 6  7
     */
    //left, root, right
    //This is iterative method
    public void inOrderRecursiveMethod(TreeNode root) {
        if (null == root) {
            return;
        }
        inOrderRecursiveMethod(root.left);
        System.out.print(root.data + " ");
        inOrderRecursiveMethod(root.right);
    }

    //in order required to keep logic in mind
    public void inOrderIterativeMethod(TreeNode root) {
        if (null == root) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || null != temp) {
            if (null != temp) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    /**
     * 1
     * 2   3
     * 4  5 6  7
     */
    //7 3 6 1 5 2 4
    public void postOrderRecursiveMethod(TreeNode root) {
        if (null == root) {
            return;
        }

        postOrderRecursiveMethod(root.right);
        System.out.print(root.data + " ");
        postOrderRecursiveMethod(root.left);
    }

    /**
     * 1
     * 2       3
     * 4  5     6  7
     */
    //7 6 3 5 2 4 1
    //not working- need to understand logic.
    public void postOrderIterativeMethod(TreeNode root) {
        if (null == root) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || null != temp) {

            if (null != temp) {
                stack.push(temp);
                temp = temp.right;
            } else if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                System.out.print(" " + pop.data);
                stack.push(pop.left);
            }
        }
    }

    /**
     * 1
     * 2       3
     * 4  5     6  7
     */
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

    public int findMax(TreeNode root) {
        if (null == root) {
            return -1;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);

        if (left < right) {
            result = right;
        }
        if(right < left){ //else is not required here.
            result = left;
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryTreeTest tree = new BinaryTreeTest();
        tree.createBinaryTree();

    /*    System.out.println("pre order");
        tree.preOrderRecursiveMethod(tree.getRoot());
        System.out.println();
        tree.preOrderIterativeMethod(tree.getRoot());

        System.out.println();
        System.out.println("in order");
        tree.inOrderRecursiveMethod(tree.getRoot());
        System.out.println();
        tree.inOrderIterativeMethod(tree.getRoot());

        System.out.println();
        System.out.println("post order");
        tree.postOrderRecursiveMethod(tree.getRoot());
        System.out.println();
        tree.postOrderIterativeMethod(tree.getRoot());*/

       /* System.out.println();
        System.out.println("level order");
        tree.levelOrderTraversal(tree.getRoot());*/


        System.out.println(tree.findMax(tree.getRoot()));
    }
}
