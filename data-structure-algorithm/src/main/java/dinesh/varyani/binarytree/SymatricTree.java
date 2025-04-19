package dinesh.varyani.binarytree;

//https://leetcode.com/problems/symmetric-tree/submissions/1611779079/


/**
 *
 *       1
 *   2   |   2
 * 3  4  |  4  3
 *
 */
public class SymatricTree {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);

    }

    public boolean isMirror(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
