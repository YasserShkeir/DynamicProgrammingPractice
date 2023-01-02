package Leetcode._4_MedianOfTwoSortedArrays.SolutionJava;

import java.util.ArrayList;

public class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        // create two pointers for each array, and merge the arrays
        int i1 = 0, i2 = 0;

        // Loop until both pointers reach end
        while (i1 != nums1.length || i2 != nums2.length) {
            // Check if any pointer has reached the end
            if (i1 == nums1.length) {
                while (i2 != nums2.length) {
                    list.add(nums2[i2++]);
                }
            } else if (i2 == nums2.length) {
                while (i1 != nums1.length) {
                    list.add(nums1[i1++]);
                }
            } else {
                // Check if number from nums1 at pointer 1 is less than nums2
                if (nums1[i1] < nums2[i2]) {
                    // Add the number to the list
                    list.add(nums1[i1++]);
                } else {
                    // Add the number to the list
                    list.add(nums2[i2++]);
                }
            }

        }

        if (list.size() % 2 == 0) {
            int left = list.get((int) ((list.size() / 2.0) - 0.5));
            int right = list.get((int) ((list.size() / 2.0) + 0.5));
            return (left + right) / 2.0;
        }

        return list.get(list.size() / 2);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 }, nums2 = { 3, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
