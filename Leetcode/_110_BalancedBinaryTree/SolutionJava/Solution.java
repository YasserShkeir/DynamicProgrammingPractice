package Leetcode._110_BalancedBinaryTree.SolutionJava;

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
    // So the return should check if the difference between left and right isn't
    // more than 1. And confirm that left and right branches are also balanced
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    // Use the function from 104 lol
    public int maxDepth(TreeNode root) {
        // if the root/node is null, return a zero
        if (root == null) {
            return 0;
        }
        // if both left and right are null, it's a leaf node (+1)
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Return the max between left and right, recursively, and add
        // a 1 each time the function is called.
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
