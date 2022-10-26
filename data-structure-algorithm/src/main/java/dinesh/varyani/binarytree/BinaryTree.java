package dinesh.varyani.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
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
     * 2 3
     * 4 5 6 7
     */
    public TreeNode createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        this.root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

        return this.root;
    }

    //98. Recursive PreOrder traversal of a Binary Tree in Java
    //visit the root node
    //travers the left subtree in preorder fashion
    //travers the right subtree in preorder fashionv

    /**
     * 1
     * 2   3
     * 4  5  6  7
     * <p>
     * //1 2 4 5 3 6 7
     */
    public void preOrderTraversalPrint(TreeNode node) {
        //base condition
        if (null == node) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversalPrint(node.left);
        preOrderTraversalPrint(node.right);
    }

    public void print() {
        System.out.println("\npreOrderTraversalPrint");
        preOrderTraversalPrint(this.root);
        System.out.println("\npreOrderIterative");
        preOrderIterative();


        System.out.println("\ninOrder");
        inOrder(this.root);
        System.out.println("\niterativeInOrder");
        iterativeInOrder();

        System.out.println("\npostOrderRecursion");
        postOrderRecursion(this.root);
        System.out.println("\niterativePostOrder");
        iterativePostOrder();


        System.out.println("\nlevelOrderTraversal");
        levelOrderTraversal();

        System.out.println("\nfindMax");
        System.out.println(findMax(this.root));
    }

    //Iterative Preorder traversal of a Binary Tree in Java
    //visit the root node
    //traverse the left subtree in pre order fashion
    //traverse the right subtree in pre order fashion
    public void preOrderIterative() {
        if (null == this.root) {
            return;
        }
        java.util.Stack<TreeNode> visited = new Stack<>();
        visited.push(this.root);
        while (!visited.empty()) {
            TreeNode temp = visited.pop();
            System.out.print(temp.data+" ");
            if (temp.right != null) {
                visited.push(temp.right);
            }
            if (temp.left != null) {
                visited.push(temp.left);
            }
        }
    }

    //100.Recursive Inorder traversal of Binary Tree in Java
    // traverse left
    //traverse center
    //traverse right
    public void inOrder(TreeNode node) {
        if (null == node) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrderRecursion(TreeNode node){
        if(node==null)return;
        postOrderRecursion(node.right);
        System.out.print(node.data+" ");
        postOrderRecursion(node.left);
    }


    //101.Iterative Inorder traversal of a Binary Tree in Java
    public void iterativeInOrder(){
        if(this.root==null)return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = this.root;
        while(!stack.isEmpty() || temp!=null){

            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }


    public void iterativePostOrder(){
        if(this.root==null)return;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode temp = this.root;
        while(!stack.isEmpty() || temp!=null){

            if(temp!=null){
                stack.push(temp);//stack = 7 3  1
                temp=temp.right;
            }else{
                temp= stack.pop(); //7
                System.out.print(temp.data+" ");
                temp=temp.left;
            }
        }
    }

    //Level order traversal of a Binary Tree in Java
    public void levelOrderTraversal(){
        if(this.root==null)return;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(this.root);
        while(!queue.isEmpty()){
            TreeNode poll = queue.poll();
            System.out.print(poll.data+" ");
            if(poll.left!=null)queue.add(poll.left);
            if(poll.right!=null)queue.add(poll.right);
        }
    }

    public int findMax(TreeNode node){
        if(node==null) return 0;
        int result = node.data;
        int left = findMax(node.left);
        int right = findMax(node.right);

        if(left>result) result=left;
        if(right>result) result=right;
        return result;
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.print();
    }

}
