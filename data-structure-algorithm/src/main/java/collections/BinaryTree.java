package collections;

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

    public void createBinaryTree(){
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
    }

    public void print(){

        TreeNode temp= this.root;
        System.out.println(temp.value);
        TreeNode left=temp.left;
        TreeNode right=temp.right;
        while(temp!=null && temp.left!=null & temp.right!=null){
            System.out.println("left "+temp.left+" right" +temp.right);
            left=left.left;
            right=right.right;
        }
    }

}
