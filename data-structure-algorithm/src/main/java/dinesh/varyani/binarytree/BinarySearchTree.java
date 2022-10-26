package dinesh.varyani.binarytree;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
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

    public void insert(int data) {
        this.root = insert(root, data);
    }

    public TreeNode insert(TreeNode root, int data) {
        if (null == root) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void inOrder() {
        inOrder(this.root);
    }

    public void inOrder(TreeNode node) {
        if (null == node) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public TreeNode search(int data) {
        return search(this.root, data);
    }

    public TreeNode search(TreeNode node, int key) {
        if (node == null || node.data == key) {
            return node;
        }
        if (key < node.data) return search(node.left, key);
        else return search(node.right, key);
    }

    /**
     *    6
     *  4   8
     *2  8  7  9
     */
    //need to check again
    public boolean validateBinarySearchTree(TreeNode node, int max, int min){
        if(null==node) return true;

        if(node.data >= min || node.data <= max){
            return false;
        }

        boolean left = validateBinarySearchTree(node.left, min, node.data);
        if(left){
            boolean right = validateBinarySearchTree(node.right, node.data, max);
            return right;
        }

        return false;
    }

    public boolean validateBinarySearchTree(){
        return validateBinarySearchTree(this.root, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public void add(){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left= new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(9);

        this.root=root;
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.add();
        System.out.println(bst.validateBinarySearchTree());

        /*BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);

        bst.inOrder();

        System.out.println();

        if(null!=bst.search(13)){
            System.out.println("key found");
        }else{
            System.out.println("key not found");
        }*/
    }
}
