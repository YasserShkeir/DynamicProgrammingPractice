package Leetcode._111_MinimumDepthOfBinaryTree.SolutionJava;

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
    // This is clearly not the optimal solution as we are using recursion.
    // A better approach can be achieved by using a queue

    public int minDepth(TreeNode root) {
        // if the root/node is null, return a zero
        if (root == null) {
            return 0;
        }
        // if both left and right are null, it's a leaf node (+1)
        if (root.left == null && root.right == null) {
            return 1;
        }

        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return minDepth(root.right) + 1;

        // If right subtree is NULL, recur for left subtree
        if (root.right == null)
            return minDepth(root.left) + 1;

        // Return the min between left and right, recursively, and add
        // a 1 each time the function is called.
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
