package Leetcode._1026_MaximumDifferenceBetweenNodeAndAncestor.SolutionJava;

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

    // The idea is to use a DFS to traverse the tree, and keep track of the minimum
    // and maximum values seen so far.
    public int dfs(TreeNode root, int min, int max) {
        // Base case
        if (root == null)
            return max - min;

        // Update the minimum and maximum values seen so far
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        // Return the maximum of the left and right subtrees
        return Math.max(dfs(root.left, min, max), dfs(root.right, min, max));
    }

    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }
}
