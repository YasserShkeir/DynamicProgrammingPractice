package Leetcode._104_MaximumDepthOfBinaryTree.SolutionJava;

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

class Solution {
    // Thought process:
    // Recursively pass through the branches, adding +1 to every return statement
    // meaning every time we call the function +1 is added (to signify depth)
    // We should return the Math.max() between the two branches

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