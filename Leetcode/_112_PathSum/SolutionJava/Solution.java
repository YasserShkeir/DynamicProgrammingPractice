package Leetcode._112_PathSum.SolutionJava;

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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            // If the root is null, there is no path to check, so return false
            return false;
        }

        // Call dfs method to check if there exists a path from root to a leaf
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int currSum, int targetSum) {
        if (node == null) {
            // If the node is null, there is no path to check, so return false
            return false;
        }

        // Add the value of the current node to the current sum
        currSum += node.val;

        if (node.left == null && node.right == null) { // leaf node
            // If the node is a leaf node, check if the current sum equals the target sum
            return currSum == targetSum;
        }

        // Recursively check if there exists a path to a leaf node from the left or
        // right child
        return dfs(node.left, currSum, targetSum) || dfs(node.right, currSum, targetSum);
    }

}
