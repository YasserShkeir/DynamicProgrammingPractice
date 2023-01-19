package Leetcode._94_BinaryTreeInorderTraversal.SolutionJava;

import java.util.ArrayList;
import java.util.List;

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
    // Create a helper function that takes in root and result
    public void inorderTraversalHelper(TreeNode root, List<Integer> result) {
        // If root is null, return
        if (root == null) {
            return;
        }
        // Call the helper function on the root left element
        inorderTraversalHelper(root.left, result);
        // Add the current element value
        result.add(root.val);
        // Lastly call the helper function on right element
        inorderTraversalHelper(root.right, result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        // Create a list to store the result
        List<Integer> result = new ArrayList<>();
        // Call the helper function
        inorderTraversalHelper(root, result);
        return result;
    }

}
