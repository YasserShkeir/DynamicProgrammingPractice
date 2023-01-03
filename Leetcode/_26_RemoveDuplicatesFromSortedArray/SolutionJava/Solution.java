package Leetcode._26_RemoveDuplicatesFromSortedArray.SolutionJava;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        // Create an index for the unique elements
        int i = 0;

        // Loop through the elements starting at index 1
        for (int j = 1; j < nums.length; j++) {

            // If we pass through a new unique element:
            if (nums[i] != nums[j]) {
                // We Add that new element after our last unique element
                nums[++i] = nums[j];
            }
        }

        // To return the LENGTH, we return the index + 1
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }

}
