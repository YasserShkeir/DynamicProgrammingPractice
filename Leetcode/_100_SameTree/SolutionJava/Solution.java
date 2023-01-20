package Leetcode._100_SameTree.SolutionJava;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null (equal)
        if (p == null && q == null) {
            return true;
        }
        // If only one is null
        if (p == null || q == null) {
            return false;
        }
        // If values aren't equal
        if (p.val != q.val) {
            return false;
        }
        // Recursively call the function on left nodes, then on right nodes
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
