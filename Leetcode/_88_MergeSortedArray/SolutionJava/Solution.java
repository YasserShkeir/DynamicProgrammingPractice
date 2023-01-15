package Leetcode._88_MergeSortedArray.SolutionJava;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create three pointers
        int i = m - 1; // for array 1 elements
        int j = n - 1; // for array 2 elements
        int k = m + n - 1; // for all of array 1
        // While i or j are greater than 0
        while (i >= 0 && j >= 0) {
            // Check if element at nums1 is greater than element at nums2
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
