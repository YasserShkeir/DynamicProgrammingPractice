package Leetcode._101_SymmetricTree.SolutionJava;

class TreeNode {
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

public class Solution {
    public static boolean isSymmetric(TreeNode root) {
        // base case: tree is null or has no children
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        // base case: tree has only one child
        if (root.left == null || root.right == null) {
            return false;
        }
        // tree has two children: check if they are mirrors of each other
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode p, TreeNode q) {
        // base case: both trees are null
        if (p == null && q == null) {
            return true;
        }
        // base case: one tree is null, the other is not
        // or if values of nodes don't match
        if ((p == null || q == null) || p.val != q.val) {
            return false;
        }
        // both trees are non-null: check if their values are the same
        // and if the mirror of their left and right subtrees are the same
        return isMirror(p.right, q.left) && isMirror(p.left, q.right);
    }
}
