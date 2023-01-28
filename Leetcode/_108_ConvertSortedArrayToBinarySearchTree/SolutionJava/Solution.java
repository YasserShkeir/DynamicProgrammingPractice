package Leetcode._108_ConvertSortedArrayToBinarySearchTree.SolutionJava;

import java.util.Arrays;

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

    // Thought Process:
    // The mid index of the array is our target, where all the elements on its left
    // will be
    // add to the left branch, and all elements on its right will be added to the
    // right
    // branch.
    // This element on the middle index is the root.

    // Moving forward, we need to start dissecting the array into smaller arrays,
    // and recursively
    // call the method.

    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return new TreeNode(nums[0]);
        }
        // Middle index
        int mid = (n - 1) / 2;
        // Root is the element in Array at middle index
        TreeNode root = new TreeNode(nums[mid]);
        // Explained above T.T
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, n));
        return root;
    }
}
