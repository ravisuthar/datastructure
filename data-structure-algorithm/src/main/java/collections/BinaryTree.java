package collections;

import java.util.HashSet;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    public class TreeNode{
        private int value;
        private TreeNode left;
        private  TreeNode right;
        public TreeNode(int value){
            this.value=value;
        }
    }

    public TreeNode createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        this.root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;

        return this.root;
    }

    //98. Recursive PreOrder traversal of a Binary Tree in Java
    //traverse the root node
    //travers the left subtree
    //travers the right subtree
    /**
     *         1
     *      2   3
     *    4  5  6  7
     *
     *    //1 2 4 5 3 6 7
     */
    public void preOrder(TreeNode node){
        //base condition
        if(null==node){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Iterative Preorder traversal of a Binary Tree in Java
    public void iterative(TreeNode node){
        if(null==node){
            return;
        }
        java.util.Stack<TreeNode> visited = new Stack<>();
        while(!visited.empty()){
            TreeNode temp = visited.pop();
            System.out.println(temp.value);
            if(temp.left!=null){
                visited.push(temp.left);
            }
            if(temp.right!=null){
                visited.push(temp.right);
            }
        }

    }

    //100.Recursive Inorder traversal of Binary Tree in Java
    // traver left
    //traveser center
    //traverse right
    public void inOrder(TreeNode node){
        if(null==node) return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }


    //101.Iterative Inorder traversal of a Binary Tree in Java





    //my implementation not working
    public void print(){

        TreeNode temp= this.root;
        System.out.println(temp.value);
        TreeNode left=temp.left;
        TreeNode right=temp.right;
        while(temp!=null & temp.left!=null & temp.right!=null){
            System.out.println("left "+temp.left.value+" right" +temp.right.value);
            left=left.left;
            right=right.right;
        }
    }


    //Level order traversal of a Binary Tree in Java

}
