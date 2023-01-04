package Leetcode._35_SearchInsertPosition.SolutionJava;

public class Solution {

    public static int searchInsert(int[] nums, int target) {
        // If given an empty array
        if (nums.length == 0) {
            return 0;
        }

        // Create left and right pointers
        int left = 0, right = nums.length - 1;

        // While left hasn't passed right
        while (left <= right) {
            // Mid index between left and right
            int mid = left + (right - left) / 2;

            // If value at mid is equal to target value
            if (nums[mid] == target) {
                return mid;
            }
            // If value at mid less than target
            else if (nums[mid] < target) {
                // Left is now shifted to mid
                left = mid + 1;
            }
            // If value at mid greater than target
            else {
                // Right is now shifted to mid
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
