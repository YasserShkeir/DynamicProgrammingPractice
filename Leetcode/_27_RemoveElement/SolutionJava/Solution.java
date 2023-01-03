package Leetcode._27_RemoveElement.SolutionJava;

public class Solution {

    public static int removeElement(int[] nums, int val) {

        // Create a variable to count the shifts + track first elements
        int k = 0;

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if element is not equal to val
            if (nums[i] != val) {
                // Element at index k is changed to nonVal element
                nums[k] = nums[i];
                // Shift forward
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 2 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
