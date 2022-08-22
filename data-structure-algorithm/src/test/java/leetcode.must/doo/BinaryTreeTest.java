package leetcode.must.doo;

import collections.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTree.TreeNode binaryTree = tree.createBinaryTree();
        tree.preOrder(binaryTree);
        System.out.println("");
        tree.inOrder(binaryTree);
        System.out.println("");
        //tree.print(); not working my initial implemetnation
    }
}
