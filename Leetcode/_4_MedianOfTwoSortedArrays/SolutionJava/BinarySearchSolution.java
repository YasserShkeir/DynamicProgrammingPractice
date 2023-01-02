package Leetcode._4_MedianOfTwoSortedArrays.SolutionJava;

public class BinarySearchSolution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Make sure nums1 is the shorter array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        // Create two variables for storing arrays lengths
        int m = nums1.length;
        int n = nums2.length;

        // Half: Represents midpoint of the merged array
        int half = (m + n + 1) / 2;
        // Left: left bound of the binary search
        int left = 0;
        // Right: right bound of the binary search
        int right = m;

        // Binary Search approach, while left index hasn't met/passed right index
        while (left < right) {
            // mid1: Middle element for nums1
            int mid1 = left + (right - left) / 2;
            // mid2: Middle element for nums2
            int mid2 = half - mid1;

            // If nums1[mid1] is less than nums2[mid2 - 1], it means that the median must be
            // in the right half of the search space, so we update left to mid1 + 1
            if (nums1[mid1] < nums2[mid2 - 1]) {
                left = mid1 + 1;
            }
            // If nums1[mid1] is greater than or equal to nums2[mid2 - 1], it means that the
            // median must be in the left half of the search space, so we update right to
            // mid1
            else {
                right = mid1;
            }
        }

        int mid1 = left;
        int mid2 = half - left;

        int c1 = Math.max(mid1 <= 0 ? Integer.MIN_VALUE : nums1[mid1 - 1],
                mid2 <= 0 ? Integer.MIN_VALUE : nums2[mid2 - 1]);

        // If the combined array has an odd number of elements, the median is simply the
        // middle element
        if ((m + n) % 2 == 1) {
            return c1;
        }

        // If the combined array has an even number of elements, the median is the
        // average of the two middle elements
        int c2 = Math.min(mid1 >= m ? Integer.MAX_VALUE : nums1[mid1],
                mid2 >= n ? Integer.MAX_VALUE : nums2[mid2]);

        return (c1 + c2) * 0.5;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 }, nums2 = { 3, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
